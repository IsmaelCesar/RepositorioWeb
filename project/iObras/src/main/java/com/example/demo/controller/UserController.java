package com.example.demo.controller;


import java.util.List;
import java.util.Optional;

import javax.jws.WebResult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import com.example.demo.model.Obra;
import com.example.demo.model.User;
import com.example.demo.repository.ObrasRepository;
import com.example.demo.repository.UserRepository;

@RestController
@RequestMapping("user")
@CrossOrigin
public class UserController {
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private ObrasRepository obraRepo;
	
	@PostMapping
	public User save (@RequestBody User user) {
		Example<User>example= Example.of(user);
	if(userRepo.exists(example)==false && user.getSenha().equals(user.getConfSenha())) {
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
	
	@GetMapping(path = "/{id}/listaObras")
	public List<Obra> ListaObras(@PathVariable("id") Long id) {
		return userRepo.getOne(id).getObras();
		
	}
	
	
		@PutMapping(path = "/{id}/obra")
		public List<Obra> update(@PathVariable("id") Long id, @RequestBody Obra obra) {
			
			User exemplo= userRepo.getOne(id);
			obra.setUser(exemplo);
			obraRepo.save(obra);
			return userRepo.findById(id).get().getObras();
		
		}
	

}
