package com.greenfoxacademy.controller;

import com.greenfoxacademy.model.*;
import com.greenfoxacademy.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import static com.greenfoxacademy.model.Trick.trickList;

@Controller
public class MainController {
  @Autowired
  AnimalRepository animalRepository;
  String animalName;
  boolean nameExists = true;


  @RequestMapping("/")
  public String mainPage(Model model) {
    model.addAttribute("animalType", AnimalType.values());
    model.addAttribute("nameExists", nameExists);
    nameExists = true;
    return "front";
  }

  @RequestMapping("/create")
  public String create(Model model, @RequestParam(value = "id") int id) {
    model.addAttribute("id", id);
    return "naming";
  }

  @RequestMapping("namedAnimal/{id}")
  public String naming(Model model, @PathVariable(value = "id") int id, @RequestParam(value = "name") String name) {
    Animal animal = new Animal();
    animal.setName(name);
    animal.setAnimalType(AnimalType.getById(id));
    animalRepository.save(animal);
    animalName = name;
    return "redirect:/index";
  }

  @RequestMapping("/index")
  public String showAnimal(Model model, @RequestParam(value = "name", required = false) String name) {
    if (name != null) {
      animalName = name;
      if (!animalRepository.exists(name)){
        nameExists = false;
        return "redirect:/";}
    }
    model.addAttribute("animal", animalRepository.findOne(animalName));
    return "index";
  }

  @RequestMapping("/nutritionStore")
  public String showNutrition(Model model) {
    model.addAttribute("food", Food.values());
    model.addAttribute("drink", Drink.values());
    model.addAttribute("animal", animalRepository.findOne(animalName));
    return "nutritionStore";
  }

  @RequestMapping("/changeNutrition")
  public String changeFoodAndDrink(Model model, @RequestParam(value = "food") int foodId, @RequestParam(value = "drink") int drinkId) {
    Animal animal = animalRepository.findOne(animalName);
    animal.setFood(Food.getById(foodId));
    animal.setDrink(Drink.getById(drinkId));
    model.addAttribute("animal", animal);
    animalRepository.save(animal);
    return "redirect:/index";
  }

  @RequestMapping("/trickCenter")
  public String showTricks(Model model) {
    model.addAttribute("animal", animalRepository.findOne(animalName));
    model.addAttribute("tricklist", trickList);
    return "trickCenter";
  }

  @RequestMapping("/learnTrick")
  public String learnTrick(Model model, @RequestParam(value = "trick") int trickId) {
    Animal animal = animalRepository.findOne(animalName);
    animal.learn(Trick.getById(trickId));
    model.addAttribute("animal", animal);
    animalRepository.save(animal);
    return "redirect:/index";
  }
}
