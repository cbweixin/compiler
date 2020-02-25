// Generated from /Users/xinwei/Documents/weixin/study-antlr/antlr-ex/src/main/java/com/weixin/pants/PANTS.g4 by ANTLR 4.8
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
		INTRANSITIVE=16, EXCLUDES=17, EXCLUDE=18, FORCE=19, DEPENDENCIES=20, SOURCES=21, 
		GLOBS=22, MAIN=23, BOOL_VALUE=24, SINGLE_QUOTED_STRING=25, NEWLINE=26, 
		DOUBLE_QUOTED_STRING=27, IDENTIFIER=28, WS=29;
	public static final int
		RULE_pants = 0, RULE_stmt_list = 1, RULE_stmt = 2, RULE_var_declare = 3, 
		RULE_java_lib_stmt = 4, RULE_jar_lib_stmt = 5, RULE_jvm_lib_stmt = 6, 
		RULE_lib_item_list = 7, RULE_lib_item = 8, RULE_jars_item_list = 9, RULE_jars_item = 10, 
		RULE_jar_list = 11, RULE_jar_entries = 12, RULE_jar_entry = 13, RULE_java_jar_entry = 14, 
		RULE_scala_jar_entry = 15, RULE_jar_coordinates = 16, RULE_jar_coordinate = 17, 
		RULE_excludes_list = 18, RULE_exclude_entries = 19, RULE_exclude_entry = 20, 
		RULE_exclude_coordinates = 21, RULE_exclude_coordinate = 22, RULE_name_item = 23, 
		RULE_dependencies_item = 24, RULE_dependent_list = 25, RULE_dependent_entry = 26, 
		RULE_sources_item = 27, RULE_main_item = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"pants", "stmt_list", "stmt", "var_declare", "java_lib_stmt", "jar_lib_stmt", 
			"jvm_lib_stmt", "lib_item_list", "lib_item", "jars_item_list", "jars_item", 
			"jar_list", "jar_entries", "jar_entry", "java_jar_entry", "scala_jar_entry", 
			"jar_coordinates", "jar_coordinate", "excludes_list", "exclude_entries", 
			"exclude_entry", "exclude_coordinates", "exclude_coordinate", "name_item", 
			"dependencies_item", "dependent_list", "dependent_entry", "sources_item", 
			"main_item"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", "'['", "']'", "','", "'java_library'", "'jar_library'", 
			"'jvm_binary'", "'jars'", "'jar'", "'scala_jar'", "'name'", "'org'", 
			"'rev'", "'intransitive'", "'excludes'", "'exclude'", "'force'", "'dependencies'", 
			"'sources'", "'globs'", "'main'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "JAVA_LIBRARY", "JAR_LIBRARY", 
			"JVM_LIBRARY", "JARS", "JAR", "SCALA_JAR", "NAME", "ORG", "REV", "INTRANSITIVE", 
			"EXCLUDES", "EXCLUDE", "FORCE", "DEPENDENCIES", "SOURCES", "GLOBS", "MAIN", 
			"BOOL_VALUE", "SINGLE_QUOTED_STRING", "NEWLINE", "DOUBLE_QUOTED_STRING", 
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
			setState(58);
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
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA_LIBRARY) | (1L << JAR_LIBRARY) | (1L << JVM_LIBRARY) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(60);
				stmt();
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(61);
					match(NEWLINE);
					}
				}

				}
				}
				setState(68);
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
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JAVA_LIBRARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				java_lib_stmt();
				}
				break;
			case JVM_LIBRARY:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				jvm_lib_stmt();
				}
				break;
			case JAR_LIBRARY:
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				jar_lib_stmt();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(72);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(IDENTIFIER);
			setState(76);
			match(T__0);
			setState(77);
			match(SINGLE_QUOTED_STRING);
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(78);
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
			setState(81);
			match(JAVA_LIBRARY);
			setState(82);
			match(T__1);
			setState(83);
			lib_item_list();
			setState(84);
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
			setState(86);
			match(JAR_LIBRARY);
			setState(87);
			match(T__1);
			setState(88);
			jars_item_list();
			setState(89);
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
			setState(91);
			match(JVM_LIBRARY);
			setState(92);
			match(T__1);
			setState(93);
			lib_item_list();
			setState(94);
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
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NAME) | (1L << DEPENDENCIES) | (1L << SOURCES) | (1L << MAIN))) != 0)) {
				{
				{
				setState(96);
				lib_item();
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(97);
					match(NEWLINE);
					}
				}

				}
				}
				setState(104);
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
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				name_item();
				}
				break;
			case DEPENDENCIES:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				dependencies_item();
				}
				break;
			case SOURCES:
				enterOuterAlt(_localctx, 3);
				{
				setState(107);
				sources_item();
				}
				break;
			case MAIN:
				enterOuterAlt(_localctx, 4);
				{
				setState(108);
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
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JARS) | (1L << NAME) | (1L << DEPENDENCIES))) != 0)) {
				{
				{
				setState(111);
				jars_item();
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(112);
					match(NEWLINE);
					}
				}

				}
				}
				setState(119);
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
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				name_item();
				}
				break;
			case DEPENDENCIES:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				dependencies_item();
				}
				break;
			case JARS:
				enterOuterAlt(_localctx, 3);
				{
				setState(122);
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
			setState(125);
			match(JARS);
			setState(126);
			match(T__0);
			setState(127);
			match(T__3);
			setState(128);
			jar_entries();
			setState(129);
			match(T__4);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(130);
				match(T__5);
				}
			}

			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(133);
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
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JAR || _la==SCALA_JAR) {
				{
				{
				setState(136);
				jar_entry();
				}
				}
				setState(141);
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
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				java_jar_entry();
				}
				break;
			case SCALA_JAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
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
			setState(146);
			match(JAR);
			setState(147);
			match(T__1);
			setState(148);
			jar_coordinates();
			setState(149);
			match(T__2);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(150);
				match(T__5);
				}
			}

			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(153);
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
			setState(156);
			match(SCALA_JAR);
			setState(157);
			match(T__1);
			setState(158);
			jar_coordinates();
			setState(159);
			match(T__2);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(160);
				match(T__5);
				}
			}

			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(163);
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
		enterRule(_localctx, 32, RULE_jar_coordinates);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NAME) | (1L << ORG) | (1L << REV) | (1L << INTRANSITIVE) | (1L << EXCLUDES) | (1L << FORCE))) != 0)) {
				{
				{
				setState(166);
				jar_coordinate();
				}
				}
				setState(171);
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

	public static class Jar_coordinateContext extends ParserRuleContext {
		public TerminalNode ORG() { return getToken(PANTSParser.ORG, 0); }
		public TerminalNode SINGLE_QUOTED_STRING() { return getToken(PANTSParser.SINGLE_QUOTED_STRING, 0); }
		public TerminalNode NAME() { return getToken(PANTSParser.NAME, 0); }
		public TerminalNode REV() { return getToken(PANTSParser.REV, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PANTSParser.IDENTIFIER, 0); }
		public TerminalNode INTRANSITIVE() { return getToken(PANTSParser.INTRANSITIVE, 0); }
		public TerminalNode BOOL_VALUE() { return getToken(PANTSParser.BOOL_VALUE, 0); }
		public TerminalNode FORCE() { return getToken(PANTSParser.FORCE, 0); }
		public Excludes_listContext excludes_list() {
			return getRuleContext(Excludes_listContext.class,0);
		}
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
		enterRule(_localctx, 34, RULE_jar_coordinate);
		int _la;
		try {
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ORG:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(ORG);
				setState(173);
				match(T__0);
				setState(174);
				match(SINGLE_QUOTED_STRING);
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(175);
					match(T__5);
					}
				}

				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				match(NAME);
				setState(179);
				match(T__0);
				setState(180);
				match(SINGLE_QUOTED_STRING);
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(181);
					match(T__5);
					}
				}

				}
				break;
			case REV:
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				match(REV);
				setState(185);
				match(T__0);
				setState(186);
				_la = _input.LA(1);
				if ( !(_la==SINGLE_QUOTED_STRING || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(187);
					match(T__5);
					}
				}

				}
				break;
			case INTRANSITIVE:
				enterOuterAlt(_localctx, 4);
				{
				setState(190);
				match(INTRANSITIVE);
				setState(191);
				match(T__0);
				setState(192);
				match(BOOL_VALUE);
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(193);
					match(T__5);
					}
				}

				}
				break;
			case FORCE:
				enterOuterAlt(_localctx, 5);
				{
				setState(196);
				match(FORCE);
				setState(197);
				match(T__0);
				setState(198);
				match(BOOL_VALUE);
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(199);
					match(T__5);
					}
				}

				}
				break;
			case EXCLUDES:
				enterOuterAlt(_localctx, 6);
				{
				setState(202);
				excludes_list();
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(203);
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

	public static class Excludes_listContext extends ParserRuleContext {
		public TerminalNode EXCLUDES() { return getToken(PANTSParser.EXCLUDES, 0); }
		public Exclude_entriesContext exclude_entries() {
			return getRuleContext(Exclude_entriesContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PANTSParser.NEWLINE, 0); }
		public Excludes_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_excludes_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).enterExcludes_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).exitExcludes_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PANTSVisitor ) return ((PANTSVisitor<? extends T>)visitor).visitExcludes_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Excludes_listContext excludes_list() throws RecognitionException {
		Excludes_listContext _localctx = new Excludes_listContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_excludes_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(EXCLUDES);
			setState(209);
			match(T__0);
			setState(210);
			match(T__3);
			setState(211);
			exclude_entries();
			setState(212);
			match(T__4);
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(213);
				match(T__5);
				}
				break;
			}
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(216);
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

	public static class Exclude_entriesContext extends ParserRuleContext {
		public List<Exclude_entryContext> exclude_entry() {
			return getRuleContexts(Exclude_entryContext.class);
		}
		public Exclude_entryContext exclude_entry(int i) {
			return getRuleContext(Exclude_entryContext.class,i);
		}
		public Exclude_entriesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclude_entries; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).enterExclude_entries(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).exitExclude_entries(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PANTSVisitor ) return ((PANTSVisitor<? extends T>)visitor).visitExclude_entries(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exclude_entriesContext exclude_entries() throws RecognitionException {
		Exclude_entriesContext _localctx = new Exclude_entriesContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_exclude_entries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EXCLUDE) {
				{
				{
				setState(219);
				exclude_entry();
				}
				}
				setState(224);
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

	public static class Exclude_entryContext extends ParserRuleContext {
		public TerminalNode EXCLUDE() { return getToken(PANTSParser.EXCLUDE, 0); }
		public Exclude_coordinatesContext exclude_coordinates() {
			return getRuleContext(Exclude_coordinatesContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PANTSParser.NEWLINE, 0); }
		public Exclude_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclude_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).enterExclude_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).exitExclude_entry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PANTSVisitor ) return ((PANTSVisitor<? extends T>)visitor).visitExclude_entry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exclude_entryContext exclude_entry() throws RecognitionException {
		Exclude_entryContext _localctx = new Exclude_entryContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_exclude_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(EXCLUDE);
			setState(226);
			match(T__1);
			setState(227);
			exclude_coordinates();
			setState(228);
			match(T__2);
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(229);
				match(T__5);
				}
			}

			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(232);
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

	public static class Exclude_coordinatesContext extends ParserRuleContext {
		public List<Exclude_coordinateContext> exclude_coordinate() {
			return getRuleContexts(Exclude_coordinateContext.class);
		}
		public Exclude_coordinateContext exclude_coordinate(int i) {
			return getRuleContext(Exclude_coordinateContext.class,i);
		}
		public Exclude_coordinatesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclude_coordinates; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).enterExclude_coordinates(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).exitExclude_coordinates(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PANTSVisitor ) return ((PANTSVisitor<? extends T>)visitor).visitExclude_coordinates(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exclude_coordinatesContext exclude_coordinates() throws RecognitionException {
		Exclude_coordinatesContext _localctx = new Exclude_coordinatesContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_exclude_coordinates);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NAME) | (1L << ORG) | (1L << REV))) != 0)) {
				{
				{
				setState(235);
				exclude_coordinate();
				}
				}
				setState(240);
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

	public static class Exclude_coordinateContext extends ParserRuleContext {
		public TerminalNode ORG() { return getToken(PANTSParser.ORG, 0); }
		public TerminalNode SINGLE_QUOTED_STRING() { return getToken(PANTSParser.SINGLE_QUOTED_STRING, 0); }
		public TerminalNode NAME() { return getToken(PANTSParser.NAME, 0); }
		public TerminalNode REV() { return getToken(PANTSParser.REV, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PANTSParser.IDENTIFIER, 0); }
		public Exclude_coordinateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclude_coordinate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).enterExclude_coordinate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).exitExclude_coordinate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PANTSVisitor ) return ((PANTSVisitor<? extends T>)visitor).visitExclude_coordinate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exclude_coordinateContext exclude_coordinate() throws RecognitionException {
		Exclude_coordinateContext _localctx = new Exclude_coordinateContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_exclude_coordinate);
		int _la;
		try {
			setState(259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ORG:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				match(ORG);
				setState(242);
				match(T__0);
				setState(243);
				match(SINGLE_QUOTED_STRING);
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(244);
					match(T__5);
					}
				}

				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				match(NAME);
				setState(248);
				match(T__0);
				setState(249);
				match(SINGLE_QUOTED_STRING);
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(250);
					match(T__5);
					}
				}

				}
				break;
			case REV:
				enterOuterAlt(_localctx, 3);
				{
				setState(253);
				match(REV);
				setState(254);
				match(T__0);
				setState(255);
				_la = _input.LA(1);
				if ( !(_la==SINGLE_QUOTED_STRING || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(256);
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
		enterRule(_localctx, 46, RULE_name_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(NAME);
			setState(262);
			match(T__0);
			setState(263);
			match(SINGLE_QUOTED_STRING);
			setState(264);
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
		enterRule(_localctx, 48, RULE_dependencies_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(DEPENDENCIES);
			setState(267);
			match(T__0);
			setState(268);
			match(T__3);
			setState(269);
			dependent_list();
			setState(270);
			match(T__4);
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(271);
				match(T__5);
				}
			}

			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(274);
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
		enterRule(_localctx, 50, RULE_dependent_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SINGLE_QUOTED_STRING) {
				{
				{
				setState(277);
				dependent_entry();
				}
				}
				setState(282);
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
		enterRule(_localctx, 52, RULE_dependent_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(SINGLE_QUOTED_STRING);
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(284);
				match(T__5);
				}
			}

			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(287);
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
		enterRule(_localctx, 54, RULE_sources_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(SOURCES);
			setState(291);
			match(T__0);
			setState(292);
			match(GLOBS);
			setState(293);
			match(T__1);
			setState(294);
			match(SINGLE_QUOTED_STRING);
			setState(295);
			match(T__2);
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(296);
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
		enterRule(_localctx, 56, RULE_main_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(MAIN);
			setState(300);
			match(T__0);
			setState(301);
			match(DOUBLE_QUOTED_STRING);
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(302);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u0134\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\3\3\3\5\3"+
		"A\n\3\7\3C\n\3\f\3\16\3F\13\3\3\4\3\4\3\4\3\4\5\4L\n\4\3\5\3\5\3\5\3\5"+
		"\5\5R\n\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\5\te\n\t\7\tg\n\t\f\t\16\tj\13\t\3\n\3\n\3\n\3\n\5\np\n\n\3\13"+
		"\3\13\5\13t\n\13\7\13v\n\13\f\13\16\13y\13\13\3\f\3\f\3\f\5\f~\n\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\5\r\u0086\n\r\3\r\5\r\u0089\n\r\3\16\7\16\u008c\n"+
		"\16\f\16\16\16\u008f\13\16\3\17\3\17\5\17\u0093\n\17\3\20\3\20\3\20\3"+
		"\20\3\20\5\20\u009a\n\20\3\20\5\20\u009d\n\20\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u00a4\n\21\3\21\5\21\u00a7\n\21\3\22\7\22\u00aa\n\22\f\22\16\22"+
		"\u00ad\13\22\3\23\3\23\3\23\3\23\5\23\u00b3\n\23\3\23\3\23\3\23\3\23\5"+
		"\23\u00b9\n\23\3\23\3\23\3\23\3\23\5\23\u00bf\n\23\3\23\3\23\3\23\3\23"+
		"\5\23\u00c5\n\23\3\23\3\23\3\23\3\23\5\23\u00cb\n\23\3\23\3\23\5\23\u00cf"+
		"\n\23\5\23\u00d1\n\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00d9\n\24\3"+
		"\24\5\24\u00dc\n\24\3\25\7\25\u00df\n\25\f\25\16\25\u00e2\13\25\3\26\3"+
		"\26\3\26\3\26\3\26\5\26\u00e9\n\26\3\26\5\26\u00ec\n\26\3\27\7\27\u00ef"+
		"\n\27\f\27\16\27\u00f2\13\27\3\30\3\30\3\30\3\30\5\30\u00f8\n\30\3\30"+
		"\3\30\3\30\3\30\5\30\u00fe\n\30\3\30\3\30\3\30\3\30\5\30\u0104\n\30\5"+
		"\30\u0106\n\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\5\32\u0113\n\32\3\32\5\32\u0116\n\32\3\33\7\33\u0119\n\33\f\33\16\33"+
		"\u011c\13\33\3\34\3\34\5\34\u0120\n\34\3\34\5\34\u0123\n\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\5\35\u012c\n\35\3\36\3\36\3\36\3\36\5\36\u0132"+
		"\n\36\3\36\2\2\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:\2\3\4\2\33\33\36\36\2\u014b\2<\3\2\2\2\4D\3\2\2\2\6K\3\2\2\2"+
		"\bM\3\2\2\2\nS\3\2\2\2\fX\3\2\2\2\16]\3\2\2\2\20h\3\2\2\2\22o\3\2\2\2"+
		"\24w\3\2\2\2\26}\3\2\2\2\30\177\3\2\2\2\32\u008d\3\2\2\2\34\u0092\3\2"+
		"\2\2\36\u0094\3\2\2\2 \u009e\3\2\2\2\"\u00ab\3\2\2\2$\u00d0\3\2\2\2&\u00d2"+
		"\3\2\2\2(\u00e0\3\2\2\2*\u00e3\3\2\2\2,\u00f0\3\2\2\2.\u0105\3\2\2\2\60"+
		"\u0107\3\2\2\2\62\u010c\3\2\2\2\64\u011a\3\2\2\2\66\u011d\3\2\2\28\u0124"+
		"\3\2\2\2:\u012d\3\2\2\2<=\5\4\3\2=\3\3\2\2\2>@\5\6\4\2?A\7\34\2\2@?\3"+
		"\2\2\2@A\3\2\2\2AC\3\2\2\2B>\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\5"+
		"\3\2\2\2FD\3\2\2\2GL\5\n\6\2HL\5\16\b\2IL\5\f\7\2JL\5\b\5\2KG\3\2\2\2"+
		"KH\3\2\2\2KI\3\2\2\2KJ\3\2\2\2L\7\3\2\2\2MN\7\36\2\2NO\7\3\2\2OQ\7\33"+
		"\2\2PR\7\34\2\2QP\3\2\2\2QR\3\2\2\2R\t\3\2\2\2ST\7\t\2\2TU\7\4\2\2UV\5"+
		"\20\t\2VW\7\5\2\2W\13\3\2\2\2XY\7\n\2\2YZ\7\4\2\2Z[\5\24\13\2[\\\7\5\2"+
		"\2\\\r\3\2\2\2]^\7\13\2\2^_\7\4\2\2_`\5\20\t\2`a\7\5\2\2a\17\3\2\2\2b"+
		"d\5\22\n\2ce\7\34\2\2dc\3\2\2\2de\3\2\2\2eg\3\2\2\2fb\3\2\2\2gj\3\2\2"+
		"\2hf\3\2\2\2hi\3\2\2\2i\21\3\2\2\2jh\3\2\2\2kp\5\60\31\2lp\5\62\32\2m"+
		"p\58\35\2np\5:\36\2ok\3\2\2\2ol\3\2\2\2om\3\2\2\2on\3\2\2\2p\23\3\2\2"+
		"\2qs\5\26\f\2rt\7\34\2\2sr\3\2\2\2st\3\2\2\2tv\3\2\2\2uq\3\2\2\2vy\3\2"+
		"\2\2wu\3\2\2\2wx\3\2\2\2x\25\3\2\2\2yw\3\2\2\2z~\5\60\31\2{~\5\62\32\2"+
		"|~\5\30\r\2}z\3\2\2\2}{\3\2\2\2}|\3\2\2\2~\27\3\2\2\2\177\u0080\7\f\2"+
		"\2\u0080\u0081\7\3\2\2\u0081\u0082\7\6\2\2\u0082\u0083\5\32\16\2\u0083"+
		"\u0085\7\7\2\2\u0084\u0086\7\b\2\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2"+
		"\2\2\u0086\u0088\3\2\2\2\u0087\u0089\7\34\2\2\u0088\u0087\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\31\3\2\2\2\u008a\u008c\5\34\17\2\u008b\u008a\3\2"+
		"\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\33\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0093\5\36\20\2\u0091\u0093\5 \21"+
		"\2\u0092\u0090\3\2\2\2\u0092\u0091\3\2\2\2\u0093\35\3\2\2\2\u0094\u0095"+
		"\7\r\2\2\u0095\u0096\7\4\2\2\u0096\u0097\5\"\22\2\u0097\u0099\7\5\2\2"+
		"\u0098\u009a\7\b\2\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c"+
		"\3\2\2\2\u009b\u009d\7\34\2\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2"+
		"\u009d\37\3\2\2\2\u009e\u009f\7\16\2\2\u009f\u00a0\7\4\2\2\u00a0\u00a1"+
		"\5\"\22\2\u00a1\u00a3\7\5\2\2\u00a2\u00a4\7\b\2\2\u00a3\u00a2\3\2\2\2"+
		"\u00a3\u00a4\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a7\7\34\2\2\u00a6\u00a5"+
		"\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7!\3\2\2\2\u00a8\u00aa\5$\23\2\u00a9"+
		"\u00a8\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2"+
		"\2\2\u00ac#\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00af\7\20\2\2\u00af\u00b0"+
		"\7\3\2\2\u00b0\u00b2\7\33\2\2\u00b1\u00b3\7\b\2\2\u00b2\u00b1\3\2\2\2"+
		"\u00b2\u00b3\3\2\2\2\u00b3\u00d1\3\2\2\2\u00b4\u00b5\7\17\2\2\u00b5\u00b6"+
		"\7\3\2\2\u00b6\u00b8\7\33\2\2\u00b7\u00b9\7\b\2\2\u00b8\u00b7\3\2\2\2"+
		"\u00b8\u00b9\3\2\2\2\u00b9\u00d1\3\2\2\2\u00ba\u00bb\7\21\2\2\u00bb\u00bc"+
		"\7\3\2\2\u00bc\u00be\t\2\2\2\u00bd\u00bf\7\b\2\2\u00be\u00bd\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\u00d1\3\2\2\2\u00c0\u00c1\7\22\2\2\u00c1\u00c2\7"+
		"\3\2\2\u00c2\u00c4\7\32\2\2\u00c3\u00c5\7\b\2\2\u00c4\u00c3\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00d1\3\2\2\2\u00c6\u00c7\7\25\2\2\u00c7\u00c8\7"+
		"\3\2\2\u00c8\u00ca\7\32\2\2\u00c9\u00cb\7\b\2\2\u00ca\u00c9\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\u00d1\3\2\2\2\u00cc\u00ce\5&\24\2\u00cd\u00cf\7\b"+
		"\2\2\u00ce\u00cd\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0"+
		"\u00ae\3\2\2\2\u00d0\u00b4\3\2\2\2\u00d0\u00ba\3\2\2\2\u00d0\u00c0\3\2"+
		"\2\2\u00d0\u00c6\3\2\2\2\u00d0\u00cc\3\2\2\2\u00d1%\3\2\2\2\u00d2\u00d3"+
		"\7\23\2\2\u00d3\u00d4\7\3\2\2\u00d4\u00d5\7\6\2\2\u00d5\u00d6\5(\25\2"+
		"\u00d6\u00d8\7\7\2\2\u00d7\u00d9\7\b\2\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9"+
		"\3\2\2\2\u00d9\u00db\3\2\2\2\u00da\u00dc\7\34\2\2\u00db\u00da\3\2\2\2"+
		"\u00db\u00dc\3\2\2\2\u00dc\'\3\2\2\2\u00dd\u00df\5*\26\2\u00de\u00dd\3"+
		"\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		")\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e4\7\24\2\2\u00e4\u00e5\7\4\2\2"+
		"\u00e5\u00e6\5,\27\2\u00e6\u00e8\7\5\2\2\u00e7\u00e9\7\b\2\2\u00e8\u00e7"+
		"\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00ec\7\34\2\2"+
		"\u00eb\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec+\3\2\2\2\u00ed\u00ef\5"+
		".\30\2\u00ee\u00ed\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0"+
		"\u00f1\3\2\2\2\u00f1-\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f4\7\20\2\2"+
		"\u00f4\u00f5\7\3\2\2\u00f5\u00f7\7\33\2\2\u00f6\u00f8\7\b\2\2\u00f7\u00f6"+
		"\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u0106\3\2\2\2\u00f9\u00fa\7\17\2\2"+
		"\u00fa\u00fb\7\3\2\2\u00fb\u00fd\7\33\2\2\u00fc\u00fe\7\b\2\2\u00fd\u00fc"+
		"\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0106\3\2\2\2\u00ff\u0100\7\21\2\2"+
		"\u0100\u0101\7\3\2\2\u0101\u0103\t\2\2\2\u0102\u0104\7\b\2\2\u0103\u0102"+
		"\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106\3\2\2\2\u0105\u00f3\3\2\2\2\u0105"+
		"\u00f9\3\2\2\2\u0105\u00ff\3\2\2\2\u0106/\3\2\2\2\u0107\u0108\7\17\2\2"+
		"\u0108\u0109\7\3\2\2\u0109\u010a\7\33\2\2\u010a\u010b\7\b\2\2\u010b\61"+
		"\3\2\2\2\u010c\u010d\7\26\2\2\u010d\u010e\7\3\2\2\u010e\u010f\7\6\2\2"+
		"\u010f\u0110\5\64\33\2\u0110\u0112\7\7\2\2\u0111\u0113\7\b\2\2\u0112\u0111"+
		"\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0115\3\2\2\2\u0114\u0116\7\34\2\2"+
		"\u0115\u0114\3\2\2\2\u0115\u0116\3\2\2\2\u0116\63\3\2\2\2\u0117\u0119"+
		"\5\66\34\2\u0118\u0117\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2"+
		"\u011a\u011b\3\2\2\2\u011b\65\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u011f"+
		"\7\33\2\2\u011e\u0120\7\b\2\2\u011f\u011e\3\2\2\2\u011f\u0120\3\2\2\2"+
		"\u0120\u0122\3\2\2\2\u0121\u0123\7\34\2\2\u0122\u0121\3\2\2\2\u0122\u0123"+
		"\3\2\2\2\u0123\67\3\2\2\2\u0124\u0125\7\27\2\2\u0125\u0126\7\3\2\2\u0126"+
		"\u0127\7\30\2\2\u0127\u0128\7\4\2\2\u0128\u0129\7\33\2\2\u0129\u012b\7"+
		"\5\2\2\u012a\u012c\7\b\2\2\u012b\u012a\3\2\2\2\u012b\u012c\3\2\2\2\u012c"+
		"9\3\2\2\2\u012d\u012e\7\31\2\2\u012e\u012f\7\3\2\2\u012f\u0131\7\35\2"+
		"\2\u0130\u0132\7\b\2\2\u0131\u0130\3\2\2\2\u0131\u0132\3\2\2\2\u0132;"+
		"\3\2\2\2-@DKQdhosw}\u0085\u0088\u008d\u0092\u0099\u009c\u00a3\u00a6\u00ab"+
		"\u00b2\u00b8\u00be\u00c4\u00ca\u00ce\u00d0\u00d8\u00db\u00e0\u00e8\u00eb"+
		"\u00f0\u00f7\u00fd\u0103\u0105\u0112\u0115\u011a\u011f\u0122\u012b\u0131";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}