// Generated from /Users/xinwei/Documents/weixin/study-antlr/antlr-ex/src/main/java/com/weixin/pants/PANTS.g4 by ANTLR 4.8
package com.weixin.pants.gen;
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
		SOURCES=9, GLOBS=10, MAIN=11, DOUBLE_QUOTED_STRING=12, JAR_LIBRARY=13, 
		JARS=14, JAR=15, SCALA_JAR=16, NAME=17, ORG=18, REV=19, INTRANSITIVE=20, 
		EXCLUDES=21, EXCLUDE=22, FORCE=23, DEPENDENCIES=24, BOOL_VALUE=25, SINGLE_QUOTED_STRING=26, 
		NEWLINE=27, IDENTIFIER=28, WS=29;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "JAVA_LIBRARY", "JVM_LIBRARY", 
			"SOURCES", "GLOBS", "MAIN", "DOUBLE_QUOTED_STRING", "JAR_LIBRARY", "JARS", 
			"JAR", "SCALA_JAR", "NAME", "ORG", "REV", "INTRANSITIVE", "EXCLUDES", 
			"EXCLUDE", "FORCE", "DEPENDENCIES", "BOOL_VALUE", "SINGLE_QUOTED_STRING", 
			"NEWLINE", "IDENTIFIER", "ESC", "UNICODE", "HEX", "LetterOrDigit", "Letter", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", "'['", "']'", "','", "'java_library'", "'jvm_binary'", 
			"'sources'", "'globs'", "'main'", null, "'jar_library'", "'jars'", "'jar'", 
			"'scala_jar'", "'name'", "'org'", "'rev'", "'intransitive'", "'excludes'", 
			"'exclude'", "'force'", "'dependencies'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "JAVA_LIBRARY", "JVM_LIBRARY", 
			"SOURCES", "GLOBS", "MAIN", "DOUBLE_QUOTED_STRING", "JAR_LIBRARY", "JARS", 
			"JAR", "SCALA_JAR", "NAME", "ORG", "REV", "INTRANSITIVE", "EXCLUDES", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u0123\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\5\r\u0082\n\r\3\r\7"+
		"\r\u0085\n\r\f\r\16\r\u0088\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u00f2"+
		"\n\32\3\33\3\33\3\33\7\33\u00f7\n\33\f\33\16\33\u00fa\13\33\3\33\3\33"+
		"\3\34\5\34\u00ff\n\34\3\34\3\34\3\35\3\35\7\35\u0105\n\35\f\35\16\35\u0108"+
		"\13\35\3\36\3\36\3\36\5\36\u010d\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		" \3 \3!\3!\5!\u0119\n!\3\"\3\"\3#\6#\u011e\n#\r#\16#\u011f\3#\3#\4\u0086"+
		"\u00f8\2$\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\2=\2?\2A\2C\2E\37\3\2\b\4\2$$^^\n\2$$\61\61^^ddhhppttvv\5\2\62"+
		";CHch\3\2\62;\6\2&&C\\aac|\5\2\13\f\17\17\"\"\2\u0127\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2E\3\2\2\2\3G\3\2\2\2"+
		"\5I\3\2\2\2\7K\3\2\2\2\tM\3\2\2\2\13O\3\2\2\2\rQ\3\2\2\2\17S\3\2\2\2\21"+
		"`\3\2\2\2\23k\3\2\2\2\25s\3\2\2\2\27y\3\2\2\2\31~\3\2\2\2\33\u008b\3\2"+
		"\2\2\35\u0097\3\2\2\2\37\u009c\3\2\2\2!\u00a0\3\2\2\2#\u00aa\3\2\2\2%"+
		"\u00af\3\2\2\2\'\u00b3\3\2\2\2)\u00b7\3\2\2\2+\u00c4\3\2\2\2-\u00cd\3"+
		"\2\2\2/\u00d5\3\2\2\2\61\u00db\3\2\2\2\63\u00f1\3\2\2\2\65\u00f3\3\2\2"+
		"\2\67\u00fe\3\2\2\29\u0102\3\2\2\2;\u0109\3\2\2\2=\u010e\3\2\2\2?\u0114"+
		"\3\2\2\2A\u0118\3\2\2\2C\u011a\3\2\2\2E\u011d\3\2\2\2GH\7?\2\2H\4\3\2"+
		"\2\2IJ\7*\2\2J\6\3\2\2\2KL\7+\2\2L\b\3\2\2\2MN\7]\2\2N\n\3\2\2\2OP\7_"+
		"\2\2P\f\3\2\2\2QR\7.\2\2R\16\3\2\2\2ST\7l\2\2TU\7c\2\2UV\7x\2\2VW\7c\2"+
		"\2WX\7a\2\2XY\7n\2\2YZ\7k\2\2Z[\7d\2\2[\\\7t\2\2\\]\7c\2\2]^\7t\2\2^_"+
		"\7{\2\2_\20\3\2\2\2`a\7l\2\2ab\7x\2\2bc\7o\2\2cd\7a\2\2de\7d\2\2ef\7k"+
		"\2\2fg\7p\2\2gh\7c\2\2hi\7t\2\2ij\7{\2\2j\22\3\2\2\2kl\7u\2\2lm\7q\2\2"+
		"mn\7w\2\2no\7t\2\2op\7e\2\2pq\7g\2\2qr\7u\2\2r\24\3\2\2\2st\7i\2\2tu\7"+
		"n\2\2uv\7q\2\2vw\7d\2\2wx\7u\2\2x\26\3\2\2\2yz\7o\2\2z{\7c\2\2{|\7k\2"+
		"\2|}\7p\2\2}\30\3\2\2\2~\u0081\7$\2\2\177\u0082\5;\36\2\u0080\u0082\n"+
		"\2\2\2\u0081\177\3\2\2\2\u0081\u0080\3\2\2\2\u0082\u0086\3\2\2\2\u0083"+
		"\u0085\13\2\2\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0087\3"+
		"\2\2\2\u0086\u0084\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089"+
		"\u008a\7$\2\2\u008a\32\3\2\2\2\u008b\u008c\7l\2\2\u008c\u008d\7c\2\2\u008d"+
		"\u008e\7t\2\2\u008e\u008f\7a\2\2\u008f\u0090\7n\2\2\u0090\u0091\7k\2\2"+
		"\u0091\u0092\7d\2\2\u0092\u0093\7t\2\2\u0093\u0094\7c\2\2\u0094\u0095"+
		"\7t\2\2\u0095\u0096\7{\2\2\u0096\34\3\2\2\2\u0097\u0098\7l\2\2\u0098\u0099"+
		"\7c\2\2\u0099\u009a\7t\2\2\u009a\u009b\7u\2\2\u009b\36\3\2\2\2\u009c\u009d"+
		"\7l\2\2\u009d\u009e\7c\2\2\u009e\u009f\7t\2\2\u009f \3\2\2\2\u00a0\u00a1"+
		"\7u\2\2\u00a1\u00a2\7e\2\2\u00a2\u00a3\7c\2\2\u00a3\u00a4\7n\2\2\u00a4"+
		"\u00a5\7c\2\2\u00a5\u00a6\7a\2\2\u00a6\u00a7\7l\2\2\u00a7\u00a8\7c\2\2"+
		"\u00a8\u00a9\7t\2\2\u00a9\"\3\2\2\2\u00aa\u00ab\7p\2\2\u00ab\u00ac\7c"+
		"\2\2\u00ac\u00ad\7o\2\2\u00ad\u00ae\7g\2\2\u00ae$\3\2\2\2\u00af\u00b0"+
		"\7q\2\2\u00b0\u00b1\7t\2\2\u00b1\u00b2\7i\2\2\u00b2&\3\2\2\2\u00b3\u00b4"+
		"\7t\2\2\u00b4\u00b5\7g\2\2\u00b5\u00b6\7x\2\2\u00b6(\3\2\2\2\u00b7\u00b8"+
		"\7k\2\2\u00b8\u00b9\7p\2\2\u00b9\u00ba\7v\2\2\u00ba\u00bb\7t\2\2\u00bb"+
		"\u00bc\7c\2\2\u00bc\u00bd\7p\2\2\u00bd\u00be\7u\2\2\u00be\u00bf\7k\2\2"+
		"\u00bf\u00c0\7v\2\2\u00c0\u00c1\7k\2\2\u00c1\u00c2\7x\2\2\u00c2\u00c3"+
		"\7g\2\2\u00c3*\3\2\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6\7z\2\2\u00c6\u00c7"+
		"\7e\2\2\u00c7\u00c8\7n\2\2\u00c8\u00c9\7w\2\2\u00c9\u00ca\7f\2\2\u00ca"+
		"\u00cb\7g\2\2\u00cb\u00cc\7u\2\2\u00cc,\3\2\2\2\u00cd\u00ce\7g\2\2\u00ce"+
		"\u00cf\7z\2\2\u00cf\u00d0\7e\2\2\u00d0\u00d1\7n\2\2\u00d1\u00d2\7w\2\2"+
		"\u00d2\u00d3\7f\2\2\u00d3\u00d4\7g\2\2\u00d4.\3\2\2\2\u00d5\u00d6\7h\2"+
		"\2\u00d6\u00d7\7q\2\2\u00d7\u00d8\7t\2\2\u00d8\u00d9\7e\2\2\u00d9\u00da"+
		"\7g\2\2\u00da\60\3\2\2\2\u00db\u00dc\7f\2\2\u00dc\u00dd\7g\2\2\u00dd\u00de"+
		"\7r\2\2\u00de\u00df\7g\2\2\u00df\u00e0\7p\2\2\u00e0\u00e1\7f\2\2\u00e1"+
		"\u00e2\7g\2\2\u00e2\u00e3\7p\2\2\u00e3\u00e4\7e\2\2\u00e4\u00e5\7k\2\2"+
		"\u00e5\u00e6\7g\2\2\u00e6\u00e7\7u\2\2\u00e7\62\3\2\2\2\u00e8\u00e9\7"+
		"V\2\2\u00e9\u00ea\7t\2\2\u00ea\u00eb\7w\2\2\u00eb\u00f2\7g\2\2\u00ec\u00ed"+
		"\7H\2\2\u00ed\u00ee\7c\2\2\u00ee\u00ef\7n\2\2\u00ef\u00f0\7u\2\2\u00f0"+
		"\u00f2\7g\2\2\u00f1\u00e8\3\2\2\2\u00f1\u00ec\3\2\2\2\u00f2\64\3\2\2\2"+
		"\u00f3\u00f8\7)\2\2\u00f4\u00f7\5;\36\2\u00f5\u00f7\n\2\2\2\u00f6\u00f4"+
		"\3\2\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f8"+
		"\u00f6\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fc\7)"+
		"\2\2\u00fc\66\3\2\2\2\u00fd\u00ff\7\17\2\2\u00fe\u00fd\3\2\2\2\u00fe\u00ff"+
		"\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\7\f\2\2\u01018\3\2\2\2\u0102"+
		"\u0106\5C\"\2\u0103\u0105\5A!\2\u0104\u0103\3\2\2\2\u0105\u0108\3\2\2"+
		"\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107:\3\2\2\2\u0108\u0106"+
		"\3\2\2\2\u0109\u010c\7^\2\2\u010a\u010d\t\3\2\2\u010b\u010d\5=\37\2\u010c"+
		"\u010a\3\2\2\2\u010c\u010b\3\2\2\2\u010d<\3\2\2\2\u010e\u010f\7w\2\2\u010f"+
		"\u0110\5? \2\u0110\u0111\5? \2\u0111\u0112\5? \2\u0112\u0113\5? \2\u0113"+
		">\3\2\2\2\u0114\u0115\t\4\2\2\u0115@\3\2\2\2\u0116\u0119\5C\"\2\u0117"+
		"\u0119\t\5\2\2\u0118\u0116\3\2\2\2\u0118\u0117\3\2\2\2\u0119B\3\2\2\2"+
		"\u011a\u011b\t\6\2\2\u011bD\3\2\2\2\u011c\u011e\t\7\2\2\u011d\u011c\3"+
		"\2\2\2\u011e\u011f\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120"+
		"\u0121\3\2\2\2\u0121\u0122\b#\2\2\u0122F\3\2\2\2\r\2\u0081\u0086\u00f1"+
		"\u00f6\u00f8\u00fe\u0106\u010c\u0118\u011f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}