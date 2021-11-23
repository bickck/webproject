package com.pro.coloso.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Orders {

	@Id
	private Long id;
	
	@Column(name = "GOODSNAME")
	private String goodsName;
	
	@Column(name = "PRICE")
	private String price;
	
	
	
}
