package com.example.backendserver2.controller;

import com.example.backendserver2.model.BackendServer2Response;
import com.example.backendserver2.model.Transaction;
import com.example.backendserver2.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BackendServer2Controller {

    @Autowired
    private TransactionService transactionService;

    @GetMapping("/backendserver2/failure/{accountNumber}")
    public BackendServer2Response getFailureTransactions(@PathVariable String accountNumber) {
        List<Transaction> failureTransactions = transactionService.getFailureTransactions(accountNumber);
        return new BackendServer2Response(accountNumber, failureTransactions);
    }
}
