package com.example.demo.model;

import java.io.File;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
public class Obras {
	

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	public String nome;
	public String status;
	public boolean piscina;
	public File imagem;
	public Long numeroCrea;
	public String descricao;
	
	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	public User user;
	
}
