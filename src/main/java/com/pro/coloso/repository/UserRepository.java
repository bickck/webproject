package com.pro.coloso.repository;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import com.pro.coloso.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByUsername(String username);
	
	User findByEmailAndPassword(String email, String password);
	
	@Query(value ="SELETE * FROM user WHERE EMAIL = ?")
	User findByEmail(String string);
}
