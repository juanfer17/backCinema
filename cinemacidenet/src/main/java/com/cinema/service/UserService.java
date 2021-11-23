package com.cinema.service;

import org.springframework.stereotype.Service;

import com.cinema.DTO.GeneralResponseDTO;
import com.cinema.DTO.RequestAuthDTO;
import com.cinema.DTO.UserDTO;

@Service
public interface UserService {
	
	GeneralResponseDTO createUser(UserDTO user);
	GeneralResponseDTO updateUser(UserDTO updateUser);
	Boolean validaterCredentials(RequestAuthDTO credential);
}
