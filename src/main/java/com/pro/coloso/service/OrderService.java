package com.pro.coloso.service;

import com.pro.coloso.domain.Coupon;
import com.pro.coloso.domain.Lecture;
import com.pro.coloso.domain.User;

public interface OrderService {

	public void requestOrder(User user , Lecture lecture, Coupon coupon);
}
