package com.hotel.services;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.List;

import javax.mail.MessagingException;

import org.springframework.data.repository.query.Param;

import com.hotel.models.Booking;
import com.hotel.models.Room;
import com.hotel.models.RoomType;
import com.hotel.models.User;

public interface BookingService {
	public Booking save(Booking booking);
	public Booking findId(int id);
	public void sendVerificationEmail(Booking book,String siteURL) throws UnsupportedEncodingException, MessagingException;
}
