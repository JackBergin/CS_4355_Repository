// Generated from /Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Projects/WPLProject/grun/WPL.g4 by ANTLR 4.9.2
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
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ENDIF=2, PRINT=3, INT=4, BOOL=5, STR=6, LEXERVARIABLEOPERATORS=7, 
		LEXERCOMPARISONOPERATORS=8, LEXERUNARY=9, ASSIGN=10, SET=11, UNEQUAL=12, 
		EQUAL=13, MULTIPLY=14, DIVIDE=15, PLUS=16, MINUS=17, GREATER=18, GREATEREQUAL=19, 
		LESS=20, LESSEQUAL=21, NOT=22, AND=23, OR=24, SEMICOLON=25, QUOTE=26, 
		LBRAC=27, RBRAC=28, LPAREN=29, RPAREN=30, FALSE=31, TRUE=32, VARIABLE=33, 
		INTEGER=34, STRING=35, BOOLEAN=36, WS=37;
	public static final int
		RULE_program = 0, RULE_typeAssign = 1, RULE_declaration = 2, RULE_statement = 3, 
		RULE_ifstatement = 4, RULE_printf = 5, RULE_assignment = 6, RULE_set = 7, 
		RULE_unary = 8, RULE_array = 9, RULE_expression = 10, RULE_term = 11, 
		RULE_identifier = 12, RULE_type = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "typeAssign", "declaration", "statement", "ifstatement", "printf", 
			"assignment", "set", "unary", "array", "expression", "term", "identifier", 
			"type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'endif'", "'print'", "'int'", "'boolean'", "'str'", null, 
			null, null, "':='", "'<-'", "'~='", "'='", "'*'", "'/'", "'+'", "'-'", 
			"'>'", "'>='", "'<'", "'<='", "'~'", "'&'", "'|'", "';'", "'\"'", "'['", 
			"']'", "'('", "')'", "'false'", "'true'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ENDIF", "PRINT", "INT", "BOOL", "STR", "LEXERVARIABLEOPERATORS", 
			"LEXERCOMPARISONOPERATORS", "LEXERUNARY", "ASSIGN", "SET", "UNEQUAL", 
			"EQUAL", "MULTIPLY", "DIVIDE", "PLUS", "MINUS", "GREATER", "GREATEREQUAL", 
			"LESS", "LESSEQUAL", "NOT", "AND", "OR", "SEMICOLON", "QUOTE", "LBRAC", 
			"RBRAC", "LPAREN", "RPAREN", "FALSE", "TRUE", "VARIABLE", "INTEGER", 
			"STRING", "BOOLEAN", "WS"
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
		public TerminalNode EOF() { return getToken(WPLParser.EOF, 0); }
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
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(28);
					declaration();
					}
					} 
				}
				setState(33);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINT) | (1L << INT) | (1L << BOOL) | (1L << STR) | (1L << LEXERUNARY) | (1L << VARIABLE))) != 0)) {
				{
				{
				setState(34);
				statement();
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
			match(EOF);
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
	}

	public final TypeAssignContext typeAssign() throws RecognitionException {
		TypeAssignContext _localctx = new TypeAssignContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_typeAssign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
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
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			typeAssign();
			setState(45);
			match(VARIABLE);
			setState(46);
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
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				ifstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				printf();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				assignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(51);
				set();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(52);
				array();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(53);
				unary();
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
	}

	public final IfstatementContext ifstatement() throws RecognitionException {
		IfstatementContext _localctx = new IfstatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(IF);
			setState(57);
			match(LPAREN);
			setState(58);
			identifier();
			setState(59);
			match(LEXERCOMPARISONOPERATORS);
			setState(60);
			type();
			setState(61);
			match(RPAREN);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINT) | (1L << INT) | (1L << BOOL) | (1L << STR) | (1L << LEXERUNARY) | (1L << VARIABLE))) != 0)) {
				{
				{
				setState(62);
				statement();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
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
	}

	public final PrintfContext printf() throws RecognitionException {
		PrintfContext _localctx = new PrintfContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_printf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(PRINT);
			setState(71);
			term();
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
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(VARIABLE);
			setState(75);
			match(ASSIGN);
			setState(76);
			expression();
			setState(77);
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
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			typeAssign();
			setState(80);
			match(VARIABLE);
			setState(81);
			match(SET);
			setState(82);
			expression();
			setState(83);
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

	public static class UnaryContext extends ParserRuleContext {
		public TerminalNode LEXERUNARY() { return getToken(WPLParser.LEXERUNARY, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_unary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(LEXERUNARY);
			setState(86);
			expression();
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
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(VARIABLE);
			setState(89);
			match(ASSIGN);
			setState(90);
			match(LBRAC);
			setState(91);
			expression();
			setState(92);
			match(RBRAC);
			setState(93);
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
		public TerminalNode LPAREN() { return getToken(WPLParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(WPLParser.RPAREN, 0); }
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
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expression);
		try {
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				match(LPAREN);
				setState(96);
				expression();
				setState(97);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				term();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				term();
				setState(101);
				match(LEXERVARIABLEOPERATORS);
				setState(102);
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
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_term);
		try {
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				identifier();
				}
				break;
			case INTEGER:
			case STRING:
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
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
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
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
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'u\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\7\2 \n\2\f\2\16\2#\13\2\3\2\7\2"+
		"&\n\2\f\2\16\2)\13\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\59\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6B\n\6\f\6\16\6E\13\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\5\fk\n\f\3\r\3\r\5\ro\n\r\3\16\3\16\3\17\3\17\3\17\2\2\20\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\2\4\3\2\6\b\3\2$&\2q\2!\3\2\2\2\4,"+
		"\3\2\2\2\6.\3\2\2\2\b8\3\2\2\2\n:\3\2\2\2\fH\3\2\2\2\16L\3\2\2\2\20Q\3"+
		"\2\2\2\22W\3\2\2\2\24Z\3\2\2\2\26j\3\2\2\2\30n\3\2\2\2\32p\3\2\2\2\34"+
		"r\3\2\2\2\36 \5\6\4\2\37\36\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\""+
		"\'\3\2\2\2#!\3\2\2\2$&\5\b\5\2%$\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2"+
		"\2(*\3\2\2\2)\'\3\2\2\2*+\7\2\2\3+\3\3\2\2\2,-\t\2\2\2-\5\3\2\2\2./\5"+
		"\4\3\2/\60\7#\2\2\60\61\7\33\2\2\61\7\3\2\2\2\629\5\n\6\2\639\5\f\7\2"+
		"\649\5\16\b\2\659\5\20\t\2\669\5\24\13\2\679\5\22\n\28\62\3\2\2\28\63"+
		"\3\2\2\28\64\3\2\2\28\65\3\2\2\28\66\3\2\2\28\67\3\2\2\29\t\3\2\2\2:;"+
		"\7\3\2\2;<\7\37\2\2<=\5\32\16\2=>\7\n\2\2>?\5\34\17\2?C\7 \2\2@B\5\b\5"+
		"\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DF\3\2\2\2EC\3\2\2\2FG\7\4\2"+
		"\2G\13\3\2\2\2HI\7\5\2\2IJ\5\30\r\2JK\7\33\2\2K\r\3\2\2\2LM\7#\2\2MN\7"+
		"\f\2\2NO\5\26\f\2OP\7\33\2\2P\17\3\2\2\2QR\5\4\3\2RS\7#\2\2ST\7\r\2\2"+
		"TU\5\26\f\2UV\7\33\2\2V\21\3\2\2\2WX\7\13\2\2XY\5\26\f\2Y\23\3\2\2\2Z"+
		"[\7#\2\2[\\\7\f\2\2\\]\7\35\2\2]^\5\26\f\2^_\7\36\2\2_`\7\33\2\2`\25\3"+
		"\2\2\2ab\7\37\2\2bc\5\26\f\2cd\7 \2\2dk\3\2\2\2ek\5\30\r\2fg\5\30\r\2"+
		"gh\7\t\2\2hi\5\30\r\2ik\3\2\2\2ja\3\2\2\2je\3\2\2\2jf\3\2\2\2k\27\3\2"+
		"\2\2lo\5\32\16\2mo\5\34\17\2nl\3\2\2\2nm\3\2\2\2o\31\3\2\2\2pq\7#\2\2"+
		"q\33\3\2\2\2rs\t\3\2\2s\35\3\2\2\2\b!\'8Cjn";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}