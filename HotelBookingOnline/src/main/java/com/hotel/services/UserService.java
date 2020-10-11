package com.hotel.services;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.query.Param;

import com.hotel.models.Room;
import com.hotel.models.RoomType;
import com.hotel.models.User;

public interface UserService {
	public User save(User user);
}
