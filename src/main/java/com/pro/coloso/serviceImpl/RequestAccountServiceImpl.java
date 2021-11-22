package com.pro.coloso.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.pro.coloso.domain.User;
import com.pro.coloso.dto.RequestLoginDTO;
import com.pro.coloso.repository.UserRepository;
import com.pro.coloso.service.RequestAccountService;

@Service
public class RequestAccountServiceImpl implements RequestAccountService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User requestLoginDTO(RequestLoginDTO requestLoginDTO) {
		// TODO Auto-generated method stub
		Optional<User> dto = Optional.ofNullable(userRepository
				.findByEmailAndPassword(requestLoginDTO.getEmail(), requestLoginDTO.getPassword()).orElseThrow(()->{
					throw new IllegalArgumentException("해당 사용자나 패스워드가 맞지 않습니다.");
				}));
		
		return dto.get();
	}
}
