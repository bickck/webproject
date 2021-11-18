package com.pro.coloso.authconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.web.bind.annotation.RequestBody;

import com.pro.coloso.authfilter.AuthFailureHandlerImpl;
import com.pro.coloso.authfilter.AuthSuccessHandlerImpl;
import com.pro.coloso.authuserdetails.AuthUserDetailService;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private AuthUserDetailService authUserDetailService;

	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

	// 정적 자원에 대해서 security 설정으 적용하지 않음
	@Override
	public void configure(WebSecurity web) throws Exception {
		// TODO Auto-generated method stub
		web.ignoring().requestMatchers(PathRequest.toStaticResources().atCommonLocations());
		
	}


	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http
		.authorizeRequests()
			.antMatchers("/","/event/**", "/user/**", "/account/**","/test")
			.anonymous()
			.anyRequest().authenticated()
		.and()
			.csrf()
			.ignoringAntMatchers("/user/login")
			.ignoringAntMatchers("/auth/logining")
		.and()
			.formLogin()
			.loginPage("/user/login")
			.loginProcessingUrl("auth/logining")
			.defaultSuccessUrl("/",true)
			.successHandler(authSuccessHandlerImpl())
			.failureHandler(authFailureHandlerImpl())
		.and()
			.logout()
			.logoutUrl("/logout")
			.deleteCookies("JSESSIONID")
			.logoutSuccessUrl("/");
		
		/*
		.csrf().disable()
				.authorizeRequests()
				.antMatchers("/","/event/**", "/user/**", "/account/**","/test")
				.permitAll()
				.anyRequest()
				.authenticated()
			.and()
				.formLogin()
				.loginPage("/account/login")
				.loginProcessingUrl("/user/login")
				.defaultSuccessUrl("/")
				.failureForwardUrl("/account/login");*/
	}
	
	@Bean
	public UserAuthenticationProvider authenticationProvider() {
		return new UserAuthenticationProvider(bCryptPasswordEncoder());
	}
	@Bean
	public AuthSuccessHandlerImpl authSuccessHandlerImpl() {
		// TODO Auto-generated constructor stub
		return new AuthSuccessHandlerImpl();
	}
	
	@Bean
	public AuthFailureHandlerImpl authFailureHandlerImpl() {
		return new AuthFailureHandlerImpl();
	}
	@Override
	protected void configure(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
		// TODO Auto-generated method stub
		authenticationManagerBuilder.authenticationProvider(authenticationProvider());
	}
	
	// 리다이렉션 존나 뜨네 시바꺼;;
}
