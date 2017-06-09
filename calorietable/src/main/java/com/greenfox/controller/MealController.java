package com.greenfox.controller;

import com.greenfox.model.Meal;
import com.greenfox.model.Type;
import com.greenfox.repository.MealRepository;
import com.greenfox.repository.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MealController {
  String errorMessage;

  @Autowired
  MealRepository mealRepository;
  @Autowired
  TypeRepository typeRepository;

  @RequestMapping("/index")
  public String mainPage(Model model) {
    errorMessage = null;
    model.addAttribute("meals", mealRepository.findAll());
    int calorieCounter = 0;
    for (Meal meal : mealRepository.findAll()) {
      calorieCounter += meal.getCalories();
    }
    model.addAttribute("calorieCounter", calorieCounter);
    return "index";
  }

  @RequestMapping({"/add", "/add/{id}"})
  public String editPage(Model model, @PathVariable(value = "id", required = false) Long id) {
    if (id != null) {
      Meal mealToEdit = mealRepository.findOne(id);
      model.addAttribute("mealtoedit", mealToEdit);
    }
    model.addAttribute("types", typeRepository.findAll());
    model.addAttribute("errormessage", errorMessage);
    return "edit";
  }

  @RequestMapping({"/saveMeal", "saveMeal/{id}"})
  public String saveMeal(Model model, @RequestParam(value = "date") String date, @RequestParam(value = "type") Type type,
                         @RequestParam(value = "description") String description, @RequestParam(value = "calories") Integer calories,
                         @PathVariable(value = "id", required = false) Long id) {
    if (date != null && type != null && calories != null) {
      Meal mealToSave;
      if (id != null) {
        mealToSave = mealRepository.findOne(id);
        mealToSave.setCalories(calories);
        mealToSave.setDescription(description);
        mealToSave.setMealDate(date);
        mealToSave.setType(type);
      } else {
        mealToSave = new Meal(date, type, description, calories);
      }
      mealRepository.save(mealToSave);
      return "redirect:/index";
    }else{
      StringBuilder missingFields = new StringBuilder("Please fill the following field(s): ");
      if(date.equals("")){
        missingFields.append("date ");
      }
      if (calories == null){
        missingFields.append("calories ");
      }
      errorMessage = missingFields.toString();
      if (id == null){
        return "redirect:/add";
      }else{
        return "redirect:/add/" + id;
      }
    }
  }

  @RequestMapping("/deleteMeal/{id}")
  public String deleteMeal(@PathVariable(value = "id") long id) {
    mealRepository.delete(id);
    return "redirect:/index";
  }

}
