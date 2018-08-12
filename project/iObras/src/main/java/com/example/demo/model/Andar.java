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
public class Andar {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int numero;
	private boolean status;
	private int quantidadeAndar;
	private int quantidadeApartamento;
	
	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	private Edificio edificio;
	
	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	private Alvenaria alvenaria;
	
	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	private Hidraulica hidraulica;
	
	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	private Eletrica eletrica;
	
	
	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	private Revestimento revestimento;
	
}
