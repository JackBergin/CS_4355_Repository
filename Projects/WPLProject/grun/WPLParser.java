// Generated from WPL.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WPLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ENDIF=2, PRINT=3, INT=4, BOOL=5, STR=6, LEXERVARIABLEOPERATORS=7, 
		LEXERCOMPARISONOPERATORS=8, ASSIGN=9, SET=10, UNEQUAL=11, EQUAL=12, MULTIPLY=13, 
		DIVIDE=14, PLUS=15, MINUS=16, GREATER=17, GREATEREQUAL=18, LESS=19, LESSEQUAL=20, 
		NOT=21, AND=22, OR=23, SEMICOLON=24, QUOTE=25, LBRAC=26, RBRAC=27, LPAREN=28, 
		RPAREN=29, FALSE=30, TRUE=31, WS=32, VARIABLE=33, INTEGER=34, STRING=35, 
		BOOLEAN=36;
	public static final int
		RULE_program = 0, RULE_typeAssign = 1, RULE_declaration = 2, RULE_statement = 3, 
		RULE_ifstatement = 4, RULE_printf = 5, RULE_assignment = 6, RULE_set = 7, 
		RULE_array = 8, RULE_expression = 9, RULE_term = 10, RULE_identifier = 11, 
		RULE_type = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "typeAssign", "declaration", "statement", "ifstatement", "printf", 
			"assignment", "set", "array", "expression", "term", "identifier", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'endif'", "'print'", "'int'", "'boolean'", "'str'", null, 
			null, "':='", "'<-'", "'~='", "'='", "'*'", "'/'", "'+'", "'-'", "'>'", 
			"'>='", "'<'", "'<='", "'~'", "'&'", "'|'", "';'", "'\"'", "'['", "']'", 
			"'('", "')'", "'false'", "'true'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ENDIF", "PRINT", "INT", "BOOL", "STR", "LEXERVARIABLEOPERATORS", 
			"LEXERCOMPARISONOPERATORS", "ASSIGN", "SET", "UNEQUAL", "EQUAL", "MULTIPLY", 
			"DIVIDE", "PLUS", "MINUS", "GREATER", "GREATEREQUAL", "LESS", "LESSEQUAL", 
			"NOT", "AND", "OR", "SEMICOLON", "QUOTE", "LBRAC", "RBRAC", "LPAREN", 
			"RPAREN", "FALSE", "TRUE", "WS", "VARIABLE", "INTEGER", "STRING", "BOOLEAN"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "WPL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public WPLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(26);
					declaration();
					}
					} 
				}
				setState(31);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINT) | (1L << INT) | (1L << BOOL) | (1L << STR) | (1L << VARIABLE))) != 0)) {
				{
				{
				setState(32);
				statement();
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeAssignContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(WPLParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(WPLParser.BOOL, 0); }
		public TerminalNode STR() { return getToken(WPLParser.STR, 0); }
		public TypeAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).enterTypeAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).exitTypeAssign(this);
		}
	}

	public final TypeAssignContext typeAssign() throws RecognitionException {
		TypeAssignContext _localctx = new TypeAssignContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_typeAssign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << STR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public TypeAssignContext typeAssign() {
			return getRuleContext(TypeAssignContext.class,0);
		}
		public TerminalNode VARIABLE() { return getToken(WPLParser.VARIABLE, 0); }
		public TerminalNode SEMICOLON() { return getToken(WPLParser.SEMICOLON, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			typeAssign();
			setState(41);
			match(VARIABLE);
			setState(42);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public IfstatementContext ifstatement() {
			return getRuleContext(IfstatementContext.class,0);
		}
		public PrintfContext printf() {
			return getRuleContext(PrintfContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				ifstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				printf();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				assignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(47);
				set();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(48);
				array();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfstatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(WPLParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(WPLParser.LPAREN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LEXERCOMPARISONOPERATORS() { return getToken(WPLParser.LEXERCOMPARISONOPERATORS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(WPLParser.RPAREN, 0); }
		public TerminalNode ENDIF() { return getToken(WPLParser.ENDIF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).enterIfstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).exitIfstatement(this);
		}
	}

	public final IfstatementContext ifstatement() throws RecognitionException {
		IfstatementContext _localctx = new IfstatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(IF);
			setState(52);
			match(LPAREN);
			setState(53);
			identifier();
			setState(54);
			match(LEXERCOMPARISONOPERATORS);
			setState(55);
			type();
			setState(56);
			match(RPAREN);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINT) | (1L << INT) | (1L << BOOL) | (1L << STR) | (1L << VARIABLE))) != 0)) {
				{
				{
				setState(57);
				statement();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			match(ENDIF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintfContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(WPLParser.PRINT, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(WPLParser.SEMICOLON, 0); }
		public PrintfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).enterPrintf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).exitPrintf(this);
		}
	}

	public final PrintfContext printf() throws RecognitionException {
		PrintfContext _localctx = new PrintfContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_printf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(PRINT);
			setState(66);
			term();
			setState(67);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(WPLParser.VARIABLE, 0); }
		public TerminalNode ASSIGN() { return getToken(WPLParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(WPLParser.SEMICOLON, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(VARIABLE);
			setState(70);
			match(ASSIGN);
			setState(71);
			expression();
			setState(72);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetContext extends ParserRuleContext {
		public TypeAssignContext typeAssign() {
			return getRuleContext(TypeAssignContext.class,0);
		}
		public TerminalNode VARIABLE() { return getToken(WPLParser.VARIABLE, 0); }
		public TerminalNode SET() { return getToken(WPLParser.SET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(WPLParser.SEMICOLON, 0); }
		public SetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).enterSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).exitSet(this);
		}
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			typeAssign();
			setState(75);
			match(VARIABLE);
			setState(76);
			match(SET);
			setState(77);
			expression();
			setState(78);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(WPLParser.VARIABLE, 0); }
		public TerminalNode ASSIGN() { return getToken(WPLParser.ASSIGN, 0); }
		public TerminalNode LBRAC() { return getToken(WPLParser.LBRAC, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRAC() { return getToken(WPLParser.RBRAC, 0); }
		public TerminalNode SEMICOLON() { return getToken(WPLParser.SEMICOLON, 0); }
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(VARIABLE);
			setState(81);
			match(ASSIGN);
			setState(82);
			match(LBRAC);
			setState(83);
			expression();
			setState(84);
			match(RBRAC);
			setState(85);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode LEXERVARIABLEOPERATORS() { return getToken(WPLParser.LEXERVARIABLEOPERATORS, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expression);
		try {
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				term();
				setState(89);
				match(LEXERVARIABLEOPERATORS);
				setState(90);
				term();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_term);
		try {
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				identifier();
				}
				break;
			case INTEGER:
			case STRING:
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(WPLParser.VARIABLE, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(VARIABLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(WPLParser.INTEGER, 0); }
		public TerminalNode STRING() { return getToken(WPLParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(WPLParser.BOOLEAN, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WPLListener ) ((WPLListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << STRING) | (1L << BOOLEAN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001$g\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007"+
		"\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002\f\u0007"+
		"\f\u0001\u0000\u0005\u0000\u001c\b\u0000\n\u0000\f\u0000\u001f\t\u0000"+
		"\u0001\u0000\u0005\u0000\"\b\u0000\n\u0000\f\u0000%\t\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u00032\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004;\b\u0004\n\u0004\f\u0004>\t\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t]\b\t\u0001\n\u0001\n\u0003\na\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0000\u0000\r\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u0000\u0002\u0001\u0000\u0004\u0006\u0001\u0000"+
		"\"$b\u0000\u001d\u0001\u0000\u0000\u0000\u0002&\u0001\u0000\u0000\u0000"+
		"\u0004(\u0001\u0000\u0000\u0000\u00061\u0001\u0000\u0000\u0000\b3\u0001"+
		"\u0000\u0000\u0000\nA\u0001\u0000\u0000\u0000\fE\u0001\u0000\u0000\u0000"+
		"\u000eJ\u0001\u0000\u0000\u0000\u0010P\u0001\u0000\u0000\u0000\u0012\\"+
		"\u0001\u0000\u0000\u0000\u0014`\u0001\u0000\u0000\u0000\u0016b\u0001\u0000"+
		"\u0000\u0000\u0018d\u0001\u0000\u0000\u0000\u001a\u001c\u0003\u0004\u0002"+
		"\u0000\u001b\u001a\u0001\u0000\u0000\u0000\u001c\u001f\u0001\u0000\u0000"+
		"\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000"+
		"\u0000\u001e#\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000"+
		" \"\u0003\u0006\u0003\u0000! \u0001\u0000\u0000\u0000\"%\u0001\u0000\u0000"+
		"\u0000#!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$\u0001\u0001"+
		"\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000&\'\u0007\u0000\u0000\u0000"+
		"\'\u0003\u0001\u0000\u0000\u0000()\u0003\u0002\u0001\u0000)*\u0005!\u0000"+
		"\u0000*+\u0005\u0018\u0000\u0000+\u0005\u0001\u0000\u0000\u0000,2\u0003"+
		"\b\u0004\u0000-2\u0003\n\u0005\u0000.2\u0003\f\u0006\u0000/2\u0003\u000e"+
		"\u0007\u000002\u0003\u0010\b\u00001,\u0001\u0000\u0000\u00001-\u0001\u0000"+
		"\u0000\u00001.\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000010\u0001"+
		"\u0000\u0000\u00002\u0007\u0001\u0000\u0000\u000034\u0005\u0001\u0000"+
		"\u000045\u0005\u001c\u0000\u000056\u0003\u0016\u000b\u000067\u0005\b\u0000"+
		"\u000078\u0003\u0018\f\u00008<\u0005\u001d\u0000\u00009;\u0003\u0006\u0003"+
		"\u0000:9\u0001\u0000\u0000\u0000;>\u0001\u0000\u0000\u0000<:\u0001\u0000"+
		"\u0000\u0000<=\u0001\u0000\u0000\u0000=?\u0001\u0000\u0000\u0000><\u0001"+
		"\u0000\u0000\u0000?@\u0005\u0002\u0000\u0000@\t\u0001\u0000\u0000\u0000"+
		"AB\u0005\u0003\u0000\u0000BC\u0003\u0014\n\u0000CD\u0005\u0018\u0000\u0000"+
		"D\u000b\u0001\u0000\u0000\u0000EF\u0005!\u0000\u0000FG\u0005\t\u0000\u0000"+
		"GH\u0003\u0012\t\u0000HI\u0005\u0018\u0000\u0000I\r\u0001\u0000\u0000"+
		"\u0000JK\u0003\u0002\u0001\u0000KL\u0005!\u0000\u0000LM\u0005\n\u0000"+
		"\u0000MN\u0003\u0012\t\u0000NO\u0005\u0018\u0000\u0000O\u000f\u0001\u0000"+
		"\u0000\u0000PQ\u0005!\u0000\u0000QR\u0005\t\u0000\u0000RS\u0005\u001a"+
		"\u0000\u0000ST\u0003\u0012\t\u0000TU\u0005\u001b\u0000\u0000UV\u0005\u0018"+
		"\u0000\u0000V\u0011\u0001\u0000\u0000\u0000W]\u0003\u0014\n\u0000XY\u0003"+
		"\u0014\n\u0000YZ\u0005\u0007\u0000\u0000Z[\u0003\u0014\n\u0000[]\u0001"+
		"\u0000\u0000\u0000\\W\u0001\u0000\u0000\u0000\\X\u0001\u0000\u0000\u0000"+
		"]\u0013\u0001\u0000\u0000\u0000^a\u0003\u0016\u000b\u0000_a\u0003\u0018"+
		"\f\u0000`^\u0001\u0000\u0000\u0000`_\u0001\u0000\u0000\u0000a\u0015\u0001"+
		"\u0000\u0000\u0000bc\u0005!\u0000\u0000c\u0017\u0001\u0000\u0000\u0000"+
		"de\u0007\u0001\u0000\u0000e\u0019\u0001\u0000\u0000\u0000\u0006\u001d"+
		"#1<\\`";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}