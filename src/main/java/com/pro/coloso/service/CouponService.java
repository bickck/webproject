package com.pro.coloso.service;

import java.util.List;

import com.pro.coloso.domain.Coupon;

public interface CouponService {

	public Coupon createCoupon(Coupon coupon);
	
	public Coupon getCoupon(Coupon coupon);
	
	public List<Coupon> allCoupon();
}
