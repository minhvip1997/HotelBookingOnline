package com.hotel.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hotel.models.Booking;
import com.hotel.models.CreditCard;
import com.hotel.models.Room;
import com.hotel.repositories.BookingRepository;
import com.hotel.repositories.CreditCardRepository;
import com.hotel.repositories.RoomRepository;

@Service
@Transactional
public class CreditCardServiceImpl implements CreditCardService{
	 @Autowired
	 private CreditCardRepository creditcardrepository;

	@Override
	public CreditCard save(CreditCard creditcard) {
		
		return creditcardrepository.save(creditcard);
	}

	@Override
	public CreditCard findId(int id) {
		
		return creditcardrepository.findById(id).get();
	}


	

}
