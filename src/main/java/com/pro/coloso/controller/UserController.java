package com.pro.coloso.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pro.coloso.domain.User;
import com.pro.coloso.enumtype.UserType;
import com.pro.coloso.service.UserService;

@RestController
public class UserController {
	
	
	@Autowired
	private UserService userService;
	
	@PostMapping(value = "/user/register", produces = MediaType.APPLICATION_JSON_VALUE)
	public User save(@RequestBody User user) {
		user.setUserType(UserType.STUDENT);
		userService.save(user);
		System.out.println(user);
		return user;
	}
	
	@PostMapping(value ="/user/update")
	public User update(@RequestBody User user) {
		return null;
	}
	

}
