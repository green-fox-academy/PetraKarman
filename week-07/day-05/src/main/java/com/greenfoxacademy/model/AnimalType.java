package com.greenfoxacademy.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
@Getter
public enum  AnimalType {
  PENGUIN(0, "penguin", "pingu.png"), SEAL(1, "seal", "seal.jpg"), REINDEER (2, "reindeer", "reindeer.jpg"), POLARBEAR(3, "polar bear", "polar.jpg"), PANDA(4, "panda", "panda.png"), MAMAGAJ(5, "mamagáj", "mate.jpg");

  private int id;
  private String type;
  private String image;

  public static List<AnimalType> animals = Arrays.asList(AnimalType.values());

  public static AnimalType getById(int index) {
    return animals.get(index);
  }

}

