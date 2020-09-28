package com.hotel.models;

import java.util.ArrayList;
import java.util.Date;
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
@Table(name = "promotion")
public class Promotion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "promId")
	private int promId;
	@Column(name = "promname")
	private String promname;
	@Column(name = "description")
	private String description;
	@Column(name = "startdate")
	private Date startdate;
	@Column(name = "enddate")
	private Date enddate;
	@Column(name = "code")
	private String code;
	private Type type;
	@OneToMany(mappedBy = "promotion", fetch = FetchType.LAZY)
	private List<Booking> bookings=new ArrayList<Booking>();
	public Promotion(int promId, String promname, String description, Date startdate, Date enddate, String code,
			Type type, List<Booking> bookings) {
		super();
		this.promId = promId;
		this.promname = promname;
		this.description = description;
		this.startdate = startdate;
		this.enddate = enddate;
		this.code = code;
		this.type = type;
		this.bookings = bookings;
	}
	public Promotion() {
		super();
	}
	public int getPromId() {
		return promId;
	}
	public void setPromId(int promId) {
		this.promId = promId;
	}
	public String getPromname() {
		return promname;
	}
	public void setPromname(String promname) {
		this.promname = promname;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public Date getEnddate() {
		return enddate;
	}
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public List<Booking> getBookings() {
		return bookings;
	}
	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}
	
	
}
