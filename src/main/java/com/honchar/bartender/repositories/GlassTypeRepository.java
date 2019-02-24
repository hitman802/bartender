package com.honchar.bartender.repositories;

import com.honchar.bartender.entities.CoctailReceipt;
import com.honchar.bartender.entities.GlassType;
import org.springframework.data.repository.CrudRepository;

public interface GlassTypeRepository extends CrudRepository<GlassType, Long> {
}
