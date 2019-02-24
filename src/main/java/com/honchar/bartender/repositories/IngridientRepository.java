package com.honchar.bartender.repositories;

import com.honchar.bartender.entities.Ingridient;
import org.springframework.data.repository.CrudRepository;

public interface IngridientRepository extends CrudRepository<Ingridient, Long> {
}
