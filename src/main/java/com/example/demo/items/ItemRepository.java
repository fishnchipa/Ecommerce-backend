package com.example.demo.items;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long>{

	public List<Item> findByNameIgnoreCaseContaining(String search);
}
