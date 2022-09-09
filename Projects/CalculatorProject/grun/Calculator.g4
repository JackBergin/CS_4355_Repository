grammar Calculator;

program: (exprs += expression ';')+ EOF;

booleanConstant: TRUE | FALSE;
assignExpression: <assoc = right>VARIABLE ':=' expression;

expression:
	'(' expression ')'
	| <assoc = right> '-' expression
	| <assoc = right> '~' expression
	| expression ('*' | '/') expression
	| expression ('+' | '-') expression
	| expression ('<' | '>') expression
	| <assoc = right> expression ('=' | '~=') expression
	| assignExpression
	| booleanConstant
	| VARIABLE
	| INTEGER;

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