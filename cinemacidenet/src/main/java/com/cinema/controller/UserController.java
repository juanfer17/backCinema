package com.cinema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cinema.DTO.GeneralResponseDTO;
import com.cinema.DTO.UserDTO;
import com.cinema.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/register")
	public GeneralResponseDTO createUser( @RequestBody UserDTO user) {
		return userService.createUser(user);
	}
	
}
