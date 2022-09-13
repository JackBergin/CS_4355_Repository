TEST_CASE("Scanner operator tests", "[front-end]") {
  antlr4::ANTLRInputStream input(":= / = > < - * ~ + ~=");
  CalculatorLexer lexer(&input);
  lexer.removeErrorListeners();
  lexer.addErrorListener(new TestErrorListener());
  CHECK(lexer.nextToken()->getType() == lexer.ASSIGN);
  CHECK(lexer.nextToken()->getType() == lexer.DIVIDE);
  CHECK(lexer.nextToken()->getType() == lexer.EQUAL);
  CHECK(lexer.nextToken()->getType() == lexer.GREATER);
  CHECK(lexer.nextToken()->getType() == lexer.LESS);
  CHECK(lexer.nextToken()->getType() == lexer.MINUS);
  CHECK(lexer.nextToken()->getType() == lexer.MULTIPLY);
  CHECK(lexer.nextToken()->getType() == lexer.NOT);
  CHECK(lexer.nextToken()->getType() == lexer.PLUS);
  CHECK(lexer.nextToken()->getType() == lexer.UNEQUAL);
}