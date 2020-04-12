package com.weixin.tpdsl.symtab.classex;

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
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RuleReturnScope;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.runtime.tree.TreeAdaptor;

public class ClassTest {

  /**
   * An adaptor that tells ANTLR to build CymbolAST nodes
   */
  public static TreeAdaptor cymbalAdaptor = new CommonTreeAdaptor() {
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
    public Object errorNode(TokenStream input, Token start, Token stop,
        RecognitionException e) {
      CymbolErrorNode t = new CymbolErrorNode(input, start, stop, e);
      //System.out.println("returning error node '"+t+"' @index="+input.index());
      return t;
    }
  };

  public static void main(String[] args) throws Exception {
    CharStream input = null;
    if (args.length > 0) {
      input = new ANTLRFileStream(args[0]);
    } else {
      input = new ANTLRInputStream(System.in);
    }
    // Create lexer/parser to build trees from stdin
    CymbolLexer lex = new CymbolLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lex);
    CymbolParser p = new CymbolParser(tokens);
    p.setTreeAdaptor(cymbalAdaptor);
    // launch parser by calling start rule
    RuleReturnScope r = p.compilationUnit();
    // get tree result
    CommonTree t = (CommonTree) r.getTree();
    System.out.println("tree: "+t.toStringTree());
    DOTTreeGenerator dot = new DOTTreeGenerator();
    System.out.println(dot.toDOT(t));

    CommonTreeNodeStream nodes = new CommonTreeNodeStream(cymbalAdaptor, t);
    nodes.setTokenStream(tokens);
    // init symbol table
    SymbolTable symtab = new SymbolTable();
    // create Def phase
    Def def = new Def(nodes, symtab);
    // Do pass 1
    def.downup(t);
    System.out.println("globals: " + symtab.globals);
    // rewind AST node stream to root
    nodes.reset();
    System.out.println("start ref phase...");
    // create Ref phase
    Ref ref = new Ref(nodes);
    // Do pass 2
    ref.downup(t);
  }
}
