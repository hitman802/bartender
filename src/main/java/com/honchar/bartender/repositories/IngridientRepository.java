package com.honchar.bartender.repositories;

import com.honchar.bartender.entities.Ingridient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngridientRepository extends JpaRepository<Ingridient, Long> {
}
