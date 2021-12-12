package com.pro.coloso.handlerconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.pro.coloso.handler.LoginRequestHandler;

@Configuration
public class LoginHandlerConfigure implements WebMvcConfigurer{
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
		//WebMvcConfigurer.super.addInterceptors(registry);
		registry.addInterceptor(new LoginRequestHandler())
		.excludePathPatterns("/account/login")
		.addPathPatterns("/account/cookies");
	}
}
