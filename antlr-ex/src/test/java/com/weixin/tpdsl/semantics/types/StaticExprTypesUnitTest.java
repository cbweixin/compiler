package com.weixin.tpdsl.semantics.types;

import java.io.IOException;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RuleReturnScope;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenRewriteStream;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.TreeAdaptor;
import org.antlr.runtime.tree.TreeVisitor;
import org.antlr.runtime.tree.TreeVisitorAction;
import org.junit.jupiter.api.Test;

class StaticExprTypesUnitTest {

  /**
   * An adaptor that tells ANTLR to build CymbolAST nodes
   */
  public static TreeAdaptor CymbolAdaptor = new CommonTreeAdaptor() {
    @Override
    public Object create(Token token) {
      return new CymbolAST(token);
    }

    @Override
    public Object dupNode(Object t) {
      if (t == null) {
        return null;
      }
      return create(((CymbolAST) t).token);
    }

    @Override
    public Object errorNode(TokenStream input,
        Token start,
        Token stop,
        RecognitionException e) {
      return new CymbolErrorNode(input, start, stop, e);
    }
  };


  @Test
  public void testStaticsExprTypes() throws RecognitionException, IOException {
    CharStream input = new ANTLRInputStream(
        this.getClass().getClassLoader().getResourceAsStream("t.cymbol"));
    // CREATE PARSER AND BUILD AST
    CymbolLexer lex = new CymbolLexer(input);
    final TokenRewriteStream tokens = new TokenRewriteStream(lex);
    CymbolParser p = new CymbolParser(tokens);
    // create CymbolAST nodes
    p.setTreeAdaptor(CymbolAdaptor);
    // launch parser
    RuleReturnScope r = p.compilationUnit();
    // get tree result
    CommonTree t = (CommonTree) r.getTree();

    // CREATE TREE NODE STREAM FOR TREE PARSERS
    CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
    // where to find tokens
    nodes.setTokenStream(tokens);
    nodes.setTreeAdaptor(CymbolAdaptor);
    SymbolTable symtab = new SymbolTable();
    // DEFINE SYMBOLS
    // pass symtab to walker
    Def def = new Def(nodes, symtab);
    // trigger define actions upon certain subtrees
    def.downup(t);
    // RESOLVE SYMBOLS, COMPUTE EXPRESSION TYPES
    nodes.reset();
    Types typeComp = new Types(nodes, symtab);
    // trigger resolve/type computation actions
    typeComp.downup(t);

    // WALK TREE TO DUMP SUBTREE TYPES
    TreeVisitor v = new TreeVisitor(new CommonTreeAdaptor());
    TreeVisitorAction actions = new TreeVisitorAction() {
      @Override
      public Object pre(Object t) {
        return t;
      }

      @Override
      public Object post(Object t) {
        showTypes((CymbolAST) t, tokens);
        return t;
      }
    };
    // walk in postorder, showing types
    v.visit(t, actions);

    //System.out.println("tree: "+t.toStringTree());
  }

  static void showTypes(CymbolAST t, TokenRewriteStream tokens) {
    if (t.evalType != null && t.getType() != CymbolParser.EXPR) {
      System.out.printf("%-17s",
          tokens.toString(t.getTokenStartIndex(),
              t.getTokenStopIndex()));
      String ts = t.evalType.toString();
      System.out.printf(" type %-8s\n", ts);
    }
  }

}



