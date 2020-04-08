package com.weixin.tpdsl.symtab.nested;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RuleReturnScope;
import org.antlr.runtime.tree.CommonTree;
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

  }
}