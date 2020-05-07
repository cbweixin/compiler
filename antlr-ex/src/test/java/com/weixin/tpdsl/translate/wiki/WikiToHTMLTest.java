package com.weixin.tpdsl.translate.wiki;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.Token;
import org.junit.jupiter.api.Test;

class WikiToHTMLTest {


  static void header(PrintStream out) {
    out.println(
        "<HTML>\n" +
            "<HEAD>\n" +
            "<meta http-equiv=content-type content=\"text/html; charset=utf-8\"/>\n" +
            "<link rel=stylesheet href=http://www.cs.usfca.edu/~parrt/lecture-wiki.css " +
            "type=\"text/css\"/>\n" +
            "</HEAD>\n" +
            "<BODY>\n");
  }

  static void trailer(PrintStream out) {
    out.println("</BODY>");
    out.println("</HTML>");
  }

  @Test
  public void testWikiToHtml() throws IOException {
    PrintStream out = System.out;
    InputStream in = getClass().getClassLoader().getResourceAsStream("t.wiki");
    header(out);
    Wiki lex = new Wiki(new ANTLRInputStream(in), out);
    try {
      Token t = lex.nextToken();
      while (t.getType() != Token.EOF) {
        t = lex.nextToken();
      }
    } finally {
      in.close();
    }
    trailer(out);

  }

  @Test
  public void testWikiToHtml2() throws IOException {
    PrintStream out = System.out;
    InputStream in = getClass().getClassLoader().getResourceAsStream("t2.wiki");
    header(out);
    Wiki lex = new Wiki(new ANTLRInputStream(in), out);
    try {
      Token t = lex.nextToken();
      while (t.getType() != Token.EOF) {
        t = lex.nextToken();
      }
    } finally {
      in.close();
    }
    trailer(out);

  }

}