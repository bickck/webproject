package com.pro.coloso.domain;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.hibernate.annotations.Generated;

@Entity(name = "coupon")
public class Coupon extends CouponBaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "ISUSED")
	private boolean isUsed;

	@Override
	public void setEventname(String eventname) {
		// TODO Auto-generated method stub
		super.setEventname(eventname);
	}

	public Coupon() {
		// TODO Auto-generated constructor stub
	}

	public Coupon(String couponEventName, int discountRate, CouponPeriod period) {
		super();
		super.setEventname(couponEventName);
		super.setDiscountrate(discountRate);
		super.setPeriod(period);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
