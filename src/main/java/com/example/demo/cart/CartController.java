package com.example.demo.cart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class CartController {
	
	@Autowired
	private final CartService cartService;

	public CartController(CartService cartService) {
		this.cartService = cartService;
	}

	@GetMapping("/cart")
	public List<Cart> getCart() {
		return cartService.getCart();
	}

	@PostMapping("/cart/add") 
	public void addCart(@RequestBody Cart cartItem) {
		cartService.addCart(cartItem);
	}
}
