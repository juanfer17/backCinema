package com.cinema.utilies;

import java.lang.reflect.Type;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;

import com.cinema.DTO.FilmDTO;
import com.cinema.model.Film;

public class FilmMapping {

	public Film dtoToModel(FilmDTO filmDto) {
		ModelMapper convertToModel = new ModelMapper();
		Film film = convertToModel.map(filmDto, Film.class);
		return film;
	}
	
	public FilmDTO modelToDto (Film filmModel) {
		ModelMapper convertToDTO = new ModelMapper();
		FilmDTO filmDto = convertToDTO.map(filmModel, FilmDTO.class);
		return filmDto;
	}
	
	public List<FilmDTO> modelListToDTOList(List<Film> listFilm){
		ModelMapper convertList = new ModelMapper();
		Type listType = new TypeToken<List<FilmDTO>>(){}.getType();
		List<FilmDTO> listFilmDTO = convertList.map(listFilm, listType);
		return listFilmDTO;
		
	}
}
