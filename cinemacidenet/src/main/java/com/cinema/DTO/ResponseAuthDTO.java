package com.cinema.DTO;

public class ResponseAuthDTO {

	private String status;
	private String message;
	private String token;
	
	
	
	public ResponseAuthDTO(String status, String message, String token) {
		super();
		this.status = status;
		this.message = message;
		this.token = token;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	
	
	
}
