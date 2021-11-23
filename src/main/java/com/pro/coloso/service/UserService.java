package com.pro.coloso.service;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pro.coloso.domain.User;
import com.pro.coloso.dto.RequestLoginDTO;

public interface UserService {

	public User save(User user);

	public void delete(User user);

	public User update(User user);
	
	public Optional<User> findUserPassword(String email);

}
