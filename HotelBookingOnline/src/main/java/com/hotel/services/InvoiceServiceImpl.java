package com.hotel.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hotel.models.Booking;
import com.hotel.models.CreditCard;
import com.hotel.models.Invoice;
import com.hotel.models.Room;
import com.hotel.repositories.BookingRepository;
import com.hotel.repositories.CreditCardRepository;
import com.hotel.repositories.InvoiceRepository;
import com.hotel.repositories.RoomRepository;

@Service
@Transactional
public class InvoiceServiceImpl implements InvoiceService{
	 @Autowired
	 private InvoiceRepository invoiceRepository;

	@Override
	public Invoice save(Invoice invoice) {
		
		return invoiceRepository.save(invoice);
	}

	@Override
	public Invoice findId(int id) {
		
		return invoiceRepository.findById(id).get();
	}

}
