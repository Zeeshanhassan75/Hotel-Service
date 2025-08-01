package com.microservice.hotelservice.Interface;

import java.util.List;

import com.microservice.hotelservice.entity.Hotel;

public interface HotelInterface {
	
	public Hotel createHotel(Hotel hotel);
	
	public Hotel getHotelById(String hotelId);
	
	public List<Hotel> getAllHotel();
	
	public Hotel updateHotel(String hotelId, Hotel hotel);
	
	public String deleteHotel(String hotelId);

}
