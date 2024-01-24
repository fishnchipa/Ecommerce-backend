package com.example.demo.cart;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.items.Item;
import com.example.demo.users.Users;

public interface CartRepository extends JpaRepository<Cart, CartId>{
	
	String query = 
	"SELECT new com.example.demo.items.Item(i.id, i.name, i.price, i.category)" +
	"FROM Cart c JOIN Item i ON c.id.itemId.id = i.id WHERE c.id.userId.id = :id";

	@Query(query)
	List<Item> findUserCart(Long id);
}
