/**
 * @file CodegenVisitor.cpp
 * @author Jack Bergin
 * @brief Implementation of the code generator visitor. 
 * @version 0.1
 * @date 2022-10-15 to 2022-10-29
 * 
 * @copyright Copyright (c) 2022
 * 
 */

#include "CodegenVisitor.h"
#include <any>
#include <string>
using namespace llvm;

/**
 * @brief Completed code and tested.
 */
std::any CodegenVisitor::visitCompilationUnit(WPLParser::CompilationUnitContext *ctx) {
  auto printf_prototype = FunctionType::get(i8p, true);
  auto printf_fn = Function::Create(printf_prototype, Function::ExternalLinkage, "printf", module);
  FunctionCallee printExpr(printf_prototype, printf_fn);

  for (auto e : ctx->components) {
    if (e->varDeclaration() && e->varDeclaration()->scalarDeclaration()) {
      WPLParser::ScalarDeclarationContext* sdctx = e->varDeclaration()->scalarDeclaration();
      Type* t = llvmTypeFromWPLType(sdctx->t);
      for (WPLParser::ScalarContext* sctx : sdctx->scalars){
        module->getOrInsertGlobal(sctx->id->getText(), t);
      }
    }
    else {
      e->accept(this);
    }
  }
  return nullptr;
}

/**
 * @brief Completed code and tested.
 */
Type* CodegenVisitor::llvmTypeFromWPLType(WPLParser::TypeContext* tctx) {
  if (tctx->BOOL()) return Int1Ty;
  if (tctx->INT()) return Int32Ty;
  if (tctx->STR()) return i8p;
  return VoidTy;
}

/**
 * @brief Completed code/tested.
 */
Type* CodegenVisitor::llvmTypeFromSymType(SymType t){
  if (t == SymType::BOOL) return Int1Ty;
  if (t == SymType::INT) return Int32Ty;
  if (t == SymType::STR) return i8p;
  return VoidTy;
}

/**
 * @brief Completed code/tested.
 */
std::any CodegenVisitor::visitFunction(WPLParser::FunctionContext *ctx) {
  Value *v;
  Function* func;
  std::string funcName = ctx->funcH->id->getText();
  Type* returnType = llvmTypeFromWPLType(ctx->funcH->t);
  std::vector<Type*> argtypes;

  if (ctx->funcH->p){
    for (WPLParser::TypeContext* tctx : ctx->funcH->p->types){
      argtypes.push_back(llvmTypeFromWPLType(tctx));
    }
  }

  FunctionType *funcType = FunctionType::get(returnType, argtypes, false);
  func = Function::Create(funcType, GlobalValue::ExternalLinkage, funcName, module);
  BasicBlock *bBlock = BasicBlock::Create(module->getContext(), "entry", func);
  builder->SetInsertPoint(bBlock);

  if (ctx->funcH->p) {
    Function::arg_iterator iterator = func->arg_begin();
    for (unsigned long i = 0; i < ctx->funcH->p->ids.size(); i++){
      std::string id = ctx->funcH->p->ids[i]->getText();
      Symbol* symbol = props->getBinding(ctx->funcH->p->ids[i]);
      if (symbol == nullptr){
        errors.addCodegenError(ctx->getStart(), "Symbol not made for: " + id);
        return v;
      }

      Type* type = llvmTypeFromSymType(symbol->type);
      Value* alloc = builder->CreateAlloca(type, 0, symbol->identifier);
      symbol->val = alloc;
      builder->CreateStore(iterator++, symbol->val); 
    }
  }

  ctx->blc->accept(this);

  return v;
}

/**
 * @brief Completed code and testing.
 */
std::any CodegenVisitor::visitProcedure(WPLParser::ProcedureContext *ctx) {
  Value *v;
  std::string procName = ctx->procH->id->getText();
  std::vector<Type*> argtypes;

  if (ctx->procH->p){
    for (WPLParser::TypeContext* tctx : ctx->procH->p->types){
      argtypes.push_back(llvmTypeFromWPLType(tctx));
    }
  }

  FunctionType *procType = FunctionType::get(VoidTy, argtypes, false);
  Function *proc = Function::Create(procType, GlobalValue::ExternalLinkage, procName, module);
  BasicBlock *bBlock = BasicBlock::Create(module->getContext(), "entry", proc);
  builder->SetInsertPoint(bBlock);

  if (ctx->procH->p){
    Function::arg_iterator iterator = proc->arg_begin();

    for (unsigned long i = 0; i < ctx->procH->p->ids.size(); i++){
      std::string id = ctx->procH->p->ids[i]->getText();
      Symbol* symbol = props->getBinding(ctx->procH->p->ids[i]);

      if (symbol == nullptr) {
        errors.addCodegenError(ctx->getStart(), "No symbol created for: " + id);
        return v;
      }
      Type* type = llvmTypeFromSymType(symbol->type);
      Value* alloc = builder->CreateAlloca(type, 0, symbol->identifier);
      symbol->val = alloc;
      builder->CreateStore(iterator++, symbol->val); 
    }
  }

  ctx->blc->accept(this);
  builder->CreateRet((Value*)nullptr);
  return v;
}

/**
 * @brief Completed code and testing.
 */
std::any CodegenVisitor::visitExternDeclaration(WPLParser::ExternDeclarationContext *ctx) { 
  Value* v = Int32Zero;
  std::string procName;
  std::vector<WPLParser::TypeContext*> parserargtypes;
  std::vector<Type*> llvmargtypes;
  Type* returnType;

  if (ctx->externProcHeader()){
    if (ctx->externProcHeader()->params()) parserargtypes = ctx->externProcHeader()->params()->types;
    procName = ctx->externProcHeader()->id->getText();
    returnType = VoidTy;
  }
  else if (ctx->externFuncHeader()){
    if (ctx->externFuncHeader()->params()) parserargtypes = ctx->externFuncHeader()->params()->types;
    procName = ctx->externFuncHeader()->id->getText();
    returnType = llvmTypeFromWPLType(ctx->externFuncHeader()->t);
  }
  for (WPLParser::TypeContext* tctx : parserargtypes){
    llvmargtypes.push_back(llvmTypeFromWPLType(tctx));
  }

  auto exproc_prototype = FunctionType::get(returnType, llvmargtypes, false);
  auto exproc_fn = Function::Create(exproc_prototype, Function::ExternalLinkage, procName, module);
  FunctionCallee exExpr(exproc_prototype, exproc_fn);

  return v;
}

/**
 * @brief Completed code and testing.
 */
std::any CodegenVisitor::visitScalarDeclaration(WPLParser::ScalarDeclarationContext *ctx) {
  for (WPLParser::ScalarContext* sctx : ctx->scalars){
    Symbol* symbol = props->getBinding(sctx);
    Type* type = llvmTypeFromSymType(symbol->type);
    Value* alloc = builder->CreateAlloca(type, 0, symbol->identifier);
    symbol->val = alloc;
    
    if (sctx->varInit){
      Value* v = std::any_cast<Value *>(sctx->varInit->c->accept(this));
      builder->CreateStore(v, symbol->val); 
      symbol->defined = true;
    }
  }
  return (Value*) Int32Zero;
}

/**
 * @brief Completed code and testing.
 */
std::any CodegenVisitor::visitAssignment(WPLParser::AssignmentContext *ctx) {
  Value* v = Int32Zero;

  for (unsigned long i = 0; i < ctx->exprs.size(); i++){
    Symbol* symbol = props->getBinding(ctx);
    Value* v = std::any_cast<Value *>(ctx->exprs[i]->accept(this));
    builder->CreateStore(v, symbol->val);
    symbol->defined = true;
  }

  return v;
}

/**
 * @brief Completed code and testing.
 */
std::any CodegenVisitor::visitIDExpr(WPLParser::IDExprContext *ctx) {
  Value* v = Int32Zero;
  Symbol* symbol = props->getBinding(ctx); 
  Type* type = llvmTypeFromSymType(symbol->type);

  if (!symbol){
    errors.addCodegenError(ctx->getStart(), "Cannot find symbol for: " + ctx->getText());
    return v;
  }
  if (!symbol->defined){
    errors.addCodegenError(ctx->getStart(), symbol->identifier + " has not been defined!");
    return v;
  }
  if (!symbol->val){
    errors.addCodegenError(ctx->getStart(), "No llvm value for: " + symbol->identifier);
    return v;
  }
  v = builder->CreateLoad(type, symbol->val, symbol->identifier);

  return v;
}

/**
 * @brief Completed code and testing.
 */
std::any CodegenVisitor::visitCall(WPLParser::CallContext *ctx) {
  Value* v = Int32Zero;
  std::string id = ctx->id->getText();
  Function* funcCall = module->getFunction(id);
  std::vector<Value *> args;

  if (!funcCall){
    errors.addCodegenError(ctx->getStart(), "No definition found for: " + id);
    return v;
  }

  if (ctx->arguments()){
    for (WPLParser::ArgContext* arg : ctx->arguments()->args){
      std::any v = arg->accept(this);
      args.push_back(std::any_cast<Value *>(v));
    }
  }
  v = builder->CreateCall(funcCall, args);
  return v;
}

/**
 * @brief Completed code and testing.
 */
std::any CodegenVisitor::visitFuncProcCallExpr(WPLParser::FuncProcCallExprContext *ctx) {
  Value* v = Int32Zero;
  std::string id = ctx->fpname->getText();

  Function* funcCall = module->getFunction(id);
  if (!funcCall) {
    errors.addCodegenError(ctx->getStart(), "Function definition not found!");
    return v;
  }

  std::vector<Value *> args;
  for (WPLParser::ExprContext* arg : ctx->args){
    args.push_back(std::any_cast<Value *>(arg->accept(this)));
  }

  v = builder->CreateCall(funcCall, args);
  return v;
}

/**
 * @brief Completed code and testing.
 */
std::any CodegenVisitor::visitReturn(WPLParser::ReturnContext *ctx) {
  Value* v = Int32Zero;

  if (ctx->expr()){
    v = std::any_cast<Value *>(ctx->expr()->accept(this)); 
  }
  else {
    v = nullptr;
  }

  return builder->CreateRet(v);
}

/**
 * @brief Completed code and testing.
 */
std::any CodegenVisitor::visitConstant(WPLParser::ConstantContext *ctx) {
  Value* v = Int32Zero;

  if (ctx->BOOLEAN()) {
    if (ctx->getText() == "true") {
      v = builder->getInt1(1);
    }
    else {
      v = builder->getInt1(0);
    }
  }

  else if (ctx->INTEGER()){
    int i = stoi(ctx->getText());
    v = builder->getInt32(i);
  }

  else if (ctx->STRING()){
    std::string s = ctx->getText();
    s.erase(s.length()-1, 1);
    s.erase(0, 1);
    
    for (unsigned long i = 0; i < s.length(); i++) {
      if (s.length() <= i) {
        break;
      } 
      if (s[i] == '\\' && s[i+1] == 'n'){
        s.erase(i, 2);
        s.insert(i, "\n");
      }
    }
    v = builder->CreateGlobalStringPtr(s);
  }

  return v;
}


//---------------------------Calculator Logic Carry-Over---------------------------------------=
/**
 * @brief Completed code and testing.
 */
std::any CodegenVisitor::visitEqExpr(WPLParser::EqExprContext *ctx) {
  Value *leftV = std::any_cast<Value *>(ctx->left->accept(this));
  Value *rightV = std::any_cast<Value *>(ctx->right->accept(this));
  Value *v;

  if (ctx->EQUAL()) {
    v = builder->CreateICmpEQ(leftV, rightV);
  } else {
    v = builder->CreateICmpNE(leftV, rightV);
  }

  return v;
}

/**
 * @brief Completed code and testing.
 */
std::any CodegenVisitor::visitRelExpr(WPLParser::RelExprContext *ctx) {
  Value *leftV = std::any_cast<Value *>(ctx->left->accept(this));
  Value *rightV = std::any_cast<Value *>(ctx->right->accept(this));
  Value *v;

  if (ctx->LESS()){
    v = builder->CreateICmpSLT(leftV, rightV);
  }
  else if (ctx->LEQ()){
    v = builder->CreateICmpSLE(leftV, rightV);
  }
  else if (ctx->GTR()){
    v = builder->CreateICmpSGT(leftV, rightV);
  }
  else if (ctx->GEQ()){
    v = builder->CreateICmpSGE(leftV, rightV);
  }

  return v;
}

/**
 * @brief Completed code and testing.
 */
std::any CodegenVisitor::visitAndExpr(WPLParser::AndExprContext *ctx) {
  Value *leftV = std::any_cast<Value *>(ctx->left->accept(this));
  Value *rightV = std::any_cast<Value *>(ctx->right->accept(this));
  Value *v = builder->CreateAnd(leftV, rightV);
  return v;
}

/**
 * @brief Completed code and testing.
 */
std::any CodegenVisitor::visitOrExpr(WPLParser::OrExprContext *ctx) {
  Value *leftV = std::any_cast<Value *>(ctx->left->accept(this));
  Value *rightV = std::any_cast<Value *>(ctx->right->accept(this));
  Value *v = builder->CreateOr(leftV, rightV);
  return v;
}

/**
 * @brief Completed code and testing.
 */
std::any CodegenVisitor::visitNotExpr(WPLParser::NotExprContext *ctx) {
  Value *e = std::any_cast<Value *>(ctx->e->accept(this));
  Value *v = builder->CreateNot(e);
  return v;
}

/**
 * @brief Completed code and testing.
 */
std::any CodegenVisitor::visitMultExpr(WPLParser::MultExprContext *ctx) {
  Value *leftV = std::any_cast<Value *>(ctx->left->accept(this));
  Value *rightV = std::any_cast<Value *>(ctx->right->accept(this));
  Value *v;
  if (ctx->MUL()){
    v = builder->CreateNSWMul(leftV, rightV);
  }
  if (ctx->DIV()){
    v = builder->CreateSDiv(leftV, rightV);
  }
  return v;
}

/**
 * @brief Completed code and testing.
 */
std::any CodegenVisitor::visitAddExpr(WPLParser::AddExprContext *ctx) {
  Value *leftV = std::any_cast<Value *>(ctx->left->accept(this));
  Value *rightV = std::any_cast<Value *>(ctx->right->accept(this));
  Value *v;
  if (ctx->PLUS()){
    v = builder->CreateNSWAdd(leftV, rightV);
  }
  if (ctx->MINUS()){
    v = builder->CreateNSWSub(leftV, rightV);
  }
  return v;
}

/**
 * @brief Completed code and testing.
 */
std::any CodegenVisitor::visitUMinusExpr(WPLParser::UMinusExprContext *ctx) {
  Value *e = std::any_cast<Value *>(ctx->e->accept(this));
  Value *v = builder->CreateNSWSub(Int32Zero, e);
  return v;
}
//---------------------------------------------------------------------------------------


/**
 * @brief Completed code and testing.
 */
std::any CodegenVisitor::visitConditional(WPLParser::ConditionalContext *ctx) {
  Value* v = Int32Zero;
  
  Function* func = builder->GetInsertBlock()->getParent(); 
  
  // True block
  BasicBlock *trueBlc = BasicBlock::Create(module->getContext(), "trueBlock", func);
  // False block
  BasicBlock *falseBlc = nullptr;

  if (ctx->invalidBlock){
    falseBlc = BasicBlock::Create(module->getContext(), "falseBlock", func);
  }

  // Continue block
  BasicBlock *continueB = BasicBlock::Create(module->getContext(), "continueBlock", func);
  Value* eresult = std::any_cast<Value*>(ctx->e->accept(this));
  if (falseBlc == nullptr){
    builder->CreateCondBr(eresult, trueBlc, continueB);
  }
  else{
    builder->CreateCondBr(eresult, trueBlc, falseBlc);
  }

  // True block 
  builder->SetInsertPoint(trueBlc);
  Value *validBlockR = std::any_cast<Value*>(ctx->validBlock->accept(this));
  if (validBlockR != Int32One) {
    builder->CreateBr(continueB);
  }

  // False block 
  if (ctx->invalidBlock){
    builder->SetInsertPoint(falseBlc);
    Value *invalidBlockR = std::any_cast<Value*>(ctx->invalidBlock->accept(this));
    if (invalidBlockR != Int32One) {
      builder->CreateBr(continueB);
    }
  }

  builder->SetInsertPoint(continueB);

  return v;
}

/**
 * @brief Completed code and testing.
 */
std::any CodegenVisitor::visitSelect(WPLParser::SelectContext *ctx) {
  //Initializer
  Value* v = Int32Zero;
  Function* func = builder->GetInsertBlock()->getParent(); 
  std::vector<BasicBlock*> validBlock;
  std::vector<BasicBlock*> conditionalBlock;
  
  for (unsigned long i = 0; i < ctx->selectAlt().size(); i++){
    WPLParser::SelectAltContext* alt = ctx->selectAlt()[i];
    validBlock.push_back(BasicBlock::Create(module->getContext(), "selectBlock", func));
    conditionalBlock.push_back(BasicBlock::Create(module->getContext(), "conditionBlock", func));
    Value* eresult = std::any_cast<Value*>(alt->e->accept(this));

    builder->CreateCondBr(eresult, validBlock[i], conditionalBlock[i]);
    builder->SetInsertPoint(conditionalBlock[i]);
  }

  BasicBlock *continueBlock = BasicBlock::Create(module->getContext(), "continue", func);
  builder->CreateBr(continueBlock); 

  for (unsigned long i = 0; i < ctx->selectAlt().size(); i++){
    WPLParser::SelectAltContext* alt = ctx->selectAlt()[i];
    builder->SetInsertPoint(validBlock[i]);
    Value* blockR = std::any_cast<Value*>(alt->s->accept(this));
    if (blockR != Int32One) {
      builder->CreateBr(continueBlock);
    }
  }

  builder->SetInsertPoint(continueBlock);

  return v;
}

/**
 * @brief Completed code and testing.
 */
std::any CodegenVisitor::visitLoop(WPLParser::LoopContext *ctx) {
  Value* v = Int32Zero;
  Function* func = builder->GetInsertBlock()->getParent(); 
  BasicBlock *conditionalBlock = BasicBlock::Create(module->getContext(), "conditionalB", func);
  BasicBlock *loopBlock = BasicBlock::Create(module->getContext(), "loopB", func);
  BasicBlock *continueBlock = BasicBlock::Create(module->getContext(), "continueB", func);
  builder->CreateBr(conditionalBlock);
  builder->SetInsertPoint(conditionalBlock);
  Value* eresult = std::any_cast<Value*>(ctx->e->accept(this));
  builder->CreateCondBr(eresult, loopBlock, continueBlock);
  builder->SetInsertPoint(loopBlock);

  Value *loopBlockR = std::any_cast<Value*>(ctx->blc->accept(this));
  if (loopBlockR != Int32One) {
    builder->CreateBr(conditionalBlock);
  }

  builder->SetInsertPoint(continueBlock);
  return v;
}

/**
 * @brief Completed code and testing.
 */
std::any CodegenVisitor::visitParenExpr(WPLParser::ParenExprContext *ctx) {
  return std::any_cast<Value *>(ctx->expr()->accept(this));
}

/**
 * @brief Completed code and testing.
 */
std::any CodegenVisitor::visitBlock(WPLParser::BlockContext *ctx) {
  Value* v = Int32Zero;

  for (WPLParser::StatementContext* sctx : ctx->statement()){
    if (sctx->return_()){
      v = Int32One;
    }
    sctx->accept(this);
  }
  return v;
}

/**
 * @brief Completed code and testing.
 */
std::any CodegenVisitor::visitStatement(WPLParser::StatementContext *ctx) {
  Value* v = Int32Zero;
  //Goes through each of the possible statements.
  if (ctx->assignment()){ctx->assignment()->accept(this);}

  else if (ctx->loop()){ctx->loop()->accept(this);}

  else if (ctx->select()){ctx->select()->accept(this);}

  else if (ctx->conditional()){ctx->conditional()->accept(this);}

  else if (ctx->call()){ctx->call()->accept(this);}

  else if (ctx->block()){v = std::any_cast<Value*>(ctx->block()->accept(this));}
  
  else if (ctx->return_()){
    ctx->return_()->accept(this);
    v = Int32One;
  }
  else if (ctx->varDeclaration()){ctx->varDeclaration()->accept(this);}
  return v;
}