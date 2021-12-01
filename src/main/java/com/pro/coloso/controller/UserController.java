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
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import com.pro.coloso.domain.User;
import com.pro.coloso.dto.RequestLoginDTO;
import com.pro.coloso.dto.RequestUserEntity;
import com.pro.coloso.dto.ResponseEntity;
import com.pro.coloso.dto.UserEntity;
import com.pro.coloso.service.RequestAccountService;
import com.pro.coloso.service.UserService;

@Controller
@RequestMapping("/me")
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserService userService;

	@GetMapping(value ="/info")
	public String userinfo() {
		
		return "me/info";
	}
	
	@RequestMapping(method = RequestMethod.POST, name ="/classroom")
	public String userClassroom() {
		return "me/classroom";
	}
	
	@PostMapping(value = "/delete")
	public void deleteUser(@RequestBody UserEntity user) {
		logger.info("call user delete username" + user.getUsername());
	}
	
	@PostMapping(value ="/update")
	public void infoUpdate(@RequestBody RequestUserEntity entity) {
		
	}
}
/*
 * 유저 컨트롤러는 회원가입 또는 계정 찾기등 회원에 관련된 모든 일을 처리한다.
 * Mapping 전 세션이 없다면 이 컨트롤러를 사용할 수 없다.
 */
