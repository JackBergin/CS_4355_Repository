/*
 * Grammar file for the Calculator application.
 */
grammar Calculator; 

text            :   ANY EOF ;

// Lexer rules
ANY : [a-z]* ;