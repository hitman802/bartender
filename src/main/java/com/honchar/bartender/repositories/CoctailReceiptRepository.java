package com.honchar.bartender.repositories;

import com.honchar.bartender.entities.CoctailReceipt;
import org.springframework.data.repository.CrudRepository;

public interface CoctailReceiptRepository extends CrudRepository<CoctailReceipt, Long> {
}
