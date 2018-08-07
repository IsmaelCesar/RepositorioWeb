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
import com.example.demo.model.Obra;
import com.example.demo.model.Revestimento;
import com.example.demo.repository.AlvenariaRepository;
import com.example.demo.repository.AndarRepository;
import com.example.demo.repository.EdificioRepository;
import com.example.demo.repository.EletricaRepository;
import com.example.demo.repository.HidraulicaRepository;
import com.example.demo.repository.RevestimentoRepository;

@CrossOrigin
@RestController
@RequestMapping("edf")
public class EdificioController {
	
	@Autowired
	private EdificioRepository edfRepo;
	
	@Autowired
	private AlvenariaRepository alveRepo;
	
	@Autowired
	private HidraulicaRepository hdraRepo;
	
	@Autowired
	private EletricaRepository eleRepo;
	
	@Autowired
	private RevestimentoRepository revesRepo;
	
	@Autowired
	private AndarRepository andarRepo;
	
	@GetMapping
	public List<Edificio> lista (){
		return edfRepo.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public Optional<Edificio> Edf ( @PathVariable("id") Long id){
		return edfRepo.findById(id);
	}
	
	@GetMapping(path = "/{id}")
	public List<Andar> ListAndar ( @PathVariable("id") Long id){
		return edfRepo.getOne(id).getAndar();
	}

	@DeleteMapping(path = "/{id}")
	public void deletarlista(@PathVariable("id") Long id) {
	edfRepo.deleteById(id);
		
	}
	
	@PutMapping(path = "/{id}")
	public Edificio updateEdf (@PathVariable("id") Long id,  @RequestBody Edificio edf) {
		
		Edificio exemplo= edfRepo.getOne(id);
		if(edf.getNome()!=null) {
			exemplo.setNome(edf.getNome());
			
		}
		if(edf.getEmpresaFundaao()!=null) {
			exemplo.setEmpresaFundaao(edf.getEmpresaFundaao());
			
		}
		if(edf.getStatusFundacao()!=null) {
			exemplo.setStatusFundacao(edf.getStatusFundacao());
			
		}
		if(edf.getTipoFundacao()!=null) {
			exemplo.setTipoFundacao(edf.getTipoFundacao());
			
		}
		return edfRepo.save(exemplo);
		
	
	}
	
	@PostMapping(path = "/{id}")
	public Alvenaria postAlve(@PathVariable("id") Long id, @RequestBody Alvenaria alvenaria){
		Edificio edf= edfRepo.getOne(id);
		edf.setAlvenaria(alvenaria);
		return alveRepo.save(alvenaria);
			
	}
	
	@PostMapping(path = "/{id}")
	public Hidraulica postHdra(@PathVariable("id") Long id, @RequestBody Hidraulica hidra){
		Edificio edf= edfRepo.getOne(id);
		edf.setHidraulica(hidra);
		return hdraRepo.save(hidra);
			
	}
	
	@PostMapping(path = "/{id}")
	public Eletrica postElet(@PathVariable("id") Long id, @RequestBody Eletrica ele){
		Edificio edf= edfRepo.getOne(id);
		edf.setEletrica(ele);;
		return eleRepo.save(ele);
			
	}
	
	@PostMapping(path = "/{id}")
	public Revestimento postReves(@PathVariable("id") Long id, @RequestBody Revestimento revest){
		Edificio edf= edfRepo.getOne(id);
		edf.setRevestimento(revest);
		return revesRepo.save(revest);
			
	}
	
	@PostMapping(path = "/{id}")
	public Andar postAndar(@PathVariable("id") Long id, @RequestBody Andar andar ){
		Edificio edf= edfRepo.getOne(id);
		andar.setEdf(edf);
		return andarRepo.save(andar);
			
	}
	
}
