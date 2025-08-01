package com.microservice.hotelservice.Payload;

import org.springframework.http.HttpStatus;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse {
	
	private HttpStatus Status;
	private Boolean Success;
	private String message;
}
