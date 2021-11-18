package com.pro.coloso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.pro.coloso.domain.User;
import com.pro.coloso.service.UserService;

import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping(value = "/user/register", produces = MediaType.APPLICATION_JSON_VALUE)
	public User save(@RequestBody User user) {
		userService.save(user);
		return user;
	}
	
	@PostMapping(value ="/user/update")
	public User update(@RequestBody User user) {
		return null;
	}
	
	@PostMapping(value ="/user/findPwd")
	public User findPassWd(@RequestBody User user) {
		return null;
	}
	
}
/*
 * 유저 컨트롤러는 회원가입 또는 계정 찾기등 회원에 관련된 모든 일을 처리한다.
 */
