// Generated from /Users/xinwei/Documents/weixin/study-antlr/antlr-ex/src/main/java/com/weixin/pants/PANTS.g4 by ANTLR 4.8
package com.weixin.pants.javalib.gen;
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
	public static final int
		RULE_pants = 0, RULE_stmt_list = 1, RULE_stmt = 2, RULE_java_lib_stmt = 3, 
		RULE_jvm_lib_stmt = 4, RULE_lib_item_list = 5, RULE_lib_item = 6, RULE_name_item = 7, 
		RULE_dependencies_item = 8, RULE_dependent_list = 9, RULE_dependent_entry = 10, 
		RULE_sources_item = 11, RULE_strict_deps = 12, RULE_main_item = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"pants", "stmt_list", "stmt", "java_lib_stmt", "jvm_lib_stmt", "lib_item_list", 
			"lib_item", "name_item", "dependencies_item", "dependent_list", "dependent_entry", 
			"sources_item", "strict_deps", "main_item"
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).enterPants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).exitPants(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PANTSVisitor ) return ((PANTSVisitor<? extends T>)visitor).visitPants(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PantsContext pants() throws RecognitionException {
		PantsContext _localctx = new PantsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_pants);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
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
		public List<TerminalNode> NEWLINE() { return getTokens(PANTSParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(PANTSParser.NEWLINE, i);
		}
		public Stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).enterStmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).exitStmt_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PANTSVisitor ) return ((PANTSVisitor<? extends T>)visitor).visitStmt_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stmt_listContext stmt_list() throws RecognitionException {
		Stmt_listContext _localctx = new Stmt_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JAVA_LIBRARY || _la==JVM_LIBRARY) {
				{
				{
				setState(30);
				stmt();
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(31);
					match(NEWLINE);
					}
				}

				}
				}
				setState(38);
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
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PANTSVisitor ) return ((PANTSVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stmt);
		try {
			setState(41);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JAVA_LIBRARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				java_lib_stmt();
				}
				break;
			case JVM_LIBRARY:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				jvm_lib_stmt();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).enterJava_lib_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).exitJava_lib_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PANTSVisitor ) return ((PANTSVisitor<? extends T>)visitor).visitJava_lib_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Java_lib_stmtContext java_lib_stmt() throws RecognitionException {
		Java_lib_stmtContext _localctx = new Java_lib_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_java_lib_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(JAVA_LIBRARY);
			setState(44);
			match(T__0);
			setState(45);
			lib_item_list();
			setState(46);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).enterJvm_lib_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).exitJvm_lib_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PANTSVisitor ) return ((PANTSVisitor<? extends T>)visitor).visitJvm_lib_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jvm_lib_stmtContext jvm_lib_stmt() throws RecognitionException {
		Jvm_lib_stmtContext _localctx = new Jvm_lib_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_jvm_lib_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(JVM_LIBRARY);
			setState(49);
			match(T__0);
			setState(50);
			lib_item_list();
			setState(51);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).enterLib_item_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).exitLib_item_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PANTSVisitor ) return ((PANTSVisitor<? extends T>)visitor).visitLib_item_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lib_item_listContext lib_item_list() throws RecognitionException {
		Lib_item_listContext _localctx = new Lib_item_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_lib_item_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SOURCES) | (1L << MAIN) | (1L << STRICTDEPS) | (1L << NAME) | (1L << DEPENDENCIES))) != 0)) {
				{
				{
				setState(53);
				lib_item();
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(54);
					match(NEWLINE);
					}
				}

				}
				}
				setState(61);
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
		public Strict_depsContext strict_deps() {
			return getRuleContext(Strict_depsContext.class,0);
		}
		public Main_itemContext main_item() {
			return getRuleContext(Main_itemContext.class,0);
		}
		public Lib_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lib_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).enterLib_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).exitLib_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PANTSVisitor ) return ((PANTSVisitor<? extends T>)visitor).visitLib_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lib_itemContext lib_item() throws RecognitionException {
		Lib_itemContext _localctx = new Lib_itemContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_lib_item);
		try {
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				name_item();
				}
				break;
			case DEPENDENCIES:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				dependencies_item();
				}
				break;
			case SOURCES:
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				sources_item();
				}
				break;
			case STRICTDEPS:
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
				strict_deps();
				}
				break;
			case MAIN:
				enterOuterAlt(_localctx, 5);
				{
				setState(66);
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

	public static class Name_itemContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PANTSParser.NAME, 0); }
		public TerminalNode SINGLE_QUOTED_STRING() { return getToken(PANTSParser.SINGLE_QUOTED_STRING, 0); }
		public Name_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).enterName_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).exitName_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PANTSVisitor ) return ((PANTSVisitor<? extends T>)visitor).visitName_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Name_itemContext name_item() throws RecognitionException {
		Name_itemContext _localctx = new Name_itemContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_name_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(NAME);
			setState(70);
			match(T__2);
			setState(71);
			match(SINGLE_QUOTED_STRING);
			setState(72);
			match(T__3);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).enterDependencies_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).exitDependencies_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PANTSVisitor ) return ((PANTSVisitor<? extends T>)visitor).visitDependencies_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dependencies_itemContext dependencies_item() throws RecognitionException {
		Dependencies_itemContext _localctx = new Dependencies_itemContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_dependencies_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(DEPENDENCIES);
			setState(75);
			match(T__2);
			setState(76);
			match(T__4);
			setState(77);
			dependent_list();
			setState(78);
			match(T__5);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(79);
				match(T__3);
				}
			}

			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(82);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).enterDependent_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).exitDependent_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PANTSVisitor ) return ((PANTSVisitor<? extends T>)visitor).visitDependent_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dependent_listContext dependent_list() throws RecognitionException {
		Dependent_listContext _localctx = new Dependent_listContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_dependent_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SINGLE_QUOTED_STRING) {
				{
				{
				setState(85);
				dependent_entry();
				}
				}
				setState(90);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).enterDependent_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).exitDependent_entry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PANTSVisitor ) return ((PANTSVisitor<? extends T>)visitor).visitDependent_entry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dependent_entryContext dependent_entry() throws RecognitionException {
		Dependent_entryContext _localctx = new Dependent_entryContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_dependent_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(SINGLE_QUOTED_STRING);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(92);
				match(T__3);
				}
			}

			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(95);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).enterSources_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).exitSources_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PANTSVisitor ) return ((PANTSVisitor<? extends T>)visitor).visitSources_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sources_itemContext sources_item() throws RecognitionException {
		Sources_itemContext _localctx = new Sources_itemContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_sources_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(SOURCES);
			setState(99);
			match(T__2);
			setState(100);
			match(GLOBS);
			setState(101);
			match(T__0);
			setState(102);
			match(SINGLE_QUOTED_STRING);
			setState(103);
			match(T__1);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(104);
				match(T__3);
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

	public static class Strict_depsContext extends ParserRuleContext {
		public TerminalNode STRICTDEPS() { return getToken(PANTSParser.STRICTDEPS, 0); }
		public TerminalNode BOOL_VALUE() { return getToken(PANTSParser.BOOL_VALUE, 0); }
		public Strict_depsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strict_deps; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).enterStrict_deps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).exitStrict_deps(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PANTSVisitor ) return ((PANTSVisitor<? extends T>)visitor).visitStrict_deps(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Strict_depsContext strict_deps() throws RecognitionException {
		Strict_depsContext _localctx = new Strict_depsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_strict_deps);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(STRICTDEPS);
			setState(108);
			match(T__2);
			setState(109);
			match(BOOL_VALUE);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(110);
				match(T__3);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).enterMain_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).exitMain_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PANTSVisitor ) return ((PANTSVisitor<? extends T>)visitor).visitMain_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Main_itemContext main_item() throws RecognitionException {
		Main_itemContext _localctx = new Main_itemContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_main_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(MAIN);
			setState(114);
			match(T__2);
			setState(115);
			match(DOUBLE_QUOTED_STRING);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(116);
				match(T__3);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 z\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f"+
		"\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\5\3#\n\3\7\3%\n\3\f\3"+
		"\16\3(\13\3\3\4\3\4\5\4,\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\5\7:\n\7\7\7<\n\7\f\7\16\7?\13\7\3\b\3\b\3\b\3\b\3\b\5\bF\n\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\nS\n\n\3\n\5\nV\n\n\3\13"+
		"\7\13Y\n\13\f\13\16\13\\\13\13\3\f\3\f\5\f`\n\f\3\f\5\fc\n\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\5\rl\n\r\3\16\3\16\3\16\3\16\5\16r\n\16\3\17\3\17\3"+
		"\17\3\17\5\17x\n\17\3\17\2\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2"+
		"\2\2|\2\36\3\2\2\2\4&\3\2\2\2\6+\3\2\2\2\b-\3\2\2\2\n\62\3\2\2\2\f=\3"+
		"\2\2\2\16E\3\2\2\2\20G\3\2\2\2\22L\3\2\2\2\24Z\3\2\2\2\26]\3\2\2\2\30"+
		"d\3\2\2\2\32m\3\2\2\2\34s\3\2\2\2\36\37\5\4\3\2\37\3\3\2\2\2 \"\5\6\4"+
		"\2!#\7\36\2\2\"!\3\2\2\2\"#\3\2\2\2#%\3\2\2\2$ \3\2\2\2%(\3\2\2\2&$\3"+
		"\2\2\2&\'\3\2\2\2\'\5\3\2\2\2(&\3\2\2\2),\5\b\5\2*,\5\n\6\2+)\3\2\2\2"+
		"+*\3\2\2\2,\7\3\2\2\2-.\7\t\2\2./\7\3\2\2/\60\5\f\7\2\60\61\7\4\2\2\61"+
		"\t\3\2\2\2\62\63\7\n\2\2\63\64\7\3\2\2\64\65\5\f\7\2\65\66\7\4\2\2\66"+
		"\13\3\2\2\2\679\5\16\b\28:\7\36\2\298\3\2\2\29:\3\2\2\2:<\3\2\2\2;\67"+
		"\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\r\3\2\2\2?=\3\2\2\2@F\5\20\t\2"+
		"AF\5\22\n\2BF\5\30\r\2CF\5\32\16\2DF\5\34\17\2E@\3\2\2\2EA\3\2\2\2EB\3"+
		"\2\2\2EC\3\2\2\2ED\3\2\2\2F\17\3\2\2\2GH\7\24\2\2HI\7\5\2\2IJ\7\35\2\2"+
		"JK\7\6\2\2K\21\3\2\2\2LM\7\33\2\2MN\7\5\2\2NO\7\7\2\2OP\5\24\13\2PR\7"+
		"\b\2\2QS\7\6\2\2RQ\3\2\2\2RS\3\2\2\2SU\3\2\2\2TV\7\36\2\2UT\3\2\2\2UV"+
		"\3\2\2\2V\23\3\2\2\2WY\5\26\f\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2"+
		"\2[\25\3\2\2\2\\Z\3\2\2\2]_\7\35\2\2^`\7\6\2\2_^\3\2\2\2_`\3\2\2\2`b\3"+
		"\2\2\2ac\7\36\2\2ba\3\2\2\2bc\3\2\2\2c\27\3\2\2\2de\7\13\2\2ef\7\5\2\2"+
		"fg\7\f\2\2gh\7\3\2\2hi\7\35\2\2ik\7\4\2\2jl\7\6\2\2kj\3\2\2\2kl\3\2\2"+
		"\2l\31\3\2\2\2mn\7\16\2\2no\7\5\2\2oq\7\34\2\2pr\7\6\2\2qp\3\2\2\2qr\3"+
		"\2\2\2r\33\3\2\2\2st\7\r\2\2tu\7\5\2\2uw\7\17\2\2vx\7\6\2\2wv\3\2\2\2"+
		"wx\3\2\2\2x\35\3\2\2\2\20\"&+9=ERUZ_bkqw";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}