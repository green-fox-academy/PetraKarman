package com.greenfoxacademy.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Doubling {
  int received;
  int result;

  public Doubling(int input){
    received = input;
    result = input *2;

  }
  }

