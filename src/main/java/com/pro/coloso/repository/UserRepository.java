package com.pro.coloso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pro.coloso.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
