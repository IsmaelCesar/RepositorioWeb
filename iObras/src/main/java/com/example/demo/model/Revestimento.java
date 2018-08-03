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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getEsquadriasTotal() {
		return esquadriasTotal;
	}

	public void setEsquadriasTotal(int esquadriasTotal) {
		this.esquadriasTotal = esquadriasTotal;
	}

	public int getEsquadriasParcial() {
		return esquadriasParcial;
	}

	public void setEsquadriasParcial(int esquadriasParcial) {
		this.esquadriasParcial = esquadriasParcial;
	}

	public double getPisoTotal() {
		return pisoTotal;
	}

	public void setPisoTotal(double pisoTotal) {
		this.pisoTotal = pisoTotal;
	}

	public double getPisoParcial() {
		return pisoParcial;
	}

	public void setPisoParcial(double pisoParcial) {
		this.pisoParcial = pisoParcial;
	}

	public double getPinturaTotal() {
		return pinturaTotal;
	}

	public void setPinturaTotal(double pinturaTotal) {
		this.pinturaTotal = pinturaTotal;
	}

	public double getPinturaParcial() {
		return pinturaParcial;
	}

	public void setPinturaParcial(double pinturaParcial) {
		this.pinturaParcial = pinturaParcial;
	}

	public List<Andar> getAndar() {
		return andar;
	}

	public void setAndar(List<Andar> andar) {
		this.andar = andar;
	}

	public List<Edificio> getEdificio() {
		return edificio;
	}

	public void setEdificio(List<Edificio> edificio) {
		this.edificio = edificio;
	}
	
	
	
}
