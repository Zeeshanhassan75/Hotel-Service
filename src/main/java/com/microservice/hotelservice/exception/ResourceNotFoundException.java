package com.microservice.hotelservice.exception;

public class ResourceNotFoundException extends RuntimeException {
	
	public ResourceNotFoundException() {
		super("Resource not found exception");
	}
	
	public ResourceNotFoundException(String message) {
		super(message+" : Not Found");
	}
}
