package com.pro.coloso.domain;

import java.time.LocalDateTime;

import javax.persistence.Embeddable;

@Embeddable
public class DueDate {

	private LocalDateTime start_date;

	private LocalDateTime end_date;

	public LocalDateTime getStart_date() {
		return start_date;
	}

	public void setStart_date(LocalDateTime start_date) {
		this.start_date = start_date;
	}

	public LocalDateTime getEnd_date() {
		return end_date;
	}

	public void setEnd_date(LocalDateTime end_date) {
		this.end_date = end_date;
	}

}
