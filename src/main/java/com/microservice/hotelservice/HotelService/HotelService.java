package com.microservice.hotelservice.HotelService;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;
import com.microservice.hotelservice.hotelrepository.HotelRepository;
import com.microservice.hotelservice.Interface.HotelInterface;
import com.microservice.hotelservice.entity.Hotel;
import com.microservice.hotelservice.exception.ResourceNotFoundException;

@Service
public class HotelService implements HotelInterface{

	@Autowired
	HotelRepository hotelRepository;

	@Override
	public Hotel createHotel(Hotel hotel) {
		
		Hotel hotelDetails = new Hotel();
		
			hotelDetails.setHotelId(UUID.randomUUID().toString());
			hotelDetails.setHotelName(hotel.getHotelName());
			hotelDetails.setHotelContact(hotel.getHotelContact());
			hotelDetails.setHotelEmail(hotel.getHotelEmail());
			hotelDetails.setHotelLocation(hotel.getHotelLocation());
			
		return hotelRepository.save(hotelDetails);
	}

	@Override
	public Hotel getHotelById(String hotelId) {
		return hotelRepository.findById(hotelId).orElseThrow(()-> new ResourceNotFoundException(hotelId));
	}

	@Override
	public List<Hotel> getAllHotel() {
		return hotelRepository.findAll();
	}

	@Override
	public Hotel updateHotel(String hotelId , Hotel hotel) {
		return hotelRepository.findById(hotelId)
				.map(updateHotelData->{
					
				updateHotelData.setHotelName(hotel.getHotelName());
				updateHotelData.setHotelContact(hotel.getHotelContact());
				updateHotelData.setHotelEmail(hotel.getHotelEmail());
				updateHotelData.setHotelLocation(hotel.getHotelLocation());
				
				return hotelRepository.save(updateHotelData);
				
				}).orElseThrow(()-> new ResourceNotFoundException(hotelId));		
	}

	
	
	@Override
	public String deleteHotel(String hotelId) {
		try {
	        hotelRepository.deleteById(hotelId);
	        return "Deleted Successfully";
	    } 
		catch (Exception e) {
	        return "Hotel Not Found";
	    }
	}

	
}
	
