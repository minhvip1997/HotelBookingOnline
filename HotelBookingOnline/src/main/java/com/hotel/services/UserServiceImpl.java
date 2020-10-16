package com.hotel.services;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.List;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hotel.models.Booking;
import com.hotel.models.Room;
import com.hotel.models.User;
import com.hotel.repositories.RoomRepository;
import com.hotel.repositories.UserRepository;

import net.bytebuddy.utility.RandomString;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userrepository;
	@Autowired
	private JavaMailSender mailSender;

	@Override
	public User save(User user) {
		
		return userrepository.save(user);
	}

	
}
