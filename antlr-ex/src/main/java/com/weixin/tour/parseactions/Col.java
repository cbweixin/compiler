package com.weixin.tour.parseactions;

import com.weixin.tour.parseactions.gen.RowsLexer;
import com.weixin.tour.parseactions.gen.RowsParser;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.RowSorter;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Col {

  public static void main(String[] args) throws IOException {
    String inputFile = null;
    if (args.length > 0) {
      inputFile = args[0];
    }
    InputStream is = System.in;
    if (inputFile != null) {
      is = new FileInputStream(inputFile);
    }

    RowsLexer lexer = new RowsLexer(CharStreams.fromStream(is));
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    int col = Integer.valueOf(args[1]);
    RowsParser parser = new RowsParser(tokens, col);
    parser.setBuildParseTree(false);
    parser.file();
  }
}
