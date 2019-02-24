package com.honchar.bartender.services;

import com.honchar.bartender.entities.CoctailReceipt;
import com.honchar.bartender.repositories.CoctailReceiptRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class ReceiptService {

    @Autowired
    private CoctailReceiptRepository coctailReceiptRepository;

    public List<CoctailReceipt> getAll() {
        return coctailReceiptRepository.findAll();
    }
}
