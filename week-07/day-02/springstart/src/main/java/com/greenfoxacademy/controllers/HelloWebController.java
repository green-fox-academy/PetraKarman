package com.greenfoxacademy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {
  AtomicLong counter = new AtomicLong();
  @RequestMapping("/web/greeting")
  public String greeting(Model model) {
    model.addAttribute("name", " World");
    model.addAttribute("counter", counter.addAndGet(1));
    return "greeting";
  }
}
