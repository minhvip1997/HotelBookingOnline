package com.hotel.HotelBookingOnline.controller.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserManageController {

	@GetMapping("profile")
	private String getProfile() {
		return "profile";
	}
	
	@GetMapping("booking")
	private String getBooking() {
		return "my-booking";
	}
	
	@GetMapping("cancel-booking")
	private String getCancelBooking() {
		return "cancel-booking";
	}
}
