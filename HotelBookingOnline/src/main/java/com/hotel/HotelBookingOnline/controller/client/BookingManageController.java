package com.hotel.HotelBookingOnline.controller.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookingManageController {

	@GetMapping("booking")
	private String getBooking(){
		return "booking";
	}
	
	@GetMapping("checkout")
	private String getCheckout() {
		return "checkout";
	}
	
	@GetMapping("confirm")
	private String getConfirm() {
		return "confirm";
	}
}
