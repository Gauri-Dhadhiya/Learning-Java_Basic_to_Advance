package com.example.backendserver1.service;

import com.example.backendserver1.model.Transaction;
import com.example.backendserver1.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public List<Transaction> getSuccessTransactions(String accountNumber) {
        return transactionRepository.getSuccessTransactions(accountNumber);
    }
}

