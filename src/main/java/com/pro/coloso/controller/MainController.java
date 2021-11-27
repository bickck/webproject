package com.pro.coloso.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pro.coloso.domain.User;
import com.pro.coloso.dto.RequestLoginDTO;
import com.pro.coloso.dto.RequestUserDTO;
import com.pro.coloso.service.RequestAccountService;

@Controller
public class MainController {

	@Autowired
	private RequestAccountService requestAccountService;

	@GetMapping({ "/", "" })
	public String home() {
		return "home";
	}

	@GetMapping("/user/login")
	public String loginPage() {
		return "user/loginForm";
	}

	@GetMapping("/account/register")
	public String registerPage() {
		return "user/register";
	}

	@GetMapping("/account/findme")
	public String findPwd() {
		return "findPwd";
	}

	@PostMapping(value = "/auth/login", produces = MediaType.APPLICATION_JSON_VALUE)
	public ModelAndView login(@RequestBody RequestLoginDTO dto, HttpSession httpSession) {
		
		User user = requestAccountService.requestLoginDTO(dto);
		ModelAndView andView = new ModelAndView("/home");
		andView.addObject("userdto", new RequestUserDTO(user.getId(), user.getUsername()));
		
		return andView;
	}

}

/*
 * 메인 컨트롤러는 사이트에서 일어나는 모든 경로를 찾아준다.
 */