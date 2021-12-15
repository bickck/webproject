package com.pro.coloso.domain;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "USERCOUPON")
public class UserCoupon {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "USER_EMAIL")
	private String username;

	@Column(name = "COUPON_NAME")
	private String coupon_name;

	@Column(name = "DISCOUNT")
	private int discount;

	@Embedded
	@Column(name = "DUE_DATE")
	private CouponPeriod dueDate;

	@Column(name = "USED")
	private boolean used;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCoupon_name() {
		return coupon_name;
	}

	public void setCoupon_name(String coupon_name) {
		this.coupon_name = coupon_name;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public CouponPeriod getDueDate() {
		return dueDate;
	}

	public void setDueDate(CouponPeriod dueDate) {
		this.dueDate = dueDate;
	}

	public boolean isUsed() {
		return used;
	}

	public void setUsed(boolean used) {
		this.used = used;
	}

}
