package com.pro.coloso.repository;

import java.util.Optional;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import com.pro.coloso.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

	//
	User findByUsername(String username);

	Optional<User> findByEmailAndPassword(String email, String password);

	@Query(value = "SELETE * FROM user WHERE EMAIL = ?")
	Optional<User> findByEmail(String email);

}
