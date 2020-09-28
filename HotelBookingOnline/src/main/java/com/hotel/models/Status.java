package com.hotel.models;

public enum Status {
	PENDING ("PENDING"),
	CANCEL ("CANCEL"),
	SUCCESS ("SUCCESS"),
	ONLINE_PENDING ("ONLINE_PENDING");
	private final String name;

	Status(String name) {
		this.name = name;
	}
	
}
