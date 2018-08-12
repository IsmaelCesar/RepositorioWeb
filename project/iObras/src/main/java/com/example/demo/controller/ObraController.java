package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.model.Edificio;
import com.example.demo.model.Obra;
import com.example.demo.model.User;
import com.example.demo.repository.EdificioRepository;
import com.example.demo.repository.ObrasRepository;
import com.example.demo.repository.UserRepository;

@CrossOrigin
@RestController
@RequestMapping("/Obra")
public class ObraController {
	
	@Autowired
	private ObrasRepository obraRepo;
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private EdificioRepository edfRepo;
	
	@GetMapping
	public List<Obra> lista (){
		return obraRepo.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public Obra getObra ( @PathVariable("id") Long id){
		return obraRepo.getOne(id);
	}
	
	@GetMapping(path = "/{id}/edificio")
	public List<Edificio> listaEd ( @PathVariable("id") Long id){
		return obraRepo.getOne(id).getEdf();
	}
	
//	@PostMapping
//	public Obra salvar(@RequestBody Obra obra) {
//		return obraRepo.save(obra);
//	}
	
	

	@PutMapping(path = "/{id}")
	public Obra updateObra (@PathVariable("id") Long id, @RequestBody Obra obra) {
		
		Obra exemplo= obraRepo.getOne(id);
		exemplo.setDescricao(obra.getDescricao());
		exemplo.setImagem(obra.getImagem());
		exemplo.setNome(obra.getNome());
		exemplo.setNumeroCrea(obra.getNumeroCrea());
		exemplo.setPiscina(obra.isPiscina());
		exemplo.setStatus(obra.getStatus());
		return obraRepo.save(exemplo);
		
	
	}
	
	@DeleteMapping(path = "/{id}")
	public void deletarlista(@PathVariable("id") Long id) {
	obraRepo.deleteById(id);
		
	}
	
	@PostMapping(path = "/{id}/edificio")
	public Long postEdf(@PathVariable("id") Long id, @RequestBody Edificio edificio){
		Obra obra= obraRepo.getOne(id);
		edificio.setObra(obra);
		edfRepo.save(edificio);
		return edificio.getId();
		
	}

}