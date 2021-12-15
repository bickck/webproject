package com.pro.coloso.domain;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Generated;

@Entity(name = "coupon")
public class Coupon {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "COUPON_EVENT_NAME")
	private String couponEventName;

	@Column(name = "DISCOUNTRATE")
	private int discountRate;

	@Embedded
	@Column(name = "PERIOD")
	private CouponPeriod period;
	
	public Coupon() {
		// TODO Auto-generated constructor stub
	}

	public Coupon(String couponEventName, int discountRate, CouponPeriod period) {
		super();
		this.couponEventName = couponEventName;
		this.discountRate = discountRate;
		this.period = period;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCouponEventName() {
		return couponEventName;
	}

	public void setCouponEventName(String couponEventName) {
		this.couponEventName = couponEventName;
	}

	public CouponPeriod getDueDate() {
		return period;
	}

	public void setDueDate(CouponPeriod dueDate) {
		this.period = dueDate;
	}

	public int getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}

}
