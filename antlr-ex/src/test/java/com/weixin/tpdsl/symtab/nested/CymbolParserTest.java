package com.weixin.tpdsl.symtab.nested;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RuleReturnScope;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CymbolParserTest {

  @BeforeEach
  void setUp() {
  }

  @AfterEach
  void tearDown() {
  }

  @Test
  public void testNestedSymtab() throws IOException, RecognitionException {
    CymbolLexer lexer = new CymbolLexer(new ANTLRFileStream(
        "/Users/xinwei/Documents/weixin/study-antlr/antlr-ex/src/main/java/com/weixin/tpdsl/symtab/nested/t.cymbol"));
    CommonTokenStream tokenStream = new CommonTokenStream(lexer);
    CymbolParser parser = new CymbolParser(tokenStream);
    // launch parser
    RuleReturnScope r = parser.compilationUnit();

    CommonTree t = (CommonTree) r.getTree(); // get tree result from parser
    System.out.println("tree: "+t.toStringTree());

    // get tree result from parser
    CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
    nodes.setTokenStream(tokenStream);
    // make global scope, types
    SymbolTable symtab = new SymbolTable();
    // use custom constructor
    DefRef def = new DefRef(nodes, symtab);
    // trigger symtab actions upon certain subtrees
    def.downup(t);
    System.out.println("globals: " + symtab.globals);
    assertEquals("[int, float, void, i, f, g]", symtab.globals.toString());
  }

  @Test
  public void testNestedSymtab2() throws IOException, RecognitionException {
    CymbolLexer lexer = new CymbolLexer(new ANTLRFileStream(
        "/Users/xinwei/Documents/weixin/study-antlr/antlr-ex/src/main/java/com/weixin/tpdsl/symtab/nested/t2.cymbol"));
    CommonTokenStream tokenStream = new CommonTokenStream(lexer);
    CymbolParser parser = new CymbolParser(tokenStream);
    // launch parser
    RuleReturnScope r = parser.compilationUnit();

    CommonTree t = (CommonTree) r.getTree(); // get tree result from parser
    System.out.println("tree: "+t.toStringTree());

    // get tree result from parser
    CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
    nodes.setTokenStream(tokenStream);
    // make global scope, types
    SymbolTable symtab = new SymbolTable();
    // use custom constructor
    DefRef def = new DefRef(nodes, symtab);
    // trigger symtab actions upon certain subtrees
    def.downup(t);
    System.out.println("globals: " + symtab.globals);
    assertEquals("[int, float, void, f]", symtab.globals.toString());
  }
}