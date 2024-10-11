//package com.example.backendserver1.repository;
//
//import com.example.backendserver1.model.Transaction;
//import org.springframework.stereotype.Repository;
//
//import java.util.Arrays;
//import java.util.List;
//
//@Repository
//public class TransactionRepository {
//    public List<Transaction> getSuccessTransactions(String accountNumber) {
//        return Arrays.asList(
//            new Transaction("123456789", "success", 500, "30-05-2023"),
//            new Transaction("789566233", "success", 100, "31-05-2023"),
//            new Transaction("556666678", "success", 700, "20-05-2023")
//        );
//    }
//}

package com.example.backendserver1.repository;

import com.example.backendserver1.model.Transaction;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class TransactionRepository {
    public List<Transaction> getSuccessTransactions(String accountNumber) {
        return Arrays.asList(
            new Transaction("123456789", "success", 500, "30-05-2023"),
            new Transaction("789566233", "success", 100, "31-05-2023"),
            new Transaction("556666678", "success", 700, "20-05-2023")
        );
    }
}
