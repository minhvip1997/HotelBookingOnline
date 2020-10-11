package com.hotel.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hotel.models.Booking;
import com.hotel.models.BookingDetails;
import com.hotel.models.Room;
import com.hotel.repositories.BookingDetailsRepository;
import com.hotel.repositories.BookingRepository;
import com.hotel.repositories.RoomRepository;

@Service
@Transactional
public class BookingDetailsServiceImpl implements BookingDetailsService{
	 @Autowired
	 private BookingDetailsRepository bookingdetailsrepository;

	@Override
	public BookingDetails save(BookingDetails bookingdetails) {
		
		return bookingdetailsrepository.save(bookingdetails);
	}

	@Override
	public BookingDetails findId(int id) {
		// TODO Auto-generated method stub
		return bookingdetailsrepository.findById(id).get();
	}

	

}
