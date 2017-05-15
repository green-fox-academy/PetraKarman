package com.greenfoxacademy.model;



public class Groot {
  public String received;
  public String translated;


  public Groot(String message) {
    this.received = message;
    this.translated = "I am Groot!";
  }

  public String getReceived() {
    return received;
  }

  public String getTranslated() {
    return translated;
  }
}
