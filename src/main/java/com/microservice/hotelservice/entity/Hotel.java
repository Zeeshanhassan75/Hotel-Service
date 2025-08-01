package com.microservice.hotelservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
@Entity(name="HOTEL_SERVICE")
public class Hotel {
	
	@Id
	@Column(name = "HOTEL_ID")
	private String hotelId;
	
	@Column(name = "HOTEL_NAME")
	private String hotelName;
	
	@Column(name = "HOTEL_CONTACT")
	private String hotelContact;
	
	@Column(name = "HOTEL_LOCATION")
	private String hotelLocation;
	
	@Column(name = "HOTEL_EMAIL")
	private String hotelEmail;
	
	//@Column(name = "HOTEL_DESCRIPTION")
	//private String aboutHotel;
}
