/**
 * @file CodegenVisitor.h
 * @author Jack Bergin
 * @brief Code generating visitor header. 
 * @version 0.1
 * @date 2022-10-15 to 2022-10-29
 */

#pragma once
#include "antlr4-runtime.h"
#include "WPLBaseVisitor.h"
#include "PropertyManager.h"
#include "WPLErrorHandler.h"
#include "SemanticVisitor.h"
#include "llvm/ADT/StringRef.h"
#include "llvm/IR/IRBuilder.h"
#include "llvm/IR/LLVMContext.h"
#include "llvm/IR/Module.h"
#include "llvm/Support/raw_ostream.h"
#include "llvm/IR/NoFolder.h"

using namespace llvm;
class CodegenVisitor : WPLBaseVisitor {

public:
  // Create a constructor to add the generic types
  CodegenVisitor(PropertyManager *pm, std::string moduleName) {
    props = pm;
    context = new LLVMContext();
    module = new Module(moduleName, *context);
    builder = new IRBuilder<NoFolder>(module->getContext());

    VoidTy = Type::getVoidTy(module->getContext());
    Int32Ty = Type::getInt32Ty(module->getContext());
    Int1Ty = Type::getInt1Ty(module->getContext());
    Int8Ty = Type::getInt8Ty(module->getContext());
    Int32Zero = ConstantInt::get(Int32Ty, 0, true);
    Int32One = ConstantInt::get(Int32Ty, 1, true);
    i8p = Type::getInt8PtrTy(module->getContext());
    Int8PtrPtrTy = i8p->getPointerTo();
    ReturningBlockIndicator = Type::getPPC_FP128Ty(module->getContext());
  }

  std::any visitCompilationUnit(WPLParser::CompilationUnitContext *ctx) override;
  std::any visitFunction(WPLParser::FunctionContext *ctx) override;
  std::any visitProcedure(WPLParser::ProcedureContext *ctx) override;
  std::any visitFuncProcCallExpr(WPLParser::FuncProcCallExprContext *ctx) override;
  std::any visitCall(WPLParser::CallContext *ctx) override;
  std::any visitReturn(WPLParser::ReturnContext *ctx) override;
  std::any visitScalarDeclaration(WPLParser::ScalarDeclarationContext *ctx) override;
  std::any visitAssignment(WPLParser::AssignmentContext *ctx) override;
  std::any visitExternDeclaration(WPLParser::ExternDeclarationContext *ctx) override;
  std::any visitConstant(WPLParser::ConstantContext *ctx) override;
  std::any visitIDExpr(WPLParser::IDExprContext *ctx) override;
  std::any visitRelExpr(WPLParser::RelExprContext *ctx) override;
  std::any visitNotExpr(WPLParser::NotExprContext *ctx) override;
  std::any visitAndExpr(WPLParser::AndExprContext *ctx) override;
  std::any visitOrExpr(WPLParser::OrExprContext *ctx) override;
  std::any visitEqExpr(WPLParser::EqExprContext *ctx) override;
  std::any visitUMinusExpr(WPLParser::UMinusExprContext *ctx) override;
  std::any visitMultExpr(WPLParser::MultExprContext *ctx) override;
  std::any visitAddExpr(WPLParser::AddExprContext *ctx) override;
  std::any visitConditional(WPLParser::ConditionalContext *ctx) override;
  std::any visitSelect(WPLParser::SelectContext *ctx) override;
  std::any visitLoop(WPLParser::LoopContext *ctx) override;
  std::any visitBlock(WPLParser::BlockContext *ctx) override;
  std::any visitParenExpr(WPLParser::ParenExprContext *ctx) override;
  std::any visitStatement(WPLParser::StatementContext *ctx) override;

  std::string getErrors() { 
    return errors.errorList(); 
  }
  PropertyManager *getProperties() { 
    return props; 
  }
  bool hasErrors() { 
    return errors.hasErrors(); 
  }
  llvm::Module *getModule() { 
    return module; 
  }
  void modPrint() { 
    module -> print(llvm::outs(), nullptr); 
  }

  Type* llvmTypeFromWPLType(WPLParser::TypeContext* tctx);
  Type* llvmTypeFromSymType(SymType tctx);

private:
  PropertyManager *props;
  WPLErrorHandler errors;

  // LLVM items
  LLVMContext *context;
  Module *module;
  IRBuilder<NoFolder> *builder;

  // Cache commonly used 
  Type *VoidTy;
  Type *Int1Ty;
  Type *Int8Ty;
  Type *Int32Ty;
  Type * i8p;
  Type *Int8PtrPtrTy;
  Type *ReturningBlockIndicator;
  Constant *Int32Zero;
  Constant *Int32One;
};