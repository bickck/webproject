package com.pro.coloso.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.pro.coloso.domain.Coupon;
import com.pro.coloso.domain.User;
import com.pro.coloso.repository.CouponRepository;
import com.pro.coloso.repository.UserRepository;
import com.pro.coloso.service.UserCouponService;

public class UserCouponServiceImpl implements UserCouponService {
	
	@Autowired
	private CouponRepository couponRepository;
	
	@Autowired
	private UserRepository userRepository;

	
	@Override
	public void useCoupon(User user) {
		// TODO Auto-generated method stub
		
		
	}
}