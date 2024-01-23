package com.example.demo.items;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Response;

@Service
public class ItemService {
	
	@Autowired
	private final ItemRepository itemRepository;

	public ItemService(ItemRepository itemRepository) {
		this.itemRepository = itemRepository;
	}

	public List<Item> getItems() {
		return itemRepository.findAll();
	}

	public Response createItem(Item item) {
		
		Response retval = new Response();
		try {
			itemRepository.save(item);
			retval.setMessage("creating new Item");
			retval.setStatus(true);
		} catch (Exception e) {
			retval.setMessage("Unsuccessfull");
			retval.setStatus(false);
		} 

		return retval;
	}
}
