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

import com.example.demo.model.Alvenaria;
import com.example.demo.model.Andar;
import com.example.demo.model.Edificio;
import com.example.demo.model.Eletrica;
import com.example.demo.model.Hidraulica;
import com.example.demo.model.Obra;
import com.example.demo.model.Revestimento;
import com.example.demo.model.User;
import com.example.demo.repository.AlvenariaRepository;
import com.example.demo.repository.AndarRepository;
import com.example.demo.repository.EdificioRepository;
import com.example.demo.repository.EletricaRepository;
import com.example.demo.repository.HidraulicaRepository;
import com.example.demo.repository.RevestimentoRepository;

@CrossOrigin
@RestController
@RequestMapping("/edf")
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
	@GetMapping(path = "/{id}/alvenaria")
	public Alvenaria getAlvenaria ( @PathVariable("id") Long id){
		
		return  edfRepo.getOne(id).getAlvenaria();
		
	}
	
	@GetMapping(path = "/{id}/eletrica")
	public Eletrica getEletrica ( @PathVariable("id") Long id){
		
		return  edfRepo.getOne(id).getEletrica();
		
	}
	@GetMapping(path = "/{id}/hidraulica")
	public Hidraulica gethidraulica ( @PathVariable("id") Long id){
		
		return  edfRepo.getOne(id).getHidraulica();
		
	}
	@GetMapping(path = "/{id}/revestimento")
	public Revestimento getRevestimento ( @PathVariable("id") Long id){
		
		return  edfRepo.getOne(id).getRevestimento();
		
	}
	
	@GetMapping(path = "/{id}/listaAndar")
	public List<Andar> ListAndar ( @PathVariable("id") Long id){
		return edfRepo.getOne(id).getAndar();
	}

	@DeleteMapping(path = "/{id}")
	public void deletarlista(@PathVariable("id") Long id) {
	edfRepo.deleteById(id);
		
	}
	
	@PutMapping(path = "/{id}")
	public Edificio updateEdf (@PathVariable("id") Long id,  @RequestBody Edificio edificio) {
		
		Edificio exemplo= edfRepo.getOne(id);
		if(edificio.getNome()!=null) {
			exemplo.setNome(edificio.getNome());
			
		}
		if(edificio.getEmpresaFundacao()!=null) {
			exemplo.setEmpresaFundacao(edificio.getEmpresaFundacao());
			
		}
		if(edificio.getStatusFundacao()!=null) {
			exemplo.setStatusFundacao(edificio.getStatusFundacao());
			
		}
		if(edificio.getTipoFundacao()!=null) {
			exemplo.setTipoFundacao(edificio.getTipoFundacao());
			
		}
		return edfRepo.save(exemplo);
		
	
	}
	
	@PostMapping(path = "/{id}/alvenaria")
	public Alvenaria postAlve(@PathVariable("id") Long id, @RequestBody Alvenaria alvenaria){
		Edificio edf= edfRepo.getOne(id);
		edf.setAlvenaria(alvenaria);
		return alveRepo.save(alvenaria);
			
	}
	
	@PostMapping(path = "/{id}/hidraulica")
	public Hidraulica postHdra(@PathVariable("id") Long id, @RequestBody Hidraulica hidra){
		Edificio edf= edfRepo.getOne(id);
		edf.setHidraulica(hidra);
		return hdraRepo.save(hidra);
			
	}
	
	@PostMapping(path = "/{id}/eletrica")
	public Eletrica postElet(@PathVariable("id") Long id, @RequestBody Eletrica ele){
		Edificio edf= edfRepo.getOne(id);
		edf.setEletrica(ele);;
		return eleRepo.save(ele);
			
	}
	
	@PostMapping(path = "/{id}/revestimento")
	public Revestimento postReves(@PathVariable("id") Long id, @RequestBody Revestimento revest){
		Edificio edf= edfRepo.getOne(id);
		edf.setRevestimento(revest);
		return revesRepo.save(revest);
			
	}
	
	@PostMapping(path = "/{id}/andar")
	public Long postAndar(@PathVariable("id") Long id, @RequestBody Andar andar ){
	//	Long retorno=null;
//		if(andar.getQuantidadeAndar()!=0) {
			Edificio edf= edfRepo.getOne(id);
			andar.setEdificio(edf);
			andarRepo.save(andar);
			return andar.getId();
//		}
//		else {
//			for(int i=1;i<=andar.getQuantidadeAndar();i++) {
//				Edificio edf= edfRepo.getOne(id);
//				andar.setNumero(i);
//				andar.setEdificio(edf);
//				retorno =andar.getId();
//			}
		
		//return retorno;
	}
		
	
}
