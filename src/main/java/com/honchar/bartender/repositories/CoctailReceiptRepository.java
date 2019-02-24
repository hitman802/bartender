package com.honchar.bartender.repositories;

import com.honchar.bartender.entities.CoctailReceipt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoctailReceiptRepository extends JpaRepository<CoctailReceipt, Long> {
}
