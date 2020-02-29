package com.weixin.pants.datastore;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *  singleton
 */
public enum DependenciesMap {

  INSTANCE;
  private Map<String, String> dependencies = new HashMap<>();

  private Set<String> dependencySet = new HashSet<>();

  public String getDependency (String key){
    return dependencies.get(key);
  }

  public void setDependency(String name, String entry) {
    dependencies.put(name,entry);
  }

  public boolean hasJarDependency(String key){
    return dependencySet.contains(key);
  }

  public void setJarDependency(String key){
    dependencySet.add(key);
  }

}
