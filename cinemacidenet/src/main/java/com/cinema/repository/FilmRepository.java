package com.cinema.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cinema.model.Film;

public interface FilmRepository extends JpaRepository<Film, Long> {

	List<Film> findByActiva(Boolean activa);
	
	
}