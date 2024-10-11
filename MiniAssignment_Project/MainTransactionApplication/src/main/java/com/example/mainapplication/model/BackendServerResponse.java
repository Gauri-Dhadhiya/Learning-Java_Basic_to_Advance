package com.example.mainapplication.model;

import java.util.List;

public class BackendServerResponse {

	    private String accountNumber;
	    private List<Transaction> success;
	    private List<Transaction> failure;
	    private List<Transaction> pending;
		
	    public BackendServerResponse(String accountNumber, List<Transaction> success, List<Transaction> failure,
				List<Transaction> pending) {
			super();
			this.accountNumber = accountNumber;
			this.success = success;
			this.failure = failure;
			this.pending = pending;
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

		public List<Transaction> getFailure() {
			return failure;
		}

		public void setFailure(List<Transaction> failure) {
			this.failure = failure;
		}

		public List<Transaction> getPending() {
			return pending;
		}

		public void setPending(List<Transaction> pending) {
			this.pending = pending;
		}
	    
	    
	    
	    
}
