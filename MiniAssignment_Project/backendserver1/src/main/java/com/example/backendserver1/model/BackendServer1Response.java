package com.example.backendserver1.model;

import java.util.List;

public class BackendServer1Response {
    private String accountNumber;
    private List<Transaction> success;

    public BackendServer1Response(String accountNumber, List<Transaction> success) {
        this.accountNumber = accountNumber;
        this.success = success;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public List<Transaction> getSuccess() {
        return success;
    }

    public void setSuccess(List<Transaction> success) {
        this.success = success;
    }
}
