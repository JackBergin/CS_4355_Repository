grammar WPL;

program: declaration* statement* EOF;

// Lexer Rules: Type assignment
typeAssign: INT | BOOL | STR;

// Variable type assignment
declaration: typeAssign VARIABLE SEMICOLON;

// Statement logic
statement:
	ifstatement
	| printf
	| assignment
	| set
	| array
	| unary;

// If statements logic
ifstatement:
	IF LPAREN identifier LEXERCOMPARISONOPERATORS type RPAREN statement* ENDIF;

// Print statements logic
printf: PRINT term SEMICOLON;

// Assignment logic
assignment: VARIABLE ASSIGN expression SEMICOLON;

// Declaring and setting variable logic
set: typeAssign VARIABLE SET expression SEMICOLON;

// Unary logic:
unary: <assoc = right> LEXERUNARY expression;
// Array Logic
array: VARIABLE ASSIGN LBRAC expression RBRAC SEMICOLON;

// Expressions
expression:
	'(' expression ')'
	| term
	| term LEXERVARIABLEOPERATORS term;

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
LEXERVARIABLEOPERATORS: MULTIPLY | DIVIDE | PLUS | MINUS;

LEXERCOMPARISONOPERATORS:
	GREATER
	| UNEQUAL
	| EQUAL
	| GREATEREQUAL
	| LESS
	| LESSEQUAL
	| NOT
	| AND
	| OR;

LEXERUNARY: MINUS | NOT;
ASSIGN: ':=';
SET: '<-';
UNEQUAL: '~=';
EQUAL: '=';
MULTIPLY: '*';
DIVIDE: '/';
PLUS: '+';
MINUS: '-';
GREATER: '>';
GREATEREQUAL: '>=';
LESS: '<';
LESSEQUAL: '<=';
NOT: '~';
AND: '&';
OR: '|';

// Separators
SEMICOLON: ';';
QUOTE: '"';
LBRAC: '[';
RBRAC: ']';
LPAREN: '(';
RPAREN: ')';

// Boolean constants
FALSE: 'false';
TRUE: 'true';

// Integers
VARIABLE: [a-zA-Z]+;
INTEGER: [0-9][0-9]*;
STRING: '"' ~('"')* '"';
BOOLEAN: FALSE | TRUE;
//DECIMAL: [0-9]+ ( '.' [0-9]+)?;

// Ignore all white spaces 
WS: [ \n\t\r]+ -> skip;