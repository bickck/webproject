package com.pro.coloso.dto;

import javax.servlet.http.HttpSession;

public class RequestUserDTO {

	private Long id;
	private String username;
	private String email;

	public RequestUserDTO() {
		super();
	}

	public RequestUserDTO(Long id, String username) {
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
