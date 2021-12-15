package com.pro.coloso.service;

import com.pro.coloso.domain.User;
import com.pro.coloso.domain.UserCoupon;

public interface UserCouponService {

	public void userCoupon(User user);
	
	public UserCoupon getUserCoupon(User user);

}
