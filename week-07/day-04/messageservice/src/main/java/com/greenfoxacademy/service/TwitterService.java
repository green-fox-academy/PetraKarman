package com.greenfoxacademy.service;

import org.springframework.stereotype.Component;

@Component
public class TwitterService implements MessageService {

  @Override
  public String getInfo(){
    String info = "twitter";
    return info;
  }
}
