package com.greenfoxacademy.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Greeter {
  String welcome_message;

  public Greeter(String name, String title){
    welcome_message = "Oh, hi there " + name + ", my dear " + title + "!";

  }
}

