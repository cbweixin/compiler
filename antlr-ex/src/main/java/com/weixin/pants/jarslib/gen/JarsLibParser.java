// Generated from /Users/xinwei/Documents/weixin/study-antlr/antlr-ex/src/main/java/com/weixin/pants/JarsLib.g4 by ANTLR 4.8
package com.weixin.pants.jarslib.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JarsLibParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, JAR_LIBRARY=7, JARS=8, 
		JAR=9, SCALA_JAR=10, NAME=11, ORG=12, REV=13, INTRANSITIVE=14, EXCLUDES=15, 
		EXCLUDE=16, FORCE=17, DEPENDENCIES=18, BOOL_VALUE=19, SINGLE_QUOTED_STRING=20, 
		NEWLINE=21, IDENTIFIER=22, WS=23;
	public static final int
		RULE_jarslib = 0, RULE_stmt_list = 1, RULE_stmt = 2, RULE_var_declare = 3, 
		RULE_jar_lib_stmt = 4, RULE_jars_item_list = 5, RULE_jars_item = 6, RULE_jar_list = 7, 
		RULE_jar_entries = 8, RULE_jar_entry = 9, RULE_java_jar_entry = 10, RULE_scala_jar_entry = 11, 
		RULE_jar_coordinates = 12, RULE_jar_coordinate = 13, RULE_excludes_list = 14, 
		RULE_exclude_entries = 15, RULE_exclude_entry = 16, RULE_exclude_coordinates = 17, 
		RULE_exclude_coordinate = 18, RULE_name_item = 19, RULE_dependencies_item = 20, 
		RULE_dependent_list = 21, RULE_dependent_entry = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"jarslib", "stmt_list", "stmt", "var_declare", "jar_lib_stmt", "jars_item_list", 
			"jars_item", "jar_list", "jar_entries", "jar_entry", "java_jar_entry", 
			"scala_jar_entry", "jar_coordinates", "jar_coordinate", "excludes_list", 
			"exclude_entries", "exclude_entry", "exclude_coordinates", "exclude_coordinate", 
			"name_item", "dependencies_item", "dependent_list", "dependent_entry"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", "'['", "']'", "','", "'jar_library'", "'jars'", 
			"'jar'", "'scala_jar'", "'name'", "'org'", "'rev'", "'intransitive'", 
			"'excludes'", "'exclude'", "'force'", "'dependencies'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "JAR_LIBRARY", "JARS", "JAR", 
			"SCALA_JAR", "NAME", "ORG", "REV", "INTRANSITIVE", "EXCLUDES", "EXCLUDE", 
			"FORCE", "DEPENDENCIES", "BOOL_VALUE", "SINGLE_QUOTED_STRING", "NEWLINE", 
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
	public String getGrammarFileName() { return "JarsLib.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JarsLibParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class JarslibContext extends ParserRuleContext {
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public JarslibContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jarslib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterJarslib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitJarslib(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitJarslib(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JarslibContext jarslib() throws RecognitionException {
		JarslibContext _localctx = new JarslibContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_jarslib);
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
		public List<TerminalNode> NEWLINE() { return getTokens(JarsLibParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(JarsLibParser.NEWLINE, i);
		}
		public Stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterStmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitStmt_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitStmt_list(this);
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
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JAR_LIBRARY || _la==IDENTIFIER) {
				{
				{
				setState(48);
				stmt();
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(49);
					match(NEWLINE);
					}
				}

				}
				}
				setState(56);
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
		public Var_declareContext var_declare() {
			return getRuleContext(Var_declareContext.class,0);
		}
		public Jar_lib_stmtContext jar_lib_stmt() {
			return getRuleContext(Jar_lib_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stmt);
		try {
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				var_declare();
				}
				break;
			case JAR_LIBRARY:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
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

	public static class Var_declareContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JarsLibParser.IDENTIFIER, 0); }
		public TerminalNode SINGLE_QUOTED_STRING() { return getToken(JarsLibParser.SINGLE_QUOTED_STRING, 0); }
		public TerminalNode NEWLINE() { return getToken(JarsLibParser.NEWLINE, 0); }
		public Var_declareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_declare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterVar_declare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitVar_declare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitVar_declare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declareContext var_declare() throws RecognitionException {
		Var_declareContext _localctx = new Var_declareContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_declare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(IDENTIFIER);
			setState(62);
			match(T__0);
			setState(63);
			match(SINGLE_QUOTED_STRING);
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(64);
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

	public static class Jar_lib_stmtContext extends ParserRuleContext {
		public TerminalNode JAR_LIBRARY() { return getToken(JarsLibParser.JAR_LIBRARY, 0); }
		public Jars_item_listContext jars_item_list() {
			return getRuleContext(Jars_item_listContext.class,0);
		}
		public Jar_lib_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jar_lib_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterJar_lib_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitJar_lib_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitJar_lib_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jar_lib_stmtContext jar_lib_stmt() throws RecognitionException {
		Jar_lib_stmtContext _localctx = new Jar_lib_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_jar_lib_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(JAR_LIBRARY);
			setState(68);
			match(T__1);
			setState(69);
			jars_item_list();
			setState(70);
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

	public static class Jars_item_listContext extends ParserRuleContext {
		public List<Jars_itemContext> jars_item() {
			return getRuleContexts(Jars_itemContext.class);
		}
		public Jars_itemContext jars_item(int i) {
			return getRuleContext(Jars_itemContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(JarsLibParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(JarsLibParser.NEWLINE, i);
		}
		public Jars_item_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jars_item_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterJars_item_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitJars_item_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitJars_item_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jars_item_listContext jars_item_list() throws RecognitionException {
		Jars_item_listContext _localctx = new Jars_item_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_jars_item_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JARS) | (1L << NAME) | (1L << DEPENDENCIES))) != 0)) {
				{
				{
				setState(72);
				jars_item();
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(73);
					match(NEWLINE);
					}
				}

				}
				}
				setState(80);
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
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterJars_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitJars_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitJars_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jars_itemContext jars_item() throws RecognitionException {
		Jars_itemContext _localctx = new Jars_itemContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_jars_item);
		try {
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				name_item();
				}
				break;
			case DEPENDENCIES:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				dependencies_item();
				}
				break;
			case JARS:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
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
		public TerminalNode JARS() { return getToken(JarsLibParser.JARS, 0); }
		public Jar_entriesContext jar_entries() {
			return getRuleContext(Jar_entriesContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(JarsLibParser.NEWLINE, 0); }
		public Jar_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jar_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterJar_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitJar_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitJar_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jar_listContext jar_list() throws RecognitionException {
		Jar_listContext _localctx = new Jar_listContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_jar_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(JARS);
			setState(87);
			match(T__0);
			setState(88);
			match(T__3);
			setState(89);
			jar_entries();
			setState(90);
			match(T__4);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(91);
				match(T__5);
				}
			}

			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(94);
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
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterJar_entries(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitJar_entries(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitJar_entries(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jar_entriesContext jar_entries() throws RecognitionException {
		Jar_entriesContext _localctx = new Jar_entriesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_jar_entries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JAR || _la==SCALA_JAR) {
				{
				{
				setState(97);
				jar_entry();
				}
				}
				setState(102);
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
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterJar_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitJar_entry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitJar_entry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jar_entryContext jar_entry() throws RecognitionException {
		Jar_entryContext _localctx = new Jar_entryContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_jar_entry);
		try {
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				java_jar_entry();
				}
				break;
			case SCALA_JAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
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
		public TerminalNode JAR() { return getToken(JarsLibParser.JAR, 0); }
		public Jar_coordinatesContext jar_coordinates() {
			return getRuleContext(Jar_coordinatesContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(JarsLibParser.NEWLINE, 0); }
		public Java_jar_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_jar_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterJava_jar_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitJava_jar_entry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitJava_jar_entry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Java_jar_entryContext java_jar_entry() throws RecognitionException {
		Java_jar_entryContext _localctx = new Java_jar_entryContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_java_jar_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(JAR);
			setState(108);
			match(T__1);
			setState(109);
			jar_coordinates();
			setState(110);
			match(T__2);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(111);
				match(T__5);
				}
			}

			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(114);
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
		public TerminalNode SCALA_JAR() { return getToken(JarsLibParser.SCALA_JAR, 0); }
		public Jar_coordinatesContext jar_coordinates() {
			return getRuleContext(Jar_coordinatesContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(JarsLibParser.NEWLINE, 0); }
		public Scala_jar_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scala_jar_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterScala_jar_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitScala_jar_entry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitScala_jar_entry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scala_jar_entryContext scala_jar_entry() throws RecognitionException {
		Scala_jar_entryContext _localctx = new Scala_jar_entryContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_scala_jar_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(SCALA_JAR);
			setState(118);
			match(T__1);
			setState(119);
			jar_coordinates();
			setState(120);
			match(T__2);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(121);
				match(T__5);
				}
			}

			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(124);
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
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterJar_coordinates(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitJar_coordinates(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitJar_coordinates(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jar_coordinatesContext jar_coordinates() throws RecognitionException {
		Jar_coordinatesContext _localctx = new Jar_coordinatesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_jar_coordinates);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NAME) | (1L << ORG) | (1L << REV) | (1L << INTRANSITIVE) | (1L << EXCLUDES) | (1L << FORCE))) != 0)) {
				{
				{
				setState(127);
				jar_coordinate();
				}
				}
				setState(132);
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
		public Jar_coordinateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jar_coordinate; }
	 
		public Jar_coordinateContext() { }
		public void copyFrom(Jar_coordinateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GroupidContext extends Jar_coordinateContext {
		public TerminalNode ORG() { return getToken(JarsLibParser.ORG, 0); }
		public TerminalNode SINGLE_QUOTED_STRING() { return getToken(JarsLibParser.SINGLE_QUOTED_STRING, 0); }
		public GroupidContext(Jar_coordinateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterGroupid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitGroupid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitGroupid(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntransitiveContext extends Jar_coordinateContext {
		public TerminalNode INTRANSITIVE() { return getToken(JarsLibParser.INTRANSITIVE, 0); }
		public TerminalNode BOOL_VALUE() { return getToken(JarsLibParser.BOOL_VALUE, 0); }
		public IntransitiveContext(Jar_coordinateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterIntransitive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitIntransitive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitIntransitive(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArtifactidContext extends Jar_coordinateContext {
		public TerminalNode NAME() { return getToken(JarsLibParser.NAME, 0); }
		public TerminalNode SINGLE_QUOTED_STRING() { return getToken(JarsLibParser.SINGLE_QUOTED_STRING, 0); }
		public ArtifactidContext(Jar_coordinateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterArtifactid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitArtifactid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitArtifactid(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Exclude_jars_listContext extends Jar_coordinateContext {
		public Excludes_listContext excludes_list() {
			return getRuleContext(Excludes_listContext.class,0);
		}
		public Exclude_jars_listContext(Jar_coordinateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterExclude_jars_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitExclude_jars_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitExclude_jars_list(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForceableContext extends Jar_coordinateContext {
		public TerminalNode FORCE() { return getToken(JarsLibParser.FORCE, 0); }
		public TerminalNode BOOL_VALUE() { return getToken(JarsLibParser.BOOL_VALUE, 0); }
		public ForceableContext(Jar_coordinateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterForceable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitForceable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitForceable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VersionContext extends Jar_coordinateContext {
		public TerminalNode REV() { return getToken(JarsLibParser.REV, 0); }
		public TerminalNode SINGLE_QUOTED_STRING() { return getToken(JarsLibParser.SINGLE_QUOTED_STRING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JarsLibParser.IDENTIFIER, 0); }
		public VersionContext(Jar_coordinateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterVersion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitVersion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitVersion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jar_coordinateContext jar_coordinate() throws RecognitionException {
		Jar_coordinateContext _localctx = new Jar_coordinateContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_jar_coordinate);
		int _la;
		try {
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ORG:
				_localctx = new GroupidContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				match(ORG);
				setState(134);
				match(T__0);
				setState(135);
				match(SINGLE_QUOTED_STRING);
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(136);
					match(T__5);
					}
				}

				}
				break;
			case NAME:
				_localctx = new ArtifactidContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				match(NAME);
				setState(140);
				match(T__0);
				setState(141);
				match(SINGLE_QUOTED_STRING);
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(142);
					match(T__5);
					}
				}

				}
				break;
			case REV:
				_localctx = new VersionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
				match(REV);
				setState(146);
				match(T__0);
				setState(147);
				_la = _input.LA(1);
				if ( !(_la==SINGLE_QUOTED_STRING || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(148);
					match(T__5);
					}
				}

				}
				break;
			case INTRANSITIVE:
				_localctx = new IntransitiveContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(151);
				match(INTRANSITIVE);
				setState(152);
				match(T__0);
				setState(153);
				match(BOOL_VALUE);
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(154);
					match(T__5);
					}
				}

				}
				break;
			case FORCE:
				_localctx = new ForceableContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(157);
				match(FORCE);
				setState(158);
				match(T__0);
				setState(159);
				match(BOOL_VALUE);
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(160);
					match(T__5);
					}
				}

				}
				break;
			case EXCLUDES:
				_localctx = new Exclude_jars_listContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(163);
				excludes_list();
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(164);
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
		public TerminalNode EXCLUDES() { return getToken(JarsLibParser.EXCLUDES, 0); }
		public Exclude_entriesContext exclude_entries() {
			return getRuleContext(Exclude_entriesContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(JarsLibParser.NEWLINE, 0); }
		public Excludes_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_excludes_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterExcludes_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitExcludes_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitExcludes_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Excludes_listContext excludes_list() throws RecognitionException {
		Excludes_listContext _localctx = new Excludes_listContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_excludes_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(EXCLUDES);
			setState(170);
			match(T__0);
			setState(171);
			match(T__3);
			setState(172);
			exclude_entries();
			setState(173);
			match(T__4);
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(174);
				match(T__5);
				}
				break;
			}
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(177);
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
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterExclude_entries(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitExclude_entries(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitExclude_entries(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exclude_entriesContext exclude_entries() throws RecognitionException {
		Exclude_entriesContext _localctx = new Exclude_entriesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_exclude_entries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EXCLUDE) {
				{
				{
				setState(180);
				exclude_entry();
				}
				}
				setState(185);
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
		public TerminalNode EXCLUDE() { return getToken(JarsLibParser.EXCLUDE, 0); }
		public Exclude_coordinatesContext exclude_coordinates() {
			return getRuleContext(Exclude_coordinatesContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(JarsLibParser.NEWLINE, 0); }
		public Exclude_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclude_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterExclude_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitExclude_entry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitExclude_entry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exclude_entryContext exclude_entry() throws RecognitionException {
		Exclude_entryContext _localctx = new Exclude_entryContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_exclude_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(EXCLUDE);
			setState(187);
			match(T__1);
			setState(188);
			exclude_coordinates();
			setState(189);
			match(T__2);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(190);
				match(T__5);
				}
			}

			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(193);
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
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterExclude_coordinates(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitExclude_coordinates(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitExclude_coordinates(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exclude_coordinatesContext exclude_coordinates() throws RecognitionException {
		Exclude_coordinatesContext _localctx = new Exclude_coordinatesContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_exclude_coordinates);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NAME) | (1L << ORG) | (1L << REV))) != 0)) {
				{
				{
				setState(196);
				exclude_coordinate();
				}
				}
				setState(201);
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
		public Exclude_coordinateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclude_coordinate; }
	 
		public Exclude_coordinateContext() { }
		public void copyFrom(Exclude_coordinateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Exclude_groupidContext extends Exclude_coordinateContext {
		public TerminalNode ORG() { return getToken(JarsLibParser.ORG, 0); }
		public TerminalNode SINGLE_QUOTED_STRING() { return getToken(JarsLibParser.SINGLE_QUOTED_STRING, 0); }
		public Exclude_groupidContext(Exclude_coordinateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterExclude_groupid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitExclude_groupid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitExclude_groupid(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Exclude_artifactidContext extends Exclude_coordinateContext {
		public TerminalNode NAME() { return getToken(JarsLibParser.NAME, 0); }
		public TerminalNode SINGLE_QUOTED_STRING() { return getToken(JarsLibParser.SINGLE_QUOTED_STRING, 0); }
		public Exclude_artifactidContext(Exclude_coordinateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterExclude_artifactid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitExclude_artifactid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitExclude_artifactid(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Exclude_versionContext extends Exclude_coordinateContext {
		public TerminalNode REV() { return getToken(JarsLibParser.REV, 0); }
		public TerminalNode SINGLE_QUOTED_STRING() { return getToken(JarsLibParser.SINGLE_QUOTED_STRING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JarsLibParser.IDENTIFIER, 0); }
		public Exclude_versionContext(Exclude_coordinateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterExclude_version(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitExclude_version(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitExclude_version(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exclude_coordinateContext exclude_coordinate() throws RecognitionException {
		Exclude_coordinateContext _localctx = new Exclude_coordinateContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_exclude_coordinate);
		int _la;
		try {
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ORG:
				_localctx = new Exclude_groupidContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(ORG);
				setState(203);
				match(T__0);
				setState(204);
				match(SINGLE_QUOTED_STRING);
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(205);
					match(T__5);
					}
				}

				}
				break;
			case NAME:
				_localctx = new Exclude_artifactidContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				match(NAME);
				setState(209);
				match(T__0);
				setState(210);
				match(SINGLE_QUOTED_STRING);
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(211);
					match(T__5);
					}
				}

				}
				break;
			case REV:
				_localctx = new Exclude_versionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
				match(REV);
				setState(215);
				match(T__0);
				setState(216);
				_la = _input.LA(1);
				if ( !(_la==SINGLE_QUOTED_STRING || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(217);
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
		public TerminalNode NAME() { return getToken(JarsLibParser.NAME, 0); }
		public TerminalNode SINGLE_QUOTED_STRING() { return getToken(JarsLibParser.SINGLE_QUOTED_STRING, 0); }
		public Name_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterName_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitName_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitName_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Name_itemContext name_item() throws RecognitionException {
		Name_itemContext _localctx = new Name_itemContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_name_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(NAME);
			setState(223);
			match(T__0);
			setState(224);
			match(SINGLE_QUOTED_STRING);
			setState(225);
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
		public TerminalNode DEPENDENCIES() { return getToken(JarsLibParser.DEPENDENCIES, 0); }
		public Dependent_listContext dependent_list() {
			return getRuleContext(Dependent_listContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(JarsLibParser.NEWLINE, 0); }
		public Dependencies_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dependencies_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterDependencies_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitDependencies_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitDependencies_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dependencies_itemContext dependencies_item() throws RecognitionException {
		Dependencies_itemContext _localctx = new Dependencies_itemContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_dependencies_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(DEPENDENCIES);
			setState(228);
			match(T__0);
			setState(229);
			match(T__3);
			setState(230);
			dependent_list();
			setState(231);
			match(T__4);
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(232);
				match(T__5);
				}
			}

			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(235);
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
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterDependent_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitDependent_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitDependent_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dependent_listContext dependent_list() throws RecognitionException {
		Dependent_listContext _localctx = new Dependent_listContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_dependent_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SINGLE_QUOTED_STRING) {
				{
				{
				setState(238);
				dependent_entry();
				}
				}
				setState(243);
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
		public TerminalNode SINGLE_QUOTED_STRING() { return getToken(JarsLibParser.SINGLE_QUOTED_STRING, 0); }
		public TerminalNode NEWLINE() { return getToken(JarsLibParser.NEWLINE, 0); }
		public Dependent_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dependent_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterDependent_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitDependent_entry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitDependent_entry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dependent_entryContext dependent_entry() throws RecognitionException {
		Dependent_entryContext _localctx = new Dependent_entryContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_dependent_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(SINGLE_QUOTED_STRING);
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(245);
				match(T__5);
				}
			}

			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(248);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31\u00fe\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\3\3\3\5\3\65\n\3\7\3\67\n\3\f\3\16\3:\13\3\3\4\3\4\5\4>\n\4\3\5\3\5\3"+
		"\5\3\5\5\5D\n\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\5\7M\n\7\7\7O\n\7\f\7\16\7"+
		"R\13\7\3\b\3\b\3\b\5\bW\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t_\n\t\3\t\5\tb"+
		"\n\t\3\n\7\ne\n\n\f\n\16\nh\13\n\3\13\3\13\5\13l\n\13\3\f\3\f\3\f\3\f"+
		"\3\f\5\fs\n\f\3\f\5\fv\n\f\3\r\3\r\3\r\3\r\3\r\5\r}\n\r\3\r\5\r\u0080"+
		"\n\r\3\16\7\16\u0083\n\16\f\16\16\16\u0086\13\16\3\17\3\17\3\17\3\17\5"+
		"\17\u008c\n\17\3\17\3\17\3\17\3\17\5\17\u0092\n\17\3\17\3\17\3\17\3\17"+
		"\5\17\u0098\n\17\3\17\3\17\3\17\3\17\5\17\u009e\n\17\3\17\3\17\3\17\3"+
		"\17\5\17\u00a4\n\17\3\17\3\17\5\17\u00a8\n\17\5\17\u00aa\n\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u00b2\n\20\3\20\5\20\u00b5\n\20\3\21\7\21\u00b8"+
		"\n\21\f\21\16\21\u00bb\13\21\3\22\3\22\3\22\3\22\3\22\5\22\u00c2\n\22"+
		"\3\22\5\22\u00c5\n\22\3\23\7\23\u00c8\n\23\f\23\16\23\u00cb\13\23\3\24"+
		"\3\24\3\24\3\24\5\24\u00d1\n\24\3\24\3\24\3\24\3\24\5\24\u00d7\n\24\3"+
		"\24\3\24\3\24\3\24\5\24\u00dd\n\24\5\24\u00df\n\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00ec\n\26\3\26\5\26\u00ef\n"+
		"\26\3\27\7\27\u00f2\n\27\f\27\16\27\u00f5\13\27\3\30\3\30\5\30\u00f9\n"+
		"\30\3\30\5\30\u00fc\n\30\3\30\2\2\31\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\2\3\4\2\26\26\30\30\2\u0112\2\60\3\2\2\2\48\3\2\2\2\6"+
		"=\3\2\2\2\b?\3\2\2\2\nE\3\2\2\2\fP\3\2\2\2\16V\3\2\2\2\20X\3\2\2\2\22"+
		"f\3\2\2\2\24k\3\2\2\2\26m\3\2\2\2\30w\3\2\2\2\32\u0084\3\2\2\2\34\u00a9"+
		"\3\2\2\2\36\u00ab\3\2\2\2 \u00b9\3\2\2\2\"\u00bc\3\2\2\2$\u00c9\3\2\2"+
		"\2&\u00de\3\2\2\2(\u00e0\3\2\2\2*\u00e5\3\2\2\2,\u00f3\3\2\2\2.\u00f6"+
		"\3\2\2\2\60\61\5\4\3\2\61\3\3\2\2\2\62\64\5\6\4\2\63\65\7\27\2\2\64\63"+
		"\3\2\2\2\64\65\3\2\2\2\65\67\3\2\2\2\66\62\3\2\2\2\67:\3\2\2\28\66\3\2"+
		"\2\289\3\2\2\29\5\3\2\2\2:8\3\2\2\2;>\5\b\5\2<>\5\n\6\2=;\3\2\2\2=<\3"+
		"\2\2\2>\7\3\2\2\2?@\7\30\2\2@A\7\3\2\2AC\7\26\2\2BD\7\27\2\2CB\3\2\2\2"+
		"CD\3\2\2\2D\t\3\2\2\2EF\7\t\2\2FG\7\4\2\2GH\5\f\7\2HI\7\5\2\2I\13\3\2"+
		"\2\2JL\5\16\b\2KM\7\27\2\2LK\3\2\2\2LM\3\2\2\2MO\3\2\2\2NJ\3\2\2\2OR\3"+
		"\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\r\3\2\2\2RP\3\2\2\2SW\5(\25\2TW\5*\26\2UW"+
		"\5\20\t\2VS\3\2\2\2VT\3\2\2\2VU\3\2\2\2W\17\3\2\2\2XY\7\n\2\2YZ\7\3\2"+
		"\2Z[\7\6\2\2[\\\5\22\n\2\\^\7\7\2\2]_\7\b\2\2^]\3\2\2\2^_\3\2\2\2_a\3"+
		"\2\2\2`b\7\27\2\2a`\3\2\2\2ab\3\2\2\2b\21\3\2\2\2ce\5\24\13\2dc\3\2\2"+
		"\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2g\23\3\2\2\2hf\3\2\2\2il\5\26\f\2jl\5"+
		"\30\r\2ki\3\2\2\2kj\3\2\2\2l\25\3\2\2\2mn\7\13\2\2no\7\4\2\2op\5\32\16"+
		"\2pr\7\5\2\2qs\7\b\2\2rq\3\2\2\2rs\3\2\2\2su\3\2\2\2tv\7\27\2\2ut\3\2"+
		"\2\2uv\3\2\2\2v\27\3\2\2\2wx\7\f\2\2xy\7\4\2\2yz\5\32\16\2z|\7\5\2\2{"+
		"}\7\b\2\2|{\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~\u0080\7\27\2\2\177~\3\2\2"+
		"\2\177\u0080\3\2\2\2\u0080\31\3\2\2\2\u0081\u0083\5\34\17\2\u0082\u0081"+
		"\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\33\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088\7\16\2\2\u0088\u0089\7\3\2"+
		"\2\u0089\u008b\7\26\2\2\u008a\u008c\7\b\2\2\u008b\u008a\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u00aa\3\2\2\2\u008d\u008e\7\r\2\2\u008e\u008f\7\3"+
		"\2\2\u008f\u0091\7\26\2\2\u0090\u0092\7\b\2\2\u0091\u0090\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u00aa\3\2\2\2\u0093\u0094\7\17\2\2\u0094\u0095\7"+
		"\3\2\2\u0095\u0097\t\2\2\2\u0096\u0098\7\b\2\2\u0097\u0096\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\u00aa\3\2\2\2\u0099\u009a\7\20\2\2\u009a\u009b\7"+
		"\3\2\2\u009b\u009d\7\25\2\2\u009c\u009e\7\b\2\2\u009d\u009c\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u00aa\3\2\2\2\u009f\u00a0\7\23\2\2\u00a0\u00a1\7"+
		"\3\2\2\u00a1\u00a3\7\25\2\2\u00a2\u00a4\7\b\2\2\u00a3\u00a2\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\u00aa\3\2\2\2\u00a5\u00a7\5\36\20\2\u00a6\u00a8\7"+
		"\b\2\2\u00a7\u00a6\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9"+
		"\u0087\3\2\2\2\u00a9\u008d\3\2\2\2\u00a9\u0093\3\2\2\2\u00a9\u0099\3\2"+
		"\2\2\u00a9\u009f\3\2\2\2\u00a9\u00a5\3\2\2\2\u00aa\35\3\2\2\2\u00ab\u00ac"+
		"\7\21\2\2\u00ac\u00ad\7\3\2\2\u00ad\u00ae\7\6\2\2\u00ae\u00af\5 \21\2"+
		"\u00af\u00b1\7\7\2\2\u00b0\u00b2\7\b\2\2\u00b1\u00b0\3\2\2\2\u00b1\u00b2"+
		"\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b5\7\27\2\2\u00b4\u00b3\3\2\2\2"+
		"\u00b4\u00b5\3\2\2\2\u00b5\37\3\2\2\2\u00b6\u00b8\5\"\22\2\u00b7\u00b6"+
		"\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba"+
		"!\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd\7\22\2\2\u00bd\u00be\7\4\2\2"+
		"\u00be\u00bf\5$\23\2\u00bf\u00c1\7\5\2\2\u00c0\u00c2\7\b\2\2\u00c1\u00c0"+
		"\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00c5\7\27\2\2"+
		"\u00c4\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5#\3\2\2\2\u00c6\u00c8\5"+
		"&\24\2\u00c7\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca%\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\7\16\2\2"+
		"\u00cd\u00ce\7\3\2\2\u00ce\u00d0\7\26\2\2\u00cf\u00d1\7\b\2\2\u00d0\u00cf"+
		"\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00df\3\2\2\2\u00d2\u00d3\7\r\2\2\u00d3"+
		"\u00d4\7\3\2\2\u00d4\u00d6\7\26\2\2\u00d5\u00d7\7\b\2\2\u00d6\u00d5\3"+
		"\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00df\3\2\2\2\u00d8\u00d9\7\17\2\2\u00d9"+
		"\u00da\7\3\2\2\u00da\u00dc\t\2\2\2\u00db\u00dd\7\b\2\2\u00dc\u00db\3\2"+
		"\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\3\2\2\2\u00de\u00cc\3\2\2\2\u00de"+
		"\u00d2\3\2\2\2\u00de\u00d8\3\2\2\2\u00df\'\3\2\2\2\u00e0\u00e1\7\r\2\2"+
		"\u00e1\u00e2\7\3\2\2\u00e2\u00e3\7\26\2\2\u00e3\u00e4\7\b\2\2\u00e4)\3"+
		"\2\2\2\u00e5\u00e6\7\24\2\2\u00e6\u00e7\7\3\2\2\u00e7\u00e8\7\6\2\2\u00e8"+
		"\u00e9\5,\27\2\u00e9\u00eb\7\7\2\2\u00ea\u00ec\7\b\2\2\u00eb\u00ea\3\2"+
		"\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00ef\7\27\2\2\u00ee"+
		"\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef+\3\2\2\2\u00f0\u00f2\5.\30\2"+
		"\u00f1\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4"+
		"\3\2\2\2\u00f4-\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f8\7\26\2\2\u00f7"+
		"\u00f9\7\b\2\2\u00f8\u00f7\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\3\2"+
		"\2\2\u00fa\u00fc\7\27\2\2\u00fb\u00fa\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc"+
		"/\3\2\2\2(\648=CLPV^afkru|\177\u0084\u008b\u0091\u0097\u009d\u00a3\u00a7"+
		"\u00a9\u00b1\u00b4\u00b9\u00c1\u00c4\u00c9\u00d0\u00d6\u00dc\u00de\u00eb"+
		"\u00ee\u00f3\u00f8\u00fb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}