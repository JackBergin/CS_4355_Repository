grammar WPL2;

program: settype* statement*;

// Lexer Rules: Type assignment
typeAssign: INT | BOOL | STR;

// Variable type assignment
settype: typeAssign VARIABLE SEMICOLON;

// Statement logic
statement: ifstatement | printf | assignment;

// If statements logic
ifstatement:
	IF LPAREN identifier EQUAL type RPAREN statement* ENDIF;

// Print statements logic
printf: PRINT term SEMICOLON;

// Assignment logic
assignment: VARIABLE ASSIGN expression SEMICOLON;

// Expressions
expression: term | term LEXEROPERATORS term;

// Term logic breakdown
term: identifier | type;

// Identifier logic
identifier: VARIABLE;

// Logic of types
type: INTEGER | STRING | BOOLEAN;

// In depth logic
IF: 'if';
ENDIF: 'endif';
PRINT: 'print';

// Lexer Types
INT: 'int';
BOOL: 'boolean';
STR: 'str';

// Lexer Operators
LEXEROPERATORS:
	ASSIGN
	| DIVIDE
	| EQUAL
	| GREATER
	| LESS
	| MINUS
	| MULTIPLY
	| NOT
	| PLUS
	| UNEQUAL;

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

// Separators
SEMICOLON: ';';
LPAREN: '(';
RPAREN: ')';

// Boolean constants
FALSE: 'false';
TRUE: 'true';

// Integers
INTEGER: [0-9][0-9]*;
STRING: [a-zA-Z]+;
BOOLEAN: FALSE | TRUE;

// Variable names
VARIABLE: [a-z]+;

// Ignore all white spaces 
WS: [ \t\r\n]+ -> skip;