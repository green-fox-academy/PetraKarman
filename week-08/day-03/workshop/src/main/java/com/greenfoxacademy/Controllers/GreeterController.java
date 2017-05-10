package com.greenfoxacademy.Controllers;

import com.greenfoxacademy.Models.ErrorGreet;
import com.greenfoxacademy.Models.Greeter;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreeterController {
  @GetMapping(value = "/greeter")
  public Greeter greeting(@RequestParam (name = "name") String input,@RequestParam (name = "title")String input2){
    return new Greeter(input, input2);
  }
  @ExceptionHandler(MissingServletRequestParameterException.class)
  public ErrorGreet errorGreet(MissingServletRequestParameterException e) {
    String name = e.getParameterName();
    return new ErrorGreet("Please provide a " + name + "!");
  }
}

