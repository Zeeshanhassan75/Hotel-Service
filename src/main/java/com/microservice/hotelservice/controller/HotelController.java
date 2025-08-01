package com.microservice.hotelservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.hotelservice.Interface.HotelInterface;
import com.microservice.hotelservice.entity.Hotel;

@RequestMapping("/hotelService")
@RestController
public class HotelController {
	
	@Autowired
	HotelInterface hotelInterface;
	
	@PostMapping("/registerHotel")
	ResponseEntity<Hotel> CreateHotelService(@RequestBody Hotel hotel){
		Hotel createHotel = hotelInterface.createHotel(hotel);
		return ResponseEntity.status(HttpStatus.CREATED).body(createHotel);
	}
	
	
	@GetMapping("/getAllHotels")
	ResponseEntity<List<Hotel>> GetAllHotelDetails(){
		List<Hotel> allHotelDetails = hotelInterface.getAllHotel();
		return ResponseEntity.ok(allHotelDetails);
	}
	
	@GetMapping("/getHotelById/{hotelId}")
	ResponseEntity<Hotel> GetHotelDetailsById(@PathVariable String hotelId){
		Hotel getHotelById = hotelInterface.getHotelById(hotelId);
		return ResponseEntity.ok(getHotelById);
	}
	
	@PutMapping("/UpdateHotelById/{hotelId}")
	ResponseEntity<Hotel> UpdateHotelDetails(@PathVariable String hotelId , @RequestBody Hotel hotel){
		Hotel UpdateHotelDetails = hotelInterface.updateHotel(hotelId, hotel);
		return ResponseEntity.ok(UpdateHotelDetails);
	}
	
	@DeleteMapping("/RemoveHotelById/{hotelId}")
	ResponseEntity<Hotel> RemoveHotelDetailsById(@PathVariable String hotelId){
		String removeHotel = hotelInterface.deleteHotel(hotelId);
		return ResponseEntity.noContent().build();
	}
	
	

}
