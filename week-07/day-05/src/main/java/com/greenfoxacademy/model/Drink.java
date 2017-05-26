package com.greenfoxacademy.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
@Getter
public enum Drink {
  MILK(0, "milk"), WATER(1, "water"), TEA(2, "tea"), COKE(3, "coke"), COFFEE(4, "coffee"), JUICE(5, "juice");

  private int id;
  private String type;
  public static List<Drink> drinks = Arrays.asList(Drink.values());

  public static Drink getById(int index) {
    return drinks.get(index);
  }

}
