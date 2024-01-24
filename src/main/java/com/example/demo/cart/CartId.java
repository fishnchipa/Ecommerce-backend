package com.example.demo.cart;

import java.io.Serializable;

import com.example.demo.items.Item;
import com.example.demo.users.Users;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class CartId implements Serializable{

	@ManyToOne
	@JoinColumn(name = "userId")
	private Users userId;

	@ManyToOne
	@JoinColumn(name = "itemId") 
	private Item itemId;

	public CartId() {}

	public CartId(Users userId, Item itemId) {
		this.userId = userId;
		this.itemId = itemId;

	}

	public Users getUserId() { return this.userId; }

	public void setUser(Users userId) { this.userId = userId; }

	public Item getItem() { return this.itemId; }

	public void setItem(Item itemId) { this.itemId = itemId; }

	@Override
	public String toString() {
		return "CartId{" +
		"userId = '" + this.userId + '\'' +
		"itemId = '" + this.itemId + '\'' +
		"}";
	}
}
