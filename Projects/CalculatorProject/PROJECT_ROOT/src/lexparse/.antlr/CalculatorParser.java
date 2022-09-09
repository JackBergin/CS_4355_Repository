// Generated from /Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Projects/CalculatorProject/PROJECT_ROOT/src/lexparse/Calculator.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ASSIGN=1, DIVIDE=2, EQUAL=3, GREATER=4, LESS=5, MINUS=6, MULTIPLY=7, NOT=8, 
		PLUS=9, UNEQUAL=10, LPAR=11, RPAR=12, SEMICOLON=13, FALSE=14, TRUE=15, 
		INTEGER=16, VARIABLE=17, WS=18;
	public static final int
		RULE_program = 0, RULE_plusExpr = 1, RULE_multExpr = 2, RULE_expression = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "plusExpr", "multExpr", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':='", "'/'", "'='", "'>'", "'<'", "'-'", "'*'", "'~'", "'+'", 
			"'~='", "'('", "')'", "';'", "'false'", "'true'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ASSIGN", "DIVIDE", "EQUAL", "GREATER", "LESS", "MINUS", "MULTIPLY", 
			"NOT", "PLUS", "UNEQUAL", "LPAR", "RPAR", "SEMICOLON", "FALSE", "TRUE", 
			"INTEGER", "VARIABLE", "WS"
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
	public String getGrammarFileName() { return "Calculator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CalculatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> exprs = new ArrayList<ExpressionContext>();
		public TerminalNode EOF() { return getToken(CalculatorParser.EOF, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(CalculatorParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CalculatorParser.SEMICOLON, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
			setState(13);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTEGER) {
				{
				{
				setState(8);
				((ProgramContext)_localctx).expression = expression();
				((ProgramContext)_localctx).exprs.add(((ProgramContext)_localctx).expression);
				setState(9);
				match(SEMICOLON);
				}
				}
				setState(15);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(16);
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

	public static class PlusExprContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> e1 = new ArrayList<ExpressionContext>();
		public TerminalNode PLUS() { return getToken(CalculatorParser.PLUS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PlusExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plusExpr; }
	}

	public final PlusExprContext plusExpr() throws RecognitionException {
		PlusExprContext _localctx = new PlusExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_plusExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			((PlusExprContext)_localctx).expression = expression();
			((PlusExprContext)_localctx).e1.add(((PlusExprContext)_localctx).expression);
			setState(19);
			match(PLUS);
			setState(20);
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

	public static class MultExprContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> e2 = new ArrayList<ExpressionContext>();
		public TerminalNode MULTIPLY() { return getToken(CalculatorParser.MULTIPLY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MultExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multExpr; }
	}

	public final MultExprContext multExpr() throws RecognitionException {
		MultExprContext _localctx = new MultExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_multExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			((MultExprContext)_localctx).expression = expression();
			((MultExprContext)_localctx).e2.add(((MultExprContext)_localctx).expression);
			setState(23);
			match(MULTIPLY);
			setState(24);
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(CalculatorParser.INTEGER, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(INTEGER);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24\37\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\7\2\16\n\2\f\2\16\2\21\13\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\2\2\6\2\4\6\b\2\2\2\33\2\17"+
		"\3\2\2\2\4\24\3\2\2\2\6\30\3\2\2\2\b\34\3\2\2\2\n\13\5\b\5\2\13\f\7\17"+
		"\2\2\f\16\3\2\2\2\r\n\3\2\2\2\16\21\3\2\2\2\17\r\3\2\2\2\17\20\3\2\2\2"+
		"\20\22\3\2\2\2\21\17\3\2\2\2\22\23\7\2\2\3\23\3\3\2\2\2\24\25\5\b\5\2"+
		"\25\26\7\13\2\2\26\27\5\b\5\2\27\5\3\2\2\2\30\31\5\b\5\2\31\32\7\t\2\2"+
		"\32\33\5\b\5\2\33\7\3\2\2\2\34\35\7\22\2\2\35\t\3\2\2\2\3\17";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}