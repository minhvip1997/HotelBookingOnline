package com.hotel.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.hotel.models.Room;
@Repository
public interface RoomRepository extends CrudRepository<Room, Integer>{
	@Query(value="SELECT  * from room AS r, roomtype as t\r\n" + 
			"where t.room_type_id = :room_type_Id \r\n" + 
			"and r.room_type_id = t.room_type_id \r\n" + 
			"and not exists \r\n" + 
			"(select * from booking as u ,bookingdetails AS us\r\n" + 
			"where (u.checkInDate >= :checkInDate and u.checkOutDate <= :checkOutDate)\r\n" + 
			"and r.room_type_id = u.room_type_id and us.roomid=r.roomid and u.bookingId=us.bookingId)  ", nativeQuery = true)
	public List<Room> searchAvailableRoom(@Param("checkInDate") Date checkInDate,
			@Param("checkOutDate") Date checkOutDate,@Param("room_type_Id") int room_type_Id );
	@Query(value="SELECT  * from room AS r\r\n" + 
			"where r.room_type_id = 6", nativeQuery = true)
	public List<Room> findRoom(int id);
}
