package com.honchar.bartender.repositories;

import com.honchar.bartender.entities.IngridientType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngridientTypeRepository extends JpaRepository<IngridientType, Long> {
}
