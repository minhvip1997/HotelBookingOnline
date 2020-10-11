package com.hotel.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hotel.models.Booking;
import com.hotel.models.Room;
import com.hotel.repositories.BookingRepository;
import com.hotel.repositories.RoomRepository;

@Service
@Transactional
public class BookingServiceImpl implements BookingService{
	 @Autowired
	 private BookingRepository bookingRepository;

	@Override
	public Booking save(Booking booking) {
		// TODO Auto-generated method stub
		return bookingRepository.save(booking);
	}

	@Override
	public Booking findId(int id) {
		
		return bookingRepository.findById(id).get();
	}
	

}
