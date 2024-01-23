package com.example.demo.cart;


import java.io.Serializable;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table
public class Cart implements Serializable{
	
	@EmbeddedId
	private CartId cartId;

	public CartId getId() { return this.cartId; }

	public void setId(CartId cartId) { this.cartId = cartId; }

	@Override
	public String toString() {
		return "User{" +
		"id = '" + this.cartId + '\'' +
		"}";
	}
}
