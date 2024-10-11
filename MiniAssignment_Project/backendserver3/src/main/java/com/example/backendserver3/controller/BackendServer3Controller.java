package com.example.backendserver3.controller;

import com.example.backendserver3.model.BackendServer3Response;
import com.example.backendserver3.model.Transaction;
import com.example.backendserver3.service.TransactionService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BackendServer3Controller {
       
    @Autowired
    private TransactionService transactionService;

    @GetMapping("/backendserver3/pending/{accountNumber}")
    public BackendServer3Response getPendingTransactions(@PathVariable String accountNumber) {
        List<Transaction> pendingTransactions = transactionService.getPendingTransactions(accountNumber);
        return new BackendServer3Response(accountNumber, pendingTransactions);
    }
}

