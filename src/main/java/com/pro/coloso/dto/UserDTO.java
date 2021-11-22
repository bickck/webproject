package com.pro.coloso.dto;

import javax.servlet.http.HttpSession;

public class UserDTO {

	private Long id;
	private String username;

	public UserDTO() {
		super();
	}

	public UserDTO(Long id, String username) {
		super();
		this.id = id;
		this.username = username;

	}

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

}
