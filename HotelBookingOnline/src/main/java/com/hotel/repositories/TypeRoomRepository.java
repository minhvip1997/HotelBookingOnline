package com.hotel.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hotel.models.RoomType;
@Repository
public interface TypeRoomRepository extends CrudRepository<RoomType, Integer>{

}
