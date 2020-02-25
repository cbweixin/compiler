package com.weixin.pants.jarslib;

import com.weixin.pants.jarslib.gen.JarsLibBaseListener;
import com.weixin.pants.jarslib.gen.JarsLibParser;

public class JarDependentEmitter extends JarsLibBaseListener {
  @Override public void exitJar_coordinates(JarsLibParser.Jar_coordinatesContext ctx) {
    System.out.println();
  }

  @Override public void exitGroupid(JarsLibParser.GroupidContext ctx) {
    System.out.println(stripSingleQuotes(ctx.SINGLE_QUOTED_STRING().getText()));
  }

  @Override public void exitArtifactid(JarsLibParser.ArtifactidContext ctx) {
    System.out.println(stripSingleQuotes(ctx.SINGLE_QUOTED_STRING().getText()));
  }

  @Override public void exitVersion(JarsLibParser.VersionContext ctx) {
    System.out.println(stripSingleQuotes(ctx.SINGLE_QUOTED_STRING().getText()));

  }

  public String stripSingleQuotes(String s) {
    if (s == null || s.charAt(0) != '\'') {
      return s;
    }
    return s.substring(1, s.length() - 1);
  }
}
