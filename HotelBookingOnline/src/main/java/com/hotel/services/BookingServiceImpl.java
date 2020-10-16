package com.hotel.services;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.List;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hotel.models.Booking;
import com.hotel.models.Room;
import com.hotel.models.RoomType;
import com.hotel.repositories.BookingRepository;
import com.hotel.repositories.RoomRepository;
import com.hotel.repositories.TypeRoomRepository;

@Service
@Transactional
public class BookingServiceImpl implements BookingService{
	 @Autowired
	 private BookingRepository bookingRepository;
	 @Autowired
	 private TypeRoomService typeroomService;
	 @Autowired
		private JavaMailSender mailSender;
	@Override
	public Booking save(Booking booking) {
		// TODO Auto-generated method stub
		return bookingRepository.save(booking);
	}

	@Override
	public Booking findId(int id) {
		
		return bookingRepository.findById(id).get();
	}

	@Override
	public void sendVerificationEmail(Booking book, String siteURL)
			throws UnsupportedEncodingException, MessagingException {
		RoomType type=new RoomType();
		type=typeroomService.find(book.getRoomtype().getRoomtypeid());
		String subject = "Please verify your booking";
		String senderName = "Gwesty Hotel";
		String mailContent = "<p>Dear "+book.getUser().getName()+",</p>";
		//mailContent += "<p>Please click the link below to verify to your Booking: </p>";
		mailContent += "<p>Type Room Book: "+ type.getTypename()+",</p>";
		//mailContent += "<hr><img src='cid:RoomImage' />";
		mailContent += "<p>Day Check In: "+ book.getCheckInDate() +",</p>";
		mailContent += "<p>Day Check Out: "+ book.getCheckOutDate() +",</p>";
		mailContent += "<p>Guest Adult: "+ book.getAdult() +"|"+" Guest Children: "+book.getChildren()+",</p>";
		mailContent += "<p>Your Phone: "+book.getUser().getPhone()+",</p>";
		mailContent += "<p>Your Address: "+book.getUser().getAddress()+",</p>";
		mailContent += "<p>Your Promotion Code: "+book.getPromotion().getPromId()+",</p>";
		mailContent += "if there is an error please call hotel phone 035694987";
		//String verifyURL= siteURL + "/verify?code=" + +book.getUser().getVerificationCode();
		//mailContent += "<h3><a href=\"" + verifyURL + "\">VERIFY</a><h3>";
		mailContent += "<p>Thank you<br>The Gwesty Hotel</p>";
		MimeMessage message=mailSender.createMimeMessage();
		MimeMessageHelper helper=new MimeMessageHelper(message);
		helper.setFrom("tnminh1997123@gmail.com",senderName);
		helper.setTo(book.getUser().getEmail());
		helper.setSubject(subject);
		helper.setText(mailContent,true);
		//ClassPathResource resource=new ClassPathResource("/static/assets/images/hotel_detail_1_140x140.jpg");
		//helper.addInline("RoomImage", resource);
		mailSender.send(message);
		
	}
	

}
