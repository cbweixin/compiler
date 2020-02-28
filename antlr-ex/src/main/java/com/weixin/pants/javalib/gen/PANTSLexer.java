// Generated from /Users/xinwei/Documents/weixin/study-antlr/antlr-ex/src/main/java/com/weixin/pants/PANTS.g4 by ANTLR 4.8
package com.weixin.pants.javalib.gen;
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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, JAVA_LIBRARY=7, JVM_LIBRARY=8, 
		SOURCES=9, GLOBS=10, MAIN=11, STRICTDEPS=12, DOUBLE_QUOTED_STRING=13, 
		JAR_LIBRARY=14, JARS=15, JAR=16, SCALA_JAR=17, NAME=18, ORG=19, REV=20, 
		INTRANSITIVE=21, EXCLUDES=22, EXCLUDE=23, FORCE=24, DEPENDENCIES=25, BOOL_VALUE=26, 
		SINGLE_QUOTED_STRING=27, NEWLINE=28, IDENTIFIER=29, WS=30;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "JAVA_LIBRARY", "JVM_LIBRARY", 
			"SOURCES", "GLOBS", "MAIN", "STRICTDEPS", "DOUBLE_QUOTED_STRING", "JAR_LIBRARY", 
			"JARS", "JAR", "SCALA_JAR", "NAME", "ORG", "REV", "INTRANSITIVE", "EXCLUDES", 
			"EXCLUDE", "FORCE", "DEPENDENCIES", "BOOL_VALUE", "SINGLE_QUOTED_STRING", 
			"NEWLINE", "IDENTIFIER", "ESC", "UNICODE", "HEX", "LetterOrDigit", "Letter", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'='", "','", "'['", "']'", "'java_library'", "'jvm_binary'", 
			"'sources'", "'globs'", "'main'", "'strict_deps'", null, "'jar_library'", 
			"'jars'", "'jar'", "'scala_jar'", "'name'", "'org'", "'rev'", "'intransitive'", 
			"'excludes'", "'exclude'", "'force'", "'dependencies'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "JAVA_LIBRARY", "JVM_LIBRARY", 
			"SOURCES", "GLOBS", "MAIN", "STRICTDEPS", "DOUBLE_QUOTED_STRING", "JAR_LIBRARY", 
			"JARS", "JAR", "SCALA_JAR", "NAME", "ORG", "REV", "INTRANSITIVE", "EXCLUDES", 
			"EXCLUDE", "FORCE", "DEPENDENCIES", "BOOL_VALUE", "SINGLE_QUOTED_STRING", 
			"NEWLINE", "IDENTIFIER", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u0131\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\5\16\u0090\n\16\3\16\7\16\u0093\n\16"+
		"\f\16\16\16\u0096\13\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0100\n\33"+
		"\3\34\3\34\3\34\7\34\u0105\n\34\f\34\16\34\u0108\13\34\3\34\3\34\3\35"+
		"\5\35\u010d\n\35\3\35\3\35\3\36\3\36\7\36\u0113\n\36\f\36\16\36\u0116"+
		"\13\36\3\37\3\37\3\37\5\37\u011b\n\37\3 \3 \3 \3 \3 \3 \3!\3!\3\"\3\""+
		"\5\"\u0127\n\"\3#\3#\3$\6$\u012c\n$\r$\16$\u012d\3$\3$\4\u0094\u0106\2"+
		"%\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"=\2?\2A\2C\2E\2G \3\2\b\4\2$$^^\n\2$$\61\61^^ddhhppttvv\5\2\62;CHch\3"+
		"\2\62;\6\2&&C\\aac|\5\2\13\f\17\17\"\"\2\u0135\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2G\3\2\2\2\3I\3\2"+
		"\2\2\5K\3\2\2\2\7M\3\2\2\2\tO\3\2\2\2\13Q\3\2\2\2\rS\3\2\2\2\17U\3\2\2"+
		"\2\21b\3\2\2\2\23m\3\2\2\2\25u\3\2\2\2\27{\3\2\2\2\31\u0080\3\2\2\2\33"+
		"\u008c\3\2\2\2\35\u0099\3\2\2\2\37\u00a5\3\2\2\2!\u00aa\3\2\2\2#\u00ae"+
		"\3\2\2\2%\u00b8\3\2\2\2\'\u00bd\3\2\2\2)\u00c1\3\2\2\2+\u00c5\3\2\2\2"+
		"-\u00d2\3\2\2\2/\u00db\3\2\2\2\61\u00e3\3\2\2\2\63\u00e9\3\2\2\2\65\u00ff"+
		"\3\2\2\2\67\u0101\3\2\2\29\u010c\3\2\2\2;\u0110\3\2\2\2=\u0117\3\2\2\2"+
		"?\u011c\3\2\2\2A\u0122\3\2\2\2C\u0126\3\2\2\2E\u0128\3\2\2\2G\u012b\3"+
		"\2\2\2IJ\7*\2\2J\4\3\2\2\2KL\7+\2\2L\6\3\2\2\2MN\7?\2\2N\b\3\2\2\2OP\7"+
		".\2\2P\n\3\2\2\2QR\7]\2\2R\f\3\2\2\2ST\7_\2\2T\16\3\2\2\2UV\7l\2\2VW\7"+
		"c\2\2WX\7x\2\2XY\7c\2\2YZ\7a\2\2Z[\7n\2\2[\\\7k\2\2\\]\7d\2\2]^\7t\2\2"+
		"^_\7c\2\2_`\7t\2\2`a\7{\2\2a\20\3\2\2\2bc\7l\2\2cd\7x\2\2de\7o\2\2ef\7"+
		"a\2\2fg\7d\2\2gh\7k\2\2hi\7p\2\2ij\7c\2\2jk\7t\2\2kl\7{\2\2l\22\3\2\2"+
		"\2mn\7u\2\2no\7q\2\2op\7w\2\2pq\7t\2\2qr\7e\2\2rs\7g\2\2st\7u\2\2t\24"+
		"\3\2\2\2uv\7i\2\2vw\7n\2\2wx\7q\2\2xy\7d\2\2yz\7u\2\2z\26\3\2\2\2{|\7"+
		"o\2\2|}\7c\2\2}~\7k\2\2~\177\7p\2\2\177\30\3\2\2\2\u0080\u0081\7u\2\2"+
		"\u0081\u0082\7v\2\2\u0082\u0083\7t\2\2\u0083\u0084\7k\2\2\u0084\u0085"+
		"\7e\2\2\u0085\u0086\7v\2\2\u0086\u0087\7a\2\2\u0087\u0088\7f\2\2\u0088"+
		"\u0089\7g\2\2\u0089\u008a\7r\2\2\u008a\u008b\7u\2\2\u008b\32\3\2\2\2\u008c"+
		"\u008f\7$\2\2\u008d\u0090\5=\37\2\u008e\u0090\n\2\2\2\u008f\u008d\3\2"+
		"\2\2\u008f\u008e\3\2\2\2\u0090\u0094\3\2\2\2\u0091\u0093\13\2\2\2\u0092"+
		"\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0095\3\2\2\2\u0094\u0092\3\2"+
		"\2\2\u0095\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0098\7$\2\2\u0098"+
		"\34\3\2\2\2\u0099\u009a\7l\2\2\u009a\u009b\7c\2\2\u009b\u009c\7t\2\2\u009c"+
		"\u009d\7a\2\2\u009d\u009e\7n\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7d\2\2"+
		"\u00a0\u00a1\7t\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3\7t\2\2\u00a3\u00a4"+
		"\7{\2\2\u00a4\36\3\2\2\2\u00a5\u00a6\7l\2\2\u00a6\u00a7\7c\2\2\u00a7\u00a8"+
		"\7t\2\2\u00a8\u00a9\7u\2\2\u00a9 \3\2\2\2\u00aa\u00ab\7l\2\2\u00ab\u00ac"+
		"\7c\2\2\u00ac\u00ad\7t\2\2\u00ad\"\3\2\2\2\u00ae\u00af\7u\2\2\u00af\u00b0"+
		"\7e\2\2\u00b0\u00b1\7c\2\2\u00b1\u00b2\7n\2\2\u00b2\u00b3\7c\2\2\u00b3"+
		"\u00b4\7a\2\2\u00b4\u00b5\7l\2\2\u00b5\u00b6\7c\2\2\u00b6\u00b7\7t\2\2"+
		"\u00b7$\3\2\2\2\u00b8\u00b9\7p\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb\7o\2"+
		"\2\u00bb\u00bc\7g\2\2\u00bc&\3\2\2\2\u00bd\u00be\7q\2\2\u00be\u00bf\7"+
		"t\2\2\u00bf\u00c0\7i\2\2\u00c0(\3\2\2\2\u00c1\u00c2\7t\2\2\u00c2\u00c3"+
		"\7g\2\2\u00c3\u00c4\7x\2\2\u00c4*\3\2\2\2\u00c5\u00c6\7k\2\2\u00c6\u00c7"+
		"\7p\2\2\u00c7\u00c8\7v\2\2\u00c8\u00c9\7t\2\2\u00c9\u00ca\7c\2\2\u00ca"+
		"\u00cb\7p\2\2\u00cb\u00cc\7u\2\2\u00cc\u00cd\7k\2\2\u00cd\u00ce\7v\2\2"+
		"\u00ce\u00cf\7k\2\2\u00cf\u00d0\7x\2\2\u00d0\u00d1\7g\2\2\u00d1,\3\2\2"+
		"\2\u00d2\u00d3\7g\2\2\u00d3\u00d4\7z\2\2\u00d4\u00d5\7e\2\2\u00d5\u00d6"+
		"\7n\2\2\u00d6\u00d7\7w\2\2\u00d7\u00d8\7f\2\2\u00d8\u00d9\7g\2\2\u00d9"+
		"\u00da\7u\2\2\u00da.\3\2\2\2\u00db\u00dc\7g\2\2\u00dc\u00dd\7z\2\2\u00dd"+
		"\u00de\7e\2\2\u00de\u00df\7n\2\2\u00df\u00e0\7w\2\2\u00e0\u00e1\7f\2\2"+
		"\u00e1\u00e2\7g\2\2\u00e2\60\3\2\2\2\u00e3\u00e4\7h\2\2\u00e4\u00e5\7"+
		"q\2\2\u00e5\u00e6\7t\2\2\u00e6\u00e7\7e\2\2\u00e7\u00e8\7g\2\2\u00e8\62"+
		"\3\2\2\2\u00e9\u00ea\7f\2\2\u00ea\u00eb\7g\2\2\u00eb\u00ec\7r\2\2\u00ec"+
		"\u00ed\7g\2\2\u00ed\u00ee\7p\2\2\u00ee\u00ef\7f\2\2\u00ef\u00f0\7g\2\2"+
		"\u00f0\u00f1\7p\2\2\u00f1\u00f2\7e\2\2\u00f2\u00f3\7k\2\2\u00f3\u00f4"+
		"\7g\2\2\u00f4\u00f5\7u\2\2\u00f5\64\3\2\2\2\u00f6\u00f7\7V\2\2\u00f7\u00f8"+
		"\7t\2\2\u00f8\u00f9\7w\2\2\u00f9\u0100\7g\2\2\u00fa\u00fb\7H\2\2\u00fb"+
		"\u00fc\7c\2\2\u00fc\u00fd\7n\2\2\u00fd\u00fe\7u\2\2\u00fe\u0100\7g\2\2"+
		"\u00ff\u00f6\3\2\2\2\u00ff\u00fa\3\2\2\2\u0100\66\3\2\2\2\u0101\u0106"+
		"\7)\2\2\u0102\u0105\5=\37\2\u0103\u0105\n\2\2\2\u0104\u0102\3\2\2\2\u0104"+
		"\u0103\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0107\3\2\2\2\u0106\u0104\3\2"+
		"\2\2\u0107\u0109\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u010a\7)\2\2\u010a"+
		"8\3\2\2\2\u010b\u010d\7\17\2\2\u010c\u010b\3\2\2\2\u010c\u010d\3\2\2\2"+
		"\u010d\u010e\3\2\2\2\u010e\u010f\7\f\2\2\u010f:\3\2\2\2\u0110\u0114\5"+
		"E#\2\u0111\u0113\5C\"\2\u0112\u0111\3\2\2\2\u0113\u0116\3\2\2\2\u0114"+
		"\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115<\3\2\2\2\u0116\u0114\3\2\2\2"+
		"\u0117\u011a\7^\2\2\u0118\u011b\t\3\2\2\u0119\u011b\5? \2\u011a\u0118"+
		"\3\2\2\2\u011a\u0119\3\2\2\2\u011b>\3\2\2\2\u011c\u011d\7w\2\2\u011d\u011e"+
		"\5A!\2\u011e\u011f\5A!\2\u011f\u0120\5A!\2\u0120\u0121\5A!\2\u0121@\3"+
		"\2\2\2\u0122\u0123\t\4\2\2\u0123B\3\2\2\2\u0124\u0127\5E#\2\u0125\u0127"+
		"\t\5\2\2\u0126\u0124\3\2\2\2\u0126\u0125\3\2\2\2\u0127D\3\2\2\2\u0128"+
		"\u0129\t\6\2\2\u0129F\3\2\2\2\u012a\u012c\t\7\2\2\u012b\u012a\3\2\2\2"+
		"\u012c\u012d\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f"+
		"\3\2\2\2\u012f\u0130\b$\2\2\u0130H\3\2\2\2\r\2\u008f\u0094\u00ff\u0104"+
		"\u0106\u010c\u0114\u011a\u0126\u012d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}