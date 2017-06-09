package com.greenfox.controller;


import com.greenfox.model.Meal;
import com.greenfox.model.MealStat;
import com.greenfox.model.Response;
import com.greenfox.repository.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestMealController {
  @Autowired
  MealRepository mealRepository;

  @GetMapping("/getmeals")
  public Iterable<Meal> getMeals() {
    return mealRepository.findAll();
  }

  @GetMapping("/getstats")
  public MealStat getStats() {
    int calorieCounter = 0;
    for (Meal meal : mealRepository.findAll()) {
      calorieCounter += meal.getCalories();
    }
    int numberOfMeals = ((List) mealRepository.findAll()).size();
    return new MealStat(calorieCounter, numberOfMeals);
  }

  @PostMapping("/meal")
  public Response saveMeal(@RequestBody Meal meal) {
    mealRepository.save(meal);
    return new Response("ok");
  }

  @DeleteMapping("/meal")
  public Response deleteMeal(@RequestBody Meal meal){
    mealRepository.delete(meal);
    return new Response("ok");
  }

}

