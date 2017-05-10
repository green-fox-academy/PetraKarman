package com.greenfoxacademy.Models;

public class AppendA {
  String appendable;
  public String appended;

  public AppendA(String appendable) {
    this.appendable = appendable;
    this.appended = appendable + "a";
  }

  public String appendA(String appendable) {
    return appended;
  }
}
