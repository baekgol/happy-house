package com.ssafy.happyhouse.model.dto;

public class AddressDto {
	private String lat;
	private String lng;
	
	public AddressDto() {}
	
	public AddressDto(String lat, String lng) {
		this.lat = lat;
		this.lng = lng;
	}

	public String getLat() {
		return lat;
	}
	
	public void setLat(String lat) {
		this.lat = lat;
	}
	
	public String getLng() {
		return lng;
	}
	
	public void setLng(String lng) {
		this.lng = lng;
	}
}
