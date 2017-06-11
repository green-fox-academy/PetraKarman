package com.greenfox.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@Getter
@Setter
@Entity
public class URL {
  @Id
  String original;
  String shortCut;

  public URL() {
  }
}
