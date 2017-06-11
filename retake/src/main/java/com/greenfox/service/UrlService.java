package com.greenfox.service;

import org.springframework.stereotype.Service;

@Service
public class UrlService {
  public static String checkProtocol(String url) {
    if (!url.startsWith("http")) {
      url = "http://" + url;
    }
    return url;
  }

  public static String randomShortCut() {
    String url = "";
    String characters = "1234567890abcdefghijklmnopqrstuvwxyz";
    for (int i = 0; i < 6; i++) {
      url += characters.charAt((int) (Math.random() * characters.length()));
    }
    return url;

  }
}
