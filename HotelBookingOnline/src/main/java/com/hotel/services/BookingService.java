package com.hotel.services;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.query.Param;

import com.hotel.models.Booking;
import com.hotel.models.Room;
import com.hotel.models.RoomType;

public interface BookingService {
	public Booking save(Booking booking);
	public Booking findId(int id);
}
