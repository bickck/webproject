package com.pro.coloso.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name ="Orders")
public class Orders {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(targetEntity = User.class ,fetch = FetchType.LAZY)
	@JoinColumn(name="EMAIL")
	private User user;

	@Column(name = "LECTURENAME")
	private String lecture;

	@Column(name = "PRICE")
	private int price;

	public Orders() {
		// TODO Auto-generated constructor stub
	}

	public Orders(User user, String lecture, int price) {
		super();
		this.user = user;
		this.lecture = lecture;
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getGoodsName() {
		return lecture;
	}

	public void setGoodsName(String goodsName) {
		this.lecture = goodsName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
