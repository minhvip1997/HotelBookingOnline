package com.hotel.models;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "room")
public class Room {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "roomid")
	private int roomid;
	@Column(name = "roomnumber")
	private int roomnumber;
	@Column(name = "floor")
	private int floor;
	@Column(name = "description")
	private String description;
	@Column(name = "status")
	private String status;
	@ManyToOne
	@JoinColumn(name="room_type_id")
	private RoomType roomtype;
	@OneToMany(mappedBy = "room", fetch = FetchType.EAGER)
	private List<BookingDetails> bookingdetails = new ArrayList<BookingDetails>(0);
	public Room() {
		super();
	}
	public Room(int roomid, int roomnumber, int floor, String description, String status, RoomType roomtype,
			List<BookingDetails> bookingdetails) {
		super();
		this.roomid = roomid;
		this.roomnumber = roomnumber;
		this.floor = floor;
		this.description = description;
		this.status = status;
		this.roomtype = roomtype;
		this.bookingdetails = bookingdetails;
	}
	public int getRoomid() {
		return roomid;
	}
	public void setRoomid(int roomid) {
		this.roomid = roomid;
	}
	public int getRoomnumber() {
		return roomnumber;
	}
	public void setRoomnumber(int roomnumber) {
		this.roomnumber = roomnumber;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public RoomType getRoomtype() {
		return roomtype;
	}
	public void setRoomtype(RoomType roomtype) {
		this.roomtype = roomtype;
	}
	public List<BookingDetails> getBookingdetails() {
		return bookingdetails;
	}
	public void setBookingdetails(List<BookingDetails> bookingdetails) {
		this.bookingdetails = bookingdetails;
	}

}