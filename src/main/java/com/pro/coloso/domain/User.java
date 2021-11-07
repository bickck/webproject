package com.pro.coloso.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.pro.coloso.enumtype.UserType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "USER")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "USER_NAME")
	private String username;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "PHONE_NUMBER")
	private String phonenumber;

	@Column(name = "PASS_WORD")
	private String password;

	@Column(name = "USER_TYPE")
	@Enumerated(EnumType.STRING)
	private UserType userType;
	
	
	public User() {
		// TODO Auto-generated constructor stub
	}	
	
	public User(String username, String email, String phonenumber, String password) {
		super();
		this.username = username;
		this.email = email;
		this.phonenumber = phonenumber;
		this.password = password;
	}
	
	

	@Override
	public String toString() {
		return "User [username=" + username + ", email=" + email + ", phoneNumber=" + phonenumber + ", password="
				+ password + "]";
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


	public String getPhoneNumber() {
		return phonenumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phonenumber = phoneNumber;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public UserType getUserType() {
		return userType;
	}


	public void setUserType(UserType userType) {
		this.userType = userType;
	}
	
	

}
