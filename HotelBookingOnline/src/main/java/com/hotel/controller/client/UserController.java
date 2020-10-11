package com.hotel.controller.client;

//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hotel.models.User;


@Controller
@RequestMapping("/user")
public class UserController {

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
