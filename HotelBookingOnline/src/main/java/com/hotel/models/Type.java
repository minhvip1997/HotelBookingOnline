package com.hotel.models;

public enum Type {
	PERCENTAGE ("PERCENTAGE"),
	FIXED ("FIXED");
	
	private final String name;

	Type(String name) {
		this.name = name;
	}
}
