package com.pro.coloso.domain;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class CouponPeriod {

	@Temporal(TemporalType.DATE)
	private Calendar startDate;

	@Temporal(TemporalType.DATE)
	private Calendar endDate;
	
	public CouponPeriod() {
		// TODO Auto-generated constructor stub
	}
	
	public CouponPeriod(Calendar startDate, Calendar endDate) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public Calendar getStartDate() {
		return startDate;
	}

	public void setStartDate(Calendar startDate) {
		this.startDate = startDate;
	}

	public Calendar getEndDate() {
		return endDate;
	}

	public void setEndDate(Calendar endDate) {
		this.endDate = endDate;
	}	
	
}
