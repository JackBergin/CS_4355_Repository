// Generated from Calculator.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, ASSIGN=2, DIVIDE=3, EQUAL=4, GREATER=5, LESS=6, MINUS=7, MULTIPLY=8, 
		NOT=9, PLUS=10, UNEQUAL=11, LPAR=12, RPAR=13, SEMICOLON=14, FALSE=15, 
		TRUE=16, INTEGER=17, VARIABLE=18, TYPE=19, WS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "ASSIGN", "DIVIDE", "EQUAL", "GREATER", "LESS", "MINUS", "MULTIPLY", 
			"NOT", "PLUS", "UNEQUAL", "LPAR", "RPAR", "SEMICOLON", "FALSE", "TRUE", 
			"INTEGER", "VARIABLE", "TYPE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "':='", "'/'", "'='", "'>'", "'<'", "'-'", "'*'", "'~'", 
			"'+'", "'~='", "'('", "')'", "';'", "'false'", "'true'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "ASSIGN", "DIVIDE", "EQUAL", "GREATER", "LESS", "MINUS", 
			"MULTIPLY", "NOT", "PLUS", "UNEQUAL", "LPAR", "RPAR", "SEMICOLON", "FALSE", 
			"TRUE", "INTEGER", "VARIABLE", "TYPE", "WS"
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


	public CalculatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calculator.g4"; }

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
		"\u0004\u0000\u0014r\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n"+
		"\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0004\u0010T\b\u0010\u000b\u0010\f\u0010U\u0001\u0011\u0004\u0011Y\b"+
		"\u0011\u000b\u0011\f\u0011Z\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012j\b\u0012\u0001"+
		"\u0013\u0004\u0013m\b\u0013\u000b\u0013\f\u0013n\u0001\u0013\u0001\u0013"+
		"\u0000\u0000\u0014\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014\u0001"+
		"\u0000\u0003\u0001\u000009\u0002\u0000AZaz\u0003\u0000\t\n\r\r  v\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0001)\u0001\u0000\u0000\u0000"+
		"\u0003+\u0001\u0000\u0000\u0000\u0005.\u0001\u0000\u0000\u0000\u00070"+
		"\u0001\u0000\u0000\u0000\t2\u0001\u0000\u0000\u0000\u000b4\u0001\u0000"+
		"\u0000\u0000\r6\u0001\u0000\u0000\u0000\u000f8\u0001\u0000\u0000\u0000"+
		"\u0011:\u0001\u0000\u0000\u0000\u0013<\u0001\u0000\u0000\u0000\u0015>"+
		"\u0001\u0000\u0000\u0000\u0017A\u0001\u0000\u0000\u0000\u0019C\u0001\u0000"+
		"\u0000\u0000\u001bE\u0001\u0000\u0000\u0000\u001dG\u0001\u0000\u0000\u0000"+
		"\u001fM\u0001\u0000\u0000\u0000!S\u0001\u0000\u0000\u0000#X\u0001\u0000"+
		"\u0000\u0000%i\u0001\u0000\u0000\u0000\'l\u0001\u0000\u0000\u0000)*\u0005"+
		" \u0000\u0000*\u0002\u0001\u0000\u0000\u0000+,\u0005:\u0000\u0000,-\u0005"+
		"=\u0000\u0000-\u0004\u0001\u0000\u0000\u0000./\u0005/\u0000\u0000/\u0006"+
		"\u0001\u0000\u0000\u000001\u0005=\u0000\u00001\b\u0001\u0000\u0000\u0000"+
		"23\u0005>\u0000\u00003\n\u0001\u0000\u0000\u000045\u0005<\u0000\u0000"+
		"5\f\u0001\u0000\u0000\u000067\u0005-\u0000\u00007\u000e\u0001\u0000\u0000"+
		"\u000089\u0005*\u0000\u00009\u0010\u0001\u0000\u0000\u0000:;\u0005~\u0000"+
		"\u0000;\u0012\u0001\u0000\u0000\u0000<=\u0005+\u0000\u0000=\u0014\u0001"+
		"\u0000\u0000\u0000>?\u0005~\u0000\u0000?@\u0005=\u0000\u0000@\u0016\u0001"+
		"\u0000\u0000\u0000AB\u0005(\u0000\u0000B\u0018\u0001\u0000\u0000\u0000"+
		"CD\u0005)\u0000\u0000D\u001a\u0001\u0000\u0000\u0000EF\u0005;\u0000\u0000"+
		"F\u001c\u0001\u0000\u0000\u0000GH\u0005f\u0000\u0000HI\u0005a\u0000\u0000"+
		"IJ\u0005l\u0000\u0000JK\u0005s\u0000\u0000KL\u0005e\u0000\u0000L\u001e"+
		"\u0001\u0000\u0000\u0000MN\u0005t\u0000\u0000NO\u0005r\u0000\u0000OP\u0005"+
		"u\u0000\u0000PQ\u0005e\u0000\u0000Q \u0001\u0000\u0000\u0000RT\u0007\u0000"+
		"\u0000\u0000SR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000US\u0001"+
		"\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000V\"\u0001\u0000\u0000\u0000"+
		"WY\u0007\u0001\u0000\u0000XW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000"+
		"\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[$\u0001\u0000"+
		"\u0000\u0000\\]\u0005i\u0000\u0000]^\u0005n\u0000\u0000^j\u0005t\u0000"+
		"\u0000_`\u0005b\u0000\u0000`a\u0005o\u0000\u0000ab\u0005o\u0000\u0000"+
		"bj\u0005l\u0000\u0000cd\u0005s\u0000\u0000de\u0005t\u0000\u0000ef\u0005"+
		"r\u0000\u0000fg\u0005i\u0000\u0000gh\u0005n\u0000\u0000hj\u0005g\u0000"+
		"\u0000i\\\u0001\u0000\u0000\u0000i_\u0001\u0000\u0000\u0000ic\u0001\u0000"+
		"\u0000\u0000j&\u0001\u0000\u0000\u0000km\u0007\u0002\u0000\u0000lk\u0001"+
		"\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000"+
		"no\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pq\u0006\u0013\u0000"+
		"\u0000q(\u0001\u0000\u0000\u0000\u0005\u0000UZin\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}