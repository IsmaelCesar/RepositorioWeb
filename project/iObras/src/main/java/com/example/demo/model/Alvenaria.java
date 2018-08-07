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
public class Alvenaria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private int vigasTotal;
	private int vigasParcial;
	private int pilaresParcial;
	private int pilaresTotal;
	private double mQuadradosParcial;
	private double mQuadradosTotal;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="alvenaria")
	private List<Andar> andar;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="alvenaria")
	private List<Edificio> edificio;

	
	
}
