package com.hotel.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "roomtype")
public class RoomType {
	@Id
	@Column(name = "room_type_id")
	private String roomtypeid;
	@Column(name = "typeName")
	private String typeName;
	@Column(name = "description")
	private String description;
	@Column(name = "adult_capacity")
	private int adultcapacity;
	@Column(name = "children_capacity")
	private int childrencapacity;
	@Column(name = "price")
	private double price;
	@OneToMany(mappedBy = "roomtype", fetch = FetchType.EAGER)
	private List<Room> rooms=new ArrayList<Room>();
	@OneToMany(mappedBy = "roomtype", fetch = FetchType.EAGER)
	private List<Booking> bookings=new ArrayList<Booking>();
	public RoomType() {
		super();
	}
	public RoomType(String roomtypeid, String typeName, String description, int adultcapacity, int childrencapacity,
			double price, List<Room> rooms, List<Booking> bookings) {
		super();
		this.roomtypeid = roomtypeid;
		this.typeName = typeName;
		this.description = description;
		this.adultcapacity = adultcapacity;
		this.childrencapacity = childrencapacity;
		this.price = price;
		this.rooms = rooms;
		this.bookings = bookings;
	}
	public String getRoomtypeid() {
		return roomtypeid;
	}
	public void setRoomtypeid(String roomtypeid) {
		this.roomtypeid = roomtypeid;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getAdultcapacity() {
		return adultcapacity;
	}
	public void setAdultcapacity(int adultcapacity) {
		this.adultcapacity = adultcapacity;
	}
	public int getChildrencapacity() {
		return childrencapacity;
	}
	public void setChildrencapacity(int childrencapacity) {
		this.childrencapacity = childrencapacity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public List<Room> getRooms() {
		return rooms;
	}
	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}
	public List<Booking> getBookings() {
		return bookings;
	}
	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}
	

}
