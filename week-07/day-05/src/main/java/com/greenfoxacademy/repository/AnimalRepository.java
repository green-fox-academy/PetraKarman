package com.greenfoxacademy.repository;

import com.greenfoxacademy.model.Animal;
import org.springframework.data.repository.CrudRepository;

public interface AnimalRepository extends CrudRepository<Animal, String> {
}
