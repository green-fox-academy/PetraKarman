package com.greenfoxacademy.controller;



import com.greenfoxacademy.model.Groot;
import com.greenfoxacademy.model.GrootError;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;

@RestController
public class GuardianController {
  @GetMapping(value = "/groot")
  public Groot groot (@RequestParam (name = "message") String message){
  return new Groot(message);
  }
  @ExceptionHandler(MissingServletRequestParameterException.class)
  public GrootError missing() {
    return new GrootError();
  }
}
