package com.hotel.services;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.query.Param;

import com.hotel.models.Booking;
import com.hotel.models.BookingDetails;
import com.hotel.models.Room;
import com.hotel.models.RoomType;

public interface BookingDetailsService {
	public BookingDetails save(BookingDetails booking);
	public BookingDetails findId(int id);
}
