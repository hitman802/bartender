package com.honchar.bartender.repositories;

import com.honchar.bartender.entities.Ingridient;
import com.honchar.bartender.entities.MixingMethod;
import org.springframework.data.repository.CrudRepository;

public interface IngridientRepository extends CrudRepository<Ingridient, Long> {
}
