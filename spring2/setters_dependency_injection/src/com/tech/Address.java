package com.tech;

public class Address {
	private String city;

	public Address() {
		System.out.println("inside Address constructor");
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCity() {
		return city;
	}
}
