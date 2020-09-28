package com.hotel.controller.client;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("")
	private String viewHomePage(Model model) {
		boolean homePage = true;
		model.addAttribute("homePage", homePage);
		return "index";
	}
	
	@GetMapping("about")
	private String viewAbout() {
		return "about";
	}
	
	@GetMapping("blogs")
	private String viewBlogs() {
		return "blogs";
	}
	
	@GetMapping("contact")
	private String viewContact() {
		return "contact";
	}
	
	@GetMapping("faqs")
	private String viewFAQs() {
		return "faqs";
	}
}
