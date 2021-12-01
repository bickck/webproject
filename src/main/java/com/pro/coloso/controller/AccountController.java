package com.pro.coloso.controller;

import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.pro.coloso.domain.User;
import com.pro.coloso.dto.RequestLoginDTO;
import com.pro.coloso.dto.RequestUserEntity;
import com.pro.coloso.dto.UserEntity;
import com.pro.coloso.dto.ResponseEntity;
import com.pro.coloso.dto.ResponsePassword;
import com.pro.coloso.service.RequestAccountService;
import com.pro.coloso.service.UserService;

@Controller
@RequestMapping(value = "/account")
public class AccountController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private RequestAccountService requestAccountService;

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/sign-in", method = RequestMethod.GET)
	public String loginPage() {
		return "/user/loginForm";
	}

	@GetMapping("/sign-up")
	public String registerPage() {
		return "user/register";
	}

	@GetMapping("/find-password")
	public String findPwd() {
		return "user/findPwd";
	}

	@PostMapping(value = "/login", produces = MediaType.APPLICATION_JSON_VALUE)
	public ModelAndView login(@RequestBody RequestLoginDTO dto, HttpSession httpSession) {

		User user = requestAccountService.requestLoginDTO(dto);
		ModelAndView andView = new ModelAndView("/home");
		andView.addObject("userdto", new UserEntity(user.getId(), user.getUsername(), user.getEmail(),
				user.getPassword(), user.getPassword()));

		return andView;
	}

	@ResponseBody
	@PostMapping(value = "/register")
	public ResponseEntity<String> save(@RequestBody RequestUserEntity userEntity) {
		logger.info("call user save useremail: " + userEntity.getEmail());
		// 저장을 하는데 아이디 중복이 있으면 안됌
		userService.save(userEntity);
		return new ResponseEntity<String>(HttpStatus.OK, "성공적으로 저장되었습니다.");
	}

	@ResponseBody
	@PostMapping(value = "/findpassword")
	public ResponseEntity<ResponsePassword> findPassword(@RequestParam String email) throws IllegalAccessException {
		logger.info("called user findPassword username : " + email);

		String userPassowrd = userService.findUserPassword(email);

		if (userPassowrd == null) {
			logger.info("email not found : " + email);	
			throw new IllegalAccessException("emil not found : " + email);
		}

		return new ResponseEntity<ResponsePassword>(HttpStatus.OK, new ResponsePassword(userPassowrd));
	}

}
