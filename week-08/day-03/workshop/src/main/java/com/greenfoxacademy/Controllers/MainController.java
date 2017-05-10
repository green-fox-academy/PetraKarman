package com.greenfoxacademy.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {
  @RequestMapping(value = "/")
  public String loadIndex() {
    return "index";
  }
}

