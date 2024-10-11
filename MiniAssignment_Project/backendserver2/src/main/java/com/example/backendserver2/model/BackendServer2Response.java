package com.example.backendserver2.model;

import java.util.List;

public class BackendServer2Response {
    private String accountNumber;
    private List<Transaction> failure;

    public BackendServer2Response(String accountNumber, List<Transaction> failure) {
        this.accountNumber = accountNumber;
        this.failure = failure;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public List<Transaction> getFailure() {
        return failure;
    }

    public void setFailure(List<Transaction> failure) {
        this.failure = failure;
    }
}
