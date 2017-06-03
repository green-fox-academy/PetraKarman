package com.greenfoxacademy.configuration;

import com.greenfoxacademy.service.EmailService;
import com.greenfoxacademy.service.MessageProceeder;
import com.greenfoxacademy.service.MessageService;
import com.greenfoxacademy.service.TwitterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfiguration {

  @Bean
  public MessageService emailService(){
    return new EmailService();
  }

  public MessageService twitterService(){
    return new TwitterService();
  }

  @Bean
  public MessageProceeder messageProceeder(){
    return new MessageProceeder();
  }
}
