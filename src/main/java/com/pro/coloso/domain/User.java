package com.pro.coloso.domain;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.format.annotation.DateTimeFormat;

import com.pro.coloso.enumtype.UserType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "USER")
@EntityListeners(AuditingEntityListener.class)
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

	@Column(name = "CREATETIME")
	@CreationTimestamp
	private LocalDateTime createDateTime = LocalDateTime.now();

	@Column(name = "UPDATETIME")
	@UpdateTimestamp
	private LocalDateTime updateDateTime = LocalDateTime.now();

	@OneToMany(mappedBy = "lecturename")
	private List<Lecture> lecturenames = new ArrayList<Lecture>();

	@OneToMany(mappedBy = "coupon_name")
	private List<Coupon> havingCoupon = new ArrayList<Coupon>();

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

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
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

	public LocalDateTime getCreateDateTime() {
		return createDateTime;
	}

	public void setCreateDateTime(LocalDateTime createDateTime) {
		this.createDateTime = createDateTime;
	}

	public LocalDateTime getUpdateDateTime() {
		return updateDateTime;
	}

	public void setUpdateDateTime(LocalDateTime updateDateTime) {
		this.updateDateTime = updateDateTime;
	}

	public List<Lecture> getLecturenames() {
		return lecturenames;
	}

	public void setLecturenames(List<Lecture> lecturenames) {
		this.lecturenames = lecturenames;
	}

	public List<Coupon> getHavingCoupon() {
		return havingCoupon;
	}

	public void setHavingCoupon(List<Coupon> havingCoupon) {
		this.havingCoupon = havingCoupon;
	}

	
}
