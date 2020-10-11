package com.hotel.services;

import java.util.Date;
import java.util.List;

import com.hotel.models.Promotion;




public interface PromotionService {
public Iterable<Promotion> findAll();
public Promotion findByPromId(int id);
public Promotion save(Promotion promotion);
public List<Promotion> searchPromotion(Date startdate,Date enddate,int promId);
}
