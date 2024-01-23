package com.example.demo.items;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public class Item {
	@Id
	@SequenceGenerator(
		name = "item_seq",
		allocationSize = 1
	)

	@GeneratedValue(
		strategy = GenerationType.SEQUENCE
	)

	private Long id;
	private String name;
	private Double price;
	private String category;

	public Item() { }

	public Item(Long id) { 
		this.id = id;
	}

	public Item(String name, Double price, String category) {
		this.name = name;
		this.price = price;
		this.category = category;
	}

	public Long getId() { return this.id; }

	public void setId(Long id) { this.id = id; }

	public String getName() { return this.name; }

	public void setName(String name) { this.name = name; }

	public Double getPrice() { return this.price; }

	public void setPrice(Double price) { this.price = price; }

	public String getCategory() { return this.category; }

	public void setCategory(String category) { this.category = category; }

	@Override
	public String toString() {
		return "Item{" +
		"id = '" + this.id + '\'' +
		"name = '" + this.name + '\'' +
		"price = '" + this.price + '\'' +
		"category = '" + this.category + '\'' +
		"}";
	}
}
