package com.microservice.hotelservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.microservice.hotelservice.Payload.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	ResponseEntity<ApiResponse> handleException(ResourceNotFoundException resourceNotFoundException){
		
		String message = resourceNotFoundException.getMessage();
		
		ApiResponse apiResponse = ApiResponse.builder()
											.message(message)
											.Status(HttpStatus.NOT_FOUND)
											.Success(false)
											.build();
		
		return new ResponseEntity<>(apiResponse , HttpStatus.NOT_FOUND);
		
	}
}
