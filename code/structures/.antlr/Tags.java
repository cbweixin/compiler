// Generated from /Users/xinwei/Documents/weixin/study-antlr/code/structures/Tags.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Tags extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TAG_START=1, TEXT=2, TAG_STOP=3, TAG_STUFF=4;
	public static final int
		ISLAND=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "ISLAND"
	};

	public static final String[] ruleNames = {
		"TAG_START", "TEXT", "TAG_STOP", "TAG_STUFF"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'<'", null, "'>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TAG_START", "TEXT", "TAG_STOP", "TAG_STUFF"
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


	public Tags(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Tags.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 0:
			TAG_START_action((RuleContext)_localctx, actionIndex);
			break;
		case 2:
			TAG_STOP_action((RuleContext)_localctx, actionIndex);
			break;
		case 3:
			TAG_STUFF_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void TAG_START_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			pushMode(ISLAND); more();
			break;
		}
	}
	private void TAG_STOP_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			popMode();
			break;
		}
	}
	private void TAG_STUFF_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			more();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\6\36\b\1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\3\6\3\21\n\3\r\3\16\3\22\3"+
		"\4\3\4\3\4\3\5\6\5\31\n\5\r\5\16\5\32\3\5\3\5\2\2\6\4\3\6\4\b\5\n\6\4"+
		"\2\3\4\3\2>>\3\2@@\2\36\2\4\3\2\2\2\2\6\3\2\2\2\3\b\3\2\2\2\3\n\3\2\2"+
		"\2\4\f\3\2\2\2\6\20\3\2\2\2\b\24\3\2\2\2\n\30\3\2\2\2\f\r\7>\2\2\r\16"+
		"\b\2\2\2\16\5\3\2\2\2\17\21\n\2\2\2\20\17\3\2\2\2\21\22\3\2\2\2\22\20"+
		"\3\2\2\2\22\23\3\2\2\2\23\7\3\2\2\2\24\25\7@\2\2\25\26\b\4\3\2\26\t\3"+
		"\2\2\2\27\31\n\3\2\2\30\27\3\2\2\2\31\32\3\2\2\2\32\30\3\2\2\2\32\33\3"+
		"\2\2\2\33\34\3\2\2\2\34\35\b\5\4\2\35\13\3\2\2\2\6\2\3\22\32\5\3\2\2\3"+
		"\4\3\3\5\4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}