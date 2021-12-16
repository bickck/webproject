package com.pro.coloso.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pro.coloso.domain.Coupon;

import com.pro.coloso.repository.CouponRepository;
import com.pro.coloso.service.CouponService;

@Service
public class CouponServiceImpl implements CouponService {
	
	@Autowired
	private CouponRepository couponRepository;

	
	@Override
	@Transactional
	public Coupon createCoupon(Coupon coupon) {
		// TODO Auto-generated method stub
		return couponRepository.save(coupon);
	}
	
	@Override
	public Coupon getCoupon(Coupon coupon) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<Coupon> allCoupon() {
		// TODO Auto-generated method stub
		return couponRepository.findAll();
	}
	
}
