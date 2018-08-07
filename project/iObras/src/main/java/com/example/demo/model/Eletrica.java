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
public class Eletrica {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	public int pontosEletricosTotal;
	public int pontosEletricosParcial;
	public double tubulacoesTotal;
	public double tubulacoesParcial;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="eletrica")
	public List<Andar> andar;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="eletrica")
	public List<Edificio> edificio;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getPontosEletricosTotal() {
		return pontosEletricosTotal;
	}

	public void setPontosEletricosTotal(int pontosEletricosTotal) {
		this.pontosEletricosTotal = pontosEletricosTotal;
	}

	public int getPontosEletricosParcial() {
		return pontosEletricosParcial;
	}

	public void setPontosEletricosParcial(int pontosEletricosParcial) {
		this.pontosEletricosParcial = pontosEletricosParcial;
	}

	public double getTubulacoesTotal() {
		return tubulacoesTotal;
	}

	public void setTubulacoesTotal(double tubulacoesTotal) {
		this.tubulacoesTotal = tubulacoesTotal;
	}

	public double getTubulacoesParcial() {
		return tubulacoesParcial;
	}

	public void setTubulacoesParcial(double tubulacoesParcial) {
		this.tubulacoesParcial = tubulacoesParcial;
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
