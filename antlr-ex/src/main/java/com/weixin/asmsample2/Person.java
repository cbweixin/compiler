package com.weixin.asmsample2;

public class Person {

  private String name;

  private Integer age;

  public String getName() {
    return this.name;
  }

  public Person setName(String name) {
    this.name = name;
    return this;
  }

  public Integer getAge() {
    return this.age;
  }

  public Person setAge(Integer age) {
    this.age = age;
    return this;
  }

  public void doSth() {
    System.out.println("this guy is doing sth");
  }
}

