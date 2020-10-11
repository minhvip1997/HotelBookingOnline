package com.hotel.services;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.query.Param;

import com.hotel.models.Booking;
import com.hotel.models.CreditCard;
import com.hotel.models.Invoice;
import com.hotel.models.Room;
import com.hotel.models.RoomType;

public interface InvoiceService {
	public Invoice save(Invoice invoice);
	public Invoice findId(int id);
}