package com.hotel.models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;





@Entity
@Table(name = "booking")
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bookingId")
	private int bookingId;
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
	@Enumerated(EnumType.STRING)
	private Status status;
	@Column(name = "note")
	private String note;
	@Column(name = "numberOfRooms")
	private int numberOfRooms;
	@Column(name = "adult")
	private int adult;
	@Column(name = "children")
	private int children;
	@Column(name = "Bookingcol")
	private String Bookingcol;
	@OneToMany(mappedBy = "booking", fetch = FetchType.EAGER)
	private List<BookingDetails> bookingdetails = new ArrayList<BookingDetails>(0);
	@OneToMany(mappedBy = "booking", fetch = FetchType.LAZY)
	private List<Invoice> invoices = new ArrayList<Invoice>(0);
	@OneToMany(mappedBy = "booking", fetch = FetchType.LAZY)
	private List<Charge> charges = new ArrayList<Charge>(0);
	@ManyToOne
	@JoinColumn(name="room_type_id")
	private RoomType roomtype;
	@ManyToOne
	@JoinColumn(name="userId")
	private User user;
	@ManyToOne
	@JoinColumn(name="promId")
	private Promotion promotion;
	public Booking(int bookingId, String bookinguid, LocalDateTime bookingDate, Date checkInDate, Date checkOutDate,
			String paymentType, Status status, String note, int numberOfRooms, int adult, int children,
			String bookingcol, List<BookingDetails> bookingdetails, List<Invoice> invoices, List<Charge> charges,
			RoomType roomtype, User user, Promotion promotion) {
		super();
		this.bookingId = bookingId;
		this.bookinguid = bookinguid;
		this.bookingDate = bookingDate;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.paymentType = paymentType;
		this.status = status;
		this.note = note;
		this.numberOfRooms = numberOfRooms;
		this.adult = adult;
		this.children = children;
		this.Bookingcol = bookingcol;
		this.bookingdetails = bookingdetails;
		this.invoices = invoices;
		this.charges = charges;
		this.roomtype = roomtype;
		this.user = user;
		this.promotion = promotion;
	}
	
	

	public Booking() {
		super();
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public String getBookinguid() {
		return bookinguid;
	}
	public void setBookinguid(String bookinguid) {
		this.bookinguid = bookinguid;
	}
	public LocalDateTime getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(LocalDateTime bookingDate) {
		this.bookingDate = bookingDate;
	}
	public Date getCheckInDate() {
		return checkInDate;
	}
	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}
	public Date getCheckOutDate() {
		return checkOutDate;
	}
	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public int getNumberOfRooms() {
		return numberOfRooms;
	}
	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}
	public int getAdult() {
		return adult;
	}
	public void setAdult(int adult) {
		this.adult = adult;
	}
	public int getChildren() {
		return children;
	}
	public void setChildren(int children) {
		this.children = children;
	}
	public String getBookingcol() {
		return Bookingcol;
	}
	public void setBookingcol(String bookingcol) {
		Bookingcol = bookingcol;
	}
	public List<BookingDetails> getBookingdetails() {
		return bookingdetails;
	}
	public void setBookingdetails(List<BookingDetails> bookingdetails) {
		this.bookingdetails = bookingdetails;
	}
	public List<Invoice> getInvoices() {
		return invoices;
	}
	public void setInvoices(List<Invoice> invoices) {
		this.invoices = invoices;
	}
	public List<Charge> getCharges() {
		return charges;
	}
	public void setCharges(List<Charge> charges) {
		this.charges = charges;
	}
	public RoomType getRoomtype() {
		return roomtype;
	}
	public void setRoomtype(RoomType roomtype) {
		this.roomtype = roomtype;
	}



	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}



	public Promotion getPromotion() {
		return promotion;
	}



	public void setPromotion(Promotion promotion) {
		this.promotion = promotion;
	}
	
	
}