package com.example.backendserver3.model;

import java.util.List;

public class BackendServer3Response {
    private String accountNumber;
    private List<Transaction> pending;

    public BackendServer3Response(String accountNumber, List<Transaction> pending) {
        this.accountNumber = accountNumber;
        this.pending = pending;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public List<Transaction> getPending() {
        return pending;
    }

    public void setPending(List<Transaction> pending) {
        this.pending = pending;
    }
}
