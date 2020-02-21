// Generated from /Users/xinwei/Documents/weixin/study-antlr/antlr-ex/src/main/resources/PANTS.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PANTSLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, JAVA_LIBRARY=7, JAR_LIBRARY=8, 
		JVM_LIBRARY=9, NAME=10, DEPENDENCIES=11, SOURCES=12, GLOBS=13, MAIN=14, 
		STRING=15, NEWLINE=16, WS=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "JAVA_LIBRARY", "JAR_LIBRARY", 
		"JVM_LIBRARY", "NAME", "DEPENDENCIES", "SOURCES", "GLOBS", "MAIN", "STRING", 
		"NEWLINE", "ESC", "UNICODE", "HEX", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'='", "','", "'['", "']'", "'java_library'", "'jar_library'", 
		"'jvm_library'", "'name'", "'dependencies'", "'sources'", "'globs'", "'main'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "JAVA_LIBRARY", "JAR_LIBRARY", 
		"JVM_LIBRARY", "NAME", "DEPENDENCIES", "SOURCES", "GLOBS", "MAIN", "STRING", 
		"NEWLINE", "WS"
	};
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


	public PANTSLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PANTS.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23\u00a4\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\7\20\u0085"+
		"\n\20\f\20\16\20\u0088\13\20\3\20\3\20\3\21\5\21\u008d\n\21\3\21\3\21"+
		"\3\22\3\22\3\22\5\22\u0094\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\25\6\25\u009f\n\25\r\25\16\25\u00a0\3\25\3\25\3\u0086\2\26\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\2%\2\'\2)\23\3\2\6\4\2$$^^\n\2$$\61\61^^ddhhppttvv\5\2\62;CHch\5\2\13"+
		"\f\17\17\"\"\2\u00a5\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5-\3\2\2\2\7/\3\2\2\2\t\61\3\2\2\2"+
		"\13\63\3\2\2\2\r\65\3\2\2\2\17\67\3\2\2\2\21D\3\2\2\2\23P\3\2\2\2\25\\"+
		"\3\2\2\2\27a\3\2\2\2\31n\3\2\2\2\33v\3\2\2\2\35|\3\2\2\2\37\u0081\3\2"+
		"\2\2!\u008c\3\2\2\2#\u0090\3\2\2\2%\u0095\3\2\2\2\'\u009b\3\2\2\2)\u009e"+
		"\3\2\2\2+,\7*\2\2,\4\3\2\2\2-.\7+\2\2.\6\3\2\2\2/\60\7?\2\2\60\b\3\2\2"+
		"\2\61\62\7.\2\2\62\n\3\2\2\2\63\64\7]\2\2\64\f\3\2\2\2\65\66\7_\2\2\66"+
		"\16\3\2\2\2\678\7l\2\289\7c\2\29:\7x\2\2:;\7c\2\2;<\7a\2\2<=\7n\2\2=>"+
		"\7k\2\2>?\7d\2\2?@\7t\2\2@A\7c\2\2AB\7t\2\2BC\7{\2\2C\20\3\2\2\2DE\7l"+
		"\2\2EF\7c\2\2FG\7t\2\2GH\7a\2\2HI\7n\2\2IJ\7k\2\2JK\7d\2\2KL\7t\2\2LM"+
		"\7c\2\2MN\7t\2\2NO\7{\2\2O\22\3\2\2\2PQ\7l\2\2QR\7x\2\2RS\7o\2\2ST\7a"+
		"\2\2TU\7n\2\2UV\7k\2\2VW\7d\2\2WX\7t\2\2XY\7c\2\2YZ\7t\2\2Z[\7{\2\2[\24"+
		"\3\2\2\2\\]\7p\2\2]^\7c\2\2^_\7o\2\2_`\7g\2\2`\26\3\2\2\2ab\7f\2\2bc\7"+
		"g\2\2cd\7r\2\2de\7g\2\2ef\7p\2\2fg\7f\2\2gh\7g\2\2hi\7p\2\2ij\7e\2\2j"+
		"k\7k\2\2kl\7g\2\2lm\7u\2\2m\30\3\2\2\2no\7u\2\2op\7q\2\2pq\7w\2\2qr\7"+
		"t\2\2rs\7e\2\2st\7g\2\2tu\7u\2\2u\32\3\2\2\2vw\7i\2\2wx\7n\2\2xy\7q\2"+
		"\2yz\7d\2\2z{\7u\2\2{\34\3\2\2\2|}\7o\2\2}~\7c\2\2~\177\7k\2\2\177\u0080"+
		"\7p\2\2\u0080\36\3\2\2\2\u0081\u0086\7)\2\2\u0082\u0085\5#\22\2\u0083"+
		"\u0085\n\2\2\2\u0084\u0082\3\2\2\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2"+
		"\2\2\u0086\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0089\3\2\2\2\u0088"+
		"\u0086\3\2\2\2\u0089\u008a\7)\2\2\u008a \3\2\2\2\u008b\u008d\7\17\2\2"+
		"\u008c\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f"+
		"\7\f\2\2\u008f\"\3\2\2\2\u0090\u0093\7^\2\2\u0091\u0094\t\3\2\2\u0092"+
		"\u0094\5%\23\2\u0093\u0091\3\2\2\2\u0093\u0092\3\2\2\2\u0094$\3\2\2\2"+
		"\u0095\u0096\7w\2\2\u0096\u0097\5\'\24\2\u0097\u0098\5\'\24\2\u0098\u0099"+
		"\5\'\24\2\u0099\u009a\5\'\24\2\u009a&\3\2\2\2\u009b\u009c\t\4\2\2\u009c"+
		"(\3\2\2\2\u009d\u009f\t\5\2\2\u009e\u009d\3\2\2\2\u009f\u00a0\3\2\2\2"+
		"\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3"+
		"\b\25\2\2\u00a3*\3\2\2\2\b\2\u0084\u0086\u008c\u0093\u00a0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}