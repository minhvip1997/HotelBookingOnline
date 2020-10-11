package com.hotel.services;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.query.Param;

import com.hotel.models.Room;
import com.hotel.models.RoomType;

public interface RoomService {
	public List<Room> searchAvailableRoom(Date checkInDate,Date checkOutDate,int roomType );
	public List<Room> findByRoomType(int id);
}
