package com.weixin.tpdsl.symtab.classex;

import java.io.IOException;
import org.antlr.runtime.ANTLRFileStream;
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
import org.junit.jupiter.api.Test;

class ClassAndForwardReferenceTest {

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


  @Test
  public void testABCymoble() throws IOException, RecognitionException {
    // Create lexer/parser to build trees from stdin
    CymbolLexer lex = new CymbolLexer(new ANTLRFileStream(
        "/Users/xinwei/Documents/weixin/study-antlr/antlr-ex/src/main/java/com/weixin/tpdsl/symtab/classex/AB.cymbol"));
    CommonTokenStream tokens = new CommonTokenStream(lex);
    CymbolParser p = new CymbolParser(tokens);
    p.setTreeAdaptor(cymbalAdaptor);
    // launch parser by calling start rule
    RuleReturnScope r = p.compilationUnit();
    // get tree result
    CommonTree t = (CommonTree) r.getTree();
    System.out.println("tree: " + t.toStringTree());
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

  @Test
  public void testForwardSymbol() throws IOException, RecognitionException {
    // Create lexer/parser to build trees from stdin
    CymbolLexer lex = new CymbolLexer(new ANTLRFileStream(
        "/Users/xinwei/Documents/weixin/study-antlr/antlr-ex/src/main/java/com/weixin/tpdsl/symtab/classex/forward.cymbol"));
    CommonTokenStream tokens = new CommonTokenStream(lex);
    CymbolParser p = new CymbolParser(tokens);
    p.setTreeAdaptor(cymbalAdaptor);
    // launch parser by calling start rule
    RuleReturnScope r = p.compilationUnit();
    // get tree result
    CommonTree t = (CommonTree) r.getTree();
    System.out.println("tree: " + t.toStringTree());
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

  @Test
  public void testForwardSymbol2() throws IOException, RecognitionException {
    // Create lexer/parser to build trees from stdin
    CymbolLexer lex = new CymbolLexer(new ANTLRFileStream(
        "/Users/xinwei/Documents/weixin/study-antlr/antlr-ex/src/main/java/com/weixin/tpdsl/symtab/classex/forward2.cymbol"));
    CommonTokenStream tokens = new CommonTokenStream(lex);
    CymbolParser p = new CymbolParser(tokens);
    p.setTreeAdaptor(cymbalAdaptor);
    // launch parser by calling start rule
    RuleReturnScope r = p.compilationUnit();
    // get tree result
    CommonTree t = (CommonTree) r.getTree();
    System.out.println("tree: " + t.toStringTree());
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

  @Test
  public void testGlobalForwardSymbol() throws IOException, RecognitionException {
    // Create lexer/parser to build trees from stdin
    CymbolLexer lex = new CymbolLexer(new ANTLRFileStream(
        "/Users/xinwei/Documents/weixin/study-antlr/antlr-ex/src/main/java/com/weixin/tpdsl/symtab/classex/global-forward.cymbol"));
    CommonTokenStream tokens = new CommonTokenStream(lex);
    CymbolParser p = new CymbolParser(tokens);
    p.setTreeAdaptor(cymbalAdaptor);
    // launch parser by calling start rule
    RuleReturnScope r = p.compilationUnit();
    // get tree result
    CommonTree t = (CommonTree) r.getTree();
    System.out.println("tree: " + t.toStringTree());
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