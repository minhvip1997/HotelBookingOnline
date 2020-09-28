package com.hotel.models;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "charge")
public class Charge {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "chargeId")
	private int chargeId;
	@Column(name = "chargeDate")
	private LocalDateTime chargeDate;
	@Column(name = "quantity")
	private int quantity;
	@ManyToOne
	@JoinColumn(name="serviceId")
	private Service service;
	@ManyToOne
	@JoinColumn(name="bookingId")
	private Booking booking;
	public Charge(int chargeId, LocalDateTime chargeDate, int quantity, Service service, Booking booking) {
		super();
		this.chargeId = chargeId;
		this.chargeDate = chargeDate;
		this.quantity = quantity;
		this.service = service;
		this.booking = booking;
	}
	public Charge() {
		super();
	}
	public int getChargeId() {
		return chargeId;
	}
	public void setChargeId(int chargeId) {
		this.chargeId = chargeId;
	}
	public LocalDateTime getChargeDate() {
		return chargeDate;
	}
	public void setChargeDate(LocalDateTime chargeDate) {
		this.chargeDate = chargeDate;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Service getService() {
		return service;
	}
	public void setService(Service service) {
		this.service = service;
	}
	public Booking getBooking() {
		return booking;
	}
	public void setBooking(Booking booking) {
		this.booking = booking;
	}
	
	
	
}
