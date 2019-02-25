package com.honchar.bartender.repositories;

import com.honchar.bartender.entities.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngridientRepository extends JpaRepository<Ingredient, Long> {
}
