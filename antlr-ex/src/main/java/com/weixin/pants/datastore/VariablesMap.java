package com.weixin.pants.datastore;

import java.util.HashMap;
import java.util.Map;

/**
 * Singleton class
 */
public enum VariablesMap {
  INSTANCE;

  private Map<String, String> variables = new HashMap<>();

  public String getVariable(String key){
    return variables.get(key);
  }

  public void setVariable(String key, String value) {
    variables.put(key,value);
  }

}
