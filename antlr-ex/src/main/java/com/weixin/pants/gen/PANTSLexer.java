// Generated from /Users/xinwei/Documents/weixin/study-antlr/antlr-ex/src/main/resources/PANTS.g4 by ANTLR 4.8
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, JAVA_LIBRARY=7, JAR_LIBRARY=8, 
		JVM_LIBRARY=9, JARS=10, JAR=11, SCALA_JAR=12, NAME=13, ORG=14, REV=15, 
		DEPENDENCIES=16, SOURCES=17, GLOBS=18, MAIN=19, SINGLE_QUOTED_STRING=20, 
		NEWLINE=21, DOUBLE_QUOTED_STRING=22, IDENTIFIER=23, WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "JAVA_LIBRARY", "JAR_LIBRARY", 
			"JVM_LIBRARY", "JARS", "JAR", "SCALA_JAR", "NAME", "ORG", "REV", "DEPENDENCIES", 
			"SOURCES", "GLOBS", "MAIN", "SINGLE_QUOTED_STRING", "NEWLINE", "DOUBLE_QUOTED_STRING", 
			"IDENTIFIER", "ESC", "UNICODE", "HEX", "LetterOrDigit", "Letter", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", "'['", "']'", "','", "'java_library'", "'jar_library'", 
			"'jvm_binary'", "'jars'", "'jar'", "'scala_jar'", "'name'", "'org'", 
			"'rev'", "'dependencies'", "'sources'", "'globs'", "'main'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "JAVA_LIBRARY", "JAR_LIBRARY", 
			"JVM_LIBRARY", "JARS", "JAR", "SCALA_JAR", "NAME", "ORG", "REV", "DEPENDENCIES", 
			"SOURCES", "GLOBS", "MAIN", "SINGLE_QUOTED_STRING", "NEWLINE", "DOUBLE_QUOTED_STRING", 
			"IDENTIFIER", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u00ea\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\7\25\u00b1\n\25\f\25\16\25\u00b4\13\25\3\25\3\25\3\26\5\26"+
		"\u00b9\n\26\3\26\3\26\3\27\3\27\3\27\5\27\u00c0\n\27\3\27\7\27\u00c3\n"+
		"\27\f\27\16\27\u00c6\13\27\3\27\3\27\3\30\3\30\7\30\u00cc\n\30\f\30\16"+
		"\30\u00cf\13\30\3\31\3\31\3\31\5\31\u00d4\n\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\5\34\u00e0\n\34\3\35\3\35\3\36\6\36\u00e5\n"+
		"\36\r\36\16\36\u00e6\3\36\3\36\4\u00b2\u00c4\2\37\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\2\63\2\65\2\67\29\2;\32\3\2\b\4\2$$^^\n\2$$\61\61"+
		"^^ddhhppttvv\5\2\62;CHch\3\2\62;\6\2&&C\\aac|\5\2\13\f\17\17\"\"\2\u00ed"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2;\3\2\2\2\3=\3\2\2\2\5?\3\2\2\2\7A\3\2\2\2\tC\3\2\2\2\13E\3\2\2\2"+
		"\rG\3\2\2\2\17I\3\2\2\2\21V\3\2\2\2\23b\3\2\2\2\25m\3\2\2\2\27r\3\2\2"+
		"\2\31v\3\2\2\2\33\u0080\3\2\2\2\35\u0085\3\2\2\2\37\u0089\3\2\2\2!\u008d"+
		"\3\2\2\2#\u009a\3\2\2\2%\u00a2\3\2\2\2\'\u00a8\3\2\2\2)\u00ad\3\2\2\2"+
		"+\u00b8\3\2\2\2-\u00bc\3\2\2\2/\u00c9\3\2\2\2\61\u00d0\3\2\2\2\63\u00d5"+
		"\3\2\2\2\65\u00db\3\2\2\2\67\u00df\3\2\2\29\u00e1\3\2\2\2;\u00e4\3\2\2"+
		"\2=>\7?\2\2>\4\3\2\2\2?@\7*\2\2@\6\3\2\2\2AB\7+\2\2B\b\3\2\2\2CD\7]\2"+
		"\2D\n\3\2\2\2EF\7_\2\2F\f\3\2\2\2GH\7.\2\2H\16\3\2\2\2IJ\7l\2\2JK\7c\2"+
		"\2KL\7x\2\2LM\7c\2\2MN\7a\2\2NO\7n\2\2OP\7k\2\2PQ\7d\2\2QR\7t\2\2RS\7"+
		"c\2\2ST\7t\2\2TU\7{\2\2U\20\3\2\2\2VW\7l\2\2WX\7c\2\2XY\7t\2\2YZ\7a\2"+
		"\2Z[\7n\2\2[\\\7k\2\2\\]\7d\2\2]^\7t\2\2^_\7c\2\2_`\7t\2\2`a\7{\2\2a\22"+
		"\3\2\2\2bc\7l\2\2cd\7x\2\2de\7o\2\2ef\7a\2\2fg\7d\2\2gh\7k\2\2hi\7p\2"+
		"\2ij\7c\2\2jk\7t\2\2kl\7{\2\2l\24\3\2\2\2mn\7l\2\2no\7c\2\2op\7t\2\2p"+
		"q\7u\2\2q\26\3\2\2\2rs\7l\2\2st\7c\2\2tu\7t\2\2u\30\3\2\2\2vw\7u\2\2w"+
		"x\7e\2\2xy\7c\2\2yz\7n\2\2z{\7c\2\2{|\7a\2\2|}\7l\2\2}~\7c\2\2~\177\7"+
		"t\2\2\177\32\3\2\2\2\u0080\u0081\7p\2\2\u0081\u0082\7c\2\2\u0082\u0083"+
		"\7o\2\2\u0083\u0084\7g\2\2\u0084\34\3\2\2\2\u0085\u0086\7q\2\2\u0086\u0087"+
		"\7t\2\2\u0087\u0088\7i\2\2\u0088\36\3\2\2\2\u0089\u008a\7t\2\2\u008a\u008b"+
		"\7g\2\2\u008b\u008c\7x\2\2\u008c \3\2\2\2\u008d\u008e\7f\2\2\u008e\u008f"+
		"\7g\2\2\u008f\u0090\7r\2\2\u0090\u0091\7g\2\2\u0091\u0092\7p\2\2\u0092"+
		"\u0093\7f\2\2\u0093\u0094\7g\2\2\u0094\u0095\7p\2\2\u0095\u0096\7e\2\2"+
		"\u0096\u0097\7k\2\2\u0097\u0098\7g\2\2\u0098\u0099\7u\2\2\u0099\"\3\2"+
		"\2\2\u009a\u009b\7u\2\2\u009b\u009c\7q\2\2\u009c\u009d\7w\2\2\u009d\u009e"+
		"\7t\2\2\u009e\u009f\7e\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1\7u\2\2\u00a1"+
		"$\3\2\2\2\u00a2\u00a3\7i\2\2\u00a3\u00a4\7n\2\2\u00a4\u00a5\7q\2\2\u00a5"+
		"\u00a6\7d\2\2\u00a6\u00a7\7u\2\2\u00a7&\3\2\2\2\u00a8\u00a9\7o\2\2\u00a9"+
		"\u00aa\7c\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac\7p\2\2\u00ac(\3\2\2\2\u00ad"+
		"\u00b2\7)\2\2\u00ae\u00b1\5\61\31\2\u00af\u00b1\n\2\2\2\u00b0\u00ae\3"+
		"\2\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b2"+
		"\u00b0\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\7)"+
		"\2\2\u00b6*\3\2\2\2\u00b7\u00b9\7\17\2\2\u00b8\u00b7\3\2\2\2\u00b8\u00b9"+
		"\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\7\f\2\2\u00bb,\3\2\2\2\u00bc"+
		"\u00bf\7$\2\2\u00bd\u00c0\5\61\31\2\u00be\u00c0\n\2\2\2\u00bf\u00bd\3"+
		"\2\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c4\3\2\2\2\u00c1\u00c3\13\2\2\2\u00c2"+
		"\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c4\u00c2\3\2"+
		"\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\7$\2\2\u00c8"+
		".\3\2\2\2\u00c9\u00cd\59\35\2\u00ca\u00cc\5\67\34\2\u00cb\u00ca\3\2\2"+
		"\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\60"+
		"\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d3\7^\2\2\u00d1\u00d4\t\3\2\2\u00d2"+
		"\u00d4\5\63\32\2\u00d3\u00d1\3\2\2\2\u00d3\u00d2\3\2\2\2\u00d4\62\3\2"+
		"\2\2\u00d5\u00d6\7w\2\2\u00d6\u00d7\5\65\33\2\u00d7\u00d8\5\65\33\2\u00d8"+
		"\u00d9\5\65\33\2\u00d9\u00da\5\65\33\2\u00da\64\3\2\2\2\u00db\u00dc\t"+
		"\4\2\2\u00dc\66\3\2\2\2\u00dd\u00e0\59\35\2\u00de\u00e0\t\5\2\2\u00df"+
		"\u00dd\3\2\2\2\u00df\u00de\3\2\2\2\u00e08\3\2\2\2\u00e1\u00e2\t\6\2\2"+
		"\u00e2:\3\2\2\2\u00e3\u00e5\t\7\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00e6\3"+
		"\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\u00e9\b\36\2\2\u00e9<\3\2\2\2\f\2\u00b0\u00b2\u00b8\u00bf\u00c4\u00cd"+
		"\u00d3\u00df\u00e6\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}