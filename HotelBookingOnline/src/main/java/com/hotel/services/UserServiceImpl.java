package com.hotel.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hotel.models.Room;
import com.hotel.models.User;
import com.hotel.repositories.RoomRepository;
import com.hotel.repositories.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	 @Autowired
	 private UserRepository userrepository;

	@Override
	public User save(User user) {
		
		return userrepository.save(user);
	}
	

}
