package com.pro.coloso.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import com.pro.coloso.domain.User;
import com.pro.coloso.dto.RequestLoginDTO;
import com.pro.coloso.dto.RequestUserDTO;
import com.pro.coloso.service.RequestAccountService;

@Controller(value = "/account")
public class AccountController {
	
	@Autowired
	private RequestAccountService requestAccountService;

	@GetMapping("/sing-in")
	public String loginPage() {
		return "user/loginForm";
	}

	@GetMapping("/sing-up")
	public String registerPage() {
		return "user/register";
	}

	@GetMapping("/find-password")
	public String findPwd() {
		return "findPwd";
	}

	@PostMapping(value = "/login", produces = MediaType.APPLICATION_JSON_VALUE)
	public ModelAndView login(@RequestBody RequestLoginDTO dto, HttpSession httpSession) {
		
		User user = requestAccountService.requestLoginDTO(dto);
		ModelAndView andView = new ModelAndView("/home");
		andView.addObject("userdto", new RequestUserDTO(user.getId(), user.getUsername()));
		
		return andView;
	}


}
