// Generated from /Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Projects/WPLProject/grun/WPL.g4 by ANTLR 4.9.2
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
		IF=1, ENDIF=2, PRINT=3, INT=4, BOOL=5, STR=6, LEXERVARIABLEOPERATORS=7, 
		LEXERCOMPARISONOPERATORS=8, LEXERUNARY=9, ASSIGN=10, SET=11, UNEQUAL=12, 
		EQUAL=13, MULTIPLY=14, DIVIDE=15, PLUS=16, MINUS=17, GREATER=18, GREATEREQUAL=19, 
		LESS=20, LESSEQUAL=21, NOT=22, AND=23, OR=24, SEMICOLON=25, QUOTE=26, 
		LBRAC=27, RBRAC=28, LPAREN=29, RPAREN=30, FALSE=31, TRUE=32, VARIABLE=33, 
		INTEGER=34, STRING=35, BOOLEAN=36, WS=37;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IF", "ENDIF", "PRINT", "INT", "BOOL", "STR", "LEXERVARIABLEOPERATORS", 
			"LEXERCOMPARISONOPERATORS", "LEXERUNARY", "ASSIGN", "SET", "UNEQUAL", 
			"EQUAL", "MULTIPLY", "DIVIDE", "PLUS", "MINUS", "GREATER", "GREATEREQUAL", 
			"LESS", "LESSEQUAL", "NOT", "AND", "OR", "SEMICOLON", "QUOTE", "LBRAC", 
			"RBRAC", "LPAREN", "RPAREN", "FALSE", "TRUE", "VARIABLE", "INTEGER", 
			"STRING", "BOOLEAN", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u00db\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\5\bq\n\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\t|\n\t\3\n\3\n\5\n\u0080\n\n\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3"+
		"\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3"+
		"\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 "+
		"\3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\6\"\u00bd\n\"\r\"\16\"\u00be\3#\3#\7#"+
		"\u00c3\n#\f#\16#\u00c6\13#\3$\3$\7$\u00ca\n$\f$\16$\u00cd\13$\3$\3$\3"+
		"%\3%\5%\u00d3\n%\3&\6&\u00d6\n&\r&\16&\u00d7\3&\3&\2\2\'\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'\3\2\6\4\2C\\c|\3\2\62;\3\2$$\5\2\13\f\17\17\"\"\2\u00eb\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\3M\3\2\2\2\5P\3\2\2\2\7V\3\2\2\2\t\\\3\2\2\2\13`\3\2"+
		"\2\2\rh\3\2\2\2\17p\3\2\2\2\21{\3\2\2\2\23\177\3\2\2\2\25\u0081\3\2\2"+
		"\2\27\u0084\3\2\2\2\31\u0087\3\2\2\2\33\u008a\3\2\2\2\35\u008c\3\2\2\2"+
		"\37\u008e\3\2\2\2!\u0090\3\2\2\2#\u0092\3\2\2\2%\u0094\3\2\2\2\'\u0096"+
		"\3\2\2\2)\u0099\3\2\2\2+\u009b\3\2\2\2-\u009e\3\2\2\2/\u00a0\3\2\2\2\61"+
		"\u00a2\3\2\2\2\63\u00a4\3\2\2\2\65\u00a6\3\2\2\2\67\u00a8\3\2\2\29\u00aa"+
		"\3\2\2\2;\u00ac\3\2\2\2=\u00ae\3\2\2\2?\u00b0\3\2\2\2A\u00b6\3\2\2\2C"+
		"\u00bc\3\2\2\2E\u00c0\3\2\2\2G\u00c7\3\2\2\2I\u00d2\3\2\2\2K\u00d5\3\2"+
		"\2\2MN\7k\2\2NO\7h\2\2O\4\3\2\2\2PQ\7g\2\2QR\7p\2\2RS\7f\2\2ST\7k\2\2"+
		"TU\7h\2\2U\6\3\2\2\2VW\7r\2\2WX\7t\2\2XY\7k\2\2YZ\7p\2\2Z[\7v\2\2[\b\3"+
		"\2\2\2\\]\7k\2\2]^\7p\2\2^_\7v\2\2_\n\3\2\2\2`a\7d\2\2ab\7q\2\2bc\7q\2"+
		"\2cd\7n\2\2de\7g\2\2ef\7c\2\2fg\7p\2\2g\f\3\2\2\2hi\7u\2\2ij\7v\2\2jk"+
		"\7t\2\2k\16\3\2\2\2lq\5\35\17\2mq\5\37\20\2nq\5!\21\2oq\5#\22\2pl\3\2"+
		"\2\2pm\3\2\2\2pn\3\2\2\2po\3\2\2\2q\20\3\2\2\2r|\5%\23\2s|\5\31\r\2t|"+
		"\5\33\16\2u|\5\'\24\2v|\5)\25\2w|\5+\26\2x|\5-\27\2y|\5/\30\2z|\5\61\31"+
		"\2{r\3\2\2\2{s\3\2\2\2{t\3\2\2\2{u\3\2\2\2{v\3\2\2\2{w\3\2\2\2{x\3\2\2"+
		"\2{y\3\2\2\2{z\3\2\2\2|\22\3\2\2\2}\u0080\5#\22\2~\u0080\5-\27\2\177}"+
		"\3\2\2\2\177~\3\2\2\2\u0080\24\3\2\2\2\u0081\u0082\7<\2\2\u0082\u0083"+
		"\7?\2\2\u0083\26\3\2\2\2\u0084\u0085\7>\2\2\u0085\u0086\7/\2\2\u0086\30"+
		"\3\2\2\2\u0087\u0088\7\u0080\2\2\u0088\u0089\7?\2\2\u0089\32\3\2\2\2\u008a"+
		"\u008b\7?\2\2\u008b\34\3\2\2\2\u008c\u008d\7,\2\2\u008d\36\3\2\2\2\u008e"+
		"\u008f\7\61\2\2\u008f \3\2\2\2\u0090\u0091\7-\2\2\u0091\"\3\2\2\2\u0092"+
		"\u0093\7/\2\2\u0093$\3\2\2\2\u0094\u0095\7@\2\2\u0095&\3\2\2\2\u0096\u0097"+
		"\7@\2\2\u0097\u0098\7?\2\2\u0098(\3\2\2\2\u0099\u009a\7>\2\2\u009a*\3"+
		"\2\2\2\u009b\u009c\7>\2\2\u009c\u009d\7?\2\2\u009d,\3\2\2\2\u009e\u009f"+
		"\7\u0080\2\2\u009f.\3\2\2\2\u00a0\u00a1\7(\2\2\u00a1\60\3\2\2\2\u00a2"+
		"\u00a3\7~\2\2\u00a3\62\3\2\2\2\u00a4\u00a5\7=\2\2\u00a5\64\3\2\2\2\u00a6"+
		"\u00a7\7$\2\2\u00a7\66\3\2\2\2\u00a8\u00a9\7]\2\2\u00a98\3\2\2\2\u00aa"+
		"\u00ab\7_\2\2\u00ab:\3\2\2\2\u00ac\u00ad\7*\2\2\u00ad<\3\2\2\2\u00ae\u00af"+
		"\7+\2\2\u00af>\3\2\2\2\u00b0\u00b1\7h\2\2\u00b1\u00b2\7c\2\2\u00b2\u00b3"+
		"\7n\2\2\u00b3\u00b4\7u\2\2\u00b4\u00b5\7g\2\2\u00b5@\3\2\2\2\u00b6\u00b7"+
		"\7v\2\2\u00b7\u00b8\7t\2\2\u00b8\u00b9\7w\2\2\u00b9\u00ba\7g\2\2\u00ba"+
		"B\3\2\2\2\u00bb\u00bd\t\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2"+
		"\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bfD\3\2\2\2\u00c0\u00c4\t"+
		"\3\2\2\u00c1\u00c3\t\3\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5F\3\2\2\2\u00c6\u00c4\3\2\2\2"+
		"\u00c7\u00cb\7$\2\2\u00c8\u00ca\n\4\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cd"+
		"\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00ce\u00cf\7$\2\2\u00cfH\3\2\2\2\u00d0\u00d3\5? \2\u00d1"+
		"\u00d3\5A!\2\u00d2\u00d0\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3J\3\2\2\2\u00d4"+
		"\u00d6\t\5\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d5\3\2"+
		"\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\b&\2\2\u00da"+
		"L\3\2\2\2\13\2p{\177\u00be\u00c4\u00cb\u00d2\u00d7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}