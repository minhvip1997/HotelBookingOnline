package com.hotel.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "creditcard")
public class CreditCard {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cardNumber")
	private int cardNumber;
	@Column(name = "ownerName")
	private String ownerName;
	@Column(name = "expiryMonth")
	private int expiryMonth;
	@Column(name = "expiryYear")
	private int expiryYear;
	@Column(name = "cvv_code")
	private int cvvcode;
	@OneToMany(mappedBy = "creditcard", fetch = FetchType.EAGER)
	private List<Invoice> invoices = new ArrayList<Invoice>(0);
	public CreditCard(int cardNumber, String ownerName, int expiryMonth, int expiryYear, int cvvcode,
			List<Invoice> invoices) {
		super();
		this.cardNumber = cardNumber;
		this.ownerName = ownerName;
		this.expiryMonth = expiryMonth;
		this.expiryYear = expiryYear;
		this.cvvcode = cvvcode;
		this.invoices = invoices;
	}
	public CreditCard() {
		super();
	}
	public int getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getExpiryMonth() {
		return expiryMonth;
	}
	public void setExpiryMonth(int expiryMonth) {
		this.expiryMonth = expiryMonth;
	}
	public int getExpiryYear() {
		return expiryYear;
	}
	public void setExpiryYear(int expiryYear) {
		this.expiryYear = expiryYear;
	}
	public int getCvvcode() {
		return cvvcode;
	}
	public void setCvvcode(int cvvcode) {
		this.cvvcode = cvvcode;
	}
	public List<Invoice> getInvoices() {
		return invoices;
	}
	public void setInvoices(List<Invoice> invoices) {
		this.invoices = invoices;
	}
	
	
	
	
}
