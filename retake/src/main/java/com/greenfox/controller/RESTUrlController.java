package com.greenfox.controller;

import com.greenfox.model.URL;
import com.greenfox.repository.URLRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTUrlController {

  @Autowired
  URLRepository urlRepository;

  @GetMapping ("/shortends")
  public Iterable<URL> listURLs(){
    return urlRepository.findAll();
  }

}
