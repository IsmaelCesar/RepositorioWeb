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
	
	public int pontosHidraulicosTotal;
	public int pontosHidraulicosParcial;
	public double tubulacoesTotal;
	public double tubulacoesParcial;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="Andar")
	public List<Andar> andar;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="Edificio")
	public List<Edificio> edificio;
}
