package com.pro.coloso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping({ "/", "" })
	public String home() {
		System.out.println("out");
		return "home";
	}
	
	@GetMapping("/account/login")
	public String loginPage() {
		System.out.println("loginpage");
		return "user/loginForm";
	}
	
	@GetMapping("/account/register")
	public String registerPage() {
		System.out.println("register");
		return "user/register";
	}
	
	@GetMapping("/account/findme")
	public String findPwd() {
		return "findPwd";
	}
	
}

/*
 * 메인 컨트롤러는 사이트에서 일어나는 모든 경로를 찾아준다.
 */