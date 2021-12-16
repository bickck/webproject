package com.pro.coloso.Admincontroller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

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
	public Coupon createCoupon() {

		// 오류있음 : 해당 날짜에 문제가 있음
		Calendar calendar1 = Calendar.getInstance();
		calendar1.set(2021, 9, 9);

		Calendar calendar2 = Calendar.getInstance();
		calendar2.set(2021, 9, 10);

		couponService.createCoupon(new Coupon("event", 15, new CouponPeriod(calendar1, calendar2)));

		return null;
	}
	
	@ResponseBody
	@RequestMapping(value = "/couponlists", method = RequestMethod.GET)
	public List<Coupon> allCouponList() {
		// 오류있음 :  -1일이 되어 출력됨
		return couponService.allCoupon();
	}

	@ResponseBody
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public Coupon testCoupon() {

		/*
		 * Calendar calendar1 = Calendar.getInstance(); calendar1.set(2021, 9, 10);
		 * 
		 * Calendar calendar2 = Calendar.getInstance(); calendar2.set(2021, 9, 11);
		 * 
		 * couponService.createCoupon(new Coupon("event", 15, new
		 * CouponPeriod(calendar1, calendar2)));
		 */
		return null;
	}
}
