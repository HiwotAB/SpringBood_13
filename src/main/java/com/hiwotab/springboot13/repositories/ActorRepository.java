package com.hiwotab.springboot13.repositories;


import com.hiwotab.springboot13.model.Actor;
import org.springframework.data.repository.CrudRepository;

public interface ActorRepository extends CrudRepository<Actor,Long> {
}
