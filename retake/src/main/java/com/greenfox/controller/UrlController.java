package com.greenfox.controller;

import com.greenfox.model.URL;
import com.greenfox.repository.URLRepository;
import com.greenfox.service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UrlController {

  @Autowired
  URLRepository urlRepository;


  @RequestMapping("/index")
  public String mainPage(){
    return "index";
  }

  @PostMapping("/save")
  public String saveURL(Model model, @RequestParam(name = "url") String url) {
    String checkedURL = UrlService.checkProtocol(url);
    if (!urlRepository.exists(checkedURL)) {
      urlRepository.save(new URL(checkedURL, UrlService.randomShortCut()));
    }
    model.addAttribute("url", urlRepository.findOne(checkedURL));
    return "show";
  }

  @GetMapping("/shorten/{shortened}")
  public String getOriginalURL(@PathVariable(name = "shortened") String shortened) {
    if (urlRepository.findByShortCut(shortened) != null){
      return "redirect:" + urlRepository.findByShortCut(shortened).getOriginal();

    }else{
      return "redirect:/index";
    }
  }
}