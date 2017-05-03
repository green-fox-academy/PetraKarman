package com.greenfoxacademy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Exercise4 {
  @RequestMapping(value = "/exercise4")
  public static String exFour(Model model){
    String s = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("string", s);
    return "exercise4";

  }
}
