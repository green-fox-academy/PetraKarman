package com.greenfox.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "meals")
public class Meal {
  String mealDate;

  @ManyToOne
  @JoinColumn (name = "name")
  Type type;
  String description;
  int calories;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  long id;

  public Meal (){
  }

  public Meal(String mealDate, Type type, String description, int calories) {
    this.mealDate = mealDate;
    this.type = type;
    this.description = description;
    this.calories = calories;
  }

}


