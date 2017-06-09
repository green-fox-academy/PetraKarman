package com.greenfox;

import com.greenfox.model.Meal;
import com.greenfox.model.Type;
import com.greenfox.repository.MealRepository;
import com.greenfox.repository.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalorietableApplication implements CommandLineRunner {

	@Autowired
	TypeRepository typeRepository;

	@Autowired
	MealRepository mealRepository;

	public static void main(String[] args) {
		SpringApplication.run(CalorietableApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		typeRepository.save(new Type("Breakfast"));
		typeRepository.save(new Type("Elevenses"));
		typeRepository.save(new Type("Lunch"));
		typeRepository.save(new Type("Snack"));
		typeRepository.save(new Type("Dinner"));
		typeRepository.save(new Type("Midnight Snack"));

		mealRepository.save(new Meal("2017-05-22", typeRepository.findOne("Breakfast"), "fruits", 160));
		mealRepository.save(new Meal("2017-06-01", typeRepository.findOne("Snack"), "bake rolls", 250));
		mealRepository.save(new Meal("2017-06-02", typeRepository.findOne("Lunch"), "pasta", 500));
		mealRepository.save(new Meal("2017-06-04", typeRepository.findOne("Dinner"), "pizza", 750));
		mealRepository.save(new Meal("2017-06-04", typeRepository.findOne("Elevenses"), "csoki", 200));

	}

}

