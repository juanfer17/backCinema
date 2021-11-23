package com.cinema.DTO;

import java.util.Date;


public class FilmDTO {


	private Long id;
	private String title;
	private String genreFilm;
	private String urlImage;
	private String duracion;
	private Boolean activa;
	private Date fechaFin;
	

	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenreFilm() {
		return genreFilm;
	}
	public void setGenreFilm(String genreFilm) {
		this.genreFilm = genreFilm;
	}
	public String getUrlImage() {
		return urlImage;
	}
	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}
	public String getDuracion() {
		return duracion;
	}
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	public Boolean getActiva() {
		return activa;
	}
	public void setActiva(Boolean activa) {
		this.activa = activa;
	}
	public Date getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	
	
	
	
}
