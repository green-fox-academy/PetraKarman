package com.greenfoxacademy.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;

@Component
@Getter
@Setter
@Entity
public class Animal {
  @Id
  public String name;
  public AnimalType animalType;
  @Column(columnDefinition = "LONGBLOB")
  ArrayList<Trick> tricks = new ArrayList<>();
  public Food food;
  public Drink drink;



  public Animal() {
    this.food = Food.SALAD;
    this.drink = Drink.WATER;
  }

  public Animal(String name, AnimalType animalType) {
    this.name = name;
    this.animalType = animalType;
    this.food = Food.SALAD;
    this.drink = Drink.WATER;


  }

  public Animal(String name, AnimalType animalType, Food food, Drink drink) {
    this.name = name;
    this.animalType = animalType;
    this.food = food;
    this.drink = drink;

  }

  public void learn(Trick trick){
    tricks.add(trick);
  }

}
