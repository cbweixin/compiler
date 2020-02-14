package com.weixin;

import com.weixin.gen.DatesLexer;
import com.weixin.gen.DatesParser;
import com.weixin.gen.DatesParser.DateContext;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 * Hello world!
 */
public class App {

  public static void main(String[] args) {
    DatesLexer lexer = new DatesLexer(CharStreams.fromString("01.01. - 02.02./03.03."));
    DatesParser parser = new DatesParser(new CommonTokenStream(lexer));
    DatesParser.RContext parsed = parser.r();
    for (DatesParser.ElementContext e : parsed.element()) {
      if (e.daterange() != null) {
        for (DateContext d : e.daterange().date()) {
          System.out.format("month : %s, day : %s\n", d.month().getText(), d.day().getText());
        }
      } else {
        System.out.format("month : %s, day : %s\n ", e.singledate().date().month().getText(),
            e.singledate().date().day().getText());
      }
    }
  }
}
