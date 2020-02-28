package com.weixin.pants.datastore;

import java.util.HashMap;
import java.util.Map;

/**
 *  singleton
 */
public enum DependenciesMap {

  INSTANCE;
  private Map<String, String> dependencies = new HashMap<>();

  public String getDependency (String key){
    return dependencies.get(key);
  }

  public void setDependency(String name, String entry) {
    dependencies.put(name,entry);
  }

}
