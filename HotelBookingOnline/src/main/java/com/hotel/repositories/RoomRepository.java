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
	/*@Query(value="SELECT  * from room AS r, roomtype as t\r\n" + 
			"where t.room_type_id = :room_type_Id \r\n" + 
			"and r.room_type_id = t.room_type_id \r\n" + 
			"and not exists \r\n" + 
			"(select * from booking as u ,bookingdetails AS us\r\n" + 
			"where (u.checkInDate <= :checkInDate and u.checkOutDate >= :checkOutDate)\r\n" + 
			"and r.room_type_id = u.room_type_id and us.roomid=r.roomid and u.bookingId=us.bookingId)  ", nativeQuery = true)*/
	@Query(value="SELECT * FROM room AS r WHERE  r.room_type_id = ?3 and  roomid NOT IN \r\n" + 
			"(\r\n" + 
			"    SELECT roomid \r\n" + 
			"    FROM   booking B\r\n" + 
			"           JOIN bookingdetails RB\r\n" + 
			"               ON B.bookingId = RB.bookingId\r\n" + 
			"    WHERE  (B.checkInDate <= ?1 AND B.checkOutDate >= ?1) \r\n" + 
			"           OR (B.checkInDate < ?2 AND B.checkOutDate >= ?2 ) \r\n" + 
			"           OR (?1 <= B.checkInDate AND ?2 >= B.checkInDate)  \r\n" + 
			")",nativeQuery = true)
	public List<Room> searchAvailableRoom( Date checkInDate,
			Date checkOutDate, int room_type_Id );
	@Query(value="SELECT  * from room AS r\r\n" + 
			"where r.room_type_id = 6", nativeQuery = true)
	public List<Room> findRoom(int id);
}
