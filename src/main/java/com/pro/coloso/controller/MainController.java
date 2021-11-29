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

	@GetMapping({ "/", "" })
	public String home() {
		return "home";
	}
}

/*
 * 메인 컨트롤러는 사이트에서 일어나는 모든 경로를 찾아준다.
 */