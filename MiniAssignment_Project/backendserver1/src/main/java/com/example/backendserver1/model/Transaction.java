package com.example.backendserver1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Transaction {
    @JsonProperty("transactionId")
    private String transactionId;
    
    @JsonProperty("status")
    private String status;
    
    @JsonProperty("amount")
    private int amount;
    
    @JsonProperty("date")
    private String date;

	public Transaction(String transactionId, String status, int amount, String date) {
		super();
		this.transactionId = transactionId;
		this.status = status;
		this.amount = amount;
		this.date = date;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	
    
}
