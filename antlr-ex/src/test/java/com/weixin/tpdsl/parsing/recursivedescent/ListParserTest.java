package com.weixin.tpdsl.parsing.recursivedescent;

import static org.junit.jupiter.api.Assertions.*;

import com.weixin.tpdsl.parsing.nestedlist.ListLexer;
import org.junit.jupiter.api.Test;

class ListParserTest {

  @Test
  void TestList() {
    ListLexer lexer = new ListLexer("[a,b]");
    ListParser parser = new ListParser(lexer);

    parser.list();

  }

  @Test
  void TestList2() {
    ListLexer lexer = new ListLexer("[a,b,[c,d]]");
    ListParser parser = new ListParser(lexer);

    parser.list();

  }

  @Test
  void testFail() {
    ListLexer lexer = new ListLexer("[a,]");
    ListParser parser = new ListParser(lexer);

    assertThrows(java.lang.Error.class, () -> {
      parser.list();
    });

  }
}