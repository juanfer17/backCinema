package com.cinema.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cinema.DTO.GeneralResponseDTO;
import com.cinema.DTO.RequestAuthDTO;
import com.cinema.DTO.UserDTO;
import com.cinema.model.UserModel;
import com.cinema.repository.UserRepository;
import com.cinema.service.UserService;
import com.cinema.utilies.EncryptPassword;
import com.cinema.utilies.UserMapping;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private EncryptPassword encryptPassword;
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public GeneralResponseDTO createUser(UserDTO user) {
		
		UserMapping userMapping = new UserMapping ();
		
		try {
			user.setPassword(encryptPassword.encoder().encode(user.getPassword()));
			userRepository.save(userMapping.dtoToModel(user));
			return new GeneralResponseDTO("00", "Exitoso");
		}catch(Exception e){
			return   new GeneralResponseDTO("01", "Fallo General");
		}
	}

	@Override
	public GeneralResponseDTO updateUser(UserDTO updateUser) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean validaterCredentials(RequestAuthDTO credential) {
		
		try {
			UserModel user = userRepository.findByEmail(credential.getEmail());
			if(user != null) {
				return encryptPassword.encoder().matches(credential.getPassword(), user.getPassword());
			}else {
				return false;
			}
		}catch(Exception e) {
			return false;
		}
	}

	
	
}
