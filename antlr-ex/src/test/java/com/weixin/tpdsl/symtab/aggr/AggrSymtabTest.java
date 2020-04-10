package com.weixin.tpdsl.symtab.aggr;

import java.io.IOException;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RuleReturnScope;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AggrSymtabTest {

  @BeforeEach
  void setUp() {
  }

  @AfterEach
  void tearDown() {
  }

  @Test
  public void testSymTab1() throws IOException, RecognitionException {

    CymbolLexer lex = new CymbolLexer(new ANTLRFileStream(
        "/Users/xinwei/Documents/weixin/study-antlr/antlr-ex/src/main/java/com/weixin/tpdsl/symtab/aggr/t.cymbol"));
    CommonTokenStream tokens = new CommonTokenStream(lex);
    CymbolParser p = new CymbolParser(tokens);
    // launch parser
    RuleReturnScope r = p.compilationUnit();
    // get tree result
    CommonTree t = (CommonTree) r.getTree();
    System.out.println("tree: "+t.toStringTree());
    DOTTreeGenerator dot = new DOTTreeGenerator();
    System.out.println(dot.toDOT(t));

    CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
    nodes.setTokenStream(tokens);
    SymbolTable symtab = new SymbolTable();
    // use custom constructor
    DefRef def = new DefRef(nodes, symtab);
    // trigger symtab actions upon certain subtrees
    def.downup(t);
    System.out.println("globals: " + symtab.globals);
  }

}