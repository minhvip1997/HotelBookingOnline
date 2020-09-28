package com.hotel.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hotel.models.RoomType;
import com.hotel.repositories.TypeRoomRepository;
@Service
@Transactional
public class TypeRoomServiceImpl implements TypeRoomService{
 @Autowired
 private TypeRoomRepository typerepository;

@Override
public Iterable<RoomType> findAll() {
	
	return typerepository.findAll();
}

@Override
public RoomType find(int id) {
	
	return typerepository.findById(id).get();
}
	
}
