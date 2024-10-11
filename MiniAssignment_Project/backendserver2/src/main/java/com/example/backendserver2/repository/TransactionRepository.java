//package com.example.backendserver2.repository;
//
//import com.example.backendserver2.model.Transaction;
//import org.springframework.stereotype.Repository;
//
//import java.util.Arrays;
//import java.util.List;
//
//@Repository
//public class TransactionRepository {
//    public List<Transaction> getFailureTransactions(String accountNumber) {
//        return Arrays.asList(
//        		new Transaction("345577721", "failure", 500, "30-04-2023"),
//                new Transaction("245900023", "failure", 50, "29-05-2023")
//        );
//    }
//}

package com.example.backendserver2.repository;

import com.example.backendserver2.model.Transaction;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class TransactionRepository {
    public List<Transaction> getFailureTransactions(String accountNumber) {
        return Arrays.asList(
            new Transaction("345577721", "fail", 500, "30-04-2023"),
            new Transaction("245900023", "fail", 50, "29-05-2023")
        );
    }
}
