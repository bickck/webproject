package com.pro.coloso.serviceImpl;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.pro.coloso.controller.UserController;
import com.pro.coloso.domain.Coupon;
import com.pro.coloso.domain.User;
import com.pro.coloso.dto.RequestLoginEntity;
import com.pro.coloso.dto.RequestUserEntity;
import com.pro.coloso.enumtype.UserType;
import com.pro.coloso.repository.RemoveBackUpRepository;
import com.pro.coloso.repository.UserRepository;
import com.pro.coloso.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RemoveBackUpRepository backUpRepository;
	
	@Override
	public Coupon getCouponForUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public User save(RequestUserEntity userEntity) {
		User user = new User(userEntity.getUsername(),userEntity.getEmail(),userEntity.getPhonenumber(),userEntity.getPassword());
		user.setUserType(UserType.STUDENT);
		return userRepository.saveAndFlush(user);
		
	}

	@Override
	@Transactional
	public void delete(User user) {
		// TODO Auto-generated method stub
		backUpRepository.save(user);
		userRepository.delete(user);
	}

	@Override
	@Transactional
	public User update(User user) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String findUserPassword(String email) {
		// TODO Auto-generated method stub
		logger.info("get user email : "+ userRepository.findByEmail(email));
		
		return userRepository.findByEmail(email);
	}

	@Override
	public String duplicationEmail(String email) {
		// TODO Auto-generated method stub
		return userRepository.findByEmail(email);
	}

}
