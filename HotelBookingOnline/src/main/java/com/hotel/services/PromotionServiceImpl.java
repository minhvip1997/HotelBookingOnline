package com.hotel.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hotel.models.Promotion;
import com.hotel.models.RoomType;
import com.hotel.repositories.PromotionRepository;
import com.hotel.repositories.TypeRoomRepository;
@Service
@Transactional
public class PromotionServiceImpl implements PromotionService{
 @Autowired
 private PromotionRepository promotionRepository;

@Override
public Iterable<Promotion> findAll() {
	
	return promotionRepository.findAll();
}

@Override
public Promotion save(Promotion promotion) {
	
	return promotionRepository.save(promotion);
}

@Override
public List<Promotion> searchPromotion(Date startdate, Date enddate, int proId) {
	
	return promotionRepository.searchPromotion(startdate, enddate, proId);
}

@Override
public Promotion findByPromId(int id) {
	
	return promotionRepository.findById(id).get();
}
	
}
