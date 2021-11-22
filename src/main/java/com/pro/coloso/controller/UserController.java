package com.pro.coloso.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.Principal;
import java.util.logging.LogManager;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.xml.ws.ResponseWrapper;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import com.pro.coloso.domain.User;
import com.pro.coloso.dto.RequestLoginDTO;
import com.pro.coloso.dto.ResponseDTO;
import com.pro.coloso.dto.UserDTO;
import com.pro.coloso.service.RequestAccountService;
import com.pro.coloso.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserService userService;

	@PostMapping(value = "/register")
	public User save(@RequestBody User user) {
		logger.info("call user save useremail: "+ user.getEmail());
		userService.save(user);
		return user;
	}

	@PostMapping(value = "/update")
	public User update(@RequestBody User user) {
		return null;
	}

	@PostMapping(value = "/findPwd")
	public User findPassword(@RequestBody User user) {
		return null;
	}

	@PostMapping(value = "/user/delete")
	public void deleteUser(@RequestBody UserDTO user) {
		logger.info("call user delete username" + user.getUsername());
	}

}
/*
 * 유저 컨트롤러는 회원가입 또는 계정 찾기등 회원에 관련된 모든 일을 처리한다.
 */
