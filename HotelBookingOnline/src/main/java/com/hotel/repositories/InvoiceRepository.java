package com.hotel.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hotel.models.Booking;
import com.hotel.models.CreditCard;
import com.hotel.models.Invoice;
@Repository
public interface InvoiceRepository extends CrudRepository<Invoice, Integer>{

}
