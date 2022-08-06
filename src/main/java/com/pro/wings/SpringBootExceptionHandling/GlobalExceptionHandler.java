package com.pro.wings.SpringBootExceptionHandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.pro.wings.SpringBootExceptionHandling.customexception.UserNotFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(UserNotFoundException.class)
	
	public String UserNotFoundException(UserNotFoundException cust) {
		
		return "Error";
		
	}
		@ExceptionHandler(IllegalArgumentException.class)
		public ResponseEntity<?> illegalArgumentException(IllegalArgumentException ex) {
			return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
		}

}
