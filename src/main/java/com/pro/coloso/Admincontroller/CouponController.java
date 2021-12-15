package com.pro.coloso.Admincontroller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pro.coloso.controller.UserController;
import com.pro.coloso.domain.Coupon;
import com.pro.coloso.domain.CouponPeriod;
import com.pro.coloso.service.CouponService;

// 이 컨트롤러는 관리자만 접근할 수 있음

@Controller
@RequestMapping(value = "/coupon")
public class CouponController {

	private static final Logger logger = LoggerFactory.getLogger(CouponController.class);

	@Autowired
	private CouponService couponService;

	@ResponseBody
	@RequestMapping(value = "/createcoupon", method = RequestMethod.GET)
	public Coupon setCoupon() {

		Calendar calendar1 = Calendar.getInstance();
		calendar1.set(2021, 10, 10);
		
		Calendar calendar2 = Calendar.getInstance();
		calendar2.set(2021, 10, 11);
		
		System.out.println();
		
		couponService.createCoupon(new Coupon("event", 15, new CouponPeriod(calendar1, calendar2)));

		return null;
	}
}
