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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getPontosHidraulicosTotal() {
		return pontosHidraulicosTotal;
	}

	public void setPontosHidraulicosTotal(int pontosHidraulicosTotal) {
		this.pontosHidraulicosTotal = pontosHidraulicosTotal;
	}

	public int getPontosHidraulicosParcial() {
		return pontosHidraulicosParcial;
	}

	public void setPontosHidraulicosParcial(int pontosHidraulicosParcial) {
		this.pontosHidraulicosParcial = pontosHidraulicosParcial;
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
