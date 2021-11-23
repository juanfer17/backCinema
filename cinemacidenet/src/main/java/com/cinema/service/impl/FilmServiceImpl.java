package com.cinema.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cinema.DTO.FilmDTO;
import com.cinema.DTO.GeneralResponseDTO;
import com.cinema.repository.FilmRepository;
import com.cinema.service.FilmService;
import com.cinema.utilies.FilmMapping;

@Service
public class FilmServiceImpl implements FilmService{
	
	@Autowired
	private FilmRepository filmRepository;
	
	
	@Override
	public GeneralResponseDTO createFilm(FilmDTO film) {
		
		FilmMapping filmMapping = new FilmMapping ();
		
		try {
			filmRepository.save(filmMapping.dtoToModel(film));
			return new GeneralResponseDTO ("00", "Exitoso");
		}catch(Exception e) {
			return new GeneralResponseDTO ("01", "Fallido");
		}
	}


	@Override
	public List<FilmDTO> getAllFilm() {
		FilmMapping filmMapping = new FilmMapping ();
		return filmMapping.modelListToDTOList(filmRepository.findAll());
		
	}


	@Override
	public List<FilmDTO> getActiveFilm() {
		FilmMapping filmMapping = new FilmMapping ();
		return filmMapping.modelListToDTOList(filmRepository.findByActiva(true));
	}


	@Override
	public GeneralResponseDTO updateFilm(FilmDTO film) {
		FilmMapping filmMapping = new FilmMapping ();
		
		try {
			filmRepository.save(filmMapping.dtoToModel(film));
			return new GeneralResponseDTO ("00", "Exitoso");
		}catch(Exception e) {
			return new GeneralResponseDTO ("01", "Fallido");
		}
	}
	
	
}
