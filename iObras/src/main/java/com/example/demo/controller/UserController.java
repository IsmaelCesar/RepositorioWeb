package com.example.demo.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@RestController
@RequestMapping("user")
@CrossOrigin
public class UserController {
	
	@Autowired
	private UserRepository userRepo;
	
	@PostMapping
	public User save (@RequestBody User user) {
		Example<User>example= Example.of(user);
		if(userRepo.exists(example)==false) {
		return userRepo.save(user);
		}
		return user;
		
	}
	
	@GetMapping
	public List<User> lista () {
	return userRepo.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public Optional<User> get(@PathVariable("id") Long id) {
		return userRepo.findById(id);
		
	}
	
	
	

}
