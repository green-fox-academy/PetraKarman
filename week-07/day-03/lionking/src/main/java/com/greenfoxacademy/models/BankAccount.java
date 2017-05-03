package com.greenfoxacademy.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BankAccount {
  String name;
  long balance;
  String animalType;
}
