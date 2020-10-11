package com.hotel.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.hotel.models.Promotion;

@Repository
public interface PromotionRepository extends CrudRepository<Promotion, Integer>{
	@Query(value="select * from promotion as p \r\n" + 
			"where p.startDate<= :startDate and p.endDate >= :endDate and promId= :promId", nativeQuery = true)
	public List<Promotion> searchPromotion(@Param("startDate") Date startDate,
			@Param("endDate") Date endDate,@Param("promId") int promId);
	public Promotion findByPromId(int id);
}
