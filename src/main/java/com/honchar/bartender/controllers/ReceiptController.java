package com.honchar.bartender.controllers;

import com.honchar.bartender.entities.CoctailReceipt;
import com.honchar.bartender.services.ReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("receipt")
public class ReceiptController {

    @Autowired
    private ReceiptService receiptService;

    @GetMapping("/all")
    public List<CoctailReceipt> getAllReceipts() {
        return receiptService.getAll();
    }


}
