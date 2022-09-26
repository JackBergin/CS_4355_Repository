// Generated from /Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Projects/WPLProject/Tests/WPL2.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WPL2Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ENDIF=2, PRINT=3, INT=4, BOOL=5, STR=6, LEXEROPERATORS=7, ASSIGN=8, 
		DIVIDE=9, EQUAL=10, GREATER=11, LESS=12, MINUS=13, MULTIPLY=14, NOT=15, 
		PLUS=16, UNEQUAL=17, SEMICOLON=18, LPAREN=19, RPAREN=20, FALSE=21, TRUE=22, 
		INTEGER=23, STRING=24, BOOLEAN=25, VARIABLE=26, WS=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IF", "ENDIF", "PRINT", "INT", "BOOL", "STR", "LEXEROPERATORS", "ASSIGN", 
			"DIVIDE", "EQUAL", "GREATER", "LESS", "MINUS", "MULTIPLY", "NOT", "PLUS", 
			"UNEQUAL", "SEMICOLON", "LPAREN", "RPAREN", "FALSE", "TRUE", "INTEGER", 
			"STRING", "BOOLEAN", "VARIABLE", "WS"
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


	public WPL2Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "WPL2.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u00a7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bc\n\b"+
		"\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\7\30\u008e\n\30"+
		"\f\30\16\30\u0091\13\30\3\31\6\31\u0094\n\31\r\31\16\31\u0095\3\32\3\32"+
		"\5\32\u009a\n\32\3\33\6\33\u009d\n\33\r\33\16\33\u009e\3\34\6\34\u00a2"+
		"\n\34\r\34\16\34\u00a3\3\34\3\34\2\2\35\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\35\3\2\6\3\2\62;\4\2C\\c|\3\2c|\5\2\13\f"+
		"\17\17\"\"\2\u00b4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\39\3\2\2\2\5<\3\2\2\2\7B\3\2\2\2\tH\3\2\2\2\13L\3\2\2\2\rT\3\2\2\2\17"+
		"b\3\2\2\2\21d\3\2\2\2\23g\3\2\2\2\25i\3\2\2\2\27k\3\2\2\2\31m\3\2\2\2"+
		"\33o\3\2\2\2\35q\3\2\2\2\37s\3\2\2\2!u\3\2\2\2#w\3\2\2\2%z\3\2\2\2\'|"+
		"\3\2\2\2)~\3\2\2\2+\u0080\3\2\2\2-\u0086\3\2\2\2/\u008b\3\2\2\2\61\u0093"+
		"\3\2\2\2\63\u0099\3\2\2\2\65\u009c\3\2\2\2\67\u00a1\3\2\2\29:\7k\2\2:"+
		";\7h\2\2;\4\3\2\2\2<=\7g\2\2=>\7p\2\2>?\7f\2\2?@\7k\2\2@A\7h\2\2A\6\3"+
		"\2\2\2BC\7r\2\2CD\7t\2\2DE\7k\2\2EF\7p\2\2FG\7v\2\2G\b\3\2\2\2HI\7k\2"+
		"\2IJ\7p\2\2JK\7v\2\2K\n\3\2\2\2LM\7d\2\2MN\7q\2\2NO\7q\2\2OP\7n\2\2PQ"+
		"\7g\2\2QR\7c\2\2RS\7p\2\2S\f\3\2\2\2TU\7u\2\2UV\7v\2\2VW\7t\2\2W\16\3"+
		"\2\2\2Xc\5\21\t\2Yc\5\23\n\2Zc\5\25\13\2[c\5\27\f\2\\c\5\31\r\2]c\5\33"+
		"\16\2^c\5\35\17\2_c\5\37\20\2`c\5!\21\2ac\5#\22\2bX\3\2\2\2bY\3\2\2\2"+
		"bZ\3\2\2\2b[\3\2\2\2b\\\3\2\2\2b]\3\2\2\2b^\3\2\2\2b_\3\2\2\2b`\3\2\2"+
		"\2ba\3\2\2\2c\20\3\2\2\2de\7<\2\2ef\7?\2\2f\22\3\2\2\2gh\7\61\2\2h\24"+
		"\3\2\2\2ij\7?\2\2j\26\3\2\2\2kl\7@\2\2l\30\3\2\2\2mn\7>\2\2n\32\3\2\2"+
		"\2op\7/\2\2p\34\3\2\2\2qr\7,\2\2r\36\3\2\2\2st\7\u0080\2\2t \3\2\2\2u"+
		"v\7-\2\2v\"\3\2\2\2wx\7\u0080\2\2xy\7?\2\2y$\3\2\2\2z{\7=\2\2{&\3\2\2"+
		"\2|}\7*\2\2}(\3\2\2\2~\177\7+\2\2\177*\3\2\2\2\u0080\u0081\7h\2\2\u0081"+
		"\u0082\7c\2\2\u0082\u0083\7n\2\2\u0083\u0084\7u\2\2\u0084\u0085\7g\2\2"+
		"\u0085,\3\2\2\2\u0086\u0087\7v\2\2\u0087\u0088\7t\2\2\u0088\u0089\7w\2"+
		"\2\u0089\u008a\7g\2\2\u008a.\3\2\2\2\u008b\u008f\t\2\2\2\u008c\u008e\t"+
		"\2\2\2\u008d\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\60\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0094\t\3\2"+
		"\2\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096"+
		"\3\2\2\2\u0096\62\3\2\2\2\u0097\u009a\5+\26\2\u0098\u009a\5-\27\2\u0099"+
		"\u0097\3\2\2\2\u0099\u0098\3\2\2\2\u009a\64\3\2\2\2\u009b\u009d\t\4\2"+
		"\2\u009c\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f"+
		"\3\2\2\2\u009f\66\3\2\2\2\u00a0\u00a2\t\5\2\2\u00a1\u00a0\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2"+
		"\2\2\u00a5\u00a6\b\34\2\2\u00a68\3\2\2\2\t\2b\u008f\u0095\u0099\u009e"+
		"\u00a3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}