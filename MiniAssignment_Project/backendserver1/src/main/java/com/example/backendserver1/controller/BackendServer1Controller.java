package com.example.backendserver1.controller;

import com.example.backendserver1.model.BackendServer1Response;
import com.example.backendserver1.model.Transaction;
import com.example.backendserver1.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BackendServer1Controller {

    @Autowired
    private TransactionService transactionService;

    @GetMapping("/backendserver1/success/{accountNumber}")
    public BackendServer1Response getSuccessTransactions(@PathVariable String accountNumber) {
        List<Transaction> successTransactions = transactionService.getSuccessTransactions(accountNumber);
        return new BackendServer1Response(accountNumber, successTransactions);
    }
}
