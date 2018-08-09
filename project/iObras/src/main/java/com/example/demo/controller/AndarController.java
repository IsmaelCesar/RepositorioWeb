package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Alvenaria;
import com.example.demo.model.Andar;
import com.example.demo.model.Edificio;
import com.example.demo.model.Eletrica;
import com.example.demo.model.Hidraulica;
import com.example.demo.model.Revestimento;
import com.example.demo.repository.AlvenariaRepository;
import com.example.demo.repository.AndarRepository;
import com.example.demo.repository.EletricaRepository;
import com.example.demo.repository.HidraulicaRepository;
import com.example.demo.repository.RevestimentoRepository;

@CrossOrigin
@RestController
@RequestMapping("/andar")
public class AndarController {
	
	@Autowired
	private AndarRepository andarRepo;
	
	@Autowired
	private AlvenariaRepository alveRepo;
	
	@Autowired
	private HidraulicaRepository hdraRepo;
	
	@Autowired
	private EletricaRepository eleRepo;
	
	@Autowired
	private RevestimentoRepository revesRepo;

	
	@GetMapping
	public List<Andar> lista (){
		return andarRepo.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public Optional<Andar> Edf ( @PathVariable("id") Long id){
		return andarRepo.findById(id);
	}
	
	@GetMapping(path = "/{id}/alvenaria")
	public Alvenaria getAlvenaria ( @PathVariable("id") Long id){
		
		return  andarRepo.getOne(id).getAlvenaria();
		
	}
	
	@GetMapping(path = "/{id}/eletrica")
	public Eletrica getEletrica ( @PathVariable("id") Long id){
		
		return  andarRepo.getOne(id).getEletrica();
		
	}
	@GetMapping(path = "/{id}/hidraulica")
	public Hidraulica gethidraulica ( @PathVariable("id") Long id){
		
		return  andarRepo.getOne(id).getHidraulica();
		
	}
	@GetMapping(path = "/{id}/revestimento")
	public Revestimento getRevestimento ( @PathVariable("id") Long id){
		
		return  andarRepo.getOne(id).getRevestimento();
		
	}
	
	
	@PostMapping(path = "/{id}/alvenaria")
	public Alvenaria postAlve(@PathVariable("id") Long id, @RequestBody Alvenaria alvenaria){
		Andar andar=andarRepo.getOne(id);
		andar.setAlvenaria(alvenaria);
		return alveRepo.save(alvenaria);
			
	}
	
	@PostMapping(path = "/{id}/hidraulica")
	public Hidraulica postHdra(@PathVariable("id") Long id, @RequestBody Hidraulica hidra){
		Andar andar=andarRepo.getOne(id);
		andar.setHidraulica(hidra);
		return hdraRepo.save(hidra);
			
	}
	
	@PostMapping(path = "/{id}/eletrica")
	public Eletrica postElet(@PathVariable("id") Long id, @RequestBody Eletrica ele){
		Andar andar=andarRepo.getOne(id);
		andar.setEletrica(ele);;
		return eleRepo.save(ele);
			
	}
	
	@PostMapping(path = "/{id}/revestimento")
	public Revestimento postReves(@PathVariable("id") Long id, @RequestBody Revestimento revest){
		Andar andar=andarRepo.getOne(id);
		andar.setRevestimento(revest);
		return revesRepo.save(revest);
			
	}
	
	@DeleteMapping(path = "/{id}")
	public void deletarlista(@PathVariable("id") Long id) {
	andarRepo.deleteById(id);
		
	}
	
	@PutMapping(path = "/{id}")
	public Andar updateObra (@PathVariable("id") Long id,  @RequestBody Andar andar) {
		
		Andar exemplo= andarRepo.getOne(id);
		
		if(andar.getNumero()!=0) {
			exemplo.setNumero(andar.getNumero());
			
		}
		if(andar.getQuantidadeApartamento()!=0) {
			exemplo.setQuantidadeApartamento(andar.getQuantidadeApartamento());
			
		}
		
		return andarRepo.save(exemplo);
		
	
	}
	
}
