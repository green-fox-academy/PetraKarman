package com.greenfoxacademy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MessageProceeder {

  @Autowired
  @Qualifier("emailService")
  MessageService messageService;

  @Autowired
  @Qualifier("twitterService")
  MessageService messageService2;

  public void processMessage(String message, String to) {

    System.out.println(messageService.getInfo() + "Sent to " + to + " with Message=" + message);
    System.out.println(messageService2.getInfo() + "Sent to " + to + " with Message=" + message);

  }
}