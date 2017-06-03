package com.greenfoxacademy.service;

import org.springframework.stereotype.Component;

@Component
public class EmailService implements MessageService {


  @Override
  public String getInfo(){
    String info = "email";
    return info;
  }
}
