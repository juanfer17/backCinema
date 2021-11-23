package com.cinema.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USERS")
public class UserModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column (name="DOCUMENT_TYPE", length = 5, nullable = false)
	private String documentType;
	@Column (name="DOCUMENT_NUMBER", unique = true, updatable = false, length = 13, nullable = false)
	private String documentNumber;
	@Column (name="FIRST_NAME", nullable = false, length = 20)
	private String firstName;
	@Column (name="LAST_NAME", nullable = false)
	private String lastName;
	@Column (name="EMAIL", unique = true, nullable = false, length = 60)
	private String email;
	@Column (name="PASSWORD", nullable = false)
	private String password;
	@Column (name="ROL")
	private Long rol;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDocumentType() {
		return documentType;
	}
	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}
	public String getDocumentNumber() {
		return documentNumber;
	}
	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getRol() {
		return rol;
	}
	public void setRol(Long rol) {
		this.rol = rol;
	}
	
	
	
	
}
