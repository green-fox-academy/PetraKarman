package com.greenfoxacademy.controllers;

import com.greenfoxacademy.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class BankAccounts {
    @RequestMapping(value = "/exercise5")
    public static String allAccount(Model model) {
      BankAccount simba = new BankAccount("Simba", 2000, "lion");
      BankAccount mufasa = new BankAccount("Mufasa", 500000, "lion");
      BankAccount pumbaa = new BankAccount("Pumbaa", 300, "warthog" );
      BankAccount timon = new BankAccount("Timon", 200, "meerkat");
      BankAccount rafiki = new BankAccount("Rafiki", 0, "mandrill");
      ArrayList animals = new ArrayList();
      animals.add(simba);
      animals.add(mufasa);
      animals.add(pumbaa);
      animals.add(timon);
      animals.add(rafiki);
      model.addAttribute("animals",animals);
      return "animals";
    }
}
