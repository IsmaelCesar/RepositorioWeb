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
public class Revestimento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	public int esquadriasTotal;
	public int esquadriasParcial;
	public double pisoTotal;
	public double pisoParcial;
	public double pinturaTotal;
	public double pinturaParcial;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="Andar")
	public List<Andar> andar;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="Edificio")
	public List<Edificio> edificio;
	
}
