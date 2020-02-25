// Generated from /Users/xinwei/Documents/weixin/study-antlr/antlr-ex/src/main/resources/PANTS.g4 by ANTLR 4.8
package com.weixin.pants.gen;
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, JAVA_LIBRARY=7, JAR_LIBRARY=8, 
		JVM_LIBRARY=9, JARS=10, JAR=11, SCALA_JAR=12, NAME=13, ORG=14, REV=15, 
		DEPENDENCIES=16, SOURCES=17, GLOBS=18, MAIN=19, SINGLE_QUOTED_STRING=20, 
		NEWLINE=21, DOUBLE_QUOTED_STRING=22, IDENTIFIER=23, WS=24;
	public static final int
		RULE_pants = 0, RULE_stmt_list = 1, RULE_stmt = 2, RULE_var_declare = 3, 
		RULE_java_lib_stmt = 4, RULE_jar_lib_stmt = 5, RULE_jvm_lib_stmt = 6, 
		RULE_lib_item_list = 7, RULE_lib_item = 8, RULE_jars_item_list = 9, RULE_jars_item = 10, 
		RULE_jar_list = 11, RULE_jar_entries = 12, RULE_jar_entry = 13, RULE_java_jar_entry = 14, 
		RULE_scala_jar_entry = 15, RULE_jar_coordinate = 16, RULE_jar_coordinates = 17, 
		RULE_name_item = 18, RULE_dependencies_item = 19, RULE_dependent_list = 20, 
		RULE_dependent_entry = 21, RULE_sources_item = 22, RULE_main_item = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"pants", "stmt_list", "stmt", "var_declare", "java_lib_stmt", "jar_lib_stmt", 
			"jvm_lib_stmt", "lib_item_list", "lib_item", "jars_item_list", "jars_item", 
			"jar_list", "jar_entries", "jar_entry", "java_jar_entry", "scala_jar_entry", 
			"jar_coordinate", "jar_coordinates", "name_item", "dependencies_item", 
			"dependent_list", "dependent_entry", "sources_item", "main_item"
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
			setState(48);
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
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA_LIBRARY) | (1L << JAR_LIBRARY) | (1L << JVM_LIBRARY) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(50);
				stmt();
				}
				}
				setState(55);
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
		public Var_declareContext var_declare() {
			return getRuleContext(Var_declareContext.class,0);
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
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JAVA_LIBRARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				java_lib_stmt();
				}
				break;
			case JVM_LIBRARY:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				jvm_lib_stmt();
				}
				break;
			case JAR_LIBRARY:
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				jar_lib_stmt();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(59);
				var_declare();
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

	public static class Var_declareContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PANTSParser.IDENTIFIER, 0); }
		public TerminalNode SINGLE_QUOTED_STRING() { return getToken(PANTSParser.SINGLE_QUOTED_STRING, 0); }
		public TerminalNode NEWLINE() { return getToken(PANTSParser.NEWLINE, 0); }
		public Var_declareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_declare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).enterVar_declare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).exitVar_declare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PANTSVisitor ) return ((PANTSVisitor<? extends T>)visitor).visitVar_declare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declareContext var_declare() throws RecognitionException {
		Var_declareContext _localctx = new Var_declareContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_declare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(IDENTIFIER);
			setState(63);
			match(T__0);
			setState(64);
			match(SINGLE_QUOTED_STRING);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(65);
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
		enterRule(_localctx, 8, RULE_java_lib_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(JAVA_LIBRARY);
			setState(69);
			match(T__1);
			setState(70);
			lib_item_list();
			setState(71);
			match(T__2);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).enterJar_lib_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).exitJar_lib_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PANTSVisitor ) return ((PANTSVisitor<? extends T>)visitor).visitJar_lib_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jar_lib_stmtContext jar_lib_stmt() throws RecognitionException {
		Jar_lib_stmtContext _localctx = new Jar_lib_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_jar_lib_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(JAR_LIBRARY);
			setState(74);
			match(T__1);
			setState(75);
			jars_item_list();
			setState(76);
			match(T__2);
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
		enterRule(_localctx, 12, RULE_jvm_lib_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(JVM_LIBRARY);
			setState(79);
			match(T__1);
			setState(80);
			lib_item_list();
			setState(81);
			match(T__2);
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
		enterRule(_localctx, 14, RULE_lib_item_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NAME) | (1L << DEPENDENCIES) | (1L << SOURCES) | (1L << MAIN))) != 0)) {
				{
				{
				setState(83);
				lib_item();
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(84);
					match(NEWLINE);
					}
				}

				}
				}
				setState(91);
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
		enterRule(_localctx, 16, RULE_lib_item);
		try {
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				name_item();
				}
				break;
			case DEPENDENCIES:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				dependencies_item();
				}
				break;
			case SOURCES:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				sources_item();
				}
				break;
			case MAIN:
				enterOuterAlt(_localctx, 4);
				{
				setState(95);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).enterJars_item_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).exitJars_item_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PANTSVisitor ) return ((PANTSVisitor<? extends T>)visitor).visitJars_item_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jars_item_listContext jars_item_list() throws RecognitionException {
		Jars_item_listContext _localctx = new Jars_item_listContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_jars_item_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JARS) | (1L << NAME) | (1L << DEPENDENCIES))) != 0)) {
				{
				{
				setState(98);
				jars_item();
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(99);
					match(NEWLINE);
					}
				}

				}
				}
				setState(106);
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
		public Jar_listContext jar_list() {
			return getRuleContext(Jar_listContext.class,0);
		}
		public Jars_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jars_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).enterJars_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).exitJars_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PANTSVisitor ) return ((PANTSVisitor<? extends T>)visitor).visitJars_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jars_itemContext jars_item() throws RecognitionException {
		Jars_itemContext _localctx = new Jars_itemContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_jars_item);
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				name_item();
				}
				break;
			case DEPENDENCIES:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				dependencies_item();
				}
				break;
			case JARS:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				jar_list();
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

	public static class Jar_listContext extends ParserRuleContext {
		public TerminalNode JARS() { return getToken(PANTSParser.JARS, 0); }
		public Jar_entriesContext jar_entries() {
			return getRuleContext(Jar_entriesContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PANTSParser.NEWLINE, 0); }
		public Jar_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jar_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).enterJar_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).exitJar_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PANTSVisitor ) return ((PANTSVisitor<? extends T>)visitor).visitJar_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jar_listContext jar_list() throws RecognitionException {
		Jar_listContext _localctx = new Jar_listContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_jar_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(JARS);
			setState(113);
			match(T__0);
			setState(114);
			match(T__3);
			setState(115);
			jar_entries();
			setState(116);
			match(T__4);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(117);
				match(T__5);
				}
			}

			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(120);
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

	public static class Jar_entriesContext extends ParserRuleContext {
		public List<Jar_entryContext> jar_entry() {
			return getRuleContexts(Jar_entryContext.class);
		}
		public Jar_entryContext jar_entry(int i) {
			return getRuleContext(Jar_entryContext.class,i);
		}
		public Jar_entriesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jar_entries; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).enterJar_entries(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).exitJar_entries(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PANTSVisitor ) return ((PANTSVisitor<? extends T>)visitor).visitJar_entries(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jar_entriesContext jar_entries() throws RecognitionException {
		Jar_entriesContext _localctx = new Jar_entriesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_jar_entries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JAR || _la==SCALA_JAR) {
				{
				{
				setState(123);
				jar_entry();
				}
				}
				setState(128);
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

	public static class Jar_entryContext extends ParserRuleContext {
		public Java_jar_entryContext java_jar_entry() {
			return getRuleContext(Java_jar_entryContext.class,0);
		}
		public Scala_jar_entryContext scala_jar_entry() {
			return getRuleContext(Scala_jar_entryContext.class,0);
		}
		public Jar_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jar_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).enterJar_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).exitJar_entry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PANTSVisitor ) return ((PANTSVisitor<? extends T>)visitor).visitJar_entry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jar_entryContext jar_entry() throws RecognitionException {
		Jar_entryContext _localctx = new Jar_entryContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_jar_entry);
		try {
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				java_jar_entry();
				}
				break;
			case SCALA_JAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				scala_jar_entry();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).enterJava_jar_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).exitJava_jar_entry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PANTSVisitor ) return ((PANTSVisitor<? extends T>)visitor).visitJava_jar_entry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Java_jar_entryContext java_jar_entry() throws RecognitionException {
		Java_jar_entryContext _localctx = new Java_jar_entryContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_java_jar_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(JAR);
			setState(134);
			match(T__1);
			setState(135);
			jar_coordinates();
			setState(136);
			match(T__2);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(137);
				match(T__5);
				}
			}

			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(140);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).enterScala_jar_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).exitScala_jar_entry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PANTSVisitor ) return ((PANTSVisitor<? extends T>)visitor).visitScala_jar_entry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scala_jar_entryContext scala_jar_entry() throws RecognitionException {
		Scala_jar_entryContext _localctx = new Scala_jar_entryContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_scala_jar_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(SCALA_JAR);
			setState(144);
			match(T__1);
			setState(145);
			jar_coordinates();
			setState(146);
			match(T__2);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(147);
				match(T__5);
				}
			}

			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(150);
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

	public static class Jar_coordinateContext extends ParserRuleContext {
		public TerminalNode ORG() { return getToken(PANTSParser.ORG, 0); }
		public TerminalNode SINGLE_QUOTED_STRING() { return getToken(PANTSParser.SINGLE_QUOTED_STRING, 0); }
		public TerminalNode NAME() { return getToken(PANTSParser.NAME, 0); }
		public TerminalNode REV() { return getToken(PANTSParser.REV, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PANTSParser.IDENTIFIER, 0); }
		public Jar_coordinateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jar_coordinate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).enterJar_coordinate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).exitJar_coordinate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PANTSVisitor ) return ((PANTSVisitor<? extends T>)visitor).visitJar_coordinate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jar_coordinateContext jar_coordinate() throws RecognitionException {
		Jar_coordinateContext _localctx = new Jar_coordinateContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_jar_coordinate);
		int _la;
		try {
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ORG:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				match(ORG);
				setState(154);
				match(T__0);
				setState(155);
				match(SINGLE_QUOTED_STRING);
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(156);
					match(T__5);
					}
				}

				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				match(NAME);
				setState(160);
				match(T__0);
				setState(161);
				match(SINGLE_QUOTED_STRING);
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(162);
					match(T__5);
					}
				}

				}
				break;
			case REV:
				enterOuterAlt(_localctx, 3);
				{
				setState(165);
				match(REV);
				setState(166);
				match(T__0);
				setState(167);
				_la = _input.LA(1);
				if ( !(_la==SINGLE_QUOTED_STRING || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(168);
					match(T__5);
					}
				}

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

	public static class Jar_coordinatesContext extends ParserRuleContext {
		public List<Jar_coordinateContext> jar_coordinate() {
			return getRuleContexts(Jar_coordinateContext.class);
		}
		public Jar_coordinateContext jar_coordinate(int i) {
			return getRuleContext(Jar_coordinateContext.class,i);
		}
		public Jar_coordinatesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jar_coordinates; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).enterJar_coordinates(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).exitJar_coordinates(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PANTSVisitor ) return ((PANTSVisitor<? extends T>)visitor).visitJar_coordinates(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jar_coordinatesContext jar_coordinates() throws RecognitionException {
		Jar_coordinatesContext _localctx = new Jar_coordinatesContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_jar_coordinates);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NAME) | (1L << ORG) | (1L << REV))) != 0)) {
				{
				{
				setState(173);
				jar_coordinate();
				}
				}
				setState(178);
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
		enterRule(_localctx, 36, RULE_name_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(NAME);
			setState(180);
			match(T__0);
			setState(181);
			match(SINGLE_QUOTED_STRING);
			setState(182);
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
		enterRule(_localctx, 38, RULE_dependencies_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(DEPENDENCIES);
			setState(185);
			match(T__0);
			setState(186);
			match(T__3);
			setState(187);
			dependent_list();
			setState(188);
			match(T__4);
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(189);
				match(T__5);
				}
			}

			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(192);
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
		enterRule(_localctx, 40, RULE_dependent_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SINGLE_QUOTED_STRING) {
				{
				{
				setState(195);
				dependent_entry();
				}
				}
				setState(200);
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
		enterRule(_localctx, 42, RULE_dependent_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(SINGLE_QUOTED_STRING);
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(202);
				match(T__5);
				}
			}

			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(205);
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
		enterRule(_localctx, 44, RULE_sources_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(SOURCES);
			setState(209);
			match(T__0);
			setState(210);
			match(GLOBS);
			setState(211);
			match(T__1);
			setState(212);
			match(SINGLE_QUOTED_STRING);
			setState(213);
			match(T__2);
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(214);
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
		enterRule(_localctx, 46, RULE_main_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(MAIN);
			setState(218);
			match(T__0);
			setState(219);
			match(DOUBLE_QUOTED_STRING);
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(220);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32\u00e2\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\3\7\3\66\n\3\f\3\16\39\13\3\3\4\3\4\3\4\3\4\5\4?\n\4\3\5\3"+
		"\5\3\5\3\5\5\5E\n\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\5\tX\n\t\7\tZ\n\t\f\t\16\t]\13\t\3\n\3\n\3\n\3\n\5"+
		"\nc\n\n\3\13\3\13\5\13g\n\13\7\13i\n\13\f\13\16\13l\13\13\3\f\3\f\3\f"+
		"\5\fq\n\f\3\r\3\r\3\r\3\r\3\r\3\r\5\ry\n\r\3\r\5\r|\n\r\3\16\7\16\177"+
		"\n\16\f\16\16\16\u0082\13\16\3\17\3\17\5\17\u0086\n\17\3\20\3\20\3\20"+
		"\3\20\3\20\5\20\u008d\n\20\3\20\5\20\u0090\n\20\3\21\3\21\3\21\3\21\3"+
		"\21\5\21\u0097\n\21\3\21\5\21\u009a\n\21\3\22\3\22\3\22\3\22\5\22\u00a0"+
		"\n\22\3\22\3\22\3\22\3\22\5\22\u00a6\n\22\3\22\3\22\3\22\3\22\5\22\u00ac"+
		"\n\22\5\22\u00ae\n\22\3\23\7\23\u00b1\n\23\f\23\16\23\u00b4\13\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00c1\n\25\3\25"+
		"\5\25\u00c4\n\25\3\26\7\26\u00c7\n\26\f\26\16\26\u00ca\13\26\3\27\3\27"+
		"\5\27\u00ce\n\27\3\27\5\27\u00d1\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\5\30\u00da\n\30\3\31\3\31\3\31\3\31\5\31\u00e0\n\31\3\31\2\2\32\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\3\4\2\26\26\31\31"+
		"\2\u00ec\2\62\3\2\2\2\4\67\3\2\2\2\6>\3\2\2\2\b@\3\2\2\2\nF\3\2\2\2\f"+
		"K\3\2\2\2\16P\3\2\2\2\20[\3\2\2\2\22b\3\2\2\2\24j\3\2\2\2\26p\3\2\2\2"+
		"\30r\3\2\2\2\32\u0080\3\2\2\2\34\u0085\3\2\2\2\36\u0087\3\2\2\2 \u0091"+
		"\3\2\2\2\"\u00ad\3\2\2\2$\u00b2\3\2\2\2&\u00b5\3\2\2\2(\u00ba\3\2\2\2"+
		"*\u00c8\3\2\2\2,\u00cb\3\2\2\2.\u00d2\3\2\2\2\60\u00db\3\2\2\2\62\63\5"+
		"\4\3\2\63\3\3\2\2\2\64\66\5\6\4\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2"+
		"\2\2\678\3\2\2\28\5\3\2\2\29\67\3\2\2\2:?\5\n\6\2;?\5\16\b\2<?\5\f\7\2"+
		"=?\5\b\5\2>:\3\2\2\2>;\3\2\2\2><\3\2\2\2>=\3\2\2\2?\7\3\2\2\2@A\7\31\2"+
		"\2AB\7\3\2\2BD\7\26\2\2CE\7\27\2\2DC\3\2\2\2DE\3\2\2\2E\t\3\2\2\2FG\7"+
		"\t\2\2GH\7\4\2\2HI\5\20\t\2IJ\7\5\2\2J\13\3\2\2\2KL\7\n\2\2LM\7\4\2\2"+
		"MN\5\24\13\2NO\7\5\2\2O\r\3\2\2\2PQ\7\13\2\2QR\7\4\2\2RS\5\20\t\2ST\7"+
		"\5\2\2T\17\3\2\2\2UW\5\22\n\2VX\7\27\2\2WV\3\2\2\2WX\3\2\2\2XZ\3\2\2\2"+
		"YU\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\21\3\2\2\2][\3\2\2\2^c\5&"+
		"\24\2_c\5(\25\2`c\5.\30\2ac\5\60\31\2b^\3\2\2\2b_\3\2\2\2b`\3\2\2\2ba"+
		"\3\2\2\2c\23\3\2\2\2df\5\26\f\2eg\7\27\2\2fe\3\2\2\2fg\3\2\2\2gi\3\2\2"+
		"\2hd\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\25\3\2\2\2lj\3\2\2\2mq\5&"+
		"\24\2nq\5(\25\2oq\5\30\r\2pm\3\2\2\2pn\3\2\2\2po\3\2\2\2q\27\3\2\2\2r"+
		"s\7\f\2\2st\7\3\2\2tu\7\6\2\2uv\5\32\16\2vx\7\7\2\2wy\7\b\2\2xw\3\2\2"+
		"\2xy\3\2\2\2y{\3\2\2\2z|\7\27\2\2{z\3\2\2\2{|\3\2\2\2|\31\3\2\2\2}\177"+
		"\5\34\17\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2"+
		"\2\2\u0081\33\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0086\5\36\20\2\u0084"+
		"\u0086\5 \21\2\u0085\u0083\3\2\2\2\u0085\u0084\3\2\2\2\u0086\35\3\2\2"+
		"\2\u0087\u0088\7\r\2\2\u0088\u0089\7\4\2\2\u0089\u008a\5$\23\2\u008a\u008c"+
		"\7\5\2\2\u008b\u008d\7\b\2\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008f\3\2\2\2\u008e\u0090\7\27\2\2\u008f\u008e\3\2\2\2\u008f\u0090\3"+
		"\2\2\2\u0090\37\3\2\2\2\u0091\u0092\7\16\2\2\u0092\u0093\7\4\2\2\u0093"+
		"\u0094\5$\23\2\u0094\u0096\7\5\2\2\u0095\u0097\7\b\2\2\u0096\u0095\3\2"+
		"\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u009a\7\27\2\2\u0099"+
		"\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a!\3\2\2\2\u009b\u009c\7\20\2\2"+
		"\u009c\u009d\7\3\2\2\u009d\u009f\7\26\2\2\u009e\u00a0\7\b\2\2\u009f\u009e"+
		"\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00ae\3\2\2\2\u00a1\u00a2\7\17\2\2"+
		"\u00a2\u00a3\7\3\2\2\u00a3\u00a5\7\26\2\2\u00a4\u00a6\7\b\2\2\u00a5\u00a4"+
		"\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00ae\3\2\2\2\u00a7\u00a8\7\21\2\2"+
		"\u00a8\u00a9\7\3\2\2\u00a9\u00ab\t\2\2\2\u00aa\u00ac\7\b\2\2\u00ab\u00aa"+
		"\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad\u009b\3\2\2\2\u00ad"+
		"\u00a1\3\2\2\2\u00ad\u00a7\3\2\2\2\u00ae#\3\2\2\2\u00af\u00b1\5\"\22\2"+
		"\u00b0\u00af\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3"+
		"\3\2\2\2\u00b3%\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\7\17\2\2\u00b6"+
		"\u00b7\7\3\2\2\u00b7\u00b8\7\26\2\2\u00b8\u00b9\7\b\2\2\u00b9\'\3\2\2"+
		"\2\u00ba\u00bb\7\22\2\2\u00bb\u00bc\7\3\2\2\u00bc\u00bd\7\6\2\2\u00bd"+
		"\u00be\5*\26\2\u00be\u00c0\7\7\2\2\u00bf\u00c1\7\b\2\2\u00c0\u00bf\3\2"+
		"\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00c4\7\27\2\2\u00c3"+
		"\u00c2\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4)\3\2\2\2\u00c5\u00c7\5,\27\2"+
		"\u00c6\u00c5\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9"+
		"\3\2\2\2\u00c9+\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cd\7\26\2\2\u00cc"+
		"\u00ce\7\b\2\2\u00cd\u00cc\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\3\2"+
		"\2\2\u00cf\u00d1\7\27\2\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"-\3\2\2\2\u00d2\u00d3\7\23\2\2\u00d3\u00d4\7\3\2\2\u00d4\u00d5\7\24\2"+
		"\2\u00d5\u00d6\7\4\2\2\u00d6\u00d7\7\26\2\2\u00d7\u00d9\7\5\2\2\u00d8"+
		"\u00da\7\b\2\2\u00d9\u00d8\3\2\2\2\u00d9\u00da\3\2\2\2\u00da/\3\2\2\2"+
		"\u00db\u00dc\7\25\2\2\u00dc\u00dd\7\3\2\2\u00dd\u00df\7\30\2\2\u00de\u00e0"+
		"\7\b\2\2\u00df\u00de\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\61\3\2\2\2\37\67"+
		">DW[bfjpx{\u0080\u0085\u008c\u008f\u0096\u0099\u009f\u00a5\u00ab\u00ad"+
		"\u00b2\u00c0\u00c3\u00c8\u00cd\u00d0\u00d9\u00df";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}