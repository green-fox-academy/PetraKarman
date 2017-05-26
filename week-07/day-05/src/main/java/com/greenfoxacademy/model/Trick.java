package com.greenfoxacademy.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;

@AllArgsConstructor
@Getter
public enum Trick {
  CLEAN(0, "clean"), CODING(1, "code"), CLEAN_CODING(2, "write clean codes"), DANCE(3, "dance"), PLAY(4, "play"), COOK(5, "cook"), MAKE_HOT_CHOCOLATE(6, "make hot chocolate for Anna")
  ,SLEEP(7, "sleep");

  private int id;
  private String type;

  public static ArrayList<Trick> trickList = new ArrayList<>(Arrays.asList(Trick.values()));


  public static Trick getById(int id) {
    for (Trick trick : trickList){
      if (trick.id == id){
        return trick;
      }
    }return null;
  }

}

