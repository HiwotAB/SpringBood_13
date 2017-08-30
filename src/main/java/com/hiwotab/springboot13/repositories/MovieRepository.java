package com.hiwotab.springboot13.repositories;

import com.hiwotab.springboot13.model.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie,Long> {
}
