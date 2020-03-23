// Generated from /Users/xinwei/Documents/weixin/study-antlr/code/tpdsl/parsing/topdown/NameList.g by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NameListParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, NAME=4;
	public static final int
		RULE_list = 0, RULE_elements = 1;
	public static final String[] ruleNames = {
		"list", "elements"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'['", "']'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "NAME"
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

	@Override
	public String getGrammarFileName() { return "NameList.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NameListParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ListContext extends ParserRuleContext {
		public ElementsContext elements() {
			return getRuleContext(ElementsContext.class,0);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			match(T__0);
			setState(5);
			elements();
			setState(6);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementsContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(NameListParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(NameListParser.NAME, i);
		}
		public ElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elements; }
	}

	public final ElementsContext elements() throws RecognitionException {
		ElementsContext _localctx = new ElementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_elements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			match(NAME);
			setState(13);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(9);
				match(T__2);
				setState(10);
				match(NAME);
				}
				}
				setState(15);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\6\23\4\2\t\2\4\3"+
		"\t\3\3\2\3\2\3\2\3\2\3\3\3\3\3\3\7\3\16\n\3\f\3\16\3\21\13\3\3\3\2\2\4"+
		"\2\4\2\2\2\21\2\6\3\2\2\2\4\n\3\2\2\2\6\7\7\3\2\2\7\b\5\4\3\2\b\t\7\4"+
		"\2\2\t\3\3\2\2\2\n\17\7\6\2\2\13\f\7\5\2\2\f\16\7\6\2\2\r\13\3\2\2\2\16"+
		"\21\3\2\2\2\17\r\3\2\2\2\17\20\3\2\2\2\20\5\3\2\2\2\21\17\3\2\2\2\3\17";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}