package com.weixin.pants.javalib;

import static com.weixin.pants.utils.Utils.stg;

import com.weixin.pants.datastore.DependenciesMap;
import com.weixin.pants.javalib.gen.PANTSLexer;
import com.weixin.pants.javalib.gen.PANTSParser;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.stream.Collectors;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.stringtemplate.v4.ST;

public class PomGenerator {
  public static String libName = "";
  public void process(InputStream is) throws IOException {
    PANTSLexer lex = new PANTSLexer(CharStreams.fromStream(is));
    CommonTokenStream tokens = new CommonTokenStream(lex);
    PANTSParser parser = new PANTSParser(tokens);
    ParseTree tree = parser.pants();

    ParseTreeWalker walker = new ParseTreeWalker();
    JavaLibEmitter emitter = new JavaLibEmitter();
    walker.walk(emitter,tree);
    libName = emitter.libName;
  }

  public static void main(String[] args) throws IOException {
    String inputFile = null;
    if (args.length > 0) {
      inputFile = args[0];
    }
    InputStream is = System.in;
    if (inputFile != null) {
      is = new FileInputStream(inputFile);
    }

    PomGenerator generator = new PomGenerator();
    generator.process(is);
//    System.out.println(libName);
    String deps = DependenciesMap.INSTANCE.getDependency(libName);
//    System.out.println(deps);
    String currentDirectory = System.getProperty("user.dir");
//    System.out.println("The current working directory is " + currentDirectory);
    String groupId = Arrays.stream(currentDirectory.split("/")).collect(Collectors.joining("."));
    ST st = stg.getInstanceOf("pomTemplate");
    st.add("arId", libName);
    st.add("groupId",groupId);
    st.add("depends",deps);
    System.out.println(st.render());
  }


}
