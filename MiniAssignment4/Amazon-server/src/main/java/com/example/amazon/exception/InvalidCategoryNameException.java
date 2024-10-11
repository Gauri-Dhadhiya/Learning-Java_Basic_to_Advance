package com.example.amazon.exception;

public class InvalidCategoryNameException extends RuntimeException {

	public InvalidCategoryNameException(String message) {
		super(message);
	}
}