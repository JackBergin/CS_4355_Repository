// Generated from /Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Projects/SandboxProject/src/lexparse/WPL.g4 by ANTLR 4.9.2
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
		T__0=1, T__1=2, BOOL=3, INT=4, STR=5, VAR=6, PROC=7, FUNC=8, EXTERN=9, 
		RETURN=10, WHILE=11, SELECT=12, END=13, IF=14, THEN=15, ELSE=16, LENGTH=17, 
		AND=18, ASSIGN=19, EQUAL=20, GEQ=21, GTR=22, LEQ=23, LESS=24, MINUS=25, 
		NEQ=26, OR=27, PLUS=28, DIV=29, MUL=30, NOT=31, COMMA=32, SEMICOLON=33, 
		ELLIPSIS=34, DOT=35, LBRACKET=36, RBRACKET=37, LPAR=38, RPAR=39, LBRACE=40, 
		RBRACE=41, WS=42, INTEGER=43, BOOLEAN=44, ID=45, STRING=46, COMMENT=47;
	public static final int
		RULE_compilationUnit = 0, RULE_cuComponent = 1, RULE_varDeclaration = 2, 
		RULE_scalarDeclaration = 3, RULE_scalar = 4, RULE_arrayDeclaration = 5, 
		RULE_type = 6, RULE_varInitializer = 7, RULE_externDeclaration = 8, RULE_procedure = 9, 
		RULE_procHeader = 10, RULE_externProcHeader = 11, RULE_function = 12, 
		RULE_funcHeader = 13, RULE_externFuncHeader = 14, RULE_params = 15, RULE_block = 16, 
		RULE_statement = 17, RULE_loop = 18, RULE_conditional = 19, RULE_select = 20, 
		RULE_selectAlt = 21, RULE_call = 22, RULE_arguments = 23, RULE_arg = 24, 
		RULE_return = 25, RULE_constant = 26, RULE_assignment = 27, RULE_arrayIndex = 28, 
		RULE_expr = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "cuComponent", "varDeclaration", "scalarDeclaration", 
			"scalar", "arrayDeclaration", "type", "varInitializer", "externDeclaration", 
			"procedure", "procHeader", "externProcHeader", "function", "funcHeader", 
			"externFuncHeader", "params", "block", "statement", "loop", "conditional", 
			"select", "selectAlt", "call", "arguments", "arg", "return", "constant", 
			"assignment", "arrayIndex", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'do'", "':'", "'boolean'", "'int'", "'str'", "'var'", "'proc'", 
			"'func'", "'extern'", "'return'", "'while'", "'select'", "'end'", "'if'", 
			"'then'", "'else'", "'length'", "'&'", "'<-'", "'='", "'>='", "'>'", 
			"'<='", "'<'", "'-'", "'~='", "'|'", "'+'", "'/'", "'*'", "'~'", "','", 
			"';'", "'...'", "'.'", "'['", "']'", "'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "BOOL", "INT", "STR", "VAR", "PROC", "FUNC", "EXTERN", 
			"RETURN", "WHILE", "SELECT", "END", "IF", "THEN", "ELSE", "LENGTH", "AND", 
			"ASSIGN", "EQUAL", "GEQ", "GTR", "LEQ", "LESS", "MINUS", "NEQ", "OR", 
			"PLUS", "DIV", "MUL", "NOT", "COMMA", "SEMICOLON", "ELLIPSIS", "DOT", 
			"LBRACKET", "RBRACKET", "LPAR", "RPAR", "LBRACE", "RBRACE", "WS", "INTEGER", 
			"BOOLEAN", "ID", "STRING", "COMMENT"
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

	public static class CompilationUnitContext extends ParserRuleContext {
		public CuComponentContext cuComponent;
		public List<CuComponentContext> components = new ArrayList<CuComponentContext>();
		public TerminalNode EOF() { return getToken(WPLParser.EOF, 0); }
		public List<CuComponentContext> cuComponent() {
			return getRuleContexts(CuComponentContext.class);
		}
		public CuComponentContext cuComponent(int i) {
			return getRuleContext(CuComponentContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(60);
				((CompilationUnitContext)_localctx).cuComponent = cuComponent();
				((CompilationUnitContext)_localctx).components.add(((CompilationUnitContext)_localctx).cuComponent);
				}
				}
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << STR) | (1L << VAR) | (1L << PROC) | (1L << EXTERN))) != 0) );
			setState(65);
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

	public static class CuComponentContext extends ParserRuleContext {
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public ProcedureContext procedure() {
			return getRuleContext(ProcedureContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ExternDeclarationContext externDeclaration() {
			return getRuleContext(ExternDeclarationContext.class,0);
		}
		public CuComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuComponent; }
	}

	public final CuComponentContext cuComponent() throws RecognitionException {
		CuComponentContext _localctx = new CuComponentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_cuComponent);
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				varDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				procedure();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				function();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(70);
				externDeclaration();
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public ScalarDeclarationContext scalarDeclaration() {
			return getRuleContext(ScalarDeclarationContext.class,0);
		}
		public ArrayDeclarationContext arrayDeclaration() {
			return getRuleContext(ArrayDeclarationContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDeclaration);
		try {
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				scalarDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				arrayDeclaration();
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

	public static class ScalarDeclarationContext extends ParserRuleContext {
		public TypeContext t;
		public ScalarContext scalar;
		public List<ScalarContext> scalars = new ArrayList<ScalarContext>();
		public TerminalNode SEMICOLON() { return getToken(WPLParser.SEMICOLON, 0); }
		public List<ScalarContext> scalar() {
			return getRuleContexts(ScalarContext.class);
		}
		public ScalarContext scalar(int i) {
			return getRuleContext(ScalarContext.class,i);
		}
		public TerminalNode VAR() { return getToken(WPLParser.VAR, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(WPLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(WPLParser.COMMA, i);
		}
		public ScalarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalarDeclaration; }
	}

	public final ScalarDeclarationContext scalarDeclaration() throws RecognitionException {
		ScalarDeclarationContext _localctx = new ScalarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_scalarDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case INT:
			case STR:
				{
				setState(77);
				((ScalarDeclarationContext)_localctx).t = type();
				}
				break;
			case VAR:
				{
				setState(78);
				match(VAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(81);
			((ScalarDeclarationContext)_localctx).scalar = scalar();
			((ScalarDeclarationContext)_localctx).scalars.add(((ScalarDeclarationContext)_localctx).scalar);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(82);
				match(COMMA);
				setState(83);
				((ScalarDeclarationContext)_localctx).scalar = scalar();
				((ScalarDeclarationContext)_localctx).scalars.add(((ScalarDeclarationContext)_localctx).scalar);
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
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

	public static class ScalarContext extends ParserRuleContext {
		public Token id;
		public VarInitializerContext vi;
		public TerminalNode ID() { return getToken(WPLParser.ID, 0); }
		public VarInitializerContext varInitializer() {
			return getRuleContext(VarInitializerContext.class,0);
		}
		public ScalarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalar; }
	}

	public final ScalarContext scalar() throws RecognitionException {
		ScalarContext _localctx = new ScalarContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_scalar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			((ScalarContext)_localctx).id = match(ID);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(92);
				((ScalarContext)_localctx).vi = varInitializer();
				}
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

	public static class ArrayDeclarationContext extends ParserRuleContext {
		public TypeContext typename;
		public TerminalNode LBRACKET() { return getToken(WPLParser.LBRACKET, 0); }
		public TerminalNode INTEGER() { return getToken(WPLParser.INTEGER, 0); }
		public TerminalNode RBRACKET() { return getToken(WPLParser.RBRACKET, 0); }
		public TerminalNode ID() { return getToken(WPLParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(WPLParser.SEMICOLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArrayDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDeclaration; }
	}

	public final ArrayDeclarationContext arrayDeclaration() throws RecognitionException {
		ArrayDeclarationContext _localctx = new ArrayDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_arrayDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			((ArrayDeclarationContext)_localctx).typename = type();
			setState(96);
			match(LBRACKET);
			setState(97);
			match(INTEGER);
			setState(98);
			match(RBRACKET);
			setState(99);
			match(ID);
			setState(100);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(WPLParser.BOOL, 0); }
		public TerminalNode INT() { return getToken(WPLParser.INT, 0); }
		public TerminalNode STR() { return getToken(WPLParser.STR, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << STR))) != 0)) ) {
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

	public static class VarInitializerContext extends ParserRuleContext {
		public ConstantContext c;
		public TerminalNode ASSIGN() { return getToken(WPLParser.ASSIGN, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public VarInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varInitializer; }
	}

	public final VarInitializerContext varInitializer() throws RecognitionException {
		VarInitializerContext _localctx = new VarInitializerContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_varInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(ASSIGN);
			setState(105);
			((VarInitializerContext)_localctx).c = constant();
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

	public static class ExternDeclarationContext extends ParserRuleContext {
		public TerminalNode EXTERN() { return getToken(WPLParser.EXTERN, 0); }
		public TerminalNode SEMICOLON() { return getToken(WPLParser.SEMICOLON, 0); }
		public ExternProcHeaderContext externProcHeader() {
			return getRuleContext(ExternProcHeaderContext.class,0);
		}
		public ExternFuncHeaderContext externFuncHeader() {
			return getRuleContext(ExternFuncHeaderContext.class,0);
		}
		public ExternDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externDeclaration; }
	}

	public final ExternDeclarationContext externDeclaration() throws RecognitionException {
		ExternDeclarationContext _localctx = new ExternDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_externDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(EXTERN);
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROC:
				{
				setState(108);
				externProcHeader();
				}
				break;
			case BOOL:
			case INT:
			case STR:
				{
				setState(109);
				externFuncHeader();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(112);
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

	public static class ProcedureContext extends ParserRuleContext {
		public ProcHeaderContext ph;
		public BlockContext b;
		public ProcHeaderContext procHeader() {
			return getRuleContext(ProcHeaderContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProcedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure; }
	}

	public final ProcedureContext procedure() throws RecognitionException {
		ProcedureContext _localctx = new ProcedureContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_procedure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			((ProcedureContext)_localctx).ph = procHeader();
			setState(115);
			((ProcedureContext)_localctx).b = block();
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

	public static class ProcHeaderContext extends ParserRuleContext {
		public Token id;
		public ParamsContext p;
		public TerminalNode PROC() { return getToken(WPLParser.PROC, 0); }
		public TerminalNode LPAR() { return getToken(WPLParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(WPLParser.RPAR, 0); }
		public TerminalNode ID() { return getToken(WPLParser.ID, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public ProcHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procHeader; }
	}

	public final ProcHeaderContext procHeader() throws RecognitionException {
		ProcHeaderContext _localctx = new ProcHeaderContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_procHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(PROC);
			setState(118);
			((ProcHeaderContext)_localctx).id = match(ID);
			setState(119);
			match(LPAR);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << STR))) != 0)) {
				{
				setState(120);
				((ProcHeaderContext)_localctx).p = params();
				}
			}

			setState(123);
			match(RPAR);
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

	public static class ExternProcHeaderContext extends ParserRuleContext {
		public Token id;
		public TerminalNode PROC() { return getToken(WPLParser.PROC, 0); }
		public TerminalNode LPAR() { return getToken(WPLParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(WPLParser.RPAR, 0); }
		public TerminalNode ID() { return getToken(WPLParser.ID, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(WPLParser.COMMA, 0); }
		public TerminalNode ELLIPSIS() { return getToken(WPLParser.ELLIPSIS, 0); }
		public ExternProcHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externProcHeader; }
	}

	public final ExternProcHeaderContext externProcHeader() throws RecognitionException {
		ExternProcHeaderContext _localctx = new ExternProcHeaderContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_externProcHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(PROC);
			setState(126);
			((ExternProcHeaderContext)_localctx).id = match(ID);
			setState(127);
			match(LPAR);
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				{
				setState(128);
				params();
				setState(129);
				match(COMMA);
				setState(130);
				match(ELLIPSIS);
				}
				}
				break;
			case 2:
				{
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << STR))) != 0)) {
					{
					setState(132);
					params();
					}
				}

				}
				break;
			case 3:
				{
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELLIPSIS) {
					{
					setState(135);
					match(ELLIPSIS);
					}
				}

				}
				break;
			}
			setState(140);
			match(RPAR);
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

	public static class FunctionContext extends ParserRuleContext {
		public FuncHeaderContext fh;
		public BlockContext b;
		public FuncHeaderContext funcHeader() {
			return getRuleContext(FuncHeaderContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			((FunctionContext)_localctx).fh = funcHeader();
			setState(143);
			((FunctionContext)_localctx).b = block();
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

	public static class FuncHeaderContext extends ParserRuleContext {
		public TypeContext t;
		public Token id;
		public ParamsContext p;
		public TerminalNode FUNC() { return getToken(WPLParser.FUNC, 0); }
		public TerminalNode LPAR() { return getToken(WPLParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(WPLParser.RPAR, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(WPLParser.ID, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public FuncHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcHeader; }
	}

	public final FuncHeaderContext funcHeader() throws RecognitionException {
		FuncHeaderContext _localctx = new FuncHeaderContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_funcHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			((FuncHeaderContext)_localctx).t = type();
			setState(146);
			match(FUNC);
			setState(147);
			((FuncHeaderContext)_localctx).id = match(ID);
			setState(148);
			match(LPAR);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << STR))) != 0)) {
				{
				setState(149);
				((FuncHeaderContext)_localctx).p = params();
				}
			}

			setState(152);
			match(RPAR);
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

	public static class ExternFuncHeaderContext extends ParserRuleContext {
		public TypeContext t;
		public Token id;
		public TerminalNode FUNC() { return getToken(WPLParser.FUNC, 0); }
		public TerminalNode LPAR() { return getToken(WPLParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(WPLParser.RPAR, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(WPLParser.ID, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(WPLParser.COMMA, 0); }
		public TerminalNode ELLIPSIS() { return getToken(WPLParser.ELLIPSIS, 0); }
		public ExternFuncHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externFuncHeader; }
	}

	public final ExternFuncHeaderContext externFuncHeader() throws RecognitionException {
		ExternFuncHeaderContext _localctx = new ExternFuncHeaderContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_externFuncHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			((ExternFuncHeaderContext)_localctx).t = type();
			setState(155);
			match(FUNC);
			setState(156);
			((ExternFuncHeaderContext)_localctx).id = match(ID);
			setState(157);
			match(LPAR);
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				{
				setState(158);
				params();
				setState(159);
				match(COMMA);
				setState(160);
				match(ELLIPSIS);
				}
				}
				break;
			case 2:
				{
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << STR))) != 0)) {
					{
					setState(162);
					params();
					}
				}

				}
				break;
			case 3:
				{
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELLIPSIS) {
					{
					setState(165);
					match(ELLIPSIS);
					}
				}

				}
				break;
			}
			setState(170);
			match(RPAR);
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

	public static class ParamsContext extends ParserRuleContext {
		public TypeContext type;
		public List<TypeContext> types = new ArrayList<TypeContext>();
		public ExprContext expr;
		public List<ExprContext> ids = new ArrayList<ExprContext>();
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(WPLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(WPLParser.COMMA, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_params);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(172);
			((ParamsContext)_localctx).type = type();
			((ParamsContext)_localctx).types.add(((ParamsContext)_localctx).type);
			setState(173);
			((ParamsContext)_localctx).expr = expr(0);
			((ParamsContext)_localctx).ids.add(((ParamsContext)_localctx).expr);
			setState(180);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(174);
					match(COMMA);
					setState(175);
					((ParamsContext)_localctx).type = type();
					((ParamsContext)_localctx).types.add(((ParamsContext)_localctx).type);
					setState(176);
					((ParamsContext)_localctx).expr = expr(0);
					((ParamsContext)_localctx).ids.add(((ParamsContext)_localctx).expr);
					}
					} 
				}
				setState(182);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(WPLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(WPLParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(LBRACE);
			setState(185); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(184);
				statement();
				}
				}
				setState(187); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << STR) | (1L << VAR) | (1L << RETURN) | (1L << WHILE) | (1L << SELECT) | (1L << IF) | (1L << LBRACE) | (1L << ID))) != 0) );
			setState(189);
			match(RBRACE);
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
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ReturnContext return() {
			return getRuleContext(ReturnContext.class,0);
		}
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_statement);
		try {
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				loop();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(193);
				select();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(194);
				conditional();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(195);
				call();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(196);
				block();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(197);
				return();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(198);
				varDeclaration();
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

	public static class LoopContext extends ParserRuleContext {
		public ExprContext e;
		public BlockContext b;
		public TerminalNode WHILE() { return getToken(WPLParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(WHILE);
			setState(202);
			((LoopContext)_localctx).e = expr(0);
			setState(203);
			match(T__0);
			setState(204);
			((LoopContext)_localctx).b = block();
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

	public static class ConditionalContext extends ParserRuleContext {
		public ExprContext e;
		public BlockContext yesblock;
		public BlockContext noblock;
		public TerminalNode IF() { return getToken(WPLParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode THEN() { return getToken(WPLParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(WPLParser.ELSE, 0); }
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_conditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(IF);
			setState(207);
			((ConditionalContext)_localctx).e = expr(0);
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THEN) {
				{
				setState(208);
				match(THEN);
				}
			}

			setState(211);
			((ConditionalContext)_localctx).yesblock = block();
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(212);
				match(ELSE);
				setState(213);
				((ConditionalContext)_localctx).noblock = block();
				}
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

	public static class SelectContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(WPLParser.SELECT, 0); }
		public TerminalNode LBRACE() { return getToken(WPLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(WPLParser.RBRACE, 0); }
		public List<SelectAltContext> selectAlt() {
			return getRuleContexts(SelectAltContext.class);
		}
		public SelectAltContext selectAlt(int i) {
			return getRuleContext(SelectAltContext.class,i);
		}
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_select);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(SELECT);
			setState(217);
			match(LBRACE);
			setState(219); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(218);
				selectAlt();
				}
				}
				setState(221); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << NOT) | (1L << LPAR) | (1L << INTEGER) | (1L << BOOLEAN) | (1L << ID) | (1L << STRING))) != 0) );
			setState(223);
			match(RBRACE);
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

	public static class SelectAltContext extends ParserRuleContext {
		public ExprContext e;
		public StatementContext s;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SelectAltContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectAlt; }
	}

	public final SelectAltContext selectAlt() throws RecognitionException {
		SelectAltContext _localctx = new SelectAltContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_selectAlt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			((SelectAltContext)_localctx).e = expr(0);
			setState(226);
			match(T__1);
			setState(227);
			((SelectAltContext)_localctx).s = statement();
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

	public static class CallContext extends ParserRuleContext {
		public Token id;
		public TerminalNode LPAR() { return getToken(WPLParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(WPLParser.RPAR, 0); }
		public TerminalNode SEMICOLON() { return getToken(WPLParser.SEMICOLON, 0); }
		public TerminalNode ID() { return getToken(WPLParser.ID, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			((CallContext)_localctx).id = match(ID);
			setState(230);
			match(LPAR);
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << NOT) | (1L << LPAR) | (1L << INTEGER) | (1L << BOOLEAN) | (1L << ID) | (1L << STRING))) != 0)) {
				{
				setState(231);
				arguments();
				}
			}

			setState(234);
			match(RPAR);
			setState(235);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public ArgContext arg;
		public List<ArgContext> args = new ArrayList<ArgContext>();
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(WPLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(WPLParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(237);
			((ArgumentsContext)_localctx).arg = arg();
			((ArgumentsContext)_localctx).args.add(((ArgumentsContext)_localctx).arg);
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(238);
				match(COMMA);
				setState(239);
				((ArgumentsContext)_localctx).arg = arg();
				((ArgumentsContext)_localctx).args.add(((ArgumentsContext)_localctx).arg);
				}
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class ArgContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			expr(0);
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

	public static class ReturnContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(WPLParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(WPLParser.SEMICOLON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return; }
	}

	public final ReturnContext return() throws RecognitionException {
		ReturnContext _localctx = new ReturnContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(RETURN);
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << NOT) | (1L << LPAR) | (1L << INTEGER) | (1L << BOOLEAN) | (1L << ID) | (1L << STRING))) != 0)) {
				{
				setState(248);
				expr(0);
				}
			}

			setState(251);
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

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(WPLParser.INTEGER, 0); }
		public TerminalNode STRING() { return getToken(WPLParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(WPLParser.BOOLEAN, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << BOOLEAN) | (1L << STRING))) != 0)) ) {
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

	public static class AssignmentContext extends ParserRuleContext {
		public Token ID;
		public List<Token> targets = new ArrayList<Token>();
		public ExprContext expr;
		public List<ExprContext> exprs = new ArrayList<ExprContext>();
		public List<ExprContext> e = new ArrayList<ExprContext>();
		public TerminalNode ASSIGN() { return getToken(WPLParser.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(WPLParser.SEMICOLON, 0); }
		public List<TerminalNode> ID() { return getTokens(WPLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(WPLParser.ID, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(WPLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(WPLParser.COMMA, i);
		}
		public ArrayIndexContext arrayIndex() {
			return getRuleContext(ArrayIndexContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_assignment);
		int _la;
		try {
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				((AssignmentContext)_localctx).ID = match(ID);
				((AssignmentContext)_localctx).targets.add(((AssignmentContext)_localctx).ID);
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(256);
					match(COMMA);
					setState(257);
					((AssignmentContext)_localctx).ID = match(ID);
					((AssignmentContext)_localctx).targets.add(((AssignmentContext)_localctx).ID);
					}
					}
					setState(262);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(263);
				match(ASSIGN);
				setState(264);
				((AssignmentContext)_localctx).expr = expr(0);
				((AssignmentContext)_localctx).exprs.add(((AssignmentContext)_localctx).expr);
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(265);
					match(COMMA);
					setState(266);
					((AssignmentContext)_localctx).expr = expr(0);
					((AssignmentContext)_localctx).exprs.add(((AssignmentContext)_localctx).expr);
					}
					}
					setState(271);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(272);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				arrayIndex();
				setState(275);
				match(ASSIGN);
				setState(276);
				((AssignmentContext)_localctx).expr = expr(0);
				((AssignmentContext)_localctx).e.add(((AssignmentContext)_localctx).expr);
				setState(277);
				match(SEMICOLON);
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

	public static class ArrayIndexContext extends ParserRuleContext {
		public Token id;
		public TerminalNode LBRACKET() { return getToken(WPLParser.LBRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(WPLParser.RBRACKET, 0); }
		public TerminalNode ID() { return getToken(WPLParser.ID, 0); }
		public ArrayIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayIndex; }
	}

	public final ArrayIndexContext arrayIndex() throws RecognitionException {
		ArrayIndexContext _localctx = new ArrayIndexContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_arrayIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			((ArrayIndexContext)_localctx).id = match(ID);
			setState(282);
			match(LBRACKET);
			setState(283);
			expr(0);
			setState(284);
			match(RBRACKET);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AndExprContext extends ExprContext {
		public ExprContext left;
		public ExprContext right;
		public TerminalNode AND() { return getToken(WPLParser.AND, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AndExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class IDExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(WPLParser.ID, 0); }
		public IDExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ConstExprContext extends ExprContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class SubscriptExprContext extends ExprContext {
		public ArrayIndexContext arrayIndex() {
			return getRuleContext(ArrayIndexContext.class,0);
		}
		public SubscriptExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class RelExprContext extends ExprContext {
		public ExprContext left;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LESS() { return getToken(WPLParser.LESS, 0); }
		public TerminalNode LEQ() { return getToken(WPLParser.LEQ, 0); }
		public TerminalNode GTR() { return getToken(WPLParser.GTR, 0); }
		public TerminalNode GEQ() { return getToken(WPLParser.GEQ, 0); }
		public RelExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class MultExprContext extends ExprContext {
		public ExprContext left;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(WPLParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(WPLParser.DIV, 0); }
		public MultExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class AddExprContext extends ExprContext {
		public ExprContext left;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(WPLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(WPLParser.MINUS, 0); }
		public AddExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ArrayLengthExprContext extends ExprContext {
		public Token arrayname;
		public TerminalNode DOT() { return getToken(WPLParser.DOT, 0); }
		public TerminalNode LENGTH() { return getToken(WPLParser.LENGTH, 0); }
		public TerminalNode ID() { return getToken(WPLParser.ID, 0); }
		public ArrayLengthExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class UMinusExprContext extends ExprContext {
		public ExprContext e;
		public TerminalNode MINUS() { return getToken(WPLParser.MINUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UMinusExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class OrExprContext extends ExprContext {
		public ExprContext left;
		public ExprContext right;
		public TerminalNode OR() { return getToken(WPLParser.OR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OrExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class EqExprContext extends ExprContext {
		public ExprContext left;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(WPLParser.EQUAL, 0); }
		public TerminalNode NEQ() { return getToken(WPLParser.NEQ, 0); }
		public EqExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class FuncProcCallExprContext extends ExprContext {
		public Token fpname;
		public ExprContext expr;
		public List<ExprContext> args = new ArrayList<ExprContext>();
		public TerminalNode LPAR() { return getToken(WPLParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(WPLParser.RPAR, 0); }
		public TerminalNode ID() { return getToken(WPLParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(WPLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(WPLParser.COMMA, i);
		}
		public FuncProcCallExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class NotExprContext extends ExprContext {
		public ExprContext e;
		public TerminalNode NOT() { return getToken(WPLParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ParenExprContext extends ExprContext {
		public TerminalNode LPAR() { return getToken(WPLParser.LPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(WPLParser.RPAR, 0); }
		public ParenExprContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				_localctx = new FuncProcCallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(287);
				((FuncProcCallExprContext)_localctx).fpname = match(ID);
				setState(288);
				match(LPAR);
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << NOT) | (1L << LPAR) | (1L << INTEGER) | (1L << BOOLEAN) | (1L << ID) | (1L << STRING))) != 0)) {
					{
					setState(289);
					((FuncProcCallExprContext)_localctx).expr = expr(0);
					((FuncProcCallExprContext)_localctx).args.add(((FuncProcCallExprContext)_localctx).expr);
					setState(294);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(290);
						match(COMMA);
						setState(291);
						((FuncProcCallExprContext)_localctx).expr = expr(0);
						((FuncProcCallExprContext)_localctx).args.add(((FuncProcCallExprContext)_localctx).expr);
						}
						}
						setState(296);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(299);
				match(RPAR);
				}
				break;
			case 2:
				{
				_localctx = new SubscriptExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(300);
				arrayIndex();
				}
				break;
			case 3:
				{
				_localctx = new UMinusExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(301);
				match(MINUS);
				setState(302);
				((UMinusExprContext)_localctx).e = expr(12);
				}
				break;
			case 4:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(303);
				match(NOT);
				setState(304);
				((NotExprContext)_localctx).e = expr(11);
				}
				break;
			case 5:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(305);
				match(LPAR);
				setState(306);
				expr(0);
				setState(307);
				match(RPAR);
				}
				break;
			case 6:
				{
				_localctx = new ArrayLengthExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(309);
				((ArrayLengthExprContext)_localctx).arrayname = match(ID);
				setState(310);
				match(DOT);
				setState(311);
				match(LENGTH);
				}
				break;
			case 7:
				{
				_localctx = new IDExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(312);
				match(ID);
				}
				break;
			case 8:
				{
				_localctx = new ConstExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(313);
				constant();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(336);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(334);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new MultExprContext(new ExprContext(_parentctx, _parentState));
						((MultExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(316);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(317);
						_la = _input.LA(1);
						if ( !(_la==DIV || _la==MUL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(318);
						((MultExprContext)_localctx).right = expr(11);
						}
						break;
					case 2:
						{
						_localctx = new AddExprContext(new ExprContext(_parentctx, _parentState));
						((AddExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(319);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(320);
						_la = _input.LA(1);
						if ( !(_la==MINUS || _la==PLUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(321);
						((AddExprContext)_localctx).right = expr(10);
						}
						break;
					case 3:
						{
						_localctx = new RelExprContext(new ExprContext(_parentctx, _parentState));
						((RelExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(322);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(323);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GEQ) | (1L << GTR) | (1L << LEQ) | (1L << LESS))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(324);
						((RelExprContext)_localctx).right = expr(9);
						}
						break;
					case 4:
						{
						_localctx = new EqExprContext(new ExprContext(_parentctx, _parentState));
						((EqExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(325);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(326);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NEQ) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(327);
						((EqExprContext)_localctx).right = expr(7);
						}
						break;
					case 5:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						((AndExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(328);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(329);
						match(AND);
						setState(330);
						((AndExprContext)_localctx).right = expr(7);
						}
						break;
					case 6:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						((OrExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(331);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(332);
						match(OR);
						setState(333);
						((OrExprContext)_localctx).right = expr(6);
						}
						break;
					}
					} 
				}
				setState(338);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
		case 29:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u0156\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\6\2@"+
		"\n\2\r\2\16\2A\3\2\3\2\3\3\3\3\3\3\3\3\5\3J\n\3\3\4\3\4\5\4N\n\4\3\5\3"+
		"\5\5\5R\n\5\3\5\3\5\3\5\7\5W\n\5\f\5\16\5Z\13\5\3\5\3\5\3\6\3\6\5\6`\n"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\5\nq\n"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\5\f|\n\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\5\r\u0088\n\r\3\r\5\r\u008b\n\r\5\r\u008d\n\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\5\17\u0099\n\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00a6\n\20\3\20\5\20"+
		"\u00a9\n\20\5\20\u00ab\n\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\7"+
		"\21\u00b5\n\21\f\21\16\21\u00b8\13\21\3\22\3\22\6\22\u00bc\n\22\r\22\16"+
		"\22\u00bd\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00ca"+
		"\n\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\5\25\u00d4\n\25\3\25\3\25"+
		"\3\25\5\25\u00d9\n\25\3\26\3\26\3\26\6\26\u00de\n\26\r\26\16\26\u00df"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\5\30\u00eb\n\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\7\31\u00f3\n\31\f\31\16\31\u00f6\13\31\3\32\3\32"+
		"\3\33\3\33\5\33\u00fc\n\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35\7\35\u0105"+
		"\n\35\f\35\16\35\u0108\13\35\3\35\3\35\3\35\3\35\7\35\u010e\n\35\f\35"+
		"\16\35\u0111\13\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u011a\n\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u0127\n\37"+
		"\f\37\16\37\u012a\13\37\5\37\u012c\n\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u013d\n\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\7\37\u0151\n\37\f\37\16\37\u0154\13\37\3\37\2\3< \2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<\2\b\3\2\5\7\4\2"+
		"-.\60\60\3\2\37 \4\2\33\33\36\36\3\2\27\32\4\2\26\26\34\34\2\u016b\2?"+
		"\3\2\2\2\4I\3\2\2\2\6M\3\2\2\2\bQ\3\2\2\2\n]\3\2\2\2\fa\3\2\2\2\16h\3"+
		"\2\2\2\20j\3\2\2\2\22m\3\2\2\2\24t\3\2\2\2\26w\3\2\2\2\30\177\3\2\2\2"+
		"\32\u0090\3\2\2\2\34\u0093\3\2\2\2\36\u009c\3\2\2\2 \u00ae\3\2\2\2\"\u00b9"+
		"\3\2\2\2$\u00c9\3\2\2\2&\u00cb\3\2\2\2(\u00d0\3\2\2\2*\u00da\3\2\2\2,"+
		"\u00e3\3\2\2\2.\u00e7\3\2\2\2\60\u00ef\3\2\2\2\62\u00f7\3\2\2\2\64\u00f9"+
		"\3\2\2\2\66\u00ff\3\2\2\28\u0119\3\2\2\2:\u011b\3\2\2\2<\u013c\3\2\2\2"+
		">@\5\4\3\2?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2BC\3\2\2\2CD\7\2\2\3"+
		"D\3\3\2\2\2EJ\5\6\4\2FJ\5\24\13\2GJ\5\32\16\2HJ\5\22\n\2IE\3\2\2\2IF\3"+
		"\2\2\2IG\3\2\2\2IH\3\2\2\2J\5\3\2\2\2KN\5\b\5\2LN\5\f\7\2MK\3\2\2\2ML"+
		"\3\2\2\2N\7\3\2\2\2OR\5\16\b\2PR\7\b\2\2QO\3\2\2\2QP\3\2\2\2RS\3\2\2\2"+
		"SX\5\n\6\2TU\7\"\2\2UW\5\n\6\2VT\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2"+
		"Y[\3\2\2\2ZX\3\2\2\2[\\\7#\2\2\\\t\3\2\2\2]_\7/\2\2^`\5\20\t\2_^\3\2\2"+
		"\2_`\3\2\2\2`\13\3\2\2\2ab\5\16\b\2bc\7&\2\2cd\7-\2\2de\7\'\2\2ef\7/\2"+
		"\2fg\7#\2\2g\r\3\2\2\2hi\t\2\2\2i\17\3\2\2\2jk\7\25\2\2kl\5\66\34\2l\21"+
		"\3\2\2\2mp\7\13\2\2nq\5\30\r\2oq\5\36\20\2pn\3\2\2\2po\3\2\2\2qr\3\2\2"+
		"\2rs\7#\2\2s\23\3\2\2\2tu\5\26\f\2uv\5\"\22\2v\25\3\2\2\2wx\7\t\2\2xy"+
		"\7/\2\2y{\7(\2\2z|\5 \21\2{z\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~\7)\2\2~\27"+
		"\3\2\2\2\177\u0080\7\t\2\2\u0080\u0081\7/\2\2\u0081\u008c\7(\2\2\u0082"+
		"\u0083\5 \21\2\u0083\u0084\7\"\2\2\u0084\u0085\7$\2\2\u0085\u008d\3\2"+
		"\2\2\u0086\u0088\5 \21\2\u0087\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\u008d\3\2\2\2\u0089\u008b\7$\2\2\u008a\u0089\3\2\2\2\u008a\u008b\3\2"+
		"\2\2\u008b\u008d\3\2\2\2\u008c\u0082\3\2\2\2\u008c\u0087\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\7)\2\2\u008f\31\3\2\2\2"+
		"\u0090\u0091\5\34\17\2\u0091\u0092\5\"\22\2\u0092\33\3\2\2\2\u0093\u0094"+
		"\5\16\b\2\u0094\u0095\7\n\2\2\u0095\u0096\7/\2\2\u0096\u0098\7(\2\2\u0097"+
		"\u0099\5 \21\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2"+
		"\2\2\u009a\u009b\7)\2\2\u009b\35\3\2\2\2\u009c\u009d\5\16\b\2\u009d\u009e"+
		"\7\n\2\2\u009e\u009f\7/\2\2\u009f\u00aa\7(\2\2\u00a0\u00a1\5 \21\2\u00a1"+
		"\u00a2\7\"\2\2\u00a2\u00a3\7$\2\2\u00a3\u00ab\3\2\2\2\u00a4\u00a6\5 \21"+
		"\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00ab\3\2\2\2\u00a7\u00a9"+
		"\7$\2\2\u00a8\u00a7\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa"+
		"\u00a0\3\2\2\2\u00aa\u00a5\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\3\2"+
		"\2\2\u00ac\u00ad\7)\2\2\u00ad\37\3\2\2\2\u00ae\u00af\5\16\b\2\u00af\u00b6"+
		"\5<\37\2\u00b0\u00b1\7\"\2\2\u00b1\u00b2\5\16\b\2\u00b2\u00b3\5<\37\2"+
		"\u00b3\u00b5\3\2\2\2\u00b4\u00b0\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4"+
		"\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7!\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9"+
		"\u00bb\7*\2\2\u00ba\u00bc\5$\23\2\u00bb\u00ba\3\2\2\2\u00bc\u00bd\3\2"+
		"\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf"+
		"\u00c0\7+\2\2\u00c0#\3\2\2\2\u00c1\u00ca\58\35\2\u00c2\u00ca\5&\24\2\u00c3"+
		"\u00ca\5*\26\2\u00c4\u00ca\5(\25\2\u00c5\u00ca\5.\30\2\u00c6\u00ca\5\""+
		"\22\2\u00c7\u00ca\5\64\33\2\u00c8\u00ca\5\6\4\2\u00c9\u00c1\3\2\2\2\u00c9"+
		"\u00c2\3\2\2\2\u00c9\u00c3\3\2\2\2\u00c9\u00c4\3\2\2\2\u00c9\u00c5\3\2"+
		"\2\2\u00c9\u00c6\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca"+
		"%\3\2\2\2\u00cb\u00cc\7\r\2\2\u00cc\u00cd\5<\37\2\u00cd\u00ce\7\3\2\2"+
		"\u00ce\u00cf\5\"\22\2\u00cf\'\3\2\2\2\u00d0\u00d1\7\20\2\2\u00d1\u00d3"+
		"\5<\37\2\u00d2\u00d4\7\21\2\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2"+
		"\u00d4\u00d5\3\2\2\2\u00d5\u00d8\5\"\22\2\u00d6\u00d7\7\22\2\2\u00d7\u00d9"+
		"\5\"\22\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9)\3\2\2\2\u00da"+
		"\u00db\7\16\2\2\u00db\u00dd\7*\2\2\u00dc\u00de\5,\27\2\u00dd\u00dc\3\2"+
		"\2\2\u00de\u00df\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\u00e1\3\2\2\2\u00e1\u00e2\7+\2\2\u00e2+\3\2\2\2\u00e3\u00e4\5<\37\2\u00e4"+
		"\u00e5\7\4\2\2\u00e5\u00e6\5$\23\2\u00e6-\3\2\2\2\u00e7\u00e8\7/\2\2\u00e8"+
		"\u00ea\7(\2\2\u00e9\u00eb\5\60\31\2\u00ea\u00e9\3\2\2\2\u00ea\u00eb\3"+
		"\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\7)\2\2\u00ed\u00ee\7#\2\2\u00ee"+
		"/\3\2\2\2\u00ef\u00f4\5\62\32\2\u00f0\u00f1\7\"\2\2\u00f1\u00f3\5\62\32"+
		"\2\u00f2\u00f0\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5"+
		"\3\2\2\2\u00f5\61\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f8\5<\37\2\u00f8"+
		"\63\3\2\2\2\u00f9\u00fb\7\f\2\2\u00fa\u00fc\5<\37\2\u00fb\u00fa\3\2\2"+
		"\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\7#\2\2\u00fe\65"+
		"\3\2\2\2\u00ff\u0100\t\3\2\2\u0100\67\3\2\2\2\u0101\u0106\7/\2\2\u0102"+
		"\u0103\7\"\2\2\u0103\u0105\7/\2\2\u0104\u0102\3\2\2\2\u0105\u0108\3\2"+
		"\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0109\3\2\2\2\u0108"+
		"\u0106\3\2\2\2\u0109\u010a\7\25\2\2\u010a\u010f\5<\37\2\u010b\u010c\7"+
		"\"\2\2\u010c\u010e\5<\37\2\u010d\u010b\3\2\2\2\u010e\u0111\3\2\2\2\u010f"+
		"\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0112\3\2\2\2\u0111\u010f\3\2"+
		"\2\2\u0112\u0113\7#\2\2\u0113\u011a\3\2\2\2\u0114\u0115\5:\36\2\u0115"+
		"\u0116\7\25\2\2\u0116\u0117\5<\37\2\u0117\u0118\7#\2\2\u0118\u011a\3\2"+
		"\2\2\u0119\u0101\3\2\2\2\u0119\u0114\3\2\2\2\u011a9\3\2\2\2\u011b\u011c"+
		"\7/\2\2\u011c\u011d\7&\2\2\u011d\u011e\5<\37\2\u011e\u011f\7\'\2\2\u011f"+
		";\3\2\2\2\u0120\u0121\b\37\1\2\u0121\u0122\7/\2\2\u0122\u012b\7(\2\2\u0123"+
		"\u0128\5<\37\2\u0124\u0125\7\"\2\2\u0125\u0127\5<\37\2\u0126\u0124\3\2"+
		"\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129"+
		"\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u0123\3\2\2\2\u012b\u012c\3\2"+
		"\2\2\u012c\u012d\3\2\2\2\u012d\u013d\7)\2\2\u012e\u013d\5:\36\2\u012f"+
		"\u0130\7\33\2\2\u0130\u013d\5<\37\16\u0131\u0132\7!\2\2\u0132\u013d\5"+
		"<\37\r\u0133\u0134\7(\2\2\u0134\u0135\5<\37\2\u0135\u0136\7)\2\2\u0136"+
		"\u013d\3\2\2\2\u0137\u0138\7/\2\2\u0138\u0139\7%\2\2\u0139\u013d\7\23"+
		"\2\2\u013a\u013d\7/\2\2\u013b\u013d\5\66\34\2\u013c\u0120\3\2\2\2\u013c"+
		"\u012e\3\2\2\2\u013c\u012f\3\2\2\2\u013c\u0131\3\2\2\2\u013c\u0133\3\2"+
		"\2\2\u013c\u0137\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013b\3\2\2\2\u013d"+
		"\u0152\3\2\2\2\u013e\u013f\f\f\2\2\u013f\u0140\t\4\2\2\u0140\u0151\5<"+
		"\37\r\u0141\u0142\f\13\2\2\u0142\u0143\t\5\2\2\u0143\u0151\5<\37\f\u0144"+
		"\u0145\f\n\2\2\u0145\u0146\t\6\2\2\u0146\u0151\5<\37\13\u0147\u0148\f"+
		"\t\2\2\u0148\u0149\t\7\2\2\u0149\u0151\5<\37\t\u014a\u014b\f\b\2\2\u014b"+
		"\u014c\7\24\2\2\u014c\u0151\5<\37\t\u014d\u014e\f\7\2\2\u014e\u014f\7"+
		"\35\2\2\u014f\u0151\5<\37\b\u0150\u013e\3\2\2\2\u0150\u0141\3\2\2\2\u0150"+
		"\u0144\3\2\2\2\u0150\u0147\3\2\2\2\u0150\u014a\3\2\2\2\u0150\u014d\3\2"+
		"\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153"+
		"=\3\2\2\2\u0154\u0152\3\2\2\2\"AIMQX_p{\u0087\u008a\u008c\u0098\u00a5"+
		"\u00a8\u00aa\u00b6\u00bd\u00c9\u00d3\u00d8\u00df\u00ea\u00f4\u00fb\u0106"+
		"\u010f\u0119\u0128\u012b\u013c\u0150\u0152";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}