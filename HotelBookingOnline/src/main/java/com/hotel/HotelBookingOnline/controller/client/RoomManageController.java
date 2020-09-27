package com.hotel.HotelBookingOnline.controller.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RoomManageController {

	@GetMapping("rooms")
	private String getAllRooms() {
		return "rooms";
	}
	
	@GetMapping("room-detail/{roomTypeID}")
	private String getRoomDetails() {
		return "room-detail";
	}
}
