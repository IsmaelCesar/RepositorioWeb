package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
public class Edificio {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String tipoFundacao;
	private String statusFundacao;
	private String empresaFundaao;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="edificio")
	private List<Andar> andar;

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
	
	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	private Obra obra;
	
}
