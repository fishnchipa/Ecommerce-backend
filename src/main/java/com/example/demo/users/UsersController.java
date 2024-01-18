package com.example.demo.users;

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
public class UsersController {

	private final UsersService userService;

	@Autowired
	public UsersController(UsersService userService) {
		this.userService = userService;
	}

	@GetMapping("/user/{email}")
	public List<Users> getUser(@PathVariable("email") String email) {
		return userService.getUser(email);
	}

	@PostMapping("/user")
	public Response createUser(@RequestBody Users user) {
		return userService.createUser(user);
	}

}