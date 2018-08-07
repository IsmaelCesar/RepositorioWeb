package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Hidraulica {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private int pontosHidraulicosTotal;
	private int pontosHidraulicosParcial;
	private double tubulacoesTotal;
	private double tubulacoesParcial;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="hidraulica")
	private List<Andar> andar;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="hidraulica")
	private List<Edificio> edificio;

	
}
