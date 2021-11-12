package com.pro.coloso.authconfig;

import java.util.Collection;

import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

public class UserAuthenticationToken extends AbstractAuthenticationToken {

	private final Object principal;
	private Object credentials;

	// 인증 완료 전의 객체 생성
	public UserAuthenticationToken(Object principal, Object credentials) {
		// TODO Auto-generated constructor stub
		super(null);
		this.principal = principal;
		this.credentials = credentials;
		setAuthenticated(false);
	}

	// 인증 완료 후의 객체 생성
	public UserAuthenticationToken(Object principal, Object credentials,
			Collection<? extends GrantedAuthority> authorities) {
		super(authorities);
		this.principal = principal;
		this.credentials =credentials;
		super.setAuthenticated(true);
	}

	// 회원 아이디
	@Override
	public Object getPrincipal() {
		// TODO Auto-generated method stub
		return this.principal;
	}
	
	// 회원 비밀번호
	@Override
	public Object getCredentials() {
		// TODO Auto-generated method stub
		return this.credentials;
	}

}
