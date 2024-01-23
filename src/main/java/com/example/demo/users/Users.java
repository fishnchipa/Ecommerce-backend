package com.example.demo.users;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public class Users {

	@Id
	@SequenceGenerator(
		name = "user_seq",
		allocationSize = 1
	)

	@GeneratedValue(
		strategy = GenerationType.SEQUENCE
	)

	private Long id;
	private String email;
	private String password;

	public Users() {}

	public Users(Long id) {
		this.id = id;
	}

	public Users(String email, String password) {
		this.email = email;
		this.password = password;
	}

	public Long getId() { return this.id; }

	public void setId(Long id) { this.id = id; }

	public String getEmail() { return this.email; }

	public void setEmail(String email) { this.email = email; }

	public String getPassword() { return this.password; }

	public void setPassword(String password) { this.password = password; }

	@Override
	public String toString() {
		return "User{" +
		"id = '" + this.id + '\'' +
		"email = '" + this.email + '\'' +
		"password = '" + this.password + '\'' +
		"}";
	}
}