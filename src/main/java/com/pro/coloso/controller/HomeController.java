package com.pro.coloso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping({ "/", "" })
	public String home() {
		System.out.println("out");
		return "home";
	}
	
	@GetMapping("/login")
	public String loginPage() {
		System.out.println("loginpage");
		return "user/loginForm";
	}
	
	@GetMapping("/register")
	public String registerPage() {
		System.out.println("register");
		return "user/register";
	}
	
}
