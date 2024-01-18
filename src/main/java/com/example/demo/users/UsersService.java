
package com.example.demo.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Response;

@Service
public class UsersService {

	private final UsersRepository userRepository;

	@Autowired
	public UsersService(UsersRepository userRepository) {
		this.userRepository = userRepository;
	}

	public List<Users> getUser(String email) {
		return userRepository.findDistinctByEmail(email);
	}

	public Response createUser(Users user) {
		
		Response response = new Response();

		if (getUser(user.getEmail()).isEmpty()) {
			userRepository.save(user);
			response.setMessage("User successfully created");
			response.setStatus(true);

		} else {
			response.setMessage("Email already in use");
			response.setStatus(false);
		}

		return response;
	}

}
