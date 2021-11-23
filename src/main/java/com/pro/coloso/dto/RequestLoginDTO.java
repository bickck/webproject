package com.pro.coloso.dto;

import org.springframework.http.HttpStatus;

public class RequestLoginDTO {

	private String email;
	private String password;

	public RequestLoginDTO() {
		// TODO Auto-generated constructor stub
	}

	public RequestLoginDTO(String email, String password) {
		super();
		this.email = email;
		this.password = password;
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}