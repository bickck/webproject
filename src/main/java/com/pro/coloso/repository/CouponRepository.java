package com.pro.coloso.repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import com.pro.coloso.domain.Coupon;

public interface CouponRepository extends JpaRepository<Coupon, Long> {
	

	
	
}
