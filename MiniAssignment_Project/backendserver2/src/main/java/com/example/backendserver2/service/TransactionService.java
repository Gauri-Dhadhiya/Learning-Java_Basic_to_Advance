package com.example.backendserver2.service;

import com.example.backendserver2.model.Transaction;
import com.example.backendserver2.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    
    @Autowired
    private TransactionRepository transactionRepository;

    public List<Transaction> getFailureTransactions(String accountNumber) {
        return transactionRepository.getFailureTransactions(accountNumber);
    }
}
