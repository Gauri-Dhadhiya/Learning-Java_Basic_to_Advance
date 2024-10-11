//package com.example.backendserver3.repository;
//
//import com.example.backendserver3.model.Transaction;
//import org.springframework.stereotype.Repository;
//
//import java.util.Arrays;
//import java.util.List;
//
//@Repository
//public class TransactionRepository {
//    public List<Transaction> getPendingTransactions(String accountNumber) {
//        return Arrays.asList(
//        		 new Transaction("88797721", "pending", 500, "30-04-2023")
//        );
//    }
//}

package com.example.backendserver3.repository;

import com.example.backendserver3.model.Transaction;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class TransactionRepository {
    public List<Transaction> getPendingTransactions(String accountNumber) {
        return Arrays.asList(
            new Transaction("88797721", "pending", 500, "30-04-2023")
        );
    }
}

