// Generated from /Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Projects/calculator-example1/PROJECT_ROOT/src/lexparse/Calculator.g4 by ANTLR 4.9.2
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
		INTEGER=16, VARIABLE=17, TYPE=18, WS=19;
	public static final int
		RULE_program = 0, RULE_booleanConstant = 1, RULE_assignExpression = 2, 
		RULE_expression = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "booleanConstant", "assignExpression", "expression"
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
			"INTEGER", "VARIABLE", "TYPE", "WS"
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
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(8);
				((ProgramContext)_localctx).expression = expression(0);
				((ProgramContext)_localctx).exprs.add(((ProgramContext)_localctx).expression);
				setState(9);
				match(SEMICOLON);
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << NOT) | (1L << LPAR) | (1L << FALSE) | (1L << TRUE) | (1L << INTEGER) | (1L << VARIABLE))) != 0) );
			setState(15);
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

	public static class BooleanConstantContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(CalculatorParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CalculatorParser.FALSE, 0); }
		public BooleanConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanConstant; }
	}

	public final BooleanConstantContext booleanConstant() throws RecognitionException {
		BooleanConstantContext _localctx = new BooleanConstantContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_booleanConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
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

	public static class AssignExpressionContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(CalculatorParser.VARIABLE, 0); }
		public TerminalNode ASSIGN() { return getToken(CalculatorParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignExpression; }
	}

	public final AssignExpressionContext assignExpression() throws RecognitionException {
		AssignExpressionContext _localctx = new AssignExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			match(VARIABLE);
			setState(20);
			match(ASSIGN);
			setState(21);
			expression(0);
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
		public TerminalNode LPAR() { return getToken(CalculatorParser.LPAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(CalculatorParser.RPAR, 0); }
		public TerminalNode MINUS() { return getToken(CalculatorParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(CalculatorParser.NOT, 0); }
		public AssignExpressionContext assignExpression() {
			return getRuleContext(AssignExpressionContext.class,0);
		}
		public BooleanConstantContext booleanConstant() {
			return getRuleContext(BooleanConstantContext.class,0);
		}
		public TerminalNode VARIABLE() { return getToken(CalculatorParser.VARIABLE, 0); }
		public TerminalNode INTEGER() { return getToken(CalculatorParser.INTEGER, 0); }
		public TerminalNode MULTIPLY() { return getToken(CalculatorParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(CalculatorParser.DIVIDE, 0); }
		public TerminalNode PLUS() { return getToken(CalculatorParser.PLUS, 0); }
		public TerminalNode LESS() { return getToken(CalculatorParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(CalculatorParser.GREATER, 0); }
		public TerminalNode EQUAL() { return getToken(CalculatorParser.EQUAL, 0); }
		public TerminalNode UNEQUAL() { return getToken(CalculatorParser.UNEQUAL, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(24);
				match(LPAR);
				setState(25);
				expression(0);
				setState(26);
				match(RPAR);
				}
				break;
			case 2:
				{
				setState(28);
				match(MINUS);
				setState(29);
				expression(10);
				}
				break;
			case 3:
				{
				setState(30);
				match(NOT);
				setState(31);
				expression(9);
				}
				break;
			case 4:
				{
				setState(32);
				assignExpression();
				}
				break;
			case 5:
				{
				setState(33);
				booleanConstant();
				}
				break;
			case 6:
				{
				setState(34);
				match(VARIABLE);
				}
				break;
			case 7:
				{
				setState(35);
				match(INTEGER);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(52);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(50);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(38);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(39);
						_la = _input.LA(1);
						if ( !(_la==DIVIDE || _la==MULTIPLY) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(40);
						expression(9);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(41);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(42);
						_la = _input.LA(1);
						if ( !(_la==MINUS || _la==PLUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(43);
						expression(8);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(44);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(45);
						_la = _input.LA(1);
						if ( !(_la==GREATER || _la==LESS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(46);
						expression(7);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(47);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(48);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==UNEQUAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(49);
						expression(5);
						}
						break;
					}
					} 
				}
				setState(54);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\25:\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\6\2\16\n\2\r\2\16\2\17\3\2\3\2\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5"+
		"\5\'\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\65\n\5\f"+
		"\5\16\58\13\5\3\5\2\3\b\6\2\4\6\b\2\7\3\2\20\21\4\2\4\4\t\t\4\2\b\b\13"+
		"\13\3\2\6\7\4\2\5\5\f\f\2@\2\r\3\2\2\2\4\23\3\2\2\2\6\25\3\2\2\2\b&\3"+
		"\2\2\2\n\13\5\b\5\2\13\f\7\17\2\2\f\16\3\2\2\2\r\n\3\2\2\2\16\17\3\2\2"+
		"\2\17\r\3\2\2\2\17\20\3\2\2\2\20\21\3\2\2\2\21\22\7\2\2\3\22\3\3\2\2\2"+
		"\23\24\t\2\2\2\24\5\3\2\2\2\25\26\7\23\2\2\26\27\7\3\2\2\27\30\5\b\5\2"+
		"\30\7\3\2\2\2\31\32\b\5\1\2\32\33\7\r\2\2\33\34\5\b\5\2\34\35\7\16\2\2"+
		"\35\'\3\2\2\2\36\37\7\b\2\2\37\'\5\b\5\f !\7\n\2\2!\'\5\b\5\13\"\'\5\6"+
		"\4\2#\'\5\4\3\2$\'\7\23\2\2%\'\7\22\2\2&\31\3\2\2\2&\36\3\2\2\2& \3\2"+
		"\2\2&\"\3\2\2\2&#\3\2\2\2&$\3\2\2\2&%\3\2\2\2\'\66\3\2\2\2()\f\n\2\2)"+
		"*\t\3\2\2*\65\5\b\5\13+,\f\t\2\2,-\t\4\2\2-\65\5\b\5\n./\f\b\2\2/\60\t"+
		"\5\2\2\60\65\5\b\5\t\61\62\f\7\2\2\62\63\t\6\2\2\63\65\5\b\5\7\64(\3\2"+
		"\2\2\64+\3\2\2\2\64.\3\2\2\2\64\61\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66"+
		"\67\3\2\2\2\67\t\3\2\2\28\66\3\2\2\2\6\17&\64\66";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}