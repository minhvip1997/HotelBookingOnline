package com.hotel.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "bookingdetails")
public class BookingDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "booking_details_id")
	private int bookingdetailsid;
	@ManyToOne
	@JoinColumn(name="bookingId")
	private Booking booking;
	@ManyToOne
	@JoinColumn(name="roomid")
	private Room room;
	public BookingDetails(int bookingdetailsid, Booking booking, Room room) {
		super();
		this.bookingdetailsid = bookingdetailsid;
		this.booking = booking;
		this.room = room;
	}
	public BookingDetails() {
		super();
	}
	public int getBookingdetailsid() {
		return bookingdetailsid;
	}
	public void setBookingdetailsid(int bookingdetailsid) {
		this.bookingdetailsid = bookingdetailsid;
	}
	public Booking getBooking() {
		return booking;
	}
	public void setBooking(Booking booking) {
		this.booking = booking;
	}
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
	
	
	
}
