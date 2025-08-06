package com.microservice.hotelservice.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/staff")
public class StaffController {
	
	@GetMapping
	ResponseEntity<List<String>> listOfStaffs(){
		
		List<String > list = new ArrayList<String>(Arrays.asList("Ramu", "Shamu", "Chotu"));
		
		
		return ResponseEntity.ok(list);
	}

}
