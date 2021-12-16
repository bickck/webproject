package com.pro.coloso.domain;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class CouponBaseEntity {

	@Column(name = "EVENTNAME")
	private String eventname;
	
	@Embedded
	@Column(name = "PERIOD")
	private CouponPeriod period;

	@Column(name = "DISCOUNT")
	private int discountrate;

	@Column(name = "CREATEBY")
	private String createBy;

	public CouponPeriod getPeriod() {
		return period;
	}

	public void setPeriod(CouponPeriod period) {
		this.period = period;
	}

	public String getEventname() {
		return eventname;
	}

	public void setEventname(String eventname) {
		this.eventname = eventname;
	}

	public int getDiscountrate() {
		return discountrate;
	}

	public void setDiscountrate(int discountrate) {
		this.discountrate = discountrate;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

}
