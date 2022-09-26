// Generated from /Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Projects/WPLProject/Tests/WPL2.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WPL2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ENDIF=2, PRINT=3, INT=4, BOOL=5, STR=6, LEXEROPERATORS=7, ASSIGN=8, 
		DIVIDE=9, EQUAL=10, GREATER=11, LESS=12, MINUS=13, MULTIPLY=14, NOT=15, 
		PLUS=16, UNEQUAL=17, SEMICOLON=18, LPAREN=19, RPAREN=20, FALSE=21, TRUE=22, 
		INTEGER=23, STRING=24, BOOLEAN=25, VARIABLE=26, WS=27;
	public static final int
		RULE_program = 0, RULE_typeAssign = 1, RULE_settype = 2, RULE_statement = 3, 
		RULE_ifstatement = 4, RULE_printf = 5, RULE_assignment = 6, RULE_expression = 7, 
		RULE_term = 8, RULE_identifier = 9, RULE_type = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "typeAssign", "settype", "statement", "ifstatement", "printf", 
			"assignment", "expression", "term", "identifier", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'endif'", "'print'", "'int'", "'boolean'", "'str'", null, 
			"':='", "'/'", "'='", "'>'", "'<'", "'-'", "'*'", "'~'", "'+'", "'~='", 
			"';'", "'('", "')'", "'false'", "'true'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ENDIF", "PRINT", "INT", "BOOL", "STR", "LEXEROPERATORS", 
			"ASSIGN", "DIVIDE", "EQUAL", "GREATER", "LESS", "MINUS", "MULTIPLY", 
			"NOT", "PLUS", "UNEQUAL", "SEMICOLON", "LPAREN", "RPAREN", "FALSE", "TRUE", 
			"INTEGER", "STRING", "BOOLEAN", "VARIABLE", "WS"
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
	public String getGrammarFileName() { return "WPL2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public WPL2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<SettypeContext> settype() {
			return getRuleContexts(SettypeContext.class);
		}
		public SettypeContext settype(int i) {
			return getRuleContext(SettypeContext.class,i);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << STR))) != 0)) {
				{
				{
				setState(22);
				settype();
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINT) | (1L << VARIABLE))) != 0)) {
				{
				{
				setState(28);
				statement();
				}
				}
				setState(33);
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
		public TerminalNode INT() { return getToken(WPL2Parser.INT, 0); }
		public TerminalNode BOOL() { return getToken(WPL2Parser.BOOL, 0); }
		public TerminalNode STR() { return getToken(WPL2Parser.STR, 0); }
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
			setState(34);
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

	public static class SettypeContext extends ParserRuleContext {
		public TypeAssignContext typeAssign() {
			return getRuleContext(TypeAssignContext.class,0);
		}
		public TerminalNode VARIABLE() { return getToken(WPL2Parser.VARIABLE, 0); }
		public TerminalNode SEMICOLON() { return getToken(WPL2Parser.SEMICOLON, 0); }
		public SettypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_settype; }
	}

	public final SettypeContext settype() throws RecognitionException {
		SettypeContext _localctx = new SettypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_settype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			typeAssign();
			setState(37);
			match(VARIABLE);
			setState(38);
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(43);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				ifstatement();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				printf();
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				assignment();
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

	public static class IfstatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(WPL2Parser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(WPL2Parser.LPAREN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(WPL2Parser.EQUAL, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(WPL2Parser.RPAREN, 0); }
		public TerminalNode ENDIF() { return getToken(WPL2Parser.ENDIF, 0); }
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
			setState(45);
			match(IF);
			setState(46);
			match(LPAREN);
			setState(47);
			identifier();
			setState(48);
			match(EQUAL);
			setState(49);
			type();
			setState(50);
			match(RPAREN);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINT) | (1L << VARIABLE))) != 0)) {
				{
				{
				setState(51);
				statement();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
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
		public TerminalNode PRINT() { return getToken(WPL2Parser.PRINT, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(WPL2Parser.SEMICOLON, 0); }
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
			setState(59);
			match(PRINT);
			setState(60);
			term();
			setState(61);
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
		public TerminalNode VARIABLE() { return getToken(WPL2Parser.VARIABLE, 0); }
		public TerminalNode ASSIGN() { return getToken(WPL2Parser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(WPL2Parser.SEMICOLON, 0); }
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
			setState(63);
			match(VARIABLE);
			setState(64);
			match(ASSIGN);
			setState(65);
			expression();
			setState(66);
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
		public TerminalNode LEXEROPERATORS() { return getToken(WPL2Parser.LEXEROPERATORS, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expression);
		try {
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				term();
				setState(70);
				match(LEXEROPERATORS);
				setState(71);
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
		enterRule(_localctx, 16, RULE_term);
		try {
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				identifier();
				}
				break;
			case INTEGER:
			case STRING:
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
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
		public TerminalNode VARIABLE() { return getToken(WPL2Parser.VARIABLE, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
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
		public TerminalNode INTEGER() { return getToken(WPL2Parser.INTEGER, 0); }
		public TerminalNode STRING() { return getToken(WPL2Parser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(WPL2Parser.BOOLEAN, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35V\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\2\7\2 \n\2\f\2\16\2#\13\2\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\5\5.\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\7\6\67\n\6\f\6\16\6:\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\5\tL\n\t\3\n\3\n\5\nP\n\n\3\13\3\13\3\f\3\f\3\f\2"+
		"\2\r\2\4\6\b\n\f\16\20\22\24\26\2\4\3\2\6\b\3\2\31\33\2Q\2\33\3\2\2\2"+
		"\4$\3\2\2\2\6&\3\2\2\2\b-\3\2\2\2\n/\3\2\2\2\f=\3\2\2\2\16A\3\2\2\2\20"+
		"K\3\2\2\2\22O\3\2\2\2\24Q\3\2\2\2\26S\3\2\2\2\30\32\5\6\4\2\31\30\3\2"+
		"\2\2\32\35\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34!\3\2\2\2\35\33\3\2\2"+
		"\2\36 \5\b\5\2\37\36\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"\3\3\2"+
		"\2\2#!\3\2\2\2$%\t\2\2\2%\5\3\2\2\2&\'\5\4\3\2\'(\7\34\2\2()\7\24\2\2"+
		")\7\3\2\2\2*.\5\n\6\2+.\5\f\7\2,.\5\16\b\2-*\3\2\2\2-+\3\2\2\2-,\3\2\2"+
		"\2.\t\3\2\2\2/\60\7\3\2\2\60\61\7\25\2\2\61\62\5\24\13\2\62\63\7\f\2\2"+
		"\63\64\5\26\f\2\648\7\26\2\2\65\67\5\b\5\2\66\65\3\2\2\2\67:\3\2\2\28"+
		"\66\3\2\2\289\3\2\2\29;\3\2\2\2:8\3\2\2\2;<\7\4\2\2<\13\3\2\2\2=>\7\5"+
		"\2\2>?\5\22\n\2?@\7\24\2\2@\r\3\2\2\2AB\7\34\2\2BC\7\n\2\2CD\5\20\t\2"+
		"DE\7\24\2\2E\17\3\2\2\2FL\5\22\n\2GH\5\22\n\2HI\7\t\2\2IJ\5\22\n\2JL\3"+
		"\2\2\2KF\3\2\2\2KG\3\2\2\2L\21\3\2\2\2MP\5\24\13\2NP\5\26\f\2OM\3\2\2"+
		"\2ON\3\2\2\2P\23\3\2\2\2QR\7\34\2\2R\25\3\2\2\2ST\t\3\2\2T\27\3\2\2\2"+
		"\b\33!-8KO";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}