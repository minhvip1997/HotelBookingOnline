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
@Table(name = "invoice")
public class Invoice {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "invoiceId")
	private int invoiceId;
	@Column(name = "invoiceDate")
	private LocalDateTime invoiceDate;
	@Column(name = "amount")
	private double amount;
	@ManyToOne
	@JoinColumn(name="bookingId")
	private Booking booking;
	@ManyToOne
	@JoinColumn(name="cardNumber")
	private CreditCard creditcard;
	public Invoice(int invoiceId, LocalDateTime invoiceDate, double amount, Booking booking, CreditCard creditcard) {
		super();
		this.invoiceId = invoiceId;
		this.invoiceDate = invoiceDate;
		this.amount = amount;
		this.booking = booking;
		this.creditcard = creditcard;
	}
	public Invoice() {
		super();
	}
	public int getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}
	public LocalDateTime getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(LocalDateTime invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Booking getBooking() {
		return booking;
	}
	public void setBooking(Booking booking) {
		this.booking = booking;
	}
	public CreditCard getCreditcard() {
		return creditcard;
	}
	public void setCreditcard(CreditCard creditcard) {
		this.creditcard = creditcard;
	}
	
	
	
}
