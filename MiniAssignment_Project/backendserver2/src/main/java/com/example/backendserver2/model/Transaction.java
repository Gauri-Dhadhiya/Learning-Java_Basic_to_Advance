package com.example.backendserver2.model;

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
	
    
}
