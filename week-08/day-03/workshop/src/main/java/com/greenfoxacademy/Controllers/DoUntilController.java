package com.greenfoxacademy.Controllers;

import com.greenfoxacademy.Models.DoUntil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoUntilController {
  @GetMapping(value = "/dountil/{what}")
  public DoUntil until(@PathVariable(name = "what") String sum){
    return new
  }
}

/*
@RestController
public class AppendAController {
  @GetMapping(value = "/appenda/{appendable}")
  public AppendA appending (@PathVariable(name = "appendable") String input){
    return new AppendA(input);
  }
}

 */