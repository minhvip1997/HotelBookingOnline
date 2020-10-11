package com.hotel.services;

import java.util.List;

import com.hotel.models.RoomType;



public interface TypeRoomService {
public List<RoomType> findAll();
public RoomType find(int id);
public RoomType save(RoomType roomtype);
}
