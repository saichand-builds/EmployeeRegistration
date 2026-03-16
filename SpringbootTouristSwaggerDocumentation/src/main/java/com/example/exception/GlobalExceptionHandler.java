
package com.example.exception;

import java.util.NoSuchElementException;

import org.hibernate.ObjectNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> handleException(Exception e) {

		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
				.body("Some thing went  wrong  " + e.getMessage());
	}
	
	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity<?> handleNullpointer(NullPointerException ex){
		
		return ResponseEntity
				.status(HttpStatus.BAD_REQUEST)
				.body("Null Value Found");
		
	}
	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<?> TouistNotFoundException(NoSuchElementException ex){
		return ResponseEntity.status(HttpStatus.NOT_FOUND)
				.body(ex.getMessage());
	}
	
	
	/*
	 * Service Layer 
	 * ↓ 
	 * throw new NoSuchElementException("Tourist not found 5") 
	 * ↓
	 * Global Exception Handler
	 * 
	 *  catches it 
	 *  ↓
	 *   ex.getMessage() 
	 *   ↓
	 * "Tourist not found 5"
	 */

}

