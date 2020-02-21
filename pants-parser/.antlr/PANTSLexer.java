// Generated from /Users/xinwei/Documents/weixin/study-antlr/pants-parser/PANTS.g4 by ANTLR 4.7.1
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
		JVM_LIBRARY=9, JARS=10, JAR=11, SCALA_JAR=12, NAME=13, ORG=14, REV=15, 
		DEPENDENCIES=16, SOURCES=17, GLOBS=18, MAIN=19, SINGLE_QUOTED_STRING=20, 
		NEWLINE=21, DOUBLE_QUOTED_STRING=22, WS=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "JAVA_LIBRARY", "JAR_LIBRARY", 
		"JVM_LIBRARY", "JARS", "JAR", "SCALA_JAR", "NAME", "ORG", "REV", "DEPENDENCIES", 
		"SOURCES", "GLOBS", "MAIN", "SINGLE_QUOTED_STRING", "NEWLINE", "DOUBLE_QUOTED_STRING", 
		"ESC", "UNICODE", "HEX", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'='", "'['", "']'", "','", "'java_library'", "'jar_library'", 
		"'jvm_binary'", "'jars'", "'jar'", "'scala_jar'", "'name'", "'org'", "'rev'", 
		"'dependencies'", "'sources'", "'globs'", "'main'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "JAVA_LIBRARY", "JAR_LIBRARY", 
		"JVM_LIBRARY", "JARS", "JAR", "SCALA_JAR", "NAME", "ORG", "REV", "DEPENDENCIES", 
		"SOURCES", "GLOBS", "MAIN", "SINGLE_QUOTED_STRING", "NEWLINE", "DOUBLE_QUOTED_STRING", 
		"WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u00d7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\7\25\u00ab\n\25\f\25"+
		"\16\25\u00ae\13\25\3\25\3\25\3\26\5\26\u00b3\n\26\3\26\3\26\3\27\3\27"+
		"\3\27\5\27\u00ba\n\27\3\27\7\27\u00bd\n\27\f\27\16\27\u00c0\13\27\3\27"+
		"\3\27\3\30\3\30\3\30\5\30\u00c7\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\33\6\33\u00d2\n\33\r\33\16\33\u00d3\3\33\3\33\4\u00ac\u00be\2"+
		"\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\2\61\2\63\2\65\31\3\2\6\4\2$$"+
		"^^\n\2$$\61\61^^ddhhppttvv\5\2\62;CHch\5\2\13\f\17\17\"\"\2\u00da\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2\65\3\2\2\2"+
		"\3\67\3\2\2\2\59\3\2\2\2\7;\3\2\2\2\t=\3\2\2\2\13?\3\2\2\2\rA\3\2\2\2"+
		"\17C\3\2\2\2\21P\3\2\2\2\23\\\3\2\2\2\25g\3\2\2\2\27l\3\2\2\2\31p\3\2"+
		"\2\2\33z\3\2\2\2\35\177\3\2\2\2\37\u0083\3\2\2\2!\u0087\3\2\2\2#\u0094"+
		"\3\2\2\2%\u009c\3\2\2\2\'\u00a2\3\2\2\2)\u00a7\3\2\2\2+\u00b2\3\2\2\2"+
		"-\u00b6\3\2\2\2/\u00c3\3\2\2\2\61\u00c8\3\2\2\2\63\u00ce\3\2\2\2\65\u00d1"+
		"\3\2\2\2\678\7*\2\28\4\3\2\2\29:\7+\2\2:\6\3\2\2\2;<\7?\2\2<\b\3\2\2\2"+
		"=>\7]\2\2>\n\3\2\2\2?@\7_\2\2@\f\3\2\2\2AB\7.\2\2B\16\3\2\2\2CD\7l\2\2"+
		"DE\7c\2\2EF\7x\2\2FG\7c\2\2GH\7a\2\2HI\7n\2\2IJ\7k\2\2JK\7d\2\2KL\7t\2"+
		"\2LM\7c\2\2MN\7t\2\2NO\7{\2\2O\20\3\2\2\2PQ\7l\2\2QR\7c\2\2RS\7t\2\2S"+
		"T\7a\2\2TU\7n\2\2UV\7k\2\2VW\7d\2\2WX\7t\2\2XY\7c\2\2YZ\7t\2\2Z[\7{\2"+
		"\2[\22\3\2\2\2\\]\7l\2\2]^\7x\2\2^_\7o\2\2_`\7a\2\2`a\7d\2\2ab\7k\2\2"+
		"bc\7p\2\2cd\7c\2\2de\7t\2\2ef\7{\2\2f\24\3\2\2\2gh\7l\2\2hi\7c\2\2ij\7"+
		"t\2\2jk\7u\2\2k\26\3\2\2\2lm\7l\2\2mn\7c\2\2no\7t\2\2o\30\3\2\2\2pq\7"+
		"u\2\2qr\7e\2\2rs\7c\2\2st\7n\2\2tu\7c\2\2uv\7a\2\2vw\7l\2\2wx\7c\2\2x"+
		"y\7t\2\2y\32\3\2\2\2z{\7p\2\2{|\7c\2\2|}\7o\2\2}~\7g\2\2~\34\3\2\2\2\177"+
		"\u0080\7q\2\2\u0080\u0081\7t\2\2\u0081\u0082\7i\2\2\u0082\36\3\2\2\2\u0083"+
		"\u0084\7t\2\2\u0084\u0085\7g\2\2\u0085\u0086\7x\2\2\u0086 \3\2\2\2\u0087"+
		"\u0088\7f\2\2\u0088\u0089\7g\2\2\u0089\u008a\7r\2\2\u008a\u008b\7g\2\2"+
		"\u008b\u008c\7p\2\2\u008c\u008d\7f\2\2\u008d\u008e\7g\2\2\u008e\u008f"+
		"\7p\2\2\u008f\u0090\7e\2\2\u0090\u0091\7k\2\2\u0091\u0092\7g\2\2\u0092"+
		"\u0093\7u\2\2\u0093\"\3\2\2\2\u0094\u0095\7u\2\2\u0095\u0096\7q\2\2\u0096"+
		"\u0097\7w\2\2\u0097\u0098\7t\2\2\u0098\u0099\7e\2\2\u0099\u009a\7g\2\2"+
		"\u009a\u009b\7u\2\2\u009b$\3\2\2\2\u009c\u009d\7i\2\2\u009d\u009e\7n\2"+
		"\2\u009e\u009f\7q\2\2\u009f\u00a0\7d\2\2\u00a0\u00a1\7u\2\2\u00a1&\3\2"+
		"\2\2\u00a2\u00a3\7o\2\2\u00a3\u00a4\7c\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6"+
		"\7p\2\2\u00a6(\3\2\2\2\u00a7\u00ac\7)\2\2\u00a8\u00ab\5/\30\2\u00a9\u00ab"+
		"\n\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\u00ac\3\2"+
		"\2\2\u00af\u00b0\7)\2\2\u00b0*\3\2\2\2\u00b1\u00b3\7\17\2\2\u00b2\u00b1"+
		"\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\7\f\2\2\u00b5"+
		",\3\2\2\2\u00b6\u00b9\7$\2\2\u00b7\u00ba\5/\30\2\u00b8\u00ba\n\2\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00be\3\2\2\2\u00bb\u00bd\13"+
		"\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bf\3\2\2\2\u00be"+
		"\u00bc\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2\7$"+
		"\2\2\u00c2.\3\2\2\2\u00c3\u00c6\7^\2\2\u00c4\u00c7\t\3\2\2\u00c5\u00c7"+
		"\5\61\31\2\u00c6\u00c4\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7\60\3\2\2\2\u00c8"+
		"\u00c9\7w\2\2\u00c9\u00ca\5\63\32\2\u00ca\u00cb\5\63\32\2\u00cb\u00cc"+
		"\5\63\32\2\u00cc\u00cd\5\63\32\2\u00cd\62\3\2\2\2\u00ce\u00cf\t\4\2\2"+
		"\u00cf\64\3\2\2\2\u00d0\u00d2\t\5\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d3"+
		"\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"\u00d6\b\33\2\2\u00d6\66\3\2\2\2\n\2\u00aa\u00ac\u00b2\u00b9\u00be\u00c6"+
		"\u00d3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}