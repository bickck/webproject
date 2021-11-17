package com.pro.coloso.authconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.pro.coloso.authuserdetails.AuthUserDetailService;
import com.pro.coloso.authuserdetails.AuthUserDetails;

public class UserAuthenticationProvider implements AuthenticationProvider {
	
	@Autowired
	private AuthUserDetailService authUserDetailService;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public UserAuthenticationProvider(BCryptPasswordEncoder encoder) {
		// TODO Auto-generated constructor stub
		this.bCryptPasswordEncoder = encoder;
	}

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		// TODO Auto-generated method stub

		UsernamePasswordAuthenticationToken token = (UsernamePasswordAuthenticationToken) authentication;
		String getUserEmail = token.getName();
		String getPassword = (String) token.getCredentials();
		
		UserDetails authUserDetails = authUserDetailService.loadUserByUsername(getUserEmail);
		
		if(!bCryptPasswordEncoder.matches(getPassword, authUserDetails.getPassword())) {
			throw new BadCredentialsException("해당 패스워드는 맞지 않음");
		}
		return new UsernamePasswordAuthenticationToken(authUserDetails.getUsername(), authUserDetails.getPassword(), authUserDetails.getAuthorities());
	}

	@Override
	public boolean supports(Class<?> authentication) {
		// TODO Auto-generated method stub
		return authentication.equals(UsernamePasswordAuthenticationToken.class);
	}

}
