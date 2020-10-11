package com.hotel.controller.client;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hotel.models.Booking;
import com.hotel.models.Room;
import com.hotel.models.RoomType;
import com.hotel.models.User;
import com.hotel.services.RoomService;
import com.hotel.services.TypeRoomService;
import com.hotel.services.TypeRoomServiceImpl;

//import com.hotel.services.RoomTypeService;

@Controller


public class RoomController {
	@Autowired
	private TypeRoomService typeroomservice;
	@Autowired
	private RoomService roomservice;

	@GetMapping("rooms")
	private String getAllRooms(ModelMap modelmap) {
		modelmap.put("roomtype", typeroomservice.findAll());

		return "rooms";
	}
	@GetMapping("room-detail/{roomtypeid}")
	//@RequestMapping(value = "room-detail/{roomtypeid}", method = RequestMethod.GET)
	private String getRoomDetails(@PathVariable("roomtypeid") int roomtypeid, ModelMap modelMap) {
		modelMap.put("roomtype", typeroomservice.find(roomtypeid));
		Booking booking = new Booking();

		modelMap.put("booking", booking);
		return "room-detail";
	}

	@PostMapping("search")
	public String add(@ModelAttribute("booking") Booking booking, ModelMap modelMap) {
		List<Room> room=new ArrayList<Room>();
		room=roomservice.searchAvailableRoom(booking.getCheckInDate(), booking.getCheckOutDate(),booking.getRoomtype().getRoomtypeid());
		
		if (room.isEmpty()) {
			modelMap.put("msg", "NO ROOM AVAILABLE");
			modelMap.put("roomtype", booking.getRoomtype().getRoomtypeid());
			return "search.error";
		}else{
			RoomType roomstype= typeroomservice.find(booking.getRoomtype().getRoomtypeid());
			if(booking.getAdult()>roomstype.getAdultcapacity() || booking.getChildren()>roomstype.getChildrencapacity()) {
				int a=0;
				a=booking.getNumberOfRooms()+1;
				booking.setNumberOfRooms(a);
			}
			  Date checkInDate = new Date();
			  checkInDate=booking.getCheckInDate();
			  Date checkOutDate = new Date();
			  checkOutDate=booking.getCheckOutDate();
		      DateFormat df = new SimpleDateFormat("E, MMM dd yyyy HH:mm:ss");
		      String checkIn=df.format(checkInDate);
		      String checkOut=df.format(checkOutDate);
			Booking bookingnew=new Booking();
			//User user=new User();
			//booking.setRoomtype(typeroomservice.find(roomtype.roomtypeid));
			modelMap.put("booking", booking);
			modelMap.put("bookingnew", bookingnew);
			modelMap.put("checkIn", checkIn);
			modelMap.put("checkOut", checkOut);
			//modelMap.put("user", user);
			modelMap.put("roomtype", typeroomservice.find(booking.getRoomtype().getRoomtypeid()));
			return "booking";
			
		}
	
	}
}
