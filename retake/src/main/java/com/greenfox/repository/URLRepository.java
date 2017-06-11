package com.greenfox.repository;

import com.greenfox.model.URL;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface URLRepository extends CrudRepository<URL, String>{
  URL findByShortCut(String shortened);
}
