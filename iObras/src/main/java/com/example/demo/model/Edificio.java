package com.example.demo.model;

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
public class Edificio {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	public String nome;
	public String tipoFundacao;
	public String statusFundacao;
	public String empresaFundaao;
	
	
	
	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	public Alvenaria alvenaria;
	
	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	public Hidraulica hidraulica;
	
	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	public Eletrica eletrica;
	
	
	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	public Revestimento revestimento;
	
}
