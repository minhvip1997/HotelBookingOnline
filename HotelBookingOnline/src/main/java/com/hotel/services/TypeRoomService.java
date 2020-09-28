package com.hotel.services;

import java.util.List;

import com.hotel.models.RoomType;



public interface TypeRoomService {
public Iterable<RoomType> findAll();
public RoomType find(int id);
}
