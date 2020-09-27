package com.hotel.models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "booking")
public class Booking {
	@Id
	@Column(name = "bookingId")
	private String bookingId;
	@Column(name = "booking_uid")
	private String bookinguid;
	@Column(name = "bookingDate")
	private LocalDateTime bookingDate;
	@Column(name = "checkInDate")
	private Date checkInDate;
	@Column(name = "checkOutDate")
	private Date checkOutDate;
	@Column(name = "paymentType")
	private String paymentType;
	
}
