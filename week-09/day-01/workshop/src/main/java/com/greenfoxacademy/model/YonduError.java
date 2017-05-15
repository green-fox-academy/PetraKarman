package com.greenfoxacademy.model;

public class YonduError {
  String error;

  public YonduError() {
    this.error = "Please provide distance and time.";
  }

  public String getError() {
    return error;
  }
}
