// Generated from /Users/xinwei/Documents/weixin/study-antlr/antlr-ex/src/main/resources/PropertyFile.g4 by ANTLR 4.8
package com.weixin.listeners.propertyfile.gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PropertyFileLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, ID=3, STRING=4, LINE_COMMENT=5;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "ID", "STRING", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "ID", "STRING", "LINE_COMMENT"
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


	public PropertyFileLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "com/weixin/listeners/propertyfile/PropertyFile.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\7-\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\3\3\3\3\4\6\4\23\n\4\r\4\16\4"+
		"\24\3\5\3\5\7\5\31\n\5\f\5\16\5\34\13\5\3\5\3\5\3\6\3\6\7\6\"\n\6\f\6"+
		"\16\6%\13\6\3\6\5\6(\n\6\3\6\3\6\3\6\3\6\4\32#\2\7\3\3\5\4\7\5\t\6\13"+
		"\7\3\2\3\3\2c|\2\60\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\3\r\3\2\2\2\5\17\3\2\2\2\7\22\3\2\2\2\t\26\3\2\2\2\13\37\3"+
		"\2\2\2\r\16\7?\2\2\16\4\3\2\2\2\17\20\7\f\2\2\20\6\3\2\2\2\21\23\t\2\2"+
		"\2\22\21\3\2\2\2\23\24\3\2\2\2\24\22\3\2\2\2\24\25\3\2\2\2\25\b\3\2\2"+
		"\2\26\32\7$\2\2\27\31\13\2\2\2\30\27\3\2\2\2\31\34\3\2\2\2\32\33\3\2\2"+
		"\2\32\30\3\2\2\2\33\35\3\2\2\2\34\32\3\2\2\2\35\36\7$\2\2\36\n\3\2\2\2"+
		"\37#\7%\2\2 \"\13\2\2\2! \3\2\2\2\"%\3\2\2\2#$\3\2\2\2#!\3\2\2\2$\'\3"+
		"\2\2\2%#\3\2\2\2&(\7\17\2\2\'&\3\2\2\2\'(\3\2\2\2()\3\2\2\2)*\7\f\2\2"+
		"*+\3\2\2\2+,\b\6\2\2,\f\3\2\2\2\7\2\24\32#\'\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}