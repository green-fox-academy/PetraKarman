package com.greenfox.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@Getter
@Setter
@Entity
@Table (name = "MealType")
public class Type {
  @Id
  String name;
}

/*
Breakfast
Elevenses
Lunch
Snack
Dinner
Midnight Snack
 */