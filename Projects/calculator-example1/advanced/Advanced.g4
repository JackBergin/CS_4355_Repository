grammar Advanced;

text: ANY* EOF;

WS: [ \n\r]+ -> skip;
ANY: .;
SKIPME: 'skipme' -> skip;