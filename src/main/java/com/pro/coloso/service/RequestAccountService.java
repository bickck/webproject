package com.pro.coloso.service;

import com.pro.coloso.domain.User;
import com.pro.coloso.dto.RequestLoginDTO;

public interface RequestAccountService  {
	User requestLoginDTO(RequestLoginDTO requestLoginDTO);
	
}
