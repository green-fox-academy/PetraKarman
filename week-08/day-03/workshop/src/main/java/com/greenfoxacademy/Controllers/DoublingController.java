package com.greenfoxacademy.Controllers;

import com.greenfoxacademy.Models.Doubling;
import com.greenfoxacademy.Models.ErrorMess;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoublingController {
  @GetMapping(value = "/doubling")
  public Doubling doubling(@RequestParam(name = "input") Integer input) {
    return new Doubling(input);
  }
  @ExceptionHandler(MissingServletRequestParameterException.class)
  public ErrorMess missing() {
    return new ErrorMess();
  }
}
