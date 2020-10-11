package com.hotel.services;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hotel.models.Room;
import com.hotel.repositories.RoomRepository;

@Service
@Transactional
public class RoomServiceImpl implements RoomService{
	 @Autowired
	 private RoomRepository roomrepository;
	@Override
	public List<Room> searchAvailableRoom(Date checkInDate, Date checkOutDate, int room_type_Id) {
		
			return roomrepository.searchAvailableRoom(checkInDate, checkOutDate, room_type_Id);
	}
	@Override
	public List<Room> findByRoomType(int id) {
		
		return roomrepository.findRoom(id);
	}

}
