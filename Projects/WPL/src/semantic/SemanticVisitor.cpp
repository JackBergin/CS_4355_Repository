/**
 * @file SemanticVisitor.cpp
 * @author Jack Bergin
 * @brief AST/Parse tree visitor that creates the symbol table
 *  and does the simple type checking for WPLC
 * @version 0.1
 * @date Completed: 2022-10-02
 * 
 * @copyright Copyright (c) 2022
 * 
 */

#include "SemanticVisitor.h"
#include <any>

/**
 * @brief Just visit the expressions below the program
 */
std::any SemanticVisitor::visitCompilationUnit(WPLParser::CompilationUnitContext *ctx) {
  stmgr->enterScope();    
  for (auto e : ctx->components) {
    e->accept(this);
  }

  return SymType::UNDEFINED;
}

/**
 * @brief **** Still working on ****
 * @return SymType::UNDEFINED.
 */
std::any SemanticVisitor::visitScalarDeclaration(WPLParser::ScalarDeclarationContext *ctx) {
  SymType declaredtype = SymType::UNDEFINED;

  if (ctx->t){ 
    declaredtype = std::any_cast<SymType>(ctx->t->accept(this));
  }

  for (WPLParser::ScalarContext* sctx : ctx->scalars) {
    if (sctx->varInit){
      SymType t = std::any_cast<SymType>(sctx->varInit->c->accept(this));
      std::string constant = sctx->varInit->c->getText();
      if (declaredtype == SymType::UNDEFINED) {
        declaredtype = t;
      }
      else if (declaredtype != t) {
        errors.addSemanticError(ctx->getStart(), "Expected: " + Symbol::getSymTypeName(declaredtype) + " | Got: " + Symbol::getSymTypeName(t));
      }
    }

    std::string id = sctx->id->getText();
    Symbol *symbol = stmgr->findSymbol(id);

    if (symbol == nullptr) {
      symbol = stmgr->addSymbol(id, declaredtype);
      bindings->bind(sctx, symbol);
    } else {
      errors.addSemanticError(ctx->getStart(), "Variable Redeclared: " + id);
    }
  }

  return declaredtype;
}

/**
 * @brief **** Still working on ****
 * @return SymType::UNDEFINED.
 */
std::any SemanticVisitor::visitArrayDeclaration(WPLParser::ArrayDeclarationContext *ctx) {
  return SymType::UNDEFINED;
}


/**
 * @brief **** Still working on ****
 * @return SymType::UNDEFINED.
 */
std::any SemanticVisitor::visitType(WPLParser::TypeContext *ctx) {
  SymType t = SymType::UNDEFINED;
  if (ctx->BOOL()){
    t = SymType::BOOL;
  }
  else if (ctx->INT()){
    t = SymType::INT;
  }
  else if (ctx->STR()){
    t = SymType::STR;
  }

  return t;
}

/**
 * @brief Testing needed.
 * @return SymType::UNDEFINED.
*/
std::any SemanticVisitor::visitProcedure(WPLParser::ProcedureContext *ctx) {
  std::string id = ctx->procH->id->getText();

  stmgr->enterScope();
  if (ctx->procH->p){
    for (unsigned long i = 0; i < ctx->procH->p->types.size(); i++){
      std::string id = ctx->procH->p->ids[i]->getText();
      SymType t = std::any_cast<SymType>(ctx->procH->p->types[i]->accept(this));
      Symbol* sym = stmgr->addSymbol(id, t);
      bindings->bind(ctx->procH->p->ids[i], sym);
      sym->defined = true;
    }
  }
  ctx->blc->accept(this);
  stmgr->exitScope();

  Symbol *symbol = stmgr->findSymbol(id);
  if (symbol == nullptr) {
    symbol = stmgr->addSymbol(id, SymType::UNDEFINED);
    bindings->bind(ctx, symbol);
  } else {
    errors.addSemanticError(ctx->getStart(), "Procedure Redeclared: " + id);
  }

  return SymType::UNDEFINED;
}

/**
 * @brief **** Still working on ****
 * @return SymType::UNDEFINED.
 */
std::any SemanticVisitor::visitExternProcHeader(WPLParser::ExternProcHeaderContext *ctx) {
  std::string id = ctx->id->getText();
  Symbol *symbol = stmgr->findSymbol(id);
  if (symbol == nullptr) {
    symbol = stmgr->addSymbol(id, SymType::UNDEFINED);
    bindings->bind(ctx, symbol);
  } else {
    errors.addSemanticError(ctx->getStart(), "Procedure Redeclared: " + id);
  }

  return SymType::UNDEFINED;
}

/**
 * @brief **** Still working on ****
 * @return SymType::UNDEFINED.
 */
std::any SemanticVisitor::visitFunction(WPLParser::FunctionContext *ctx) {
  SymType t = std::any_cast<SymType>(ctx->funcH->t->accept(this));
  std::string id = ctx->funcH->id->getText();

  stmgr->enterScope();
  if (ctx->funcH->p) {
    for (unsigned long i = 0; i < ctx->funcH->p->types.size(); i++) {
      std::string id = ctx->funcH->p->ids[i]->getText();
      SymType t = std::any_cast<SymType>(ctx->funcH->p->types[i]->accept(this));
      Symbol* sym = stmgr->addSymbol(id, t);
      bindings->bind(ctx->funcH->p->ids[i], sym);
      sym->defined = true;
    }
  }

  ctx->blc->accept(this);
  stmgr->exitScope();
  Symbol *symbol = stmgr->findSymbol(id);

  if (symbol == nullptr) {
    symbol = stmgr->addSymbol(id, t);
    bindings->bind(ctx, symbol);
  } else {
    errors.addSemanticError(ctx->getStart(), "Function Redeclared: " + id);
  }

  return t;
}

/**
 * @brief Completed
 * @return SymType::UNDEFINED.
 */
std::any SemanticVisitor::visitBlock(WPLParser::BlockContext *ctx) {
  stmgr->enterScope();
  visitChildren(ctx);
  stmgr->exitScope();

  return SymType::UNDEFINED;
}

/**
 * @brief Completed
 * @return SymType::UNDEFINED if error.
 */
std::any SemanticVisitor::visitExternFuncHeader(WPLParser::ExternFuncHeaderContext *ctx) {
  SymType t = std::any_cast<SymType>(ctx->t->accept(this));
  std::string id = ctx->id->getText();

  Symbol *symbol = stmgr->findSymbol(id);
  if (symbol == nullptr) {
    symbol = stmgr->addSymbol(id, t);
    bindings->bind(ctx, symbol);
  } else {
    errors.addSemanticError(ctx->getStart(), "Function Redeclared: " + id);
  }

  return t;
}

/**
 * @brief Completed
 * @return SymType::UNDEFINED.
  */
std::any SemanticVisitor::visitSelectAlt(WPLParser::SelectAltContext *ctx) {
  SymType ex = std::any_cast<SymType>(ctx->e->accept(this));
  ctx->s->accept(this);

  if (ex != SymType::BOOL){
    errors.addSemanticError(ctx->getStart(), "Need boolean type!");
  }

  return SymType::UNDEFINED;
}

/**
 * @brief **** Still working on ****
 * @return SymType::UNDEFINED.
*/
std::any SemanticVisitor::visitCall(WPLParser::CallContext *ctx) {
    std::string id = ctx->id->getText();
    Symbol *symbol = stmgr->findSymbol(id);
    SymType t = SymType::UNDEFINED;
  
    if (symbol == nullptr) {
      errors.addSemanticError(ctx->getStart(), id + " is undeclared!");
    }
    else {
      t = symbol->type;
    }
    if (ctx->arguments()){
      for (WPLParser::ArgContext* arg : ctx->arguments()->args){
        arg->accept(this);
      }
    }

    return t;
}

/**
 * @brief Completed
 * @return N/A
 */
std::any SemanticVisitor::visitReturn(WPLParser::ReturnContext *ctx) {
  SymType t = SymType::UNDEFINED;

  if (ctx->expr()) {
    t = std::any_cast<SymType>(ctx->expr()->accept(this));
  }

  return t;
}

/**
 * @brief constant.type == whichever declaration was used
 * @return SymType::BOOLEAN if bool. SymType::INTEGER if int. SymType::STRING if str. SymType::UNDEFINED if error.
 */
std::any SemanticVisitor::visitConstant(WPLParser::ConstantContext *ctx) {
  SymType t = SymType::UNDEFINED;

  if (ctx->BOOLEAN()) {
    t = SymType::BOOL;
  }
  else if (ctx->INTEGER()){
    t = SymType::INT;
  }
  else if (ctx->STRING()) {
    t = SymType::STR;
  }

  return t;
}

/**
 * @brief Completed.
 * @return SymType::UNDEFINED if error.
 */
std::any SemanticVisitor::visitAssignment(WPLParser::AssignmentContext *ctx) {
  SymType t = SymType::UNDEFINED;

  if (ctx->targets.size() != ctx->exprs.size()){
    errors.addSemanticError(ctx->getStart(), "Need equal number of target pairs in expression!");
    return t;
  }

  for (unsigned long i = 0; i < ctx->targets.size(); i++){
    std::string id = ctx->targets[i]->getText();
    Symbol *symbol = stmgr->findSymbol(id);
    if (symbol != nullptr){
      bindings->bind(ctx, symbol);
      symbol->defined = true;
    }
    else {
      errors.addSemanticError(ctx->getStart(), id + " is undeclared!");
      return t;
    }

    t = std::any_cast<SymType>(ctx->exprs[i]->accept(this));

    if (symbol->type == SymType::UNDEFINED){
      symbol->type = t;
    }
    else if (symbol->type != t){
      errors.addSemanticError(ctx->getStart(), id + " is a type mismatch!");
    }
  }

  return t;
}

/*
* Not going to finish
*/
std::any SemanticVisitor::visitArrayIndex(WPLParser::ArrayIndexContext *ctx) {
  return SymType::UNDEFINED;
}

/**
 * @brief Completed
 * @return SymType::BOOL if there are no errors or SymType::UNDEFINED if there are errors.
 */
std::any SemanticVisitor::visitAndExpr(WPLParser::AndExprContext *ctx) {
  SymType leftE = std::any_cast<SymType>(ctx->left->accept(this));
  SymType rightE = std::any_cast<SymType>(ctx->right->accept(this));

  if (leftE != SymType::BOOL || rightE != SymType::BOOL){
    errors.addSemanticError(ctx->getStart(), "Booleans resultants required for AND expression!");
  }

  return SymType::BOOL;
}

/**
 * @brief  id.type = str
 * @return SymType::STRING if id != nullptr. SymType::UNDEFINED if there is an error. 
 */
std::any SemanticVisitor::visitIDExpr(WPLParser::IDExprContext *ctx) {
  std::string id = ctx->ID()->getText();
  Symbol *symbol = stmgr->findSymbol(id);
  SymType t = SymType::UNDEFINED;

  if (symbol == nullptr) {
    errors.addSemanticError(ctx->getStart(), id + " is not declared!");
  } else {
    t = symbol->type;
    bindings->bind(ctx, symbol);
  } 

  return t;
}

/*
* Not going to finish
*/
std::any SemanticVisitor::visitSubscriptExpr(WPLParser::SubscriptExprContext *ctx) {
  return SymType::UNDEFINED;
}

/**
 * @brief Completed
 * @return SymType::INT if there are no errors or SymType::UNDEFINED if there are errors.
 */
std::any SemanticVisitor::visitRelExpr(WPLParser::RelExprContext *ctx) {
  SymType leftE = std::any_cast<SymType>(ctx->left->accept(this));
  SymType rightE = std::any_cast<SymType>(ctx->right->accept(this));
  
  if (leftE != SymType::INT || rightE != SymType::INT){
    errors.addSemanticError(ctx->getStart(), "Can not relationally compare non integer types!");
  }

  return SymType::BOOL;
}

/**
 * @brief AddExpr.type = SymType::INT && left.type == right.type
 * 
 * @return SymType::INT if there are no errors or SymType::UNDEFINED if there are errors.
*/
std::any SemanticVisitor::visitMultExpr(WPLParser::MultExprContext *ctx) {
  SymType leftE = std::any_cast<SymType>(ctx->left->accept(this));
  SymType rightE = std::any_cast<SymType>(ctx->right->accept(this));
  
  if (leftE != SymType::INT || rightE != SymType::INT){
    errors.addSemanticError(ctx->getStart(), "Cannot multiply/divide non integer types!");
  }

  return SymType::INT;
}

/**
 * @brief AddExpr.type = SymType::INT && left.type == right.type
 * 
 * @return SymType::INT if there are no errors or SymType::UNDEFINED if there are errors.
 */
std::any SemanticVisitor::visitAddExpr(WPLParser::AddExprContext *ctx) {
  SymType leftE = std::any_cast<SymType>(ctx->left->accept(this));
  SymType rightE = std::any_cast<SymType>(ctx->right->accept(this));

  if (leftE != SymType::INT || rightE != SymType::INT){
    errors.addSemanticError(ctx->getStart(), "Cannot add/subtract non integer types!");
  }

  return SymType::INT;
}
/*
* Not going to finsih
*/
std::any SemanticVisitor::visitArrayLengthExpr(WPLParser::ArrayLengthExprContext *ctx) {
  return SymType::UNDEFINED;
}

/**
 * @brief UnaryMinusExpr.type = ex.type && ex.type == INT;
 * @return SymTyp::INT if no error, SymType::UNDEFINED if an error.
 */
std::any SemanticVisitor::visitUMinusExpr(WPLParser::UMinusExprContext *ctx) {
  SymType e = std::any_cast<SymType>(ctx->e->accept(this));

  if (e != SymType::INT){
    errors.addSemanticError(ctx->getStart(), "Unary Minus requires INT!");
  }

  return SymType::INT;
}

/**
 * @brief Completed
 * @return SymType::BOOL if there are no errors or SymType::UNDEFINED if there are errors.
 */
std::any SemanticVisitor::visitOrExpr(WPLParser::OrExprContext *ctx) {
  SymType leftE = std::any_cast<SymType>(ctx->left->accept(this));
  SymType rightE = std::any_cast<SymType>(ctx->right->accept(this));

  if (leftE != SymType::BOOL || rightE != SymType::BOOL) {
    errors.addSemanticError(ctx->getStart(), "Booleans resultants required for OR expression!");
  }

  return SymType::BOOL;
}

/**
 * @brief EQExpr.type = SymType::BOOL && left.type == right.type
 * @return SymType::BOOL if there are no errors or SymType::UNDEFINED if there are errors.
 */
std::any SemanticVisitor::visitEqExpr(WPLParser::EqExprContext *ctx) {
  SymType leftE = std::any_cast<SymType>(ctx->left->accept(this));
  SymType rightE = std::any_cast<SymType>(ctx->right->accept(this));

  if (leftE != rightE){
    errors.addSemanticError(ctx->getStart(), "Both sides of the EQ expression must be the same type!");
  }

  return SymType::BOOL;
}

/**
 * @brief Completed
 * @return SymType is contingint on expr() 
 */
std::any SemanticVisitor::visitFuncProcCallExpr(WPLParser::FuncProcCallExprContext *ctx) {
  std::string id = ctx->fpname->getText();
  Symbol *symbol = stmgr->findSymbol(id);
  SymType t = SymType::UNDEFINED;

  if (symbol == nullptr) {
    errors.addSemanticError(ctx->getStart(), id + " is not declared!");
  } else {
    t = symbol->type;
  } 
  for (WPLParser::ExprContext* arg : ctx->args){
    arg->accept(this);
  }

  return t;
}

/**
 * @brief Completed
 * @return SymType::BOOL if valid, SymType::UNDEFINED if error.
 */
std::any SemanticVisitor::visitNotExpr(WPLParser::NotExprContext *ctx) {
  SymType e = std::any_cast<SymType>(ctx->e->accept(this));
  if (e != SymType::BOOL){
    errors.addSemanticError(ctx->getStart(), "Not Expression requires BOOL type!");
  }

  return SymType::BOOL;
}

/**
 * @brief Completed
 * @return SymType::UNDEFINED if error, SymType::BOOL if correct.
 */
std::any SemanticVisitor::visitLoop(WPLParser::LoopContext *ctx) {
  SymType t = std::any_cast<SymType>(ctx->e->accept(this));
  if (t != SymType::BOOL) {
    errors.addSemanticError(ctx->getStart(), "Expected Boolean type for loop condition, got: " + Symbol::getSymTypeName(t));
    return SymType::UNDEFINED;
  }
  ctx->block()->accept(this);
  return SymType::BOOL;
}

/**
 * @brief **** Still working on ****
 * @return SymType::UNDEFINED.
  */
std::any SemanticVisitor::visitConditional(WPLParser::ConditionalContext *ctx) {
  SymType conditionE = std::any_cast<SymType>(ctx->e->accept(this));
  if (conditionE != SymType::BOOL){
    errors.addSemanticError(ctx->getStart(), "BOOL Expr required for if statement!");
  }
  
  ctx->validBlock->accept(this);

  if (ctx->invalidBlock){
    ctx->invalidBlock->accept(this);
  }
  return SymType::UNDEFINED;
}

/**
 * @brief ParenExpr.type = ex.type
 */ 
std::any SemanticVisitor::visitParenExpr(WPLParser::ParenExprContext *ctx) {
  return std::any_cast<SymType>(ctx->expr()->accept(this));
}