package com.honchar.bartender.repositories;

import com.honchar.bartender.entities.CocktailReceipt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoctailReceiptRepository extends JpaRepository<CocktailReceipt, Long> {
}
