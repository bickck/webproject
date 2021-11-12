package com.pro.coloso.authconfig;

import java.io.Serializable;
import java.security.Principal;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserAuthentication extends Principal, Serializable {

	
	
}
