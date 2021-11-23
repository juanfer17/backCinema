package com.cinema.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cinema.DTO.FilmDTO;
import com.cinema.DTO.GeneralResponseDTO;
import com.cinema.service.FilmService;


@RestController
@RequestMapping("/film")
public class FilmController {
	
	@Autowired
	private FilmService filmService;
	
	@PostMapping("/create")
	public GeneralResponseDTO createFilm ( @RequestBody FilmDTO film) {
		return filmService.createFilm(film);
	}
	
	@GetMapping("/allFilm")
	public List<FilmDTO> getAllFilm (){
		return filmService.getAllFilm();
	}
	
	@GetMapping("/activeFilm")
	public List<FilmDTO> getActiveFilm (){
		return filmService.getActiveFilm();
	}
	
	@PostMapping("/update")
	public GeneralResponseDTO updateFilm ( @RequestBody FilmDTO film) {
		return filmService.updateFilm(film);
	}
	
	
}
