// Generated from /Users/xinwei/Documents/weixin/study-antlr/pants-parser/PANTS.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PANTSParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, JAVA_LIBRARY=7, JAR_LIBRARY=8, 
		JVM_LIBRARY=9, JARS=10, JAR=11, SCALA_JAR=12, NAME=13, ORG=14, REV=15, 
		DEPENDENCIES=16, SOURCES=17, GLOBS=18, MAIN=19, SINGLE_QUOTED_STRING=20, 
		NEWLINE=21, DOUBLE_QUOTED_STRING=22, WS=23;
	public static final int
		RULE_pants = 0, RULE_stmt_list = 1, RULE_stmt = 2, RULE_java_lib_stmt = 3, 
		RULE_jar_lib_stmt = 4, RULE_jvm_lib_stmt = 5, RULE_lib_item_list = 6, 
		RULE_lib_item = 7, RULE_jars_item_list = 8, RULE_jars_item = 9, RULE_java_jar_list = 10, 
		RULE_scala_jar_list = 11, RULE_java_jar_entries = 12, RULE_scala_jar_entries = 13, 
		RULE_java_jar_entry = 14, RULE_scala_jar_entry = 15, RULE_jar_coordinates = 16, 
		RULE_name_item = 17, RULE_dependencies_item = 18, RULE_dependent_list = 19, 
		RULE_dependent_entry = 20, RULE_sources_item = 21, RULE_main_item = 22;
	public static final String[] ruleNames = {
		"pants", "stmt_list", "stmt", "java_lib_stmt", "jar_lib_stmt", "jvm_lib_stmt", 
		"lib_item_list", "lib_item", "jars_item_list", "jars_item", "java_jar_list", 
		"scala_jar_list", "java_jar_entries", "scala_jar_entries", "java_jar_entry", 
		"scala_jar_entry", "jar_coordinates", "name_item", "dependencies_item", 
		"dependent_list", "dependent_entry", "sources_item", "main_item"
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

	@Override
	public String getGrammarFileName() { return "PANTS.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PANTSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PantsContext extends ParserRuleContext {
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public PantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pants; }
	}

	public final PantsContext pants() throws RecognitionException {
		PantsContext _localctx = new PantsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_pants);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			stmt_list();
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

	public static class Stmt_listContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public Stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_list; }
	}

	public final Stmt_listContext stmt_list() throws RecognitionException {
		Stmt_listContext _localctx = new Stmt_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA_LIBRARY) | (1L << JAR_LIBRARY) | (1L << JVM_LIBRARY))) != 0)) {
				{
				{
				setState(48);
				stmt();
				}
				}
				setState(53);
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

	public static class StmtContext extends ParserRuleContext {
		public Java_lib_stmtContext java_lib_stmt() {
			return getRuleContext(Java_lib_stmtContext.class,0);
		}
		public Jvm_lib_stmtContext jvm_lib_stmt() {
			return getRuleContext(Jvm_lib_stmtContext.class,0);
		}
		public Jar_lib_stmtContext jar_lib_stmt() {
			return getRuleContext(Jar_lib_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stmt);
		try {
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JAVA_LIBRARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				java_lib_stmt();
				}
				break;
			case JVM_LIBRARY:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				jvm_lib_stmt();
				}
				break;
			case JAR_LIBRARY:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				jar_lib_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Java_lib_stmtContext extends ParserRuleContext {
		public TerminalNode JAVA_LIBRARY() { return getToken(PANTSParser.JAVA_LIBRARY, 0); }
		public Lib_item_listContext lib_item_list() {
			return getRuleContext(Lib_item_listContext.class,0);
		}
		public Java_lib_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_lib_stmt; }
	}

	public final Java_lib_stmtContext java_lib_stmt() throws RecognitionException {
		Java_lib_stmtContext _localctx = new Java_lib_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_java_lib_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(JAVA_LIBRARY);
			setState(60);
			match(T__0);
			setState(61);
			lib_item_list();
			setState(62);
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

	public static class Jar_lib_stmtContext extends ParserRuleContext {
		public TerminalNode JAR_LIBRARY() { return getToken(PANTSParser.JAR_LIBRARY, 0); }
		public Jars_item_listContext jars_item_list() {
			return getRuleContext(Jars_item_listContext.class,0);
		}
		public Jar_lib_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jar_lib_stmt; }
	}

	public final Jar_lib_stmtContext jar_lib_stmt() throws RecognitionException {
		Jar_lib_stmtContext _localctx = new Jar_lib_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_jar_lib_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(JAR_LIBRARY);
			setState(65);
			match(T__0);
			setState(66);
			jars_item_list();
			setState(67);
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

	public static class Jvm_lib_stmtContext extends ParserRuleContext {
		public TerminalNode JVM_LIBRARY() { return getToken(PANTSParser.JVM_LIBRARY, 0); }
		public Lib_item_listContext lib_item_list() {
			return getRuleContext(Lib_item_listContext.class,0);
		}
		public Jvm_lib_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jvm_lib_stmt; }
	}

	public final Jvm_lib_stmtContext jvm_lib_stmt() throws RecognitionException {
		Jvm_lib_stmtContext _localctx = new Jvm_lib_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_jvm_lib_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(JVM_LIBRARY);
			setState(70);
			match(T__0);
			setState(71);
			lib_item_list();
			setState(72);
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

	public static class Lib_item_listContext extends ParserRuleContext {
		public List<Lib_itemContext> lib_item() {
			return getRuleContexts(Lib_itemContext.class);
		}
		public Lib_itemContext lib_item(int i) {
			return getRuleContext(Lib_itemContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(PANTSParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(PANTSParser.NEWLINE, i);
		}
		public Lib_item_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lib_item_list; }
	}

	public final Lib_item_listContext lib_item_list() throws RecognitionException {
		Lib_item_listContext _localctx = new Lib_item_listContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_lib_item_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NAME) | (1L << DEPENDENCIES) | (1L << SOURCES) | (1L << MAIN))) != 0)) {
				{
				{
				setState(74);
				lib_item();
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(75);
					match(NEWLINE);
					}
				}

				}
				}
				setState(82);
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

	public static class Lib_itemContext extends ParserRuleContext {
		public Name_itemContext name_item() {
			return getRuleContext(Name_itemContext.class,0);
		}
		public Dependencies_itemContext dependencies_item() {
			return getRuleContext(Dependencies_itemContext.class,0);
		}
		public Sources_itemContext sources_item() {
			return getRuleContext(Sources_itemContext.class,0);
		}
		public Main_itemContext main_item() {
			return getRuleContext(Main_itemContext.class,0);
		}
		public Lib_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lib_item; }
	}

	public final Lib_itemContext lib_item() throws RecognitionException {
		Lib_itemContext _localctx = new Lib_itemContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lib_item);
		try {
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				name_item();
				}
				break;
			case DEPENDENCIES:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				dependencies_item();
				}
				break;
			case SOURCES:
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				sources_item();
				}
				break;
			case MAIN:
				enterOuterAlt(_localctx, 4);
				{
				setState(86);
				main_item();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Jars_item_listContext extends ParserRuleContext {
		public List<Jars_itemContext> jars_item() {
			return getRuleContexts(Jars_itemContext.class);
		}
		public Jars_itemContext jars_item(int i) {
			return getRuleContext(Jars_itemContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(PANTSParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(PANTSParser.NEWLINE, i);
		}
		public Jars_item_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jars_item_list; }
	}

	public final Jars_item_listContext jars_item_list() throws RecognitionException {
		Jars_item_listContext _localctx = new Jars_item_listContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_jars_item_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JARS) | (1L << SCALA_JAR) | (1L << NAME) | (1L << DEPENDENCIES))) != 0)) {
				{
				{
				setState(89);
				jars_item();
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(90);
					match(NEWLINE);
					}
				}

				}
				}
				setState(97);
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

	public static class Jars_itemContext extends ParserRuleContext {
		public Name_itemContext name_item() {
			return getRuleContext(Name_itemContext.class,0);
		}
		public Dependencies_itemContext dependencies_item() {
			return getRuleContext(Dependencies_itemContext.class,0);
		}
		public Java_jar_listContext java_jar_list() {
			return getRuleContext(Java_jar_listContext.class,0);
		}
		public Scala_jar_listContext scala_jar_list() {
			return getRuleContext(Scala_jar_listContext.class,0);
		}
		public Jars_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jars_item; }
	}

	public final Jars_itemContext jars_item() throws RecognitionException {
		Jars_itemContext _localctx = new Jars_itemContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_jars_item);
		try {
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				name_item();
				}
				break;
			case DEPENDENCIES:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				dependencies_item();
				}
				break;
			case JARS:
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				java_jar_list();
				}
				break;
			case SCALA_JAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(101);
				scala_jar_list();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Java_jar_listContext extends ParserRuleContext {
		public TerminalNode JARS() { return getToken(PANTSParser.JARS, 0); }
		public Java_jar_entriesContext java_jar_entries() {
			return getRuleContext(Java_jar_entriesContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PANTSParser.NEWLINE, 0); }
		public Java_jar_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_jar_list; }
	}

	public final Java_jar_listContext java_jar_list() throws RecognitionException {
		Java_jar_listContext _localctx = new Java_jar_listContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_java_jar_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(JARS);
			setState(105);
			match(T__2);
			setState(106);
			match(T__3);
			setState(107);
			java_jar_entries();
			setState(108);
			match(T__4);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(109);
				match(T__5);
				}
			}

			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(112);
				match(NEWLINE);
				}
				break;
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

	public static class Scala_jar_listContext extends ParserRuleContext {
		public TerminalNode SCALA_JAR() { return getToken(PANTSParser.SCALA_JAR, 0); }
		public Scala_jar_entriesContext scala_jar_entries() {
			return getRuleContext(Scala_jar_entriesContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PANTSParser.NEWLINE, 0); }
		public Scala_jar_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scala_jar_list; }
	}

	public final Scala_jar_listContext scala_jar_list() throws RecognitionException {
		Scala_jar_listContext _localctx = new Scala_jar_listContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_scala_jar_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(SCALA_JAR);
			setState(116);
			match(T__2);
			setState(117);
			match(T__3);
			setState(118);
			scala_jar_entries();
			setState(119);
			match(T__4);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(120);
				match(T__5);
				}
			}

			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(123);
				match(NEWLINE);
				}
				break;
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

	public static class Java_jar_entriesContext extends ParserRuleContext {
		public List<Java_jar_entryContext> java_jar_entry() {
			return getRuleContexts(Java_jar_entryContext.class);
		}
		public Java_jar_entryContext java_jar_entry(int i) {
			return getRuleContext(Java_jar_entryContext.class,i);
		}
		public Java_jar_entriesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_jar_entries; }
	}

	public final Java_jar_entriesContext java_jar_entries() throws RecognitionException {
		Java_jar_entriesContext _localctx = new Java_jar_entriesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_java_jar_entries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JAR) {
				{
				{
				setState(126);
				java_jar_entry();
				}
				}
				setState(131);
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

	public static class Scala_jar_entriesContext extends ParserRuleContext {
		public List<Scala_jar_entryContext> scala_jar_entry() {
			return getRuleContexts(Scala_jar_entryContext.class);
		}
		public Scala_jar_entryContext scala_jar_entry(int i) {
			return getRuleContext(Scala_jar_entryContext.class,i);
		}
		public Scala_jar_entriesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scala_jar_entries; }
	}

	public final Scala_jar_entriesContext scala_jar_entries() throws RecognitionException {
		Scala_jar_entriesContext _localctx = new Scala_jar_entriesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_scala_jar_entries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCALA_JAR) {
				{
				{
				setState(132);
				scala_jar_entry();
				}
				}
				setState(137);
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

	public static class Java_jar_entryContext extends ParserRuleContext {
		public TerminalNode JAR() { return getToken(PANTSParser.JAR, 0); }
		public Jar_coordinatesContext jar_coordinates() {
			return getRuleContext(Jar_coordinatesContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PANTSParser.NEWLINE, 0); }
		public Java_jar_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_jar_entry; }
	}

	public final Java_jar_entryContext java_jar_entry() throws RecognitionException {
		Java_jar_entryContext _localctx = new Java_jar_entryContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_java_jar_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(JAR);
			setState(139);
			match(T__0);
			setState(140);
			jar_coordinates();
			setState(141);
			match(T__1);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(142);
				match(T__5);
				}
			}

			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(145);
				match(NEWLINE);
				}
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

	public static class Scala_jar_entryContext extends ParserRuleContext {
		public TerminalNode SCALA_JAR() { return getToken(PANTSParser.SCALA_JAR, 0); }
		public Jar_coordinatesContext jar_coordinates() {
			return getRuleContext(Jar_coordinatesContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PANTSParser.NEWLINE, 0); }
		public Scala_jar_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scala_jar_entry; }
	}

	public final Scala_jar_entryContext scala_jar_entry() throws RecognitionException {
		Scala_jar_entryContext _localctx = new Scala_jar_entryContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_scala_jar_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(SCALA_JAR);
			setState(149);
			match(T__0);
			setState(150);
			jar_coordinates();
			setState(151);
			match(T__1);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(152);
				match(T__5);
				}
			}

			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(155);
				match(NEWLINE);
				}
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

	public static class Jar_coordinatesContext extends ParserRuleContext {
		public TerminalNode ORG() { return getToken(PANTSParser.ORG, 0); }
		public List<TerminalNode> SINGLE_QUOTED_STRING() { return getTokens(PANTSParser.SINGLE_QUOTED_STRING); }
		public TerminalNode SINGLE_QUOTED_STRING(int i) {
			return getToken(PANTSParser.SINGLE_QUOTED_STRING, i);
		}
		public TerminalNode NAME() { return getToken(PANTSParser.NAME, 0); }
		public TerminalNode REV() { return getToken(PANTSParser.REV, 0); }
		public Jar_coordinatesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jar_coordinates; }
	}

	public final Jar_coordinatesContext jar_coordinates() throws RecognitionException {
		Jar_coordinatesContext _localctx = new Jar_coordinatesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_jar_coordinates);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(ORG);
			setState(159);
			match(T__2);
			setState(160);
			match(SINGLE_QUOTED_STRING);
			setState(161);
			match(T__5);
			setState(162);
			match(NAME);
			setState(163);
			match(T__2);
			setState(164);
			match(SINGLE_QUOTED_STRING);
			setState(165);
			match(T__5);
			setState(166);
			match(REV);
			setState(167);
			match(T__2);
			setState(168);
			match(SINGLE_QUOTED_STRING);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(169);
				match(T__5);
				}
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

	public static class Name_itemContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PANTSParser.NAME, 0); }
		public TerminalNode SINGLE_QUOTED_STRING() { return getToken(PANTSParser.SINGLE_QUOTED_STRING, 0); }
		public Name_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_item; }
	}

	public final Name_itemContext name_item() throws RecognitionException {
		Name_itemContext _localctx = new Name_itemContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_name_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(NAME);
			setState(173);
			match(T__2);
			setState(174);
			match(SINGLE_QUOTED_STRING);
			setState(175);
			match(T__5);
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

	public static class Dependencies_itemContext extends ParserRuleContext {
		public TerminalNode DEPENDENCIES() { return getToken(PANTSParser.DEPENDENCIES, 0); }
		public Dependent_listContext dependent_list() {
			return getRuleContext(Dependent_listContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PANTSParser.NEWLINE, 0); }
		public Dependencies_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dependencies_item; }
	}

	public final Dependencies_itemContext dependencies_item() throws RecognitionException {
		Dependencies_itemContext _localctx = new Dependencies_itemContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_dependencies_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(DEPENDENCIES);
			setState(178);
			match(T__2);
			setState(179);
			match(T__3);
			setState(180);
			dependent_list();
			setState(181);
			match(T__4);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(182);
				match(T__5);
				}
			}

			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(185);
				match(NEWLINE);
				}
				break;
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

	public static class Dependent_listContext extends ParserRuleContext {
		public List<Dependent_entryContext> dependent_entry() {
			return getRuleContexts(Dependent_entryContext.class);
		}
		public Dependent_entryContext dependent_entry(int i) {
			return getRuleContext(Dependent_entryContext.class,i);
		}
		public Dependent_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dependent_list; }
	}

	public final Dependent_listContext dependent_list() throws RecognitionException {
		Dependent_listContext _localctx = new Dependent_listContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_dependent_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SINGLE_QUOTED_STRING) {
				{
				{
				setState(188);
				dependent_entry();
				}
				}
				setState(193);
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

	public static class Dependent_entryContext extends ParserRuleContext {
		public TerminalNode SINGLE_QUOTED_STRING() { return getToken(PANTSParser.SINGLE_QUOTED_STRING, 0); }
		public TerminalNode NEWLINE() { return getToken(PANTSParser.NEWLINE, 0); }
		public Dependent_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dependent_entry; }
	}

	public final Dependent_entryContext dependent_entry() throws RecognitionException {
		Dependent_entryContext _localctx = new Dependent_entryContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_dependent_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(SINGLE_QUOTED_STRING);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(195);
				match(T__5);
				}
			}

			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(198);
				match(NEWLINE);
				}
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

	public static class Sources_itemContext extends ParserRuleContext {
		public TerminalNode SOURCES() { return getToken(PANTSParser.SOURCES, 0); }
		public TerminalNode GLOBS() { return getToken(PANTSParser.GLOBS, 0); }
		public TerminalNode SINGLE_QUOTED_STRING() { return getToken(PANTSParser.SINGLE_QUOTED_STRING, 0); }
		public Sources_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sources_item; }
	}

	public final Sources_itemContext sources_item() throws RecognitionException {
		Sources_itemContext _localctx = new Sources_itemContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_sources_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(SOURCES);
			setState(202);
			match(T__2);
			setState(203);
			match(GLOBS);
			setState(204);
			match(T__0);
			setState(205);
			match(SINGLE_QUOTED_STRING);
			setState(206);
			match(T__1);
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(207);
				match(T__5);
				}
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

	public static class Main_itemContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(PANTSParser.MAIN, 0); }
		public TerminalNode DOUBLE_QUOTED_STRING() { return getToken(PANTSParser.DOUBLE_QUOTED_STRING, 0); }
		public Main_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_item; }
	}

	public final Main_itemContext main_item() throws RecognitionException {
		Main_itemContext _localctx = new Main_itemContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_main_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(MAIN);
			setState(211);
			match(T__2);
			setState(212);
			match(DOUBLE_QUOTED_STRING);
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(213);
				match(T__5);
				}
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31\u00db\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\3\7\3\64\n\3\f\3\16\3\67\13\3\3\4\3\4\3\4\5\4<\n\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\5\bO\n\b\7\bQ\n\b\f"+
		"\b\16\bT\13\b\3\t\3\t\3\t\3\t\5\tZ\n\t\3\n\3\n\5\n^\n\n\7\n`\n\n\f\n\16"+
		"\nc\13\n\3\13\3\13\3\13\3\13\5\13i\n\13\3\f\3\f\3\f\3\f\3\f\3\f\5\fq\n"+
		"\f\3\f\5\ft\n\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r|\n\r\3\r\5\r\177\n\r\3\16"+
		"\7\16\u0082\n\16\f\16\16\16\u0085\13\16\3\17\7\17\u0088\n\17\f\17\16\17"+
		"\u008b\13\17\3\20\3\20\3\20\3\20\3\20\5\20\u0092\n\20\3\20\5\20\u0095"+
		"\n\20\3\21\3\21\3\21\3\21\3\21\5\21\u009c\n\21\3\21\5\21\u009f\n\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00ad"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00ba"+
		"\n\24\3\24\5\24\u00bd\n\24\3\25\7\25\u00c0\n\25\f\25\16\25\u00c3\13\25"+
		"\3\26\3\26\5\26\u00c7\n\26\3\26\5\26\u00ca\n\26\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\5\27\u00d3\n\27\3\30\3\30\3\30\3\30\5\30\u00d9\n\30\3\30"+
		"\2\2\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\2\2\u00e2\2"+
		"\60\3\2\2\2\4\65\3\2\2\2\6;\3\2\2\2\b=\3\2\2\2\nB\3\2\2\2\fG\3\2\2\2\16"+
		"R\3\2\2\2\20Y\3\2\2\2\22a\3\2\2\2\24h\3\2\2\2\26j\3\2\2\2\30u\3\2\2\2"+
		"\32\u0083\3\2\2\2\34\u0089\3\2\2\2\36\u008c\3\2\2\2 \u0096\3\2\2\2\"\u00a0"+
		"\3\2\2\2$\u00ae\3\2\2\2&\u00b3\3\2\2\2(\u00c1\3\2\2\2*\u00c4\3\2\2\2,"+
		"\u00cb\3\2\2\2.\u00d4\3\2\2\2\60\61\5\4\3\2\61\3\3\2\2\2\62\64\5\6\4\2"+
		"\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\5\3\2\2\2"+
		"\67\65\3\2\2\28<\5\b\5\29<\5\f\7\2:<\5\n\6\2;8\3\2\2\2;9\3\2\2\2;:\3\2"+
		"\2\2<\7\3\2\2\2=>\7\t\2\2>?\7\3\2\2?@\5\16\b\2@A\7\4\2\2A\t\3\2\2\2BC"+
		"\7\n\2\2CD\7\3\2\2DE\5\22\n\2EF\7\4\2\2F\13\3\2\2\2GH\7\13\2\2HI\7\3\2"+
		"\2IJ\5\16\b\2JK\7\4\2\2K\r\3\2\2\2LN\5\20\t\2MO\7\27\2\2NM\3\2\2\2NO\3"+
		"\2\2\2OQ\3\2\2\2PL\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\17\3\2\2\2T"+
		"R\3\2\2\2UZ\5$\23\2VZ\5&\24\2WZ\5,\27\2XZ\5.\30\2YU\3\2\2\2YV\3\2\2\2"+
		"YW\3\2\2\2YX\3\2\2\2Z\21\3\2\2\2[]\5\24\13\2\\^\7\27\2\2]\\\3\2\2\2]^"+
		"\3\2\2\2^`\3\2\2\2_[\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\23\3\2\2\2"+
		"ca\3\2\2\2di\5$\23\2ei\5&\24\2fi\5\26\f\2gi\5\30\r\2hd\3\2\2\2he\3\2\2"+
		"\2hf\3\2\2\2hg\3\2\2\2i\25\3\2\2\2jk\7\f\2\2kl\7\5\2\2lm\7\6\2\2mn\5\32"+
		"\16\2np\7\7\2\2oq\7\b\2\2po\3\2\2\2pq\3\2\2\2qs\3\2\2\2rt\7\27\2\2sr\3"+
		"\2\2\2st\3\2\2\2t\27\3\2\2\2uv\7\16\2\2vw\7\5\2\2wx\7\6\2\2xy\5\34\17"+
		"\2y{\7\7\2\2z|\7\b\2\2{z\3\2\2\2{|\3\2\2\2|~\3\2\2\2}\177\7\27\2\2~}\3"+
		"\2\2\2~\177\3\2\2\2\177\31\3\2\2\2\u0080\u0082\5\36\20\2\u0081\u0080\3"+
		"\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\33\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0088\5 \21\2\u0087\u0086\3\2\2"+
		"\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\35"+
		"\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008d\7\r\2\2\u008d\u008e\7\3\2\2\u008e"+
		"\u008f\5\"\22\2\u008f\u0091\7\4\2\2\u0090\u0092\7\b\2\2\u0091\u0090\3"+
		"\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0095\7\27\2\2\u0094"+
		"\u0093\3\2\2\2\u0094\u0095\3\2\2\2\u0095\37\3\2\2\2\u0096\u0097\7\16\2"+
		"\2\u0097\u0098\7\3\2\2\u0098\u0099\5\"\22\2\u0099\u009b\7\4\2\2\u009a"+
		"\u009c\7\b\2\2\u009b\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3\2"+
		"\2\2\u009d\u009f\7\27\2\2\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"!\3\2\2\2\u00a0\u00a1\7\20\2\2\u00a1\u00a2\7\5\2\2\u00a2\u00a3\7\26\2"+
		"\2\u00a3\u00a4\7\b\2\2\u00a4\u00a5\7\17\2\2\u00a5\u00a6\7\5\2\2\u00a6"+
		"\u00a7\7\26\2\2\u00a7\u00a8\7\b\2\2\u00a8\u00a9\7\21\2\2\u00a9\u00aa\7"+
		"\5\2\2\u00aa\u00ac\7\26\2\2\u00ab\u00ad\7\b\2\2\u00ac\u00ab\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad#\3\2\2\2\u00ae\u00af\7\17\2\2\u00af\u00b0\7\5\2\2"+
		"\u00b0\u00b1\7\26\2\2\u00b1\u00b2\7\b\2\2\u00b2%\3\2\2\2\u00b3\u00b4\7"+
		"\22\2\2\u00b4\u00b5\7\5\2\2\u00b5\u00b6\7\6\2\2\u00b6\u00b7\5(\25\2\u00b7"+
		"\u00b9\7\7\2\2\u00b8\u00ba\7\b\2\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba\3\2"+
		"\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00bd\7\27\2\2\u00bc\u00bb\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\'\3\2\2\2\u00be\u00c0\5*\26\2\u00bf\u00be\3\2\2\2"+
		"\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2)\3"+
		"\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c6\7\26\2\2\u00c5\u00c7\7\b\2\2\u00c6"+
		"\u00c5\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00ca\7\27"+
		"\2\2\u00c9\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca+\3\2\2\2\u00cb\u00cc"+
		"\7\23\2\2\u00cc\u00cd\7\5\2\2\u00cd\u00ce\7\24\2\2\u00ce\u00cf\7\3\2\2"+
		"\u00cf\u00d0\7\26\2\2\u00d0\u00d2\7\4\2\2\u00d1\u00d3\7\b\2\2\u00d2\u00d1"+
		"\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3-\3\2\2\2\u00d4\u00d5\7\25\2\2\u00d5"+
		"\u00d6\7\5\2\2\u00d6\u00d8\7\30\2\2\u00d7\u00d9\7\b\2\2\u00d8\u00d7\3"+
		"\2\2\2\u00d8\u00d9\3\2\2\2\u00d9/\3\2\2\2\34\65;NRY]ahps{~\u0083\u0089"+
		"\u0091\u0094\u009b\u009e\u00ac\u00b9\u00bc\u00c1\u00c6\u00c9\u00d2\u00d8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}