package com.pro.coloso.service;

import com.pro.coloso.domain.User;
import com.pro.coloso.dto.RequestLoginEntity;

public interface RequestAccountService  {
	User requestLogin(RequestLoginEntity requestLoginDTO);
	
}
