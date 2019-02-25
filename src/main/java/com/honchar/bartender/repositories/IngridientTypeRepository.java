package com.honchar.bartender.repositories;

import com.honchar.bartender.entities.IngredientType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngridientTypeRepository extends JpaRepository<IngredientType, Long> {
}
