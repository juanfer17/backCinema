package com.cinema.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FILMS")
public class Film {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column (name="TITLE", unique = true, nullable = false)
	private String title;
	@Column (name="GENRE_FILM", nullable = false)
	private String genreFilm;
	@Column (name="URL_IMAGE", unique = true, nullable = false)
	private String urlImage;
	@Column (name="DURACION", nullable = false)
	private String duracion;
	@Column (name="ACTIVA", nullable = false)
	private Boolean activa;
	@Column (name="FECHA_FIN",  nullable = false)
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
