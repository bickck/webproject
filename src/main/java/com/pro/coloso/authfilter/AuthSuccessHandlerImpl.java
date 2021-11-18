package com.pro.coloso.authfilter;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.annotations.Filter;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;


public class AuthSuccessHandlerImpl extends SavedRequestAwareAuthenticationSuccessHandler {
		
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.onAuthenticationSuccess(request, response, authentication);
		
		logger.info(authentication);
		//response.sendRedirect(getDefaultTargetUrl());
		response.sendRedirect("/");
	}
}
