package com.weixin.arrayint;

import com.weixin.arrayint.gen.ArrayInitLexer;
import com.weixin.arrayint.gen.ArrayInitParser;
import com.weixin.arrayint.gen.ArrayInitParser.ValueContext;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class App {

  public static void main(String[] args) {
    ArrayInitLexer lexer = new ArrayInitLexer(CharStreams.fromString("{1,2,3}"));
    ArrayInitParser parser = new ArrayInitParser(new CommonTokenStream(lexer));
    ArrayInitParser.InitContext parsed = parser.init();

    for(ValueContext v : parsed.value()){
      System.out.printf("value : %s\n", v.getText());
    }

  }

}
