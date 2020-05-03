package com.weixin.tpdsl.translate.make;

/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
 ***/

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class MakeSupport {

  Map<String, Target> targets = new HashMap<String, Target>();

  public int build(String target) throws Exception {
    // System.out.println("target="+target);
    Target t = targets.get(target);
    if (t == null) {
      // nothing to do; no target
      return 0;
    }
    File targetFile = new File(target);
    int n = t.dependencies.size();
    boolean buildTarget = false;
    if (n == 0) {
      // always build if no dependencies
      buildTarget = true;
    }
    for (String dep : t.dependencies) {
      File depFile = new File(dep);
      // if not there or modified after target, make that dependency and the target
      if (!depFile.exists() || depFile.lastModified() > targetFile.lastModified()) {
        // System.out.println(dep+" doesn't exist or newer than "+target);
        buildTarget = true;
        int errorCode = build(dep);
        if (errorCode != 0) {
          return errorCode;
        }
      }
    }

    if (buildTarget) {
      int errorCode = t.exec();
      return errorCode;
    }

    return 0;
  }
}
