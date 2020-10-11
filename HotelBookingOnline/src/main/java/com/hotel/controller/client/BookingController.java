package com.hotel.controller.client;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hotel.models.Booking;
import com.hotel.models.BookingDetails;
import com.hotel.models.CreditCard;
import com.hotel.models.Invoice;
import com.hotel.models.Promotion;
import com.hotel.models.Room;
import com.hotel.models.RoomType;
import com.hotel.models.User;
import com.hotel.services.BookingDetailsService;
import com.hotel.services.BookingService;
import com.hotel.services.CreditCardService;
import com.hotel.services.InvoiceService;
import com.hotel.services.PromotionService;
import com.hotel.services.RoomService;
import com.hotel.services.TypeRoomService;
import com.hotel.services.UserService;

@Controller
//@RequestMapping("booking")
public class BookingController {
	@Autowired
	private TypeRoomService typeroomservice;
	@Autowired
	private UserService userservice;
	@Autowired
	private BookingService bookingservice;
	@Autowired
	private PromotionService promotionservice;
	@Autowired
	private CreditCardService creditcardservice;
	@Autowired
	private InvoiceService invoiceservice;
	@Autowired
	private BookingDetailsService bookingdetailsservice;
	@Autowired
	private RoomService roomservice;

	/*
	 * @GetMapping("booking") private String getBooking(ModelMap modelMap){
	 * 
	 * return "booking"; }
	 */
	@PostMapping("booking")
	private String getBooking(@ModelAttribute("bookingnew") Booking bookingnew, ModelMap modelMap) {
		User user = new User();
		user.setName(bookingnew.getUser().getName());
		user.setEmail(bookingnew.getUser().getEmail());
		user.setPhone(bookingnew.getUser().getPhone());
		user.setAddress(bookingnew.getUser().getAddress());
		userservice.save(user);
		bookingnew.setUser(user);

		if (promotionservice.searchPromotion(bookingnew.getCheckInDate(), bookingnew.getCheckOutDate(),
				bookingnew.getPromotion().getPromId()).isEmpty()) {
			bookingnew.setBookingDate(
					LocalDateTime.ofInstant(bookingnew.getCheckInDate().toInstant(), ZoneId.systemDefault()));
			bookingnew.setPromotion(null);
			bookingservice.save(bookingnew);
			BookingDetails bookdetail = new BookingDetails();
			Room room=new Room();
		
			bookdetail.setBooking(bookingnew);
			

			RoomType booktype = new RoomType();
			booktype = typeroomservice.find(bookingnew.getRoomtype().getRoomtypeid());
			List<Room> list = new ArrayList<Room>();
			list = roomservice.searchAvailableRoom(bookingnew.getCheckInDate(), bookingnew.getCheckOutDate(),
					bookingnew.getRoomtype().getRoomtypeid());
			room=list.get(0);
			bookdetail.setRoom(room);
			bookingdetailsservice.save(bookdetail);

			
			modelMap.put("bookingnew", bookingnew);
			modelMap.put("booktype", booktype);
			modelMap.put("message", "Promotion is not available");
			// bookingnew.getPromotion().getValue();
		} else {
			bookingnew.setBookingDate(
					LocalDateTime.ofInstant(bookingnew.getCheckInDate().toInstant(), ZoneId.systemDefault()));
			// bookingnew.setPromotion(promotion);
			bookingservice.save(bookingnew);
			BookingDetails bookdetail = new BookingDetails();
			Room room=new Room();
		
			bookdetail.setBooking(bookingnew);
			Promotion promotions = new Promotion();
			RoomType booktype = new RoomType();
			booktype = typeroomservice.find(bookingnew.getRoomtype().getRoomtypeid());
			List<Room> list = new ArrayList<Room>();
			list = roomservice.searchAvailableRoom(bookingnew.getCheckInDate(), bookingnew.getCheckOutDate(),
					bookingnew.getRoomtype().getRoomtypeid());
			room=list.get(0);
			bookdetail.setRoom(room);
			bookingdetailsservice.save(bookdetail);
			promotions = promotionservice.findByPromId(bookingnew.getPromotion().getPromId());
			//String type=promotions.getType().toString();
			modelMap.put("bookingnew", bookingnew);
			modelMap.put("booktype", booktype);
			modelMap.put("promotions", promotions);
			//modelMap.put("type", type);
		}

		return "confirm";
	}

	@GetMapping("checkout/{bookingId}")
	private String getCheckout(@PathVariable("bookingId") int bookingId, ModelMap modelMap) {
		Invoice invoice = new Invoice();
		CreditCard card = creditcardservice.findId(1);
		Booking books = bookingservice.findId(bookingId);
		// Date checkOutDate = new Date();
		// checkOutDate=books.getCheckOutDate();
		// DateFormat df = new SimpleDateFormat("E, MMM dd yyyy HH:mm:ss");
		// String checkOut=df.format(checkOutDate);
		LocalDateTime invoiceDate = LocalDateTime.ofInstant(books.getCheckOutDate().toInstant(),
				ZoneId.systemDefault());
		double amount=books.getRoomtype().getPrice() * books.getNumberOfRooms()
				* (books.getCheckOutDate().getTime() - books.getCheckInDate().getTime()) / (60 * 60 * 24 * 1000);
		String type=books.getPromotion().getType().toString();
		if(type.equalsIgnoreCase("FIXED")) {
			amount =amount-books.getPromotion().getValue();
		}else {
			amount=amount-(amount*books.getPromotion().getValue()/100);
		}
		
		modelMap.put("invoice", invoice);
		modelMap.put("amount", amount);
		modelMap.put("card", card);
		modelMap.put("books", books);
		modelMap.put("invoiceDate", invoiceDate);
		return "checkout";
	}

	@PostMapping("done")
	private String getCheckout(@ModelAttribute("invoice") Invoice invoice, ModelMap modelMap) {
		// LocalDateTime
		// invoiceDate=LocalDateTime.ofInstant(invoice.getBooking().getCheckOutDate().toInstant(),
		// ZoneId.systemDefault());
		Booking bookdate = bookingservice.findId(invoice.getBooking().getBookingId());

		invoice.setInvoiceDate(LocalDateTime.ofInstant(bookdate.getCheckOutDate().toInstant(), ZoneId.systemDefault()));
		invoiceservice.save(invoice);
		return "redirect:/rooms";
	}

	@GetMapping("confirm")
	private String getConfirm(ModelMap modelMap) {
		CreditCard creditcard = new CreditCard();
		modelMap.put("creditcard", creditcard);
		return "confirm";
	}
}
