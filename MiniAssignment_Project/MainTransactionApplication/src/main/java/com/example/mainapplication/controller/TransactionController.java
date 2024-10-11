package com.example.mainapplication.controller;

import com.example.mainapplication.service.TransactionService;
import com.example.mainapplication.model.Transaction;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//import reactor.core.publisher.Mono;
//
//import java.util.List;
//import java.util.Map;
//
//@RestController
//public class TransactionController {
//
//    @Autowired
//    private TransactionService transactionService;
//
//    @GetMapping("/transactions/{accountNumber}")
//    public Mono<Map<String, List<Transaction>>> getTransactions(@PathVariable String accountNumber,
//                                                                @RequestParam String status) {
//        return transactionService.getTransactions(accountNumber, status);
//    }
//}


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@RestController
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @GetMapping("/transactions/{accountNumber}")
    public List<Transaction> getTransactions(@PathVariable String accountNumber, @RequestParam String status) throws ExecutionException, InterruptedException {
        CompletableFuture<List<Transaction>> transactionsFuture = transactionService.getTransactions(accountNumber, status);
        return transactionsFuture.get();
    }
}


