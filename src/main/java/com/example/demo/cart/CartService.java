package com.example.demo.cart;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.items.Item;
import com.example.demo.users.Users;


@Service
public class CartService {
	
	@Autowired
	private final CartRepository cartRepository;

	public CartService(CartRepository cartRepository) {
		this.cartRepository = cartRepository;
	}

	public List<Item> getCart(Users user) {
		Long id = user.getId(); 
		return cartRepository.findUserCart(id);
		 
	}

	public void addCart(Cart cartItem) {
		cartRepository.save(cartItem);
	}
}
