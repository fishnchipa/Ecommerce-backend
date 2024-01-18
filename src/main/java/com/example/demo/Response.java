package com.example.demo;

public class Response {
	private Boolean status;
	private String message;

	public Response() {}

	public Response(Boolean status, String message) {
		this.status = status;
		this.message = message;
	}

	public Boolean getStatus() { return this.status; }

	public void setStatus(Boolean status) { this.status = status; }

	public String getMessage() { return this.message; }

	public void setMessage(String message) { this.message = message; }

	
}
