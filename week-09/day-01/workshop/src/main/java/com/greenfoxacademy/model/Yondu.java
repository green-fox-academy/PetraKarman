package com.greenfoxacademy.model;

public class Yondu {
  double distance;
  double time;
  double speed;

  public Yondu(double distance, double time) {
    this.distance = distance;
    this.time = time;
    this.speed = distance/time;
  }

  public double getDistance() {
    return distance;
  }

  public double getTime() {
    return time;
  }

  public double getSpeed() {
    return speed;
  }
}
