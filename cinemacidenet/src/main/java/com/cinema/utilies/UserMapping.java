package com.cinema.utilies;

import org.modelmapper.ModelMapper;

import com.cinema.DTO.UserDTO;
import com.cinema.model.UserModel;

public class UserMapping {
	
	public UserModel dtoToModel(UserDTO userDto) {
		ModelMapper convertToModel = new ModelMapper();
		UserModel user= convertToModel.map(userDto, UserModel.class);
		return user;
	}
	
	public UserDTO modelToDto (UserModel userModel) {
		ModelMapper convertToDTO = new ModelMapper();
		UserDTO userDto = convertToDTO.map(userModel, UserDTO.class);
		return userDto;
	}
	
}
