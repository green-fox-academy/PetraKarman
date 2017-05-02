package com.greenfoxacademy.controllers;

import com.greenfoxacademy.models.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {
  AtomicLong idCount = new AtomicLong();
  @RequestMapping
  public Greeting greeting(@RequestParam("name") String name){

    String greet = "Hello, " + name;
    return new Greeting( idCount.addAndGet(1), greet);
  }
}
