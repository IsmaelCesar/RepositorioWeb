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
	
	private int esquadriasTotal;
	private int esquadriasParcial;
	private double pisoTotal;
	private double pisoParcial;
	private double pinturaTotal;
	private double pinturaParcial;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="revestimento")
	private List<Andar> andar;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="revestimento")
	private List<Edificio> edificio;

	
	
}
