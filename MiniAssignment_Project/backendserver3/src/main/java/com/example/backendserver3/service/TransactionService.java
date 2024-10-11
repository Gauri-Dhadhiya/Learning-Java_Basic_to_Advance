package com.example.backendserver3.service;

import com.example.backendserver3.model.Transaction;
import com.example.backendserver3.model.BackendServer3Response;
import com.example.backendserver3.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public List<Transaction> getPendingTransactions(String accountNumber) {
        return transactionRepository.getPendingTransactions(accountNumber);
    }
}
