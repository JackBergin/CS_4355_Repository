
// Generated from Calculator.g4 by ANTLR 4.10.1

#pragma once


#include "antlr4-runtime.h"
#include "CalculatorListener.h"


/**
 * This class provides an empty implementation of CalculatorListener,
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
class  CalculatorBaseListener : public CalculatorListener {
public:

  virtual void enterText(CalculatorParser::TextContext * /*ctx*/) override { }
  virtual void exitText(CalculatorParser::TextContext * /*ctx*/) override { }


  virtual void enterEveryRule(antlr4::ParserRuleContext * /*ctx*/) override { }
  virtual void exitEveryRule(antlr4::ParserRuleContext * /*ctx*/) override { }
  virtual void visitTerminal(antlr4::tree::TerminalNode * /*node*/) override { }
  virtual void visitErrorNode(antlr4::tree::ErrorNode * /*node*/) override { }

};

