package com.example.demo.items;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Response;

@RestController
@CrossOrigin
public class ItemController {

	@Autowired
	private final ItemService itemService;

	public ItemController(ItemService itemService) {
		this.itemService = itemService;
	}

	@GetMapping("/items")
	public List<Item> getItems() {
		return itemService.getItems();
	}

	@PostMapping("/items/create") 
	public Response createItem(@RequestBody Item item) {
		return itemService.createItem(item);
	}

	@GetMapping("/items/{search}")
	public List<Item> getSearchedItems(@PathVariable String search) {
		return itemService.getSearchedItems(search);
	}
}
