package com.pro.coloso.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pro.coloso.domain.User;

public interface UserService {
	
	public User save(User user);
	public void delete(User user);
	public void update(User user);	

}
