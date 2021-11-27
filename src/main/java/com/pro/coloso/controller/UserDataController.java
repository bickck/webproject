package com.pro.coloso.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pro.coloso.domain.User;
import com.pro.coloso.dto.RequestUserDTO;
import com.pro.coloso.service.UserService;

@RestController
@RequestMapping(path = "/userdata")
public class UserDataController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserService userservice;

	@PostMapping(value = "/findpasswd")
	public User findPassword(@RequestParam String email) throws IllegalAccessException {
		logger.info("call user findPassword username : " + email);
		
		Optional<User> user = userservice.findUserPassword(email);
		
		if(user == null) {
			logger.info("user not found : " + email);
			throw new IllegalAccessException("user not found : " + email);
		}
		
		return user.get();
	}
	
	@PostMapping(value ="/userinfo")
	public User userinfo() {
		
		return null;
	}
	@RequestMapping(method = RequestMethod.POST, name ="/classroom")
	public String userClassroom(@RequestBody RequestUserDTO userDTO) {
		return null;
	}
}
