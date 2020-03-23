package com.weixin.tpdsl.parsing.nestedlist;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ListLexerTest {

  @Test
  @DisplayName("next token test")
  void nextToken() {
    String input = "[a, b ]";
    ListLexer lexer = new ListLexer(input);

    List<Token> expectedResult = new ArrayList<Token>();
    expectedResult.add(new Token(ListLexer.LBRACK, "["));
    expectedResult.add(new Token(ListLexer.NAME, "a"));
    expectedResult.add(new Token(ListLexer.COMMA, ","));
    expectedResult.add(new Token(ListLexer.NAME, "b"));
    expectedResult.add(new Token(ListLexer.RBRACK, "]"));

    List<Token> actualResult = new ArrayList<Token>();

    Token t = lexer.nextToken();
    while (t.type != Lexer.EOF_TYPE) {
      actualResult.add(t);
      t = lexer.nextToken();
    }

    assertEquals(expectedResult.size(), actualResult.size());
    assertArrayEquals(expectedResult.stream().map(s -> s.toString()).toArray(),
        actualResult.stream().map(s -> s.toString()).toArray());
  }

  @Test
  @Disabled
  void getTokenName() {
  }
}