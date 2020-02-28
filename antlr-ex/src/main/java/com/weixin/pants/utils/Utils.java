package com.weixin.pants.utils;

import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

public class Utils {
  public static String basePath = "/Users/xinwei/Documents/tinder/github/palo";
  public static STGroup stg = new STGroupFile(
      "/Users/xinwei/Documents/weixin/study-antlr/antlr-ex/src/main/java/com/weixin/pants/pom.stg");

  public static StringBuilder removeLastNewLine(StringBuilder sb) {
    int l = sb.length();
    sb.deleteCharAt(l - 1);
    return sb;
  }


  public static String stripSingleQuotes(String s) {
    if (s == null || s.charAt(0) != '\'') {
      return s;
    }
    return s.substring(1, s.length() - 1);
  }

}
