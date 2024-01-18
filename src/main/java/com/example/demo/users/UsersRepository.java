package com.example.demo.users;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long>{
	List<Users> findDistinctByEmail(String email);
}
