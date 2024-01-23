package com.example.demo.cart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {
	
	@Autowired
	private final CartRepository cartRepository;

	public CartService(CartRepository cartRepository) {
		this.cartRepository = cartRepository;
	}

	public List<Cart> getCart() {
		return cartRepository.findAll();
	}

	public void addCart(Cart cartItem) {
		cartRepository.save(cartItem);
	}
}
