package com.weixin.tpdsl.semantics.promote;

/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
 ***/

import org.antlr.runtime.ANTLRFileStream;
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
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.runtime.tree.TreeAdaptor;
import org.antlr.runtime.tree.TreeVisitor;
import org.antlr.runtime.tree.TreeVisitorAction;

public class PromotionTest {

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

  public static void main(String[] args) throws Exception {
    CharStream input = null;
      if (args.length > 0) {
          input = new ANTLRFileStream(args[0]);
      } else {
          input = new ANTLRInputStream(System.in);
      }
    CymbolLexer lex = new CymbolLexer(input);
    final TokenRewriteStream tokens = new TokenRewriteStream(lex);
    CymbolParser p = new CymbolParser(tokens);
    p.setTreeAdaptor(CymbolAdaptor);
    // launch parser
    RuleReturnScope r = p.compilationUnit();
    // get tree result
    CommonTree t = (CommonTree) r.getTree();
    //System.out.println("tree: "+t.toStringTree());
//    DOTTreeGenerator dot = new DOTTreeGenerator();
//    System.out.println(dot.toDOT(t));


    //  CREATE TREE NODE STREAM FOR TREE PARSERS
    CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
    // where to find tokens
    nodes.setTokenStream(tokens);
    // create CymbolAST nodes
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
        showTypesAndPromotions((CymbolAST) t, tokens);
        return t;
      }
    };
    // walk in postorder, showing types
    v.visit(t, actions);

    TreeVisitorAction actions2 = new TreeVisitorAction() {
      @Override
      public Object pre(Object t) {
        return t;
      }

      @Override
      public Object post(Object t) {
        CymbolAST u = (CymbolAST) t;
          if (u.promoteToType != null) {
              insertCast(u, tokens);
          }
        return t;
      }
    };
    v.visit(t, actions2);

    System.out.println(tokens);
  }

  static void showTypesAndPromotions(CymbolAST t, TokenRewriteStream tokens) {
    if (t.evalType != null && t.getType() != CymbolParser.EXPR) {
      System.out.printf("%-17s",
          tokens.toString(t.getTokenStartIndex(),
              t.getTokenStopIndex()));
      String ts = t.evalType.toString();
      System.out.printf(" type %-8s", ts);
      if (t.promoteToType != null) {
        System.out.print(" promoted to " + t.promoteToType);
      }
      System.out.println();
    }
  }

  /**
   * Insert a cast before tokens from which this node was created.
   */
  static void insertCast(CymbolAST t, TokenRewriteStream tokens) {
    String cast = "(" + t.promoteToType + ")";
    // location in token buffer
    int left = t.getTokenStartIndex();
    int right = t.getTokenStopIndex();
    // tok is node's token payload
    Token tok = t.token;
    if (tok.getType() == CymbolParser.EXPR) {
      tok = ((CymbolAST) t.getChild(0)).token;
    }
    if (left == right ||
        tok.getType() == CymbolParser.INDEX ||
        // it's a single atom or a[i] or f(); don't use (...)
        tok.getType() == CymbolParser.CALL) {
      tokens.insertBefore(left, cast);
    } else { // need parens
      String original = tokens.toString(left, right);
      tokens.replace(left, right, cast + "(" + original + ")");
    }
  }
}
