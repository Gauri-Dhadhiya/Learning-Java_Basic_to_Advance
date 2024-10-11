package com.example.EcommerceShoppingApp.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(InvalidCategoryNameException.class)
	public ResponseEntity<String> handleInvalidCategoryNameException(InvalidCategoryNameException ex) {
		return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
	}

    @ExceptionHandler(ServerDownException.class)
    public ResponseEntity<String> handleServerDownException(ServerDownException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.SERVICE_UNAVAILABLE);
    }

}
