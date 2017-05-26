package com.greenfoxacademy.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;


@AllArgsConstructor
@Getter
public enum Food {
  CHOCOLATE(0, "chocolate"), PIZZA(1, "pizza"), SALAD(2, "salad"), APPLE(3, "apple"), HUMAN(4, "human"), FISH (5, "fish");

  private int id;
  private String type;

  public static List<Food> foods = Arrays.asList(Food.values());

  public static Food getById(int index) {
    return foods.get(index);
  }

}
