package com.greenfoxacademy.controller;


import com.greenfoxacademy.model.Yondu;
import com.greenfoxacademy.model.YonduError;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class YonduController {
  @GetMapping(value = "/yondu")
  public Yondu yondu (@RequestParam(name = "distance") double distance,@RequestParam(name = "time") double time){
    return new Yondu(distance,time);
  }
  @ExceptionHandler(MissingServletRequestParameterException.class)
  public YonduError missingParam(){
    return new YonduError();
  }

}
