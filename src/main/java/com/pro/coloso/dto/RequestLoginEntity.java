package com.pro.coloso.dto;

import org.springframework.http.HttpStatus;

public class RequestLoginEntity {

	private String email;
	private String password;

	public RequestLoginEntity(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public RequestLoginEntity() {
		// TODO Auto-generated constructor stub
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

	@Override
	public String toString() {
		return "RequestLoginDTO [email=" + email + ", password=" + password + "]";
	}

}
