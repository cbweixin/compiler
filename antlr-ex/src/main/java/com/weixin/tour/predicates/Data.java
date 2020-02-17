package com.weixin.tour.predicates;

import com.weixin.tour.predicates.gen.DataLexer;
import com.weixin.tour.predicates.gen.DataParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Data {

  public static void main(String[] args) {
    DataLexer lexer = new DataLexer(CharStreams.fromString("2 9 10 3 1 2 3"));
    DataParser parser = new DataParser(new CommonTokenStream(lexer));
    ParseTree tree = parser.file();
    System.out.println(tree.toStringTree(parser));

  }

}
