/*
 * Grammar file for the Calculator application.
 */
grammar Calculator;

program: (exprs += expression ';')* EOF;
plusExpr: e1 += expression '+' expression;
multExpr: e2 += expression '*' expression;
expression: INTEGER;

// Lexer rules Operators
ASSIGN: ':=';
DIVIDE: '/';
EQUAL: '=';
GREATER: '>';
LESS: '<';
MINUS: '-';
MULTIPLY: '*';
NOT: '~';
PLUS: '+';
UNEQUAL: '~=';

// Separators (punctuation)
LPAR: '(';
RPAR: ')';
SEMICOLON: ';';

// Boolean constants
FALSE: 'false';
TRUE: 'true';

// Other
INTEGER: [0-9]+;
VARIABLE: [a-zA-Z]+;

WS: [ \n\t\r]+ -> skip;