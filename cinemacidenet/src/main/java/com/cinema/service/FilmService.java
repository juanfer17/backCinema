package com.cinema.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cinema.DTO.FilmDTO;
import com.cinema.DTO.GeneralResponseDTO;


@Service
public interface FilmService {

	GeneralResponseDTO createFilm(FilmDTO film);
	List<FilmDTO> getAllFilm();
	List<FilmDTO> getActiveFilm();
	GeneralResponseDTO updateFilm(FilmDTO film);
	
}

