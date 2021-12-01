package com.pro.coloso.service;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pro.coloso.domain.Coupon;
import com.pro.coloso.domain.User;
import com.pro.coloso.dto.RequestLoginDTO;
import com.pro.coloso.dto.RequestUserEntity;

public interface UserService {

	public User save(RequestUserEntity user);

	public void delete(User user);

	public User update(User user);
	
	public String findUserPassword(String email);
	
	public Coupon getCouponForUser(User user);

}
