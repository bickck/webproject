package com.pro.coloso.serviceImpl;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.pro.coloso.domain.User;
import com.pro.coloso.repository.RemoveBackUpRepository;
import com.pro.coloso.repository.UserRepository;
import com.pro.coloso.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RemoveBackUpRepository backUpRepository;
	
	@Transactional
	public User save(User user) {
		return userRepository.save(user);
	}

	@Transactional
	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		backUpRepository.save(user);
		userRepository.delete(user);
		
	}

	@Transactional
	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	
}
