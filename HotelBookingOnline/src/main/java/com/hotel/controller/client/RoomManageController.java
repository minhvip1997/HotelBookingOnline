package com.hotel.controller.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.hotel.services.TypeRoomService;
import com.hotel.services.TypeRoomServiceImpl;

//import com.hotel.services.RoomTypeService;

@Controller
public class RoomManageController {
	@Autowired
	private TypeRoomService typeroomservice;
	@GetMapping("rooms")
	private String getAllRooms(ModelMap modelmap) {
	modelmap.put("roomtype", typeroomservice.findAll());
	
		return "rooms";
	}
	
	@GetMapping("room-detail/{roomtypeid}")
	private String getRoomDetails() {
		return "room-detail";
	}
}
