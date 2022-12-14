// Generated from /Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Projects/WPL/src/lexparse/WPL.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WPLLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "BOOL", "INT", "STR", "VAR", "PROC", "FUNC", "EXTERN", 
			"RETURN", "WHILE", "SELECT", "END", "IF", "THEN", "ELSE", "LENGTH", "AND", 
			"ASSIGN", "EQUAL", "GEQ", "GTR", "LEQ", "LESS", "MINUS", "NEQ", "OR", 
			"PLUS", "DIV", "MUL", "NOT", "COMMA", "SEMICOLON", "ELLIPSIS", "DOT", 
			"LBRACKET", "RBRACKET", "LPAR", "RPAR", "LBRACE", "RBRACE", "WS", "INTEGER", 
			"BOOLEAN", "ID", "STRING", "COMMENT", "INLINE_COMMENT", "STD_COMMENT", 
			"UNDERSCORE", "DIGIT", "UPPER", "LOWER", "LETTER"
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


	public WPLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "WPL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u014f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3"+
		"\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3"+
		"\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3"+
		"\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3"+
		")\3)\3*\3*\3+\6+\u00fd\n+\r+\16+\u00fe\3+\3+\3,\6,\u0104\n,\r,\16,\u0105"+
		"\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u0111\n-\3.\3.\3.\3.\7.\u0117\n.\f.\16"+
		".\u011a\13.\3/\3/\3/\3/\7/\u0120\n/\f/\16/\u0123\13/\3/\3/\3\60\3\60\5"+
		"\60\u0129\n\60\3\60\3\60\3\61\3\61\7\61\u012f\n\61\f\61\16\61\u0132\13"+
		"\61\3\61\5\61\u0135\n\61\3\62\3\62\3\62\3\62\3\62\7\62\u013c\n\62\f\62"+
		"\16\62\u013f\13\62\3\62\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3"+
		"\66\3\67\3\67\5\67\u014e\n\67\5\u0121\u0130\u013d\28\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+U,W-Y.[/]\60_\61a\2c\2e\2g\2i\2k\2m\2\3\2\b\5\2\13\f\16\17\"\""+
		"\3\2\f\f\3\3\f\f\3\2\62;\3\2C\\\3\2c|\2\u0154\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y"+
		"\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\3o\3\2\2\2\5r\3\2\2\2\7t\3\2"+
		"\2\2\t|\3\2\2\2\13\u0080\3\2\2\2\r\u0084\3\2\2\2\17\u0088\3\2\2\2\21\u008d"+
		"\3\2\2\2\23\u0092\3\2\2\2\25\u0099\3\2\2\2\27\u00a0\3\2\2\2\31\u00a6\3"+
		"\2\2\2\33\u00ad\3\2\2\2\35\u00b1\3\2\2\2\37\u00b4\3\2\2\2!\u00b9\3\2\2"+
		"\2#\u00be\3\2\2\2%\u00c5\3\2\2\2\'\u00c7\3\2\2\2)\u00ca\3\2\2\2+\u00cc"+
		"\3\2\2\2-\u00cf\3\2\2\2/\u00d1\3\2\2\2\61\u00d4\3\2\2\2\63\u00d6\3\2\2"+
		"\2\65\u00d8\3\2\2\2\67\u00db\3\2\2\29\u00dd\3\2\2\2;\u00df\3\2\2\2=\u00e1"+
		"\3\2\2\2?\u00e3\3\2\2\2A\u00e5\3\2\2\2C\u00e7\3\2\2\2E\u00e9\3\2\2\2G"+
		"\u00ed\3\2\2\2I\u00ef\3\2\2\2K\u00f1\3\2\2\2M\u00f3\3\2\2\2O\u00f5\3\2"+
		"\2\2Q\u00f7\3\2\2\2S\u00f9\3\2\2\2U\u00fc\3\2\2\2W\u0103\3\2\2\2Y\u0110"+
		"\3\2\2\2[\u0112\3\2\2\2]\u011b\3\2\2\2_\u0128\3\2\2\2a\u012c\3\2\2\2c"+
		"\u0136\3\2\2\2e\u0143\3\2\2\2g\u0145\3\2\2\2i\u0147\3\2\2\2k\u0149\3\2"+
		"\2\2m\u014d\3\2\2\2op\7f\2\2pq\7q\2\2q\4\3\2\2\2rs\7<\2\2s\6\3\2\2\2t"+
		"u\7d\2\2uv\7q\2\2vw\7q\2\2wx\7n\2\2xy\7g\2\2yz\7c\2\2z{\7p\2\2{\b\3\2"+
		"\2\2|}\7k\2\2}~\7p\2\2~\177\7v\2\2\177\n\3\2\2\2\u0080\u0081\7u\2\2\u0081"+
		"\u0082\7v\2\2\u0082\u0083\7t\2\2\u0083\f\3\2\2\2\u0084\u0085\7x\2\2\u0085"+
		"\u0086\7c\2\2\u0086\u0087\7t\2\2\u0087\16\3\2\2\2\u0088\u0089\7r\2\2\u0089"+
		"\u008a\7t\2\2\u008a\u008b\7q\2\2\u008b\u008c\7e\2\2\u008c\20\3\2\2\2\u008d"+
		"\u008e\7h\2\2\u008e\u008f\7w\2\2\u008f\u0090\7p\2\2\u0090\u0091\7e\2\2"+
		"\u0091\22\3\2\2\2\u0092\u0093\7g\2\2\u0093\u0094\7z\2\2\u0094\u0095\7"+
		"v\2\2\u0095\u0096\7g\2\2\u0096\u0097\7t\2\2\u0097\u0098\7p\2\2\u0098\24"+
		"\3\2\2\2\u0099\u009a\7t\2\2\u009a\u009b\7g\2\2\u009b\u009c\7v\2\2\u009c"+
		"\u009d\7w\2\2\u009d\u009e\7t\2\2\u009e\u009f\7p\2\2\u009f\26\3\2\2\2\u00a0"+
		"\u00a1\7y\2\2\u00a1\u00a2\7j\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4\7n\2\2"+
		"\u00a4\u00a5\7g\2\2\u00a5\30\3\2\2\2\u00a6\u00a7\7u\2\2\u00a7\u00a8\7"+
		"g\2\2\u00a8\u00a9\7n\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7e\2\2\u00ab\u00ac"+
		"\7v\2\2\u00ac\32\3\2\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7p\2\2\u00af\u00b0"+
		"\7f\2\2\u00b0\34\3\2\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7h\2\2\u00b3\36"+
		"\3\2\2\2\u00b4\u00b5\7v\2\2\u00b5\u00b6\7j\2\2\u00b6\u00b7\7g\2\2\u00b7"+
		"\u00b8\7p\2\2\u00b8 \3\2\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb\7n\2\2\u00bb"+
		"\u00bc\7u\2\2\u00bc\u00bd\7g\2\2\u00bd\"\3\2\2\2\u00be\u00bf\7n\2\2\u00bf"+
		"\u00c0\7g\2\2\u00c0\u00c1\7p\2\2\u00c1\u00c2\7i\2\2\u00c2\u00c3\7v\2\2"+
		"\u00c3\u00c4\7j\2\2\u00c4$\3\2\2\2\u00c5\u00c6\7(\2\2\u00c6&\3\2\2\2\u00c7"+
		"\u00c8\7>\2\2\u00c8\u00c9\7/\2\2\u00c9(\3\2\2\2\u00ca\u00cb\7?\2\2\u00cb"+
		"*\3\2\2\2\u00cc\u00cd\7@\2\2\u00cd\u00ce\7?\2\2\u00ce,\3\2\2\2\u00cf\u00d0"+
		"\7@\2\2\u00d0.\3\2\2\2\u00d1\u00d2\7>\2\2\u00d2\u00d3\7?\2\2\u00d3\60"+
		"\3\2\2\2\u00d4\u00d5\7>\2\2\u00d5\62\3\2\2\2\u00d6\u00d7\7/\2\2\u00d7"+
		"\64\3\2\2\2\u00d8\u00d9\7\u0080\2\2\u00d9\u00da\7?\2\2\u00da\66\3\2\2"+
		"\2\u00db\u00dc\7~\2\2\u00dc8\3\2\2\2\u00dd\u00de\7-\2\2\u00de:\3\2\2\2"+
		"\u00df\u00e0\7\61\2\2\u00e0<\3\2\2\2\u00e1\u00e2\7,\2\2\u00e2>\3\2\2\2"+
		"\u00e3\u00e4\7\u0080\2\2\u00e4@\3\2\2\2\u00e5\u00e6\7.\2\2\u00e6B\3\2"+
		"\2\2\u00e7\u00e8\7=\2\2\u00e8D\3\2\2\2\u00e9\u00ea\7\60\2\2\u00ea\u00eb"+
		"\7\60\2\2\u00eb\u00ec\7\60\2\2\u00ecF\3\2\2\2\u00ed\u00ee\7\60\2\2\u00ee"+
		"H\3\2\2\2\u00ef\u00f0\7]\2\2\u00f0J\3\2\2\2\u00f1\u00f2\7_\2\2\u00f2L"+
		"\3\2\2\2\u00f3\u00f4\7*\2\2\u00f4N\3\2\2\2\u00f5\u00f6\7+\2\2\u00f6P\3"+
		"\2\2\2\u00f7\u00f8\7}\2\2\u00f8R\3\2\2\2\u00f9\u00fa\7\177\2\2\u00faT"+
		"\3\2\2\2\u00fb\u00fd\t\2\2\2\u00fc\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe"+
		"\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\b+"+
		"\2\2\u0101V\3\2\2\2\u0102\u0104\5g\64\2\u0103\u0102\3\2\2\2\u0104\u0105"+
		"\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106X\3\2\2\2\u0107"+
		"\u0108\7v\2\2\u0108\u0109\7t\2\2\u0109\u010a\7w\2\2\u010a\u0111\7g\2\2"+
		"\u010b\u010c\7h\2\2\u010c\u010d\7c\2\2\u010d\u010e\7n\2\2\u010e\u010f"+
		"\7u\2\2\u010f\u0111\7g\2\2\u0110\u0107\3\2\2\2\u0110\u010b\3\2\2\2\u0111"+
		"Z\3\2\2\2\u0112\u0118\5m\67\2\u0113\u0117\5m\67\2\u0114\u0117\5g\64\2"+
		"\u0115\u0117\5e\63\2\u0116\u0113\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0115"+
		"\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119"+
		"\\\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u0121\7$\2\2\u011c\u011d\7^\2\2\u011d"+
		"\u0120\13\2\2\2\u011e\u0120\n\3\2\2\u011f\u011c\3\2\2\2\u011f\u011e\3"+
		"\2\2\2\u0120\u0123\3\2\2\2\u0121\u0122\3\2\2\2\u0121\u011f\3\2\2\2\u0122"+
		"\u0124\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0125\7$\2\2\u0125^\3\2\2\2\u0126"+
		"\u0129\5a\61\2\u0127\u0129\5c\62\2\u0128\u0126\3\2\2\2\u0128\u0127\3\2"+
		"\2\2\u0129\u012a\3\2\2\2\u012a\u012b\b\60\2\2\u012b`\3\2\2\2\u012c\u0130"+
		"\7%\2\2\u012d\u012f\13\2\2\2\u012e\u012d\3\2\2\2\u012f\u0132\3\2\2\2\u0130"+
		"\u0131\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2"+
		"\2\2\u0133\u0135\t\4\2\2\u0134\u0133\3\2\2\2\u0135b\3\2\2\2\u0136\u0137"+
		"\7*\2\2\u0137\u0138\7,\2\2\u0138\u013d\3\2\2\2\u0139\u013c\5c\62\2\u013a"+
		"\u013c\13\2\2\2\u013b\u0139\3\2\2\2\u013b\u013a\3\2\2\2\u013c\u013f\3"+
		"\2\2\2\u013d\u013e\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u0140\3\2\2\2\u013f"+
		"\u013d\3\2\2\2\u0140\u0141\7,\2\2\u0141\u0142\7+\2\2\u0142d\3\2\2\2\u0143"+
		"\u0144\7a\2\2\u0144f\3\2\2\2\u0145\u0146\t\5\2\2\u0146h\3\2\2\2\u0147"+
		"\u0148\t\6\2\2\u0148j\3\2\2\2\u0149\u014a\t\7\2\2\u014al\3\2\2\2\u014b"+
		"\u014e\5i\65\2\u014c\u014e\5k\66\2\u014d\u014b\3\2\2\2\u014d\u014c\3\2"+
		"\2\2\u014en\3\2\2\2\20\2\u00fe\u0105\u0110\u0116\u0118\u011f\u0121\u0128"+
		"\u0130\u0134\u013b\u013d\u014d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}