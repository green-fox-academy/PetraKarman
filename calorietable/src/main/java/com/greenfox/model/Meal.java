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
  Type type;
  String description;
  int calories;
  @Id
  @GeneratedValue (strategy = GenerationType.AUTO)
  long id;

}

