package com.example.demo.cart;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.items.Item;
import com.example.demo.users.Users;

@RestController
@CrossOrigin
public class CartController {
	
	@Autowired
	private final CartService cartService;

	public CartController(CartService cartService) {
		this.cartService = cartService;
	}

	@PostMapping("/cart")
	public List<Item> getCart(@RequestBody Users id) {
		return cartService.getCart(id);
	}

	@PostMapping("/cart/add") 
	public void addCart(@RequestBody Cart cartItem) {
		cartService.addCart(cartItem);
	}
}
