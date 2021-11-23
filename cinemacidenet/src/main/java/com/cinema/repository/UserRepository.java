package com.cinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cinema.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Long> {
	
	UserModel findByEmail(String email);
	
}
