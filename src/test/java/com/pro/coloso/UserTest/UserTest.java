package com.pro.coloso.UserTest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.web.WebAppConfiguration;

import com.pro.coloso.domain.User;
import com.pro.coloso.enumtype.UserType;
import com.pro.coloso.repository.UserRepository;

@WebAppConfiguration
public class UserTest {
	
	@Autowired
	private UserRepository userRepository;
	
	@Test
	public void testUser() {
		User user = new User("abc","ggg@gmail.com","010-0000-0000","aaa");
		user.setUserType(UserType.STUDENT);
		System.out.println(user.toString());
		userRepository.save(user);
	}

}
