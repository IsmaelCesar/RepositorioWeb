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
	public int numero;
	public boolean status;
	public int quantidadeApartamento;
	
	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	private Edificio edf;
	
	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	public Alvenaria alvenaria;
	
	public Edificio getEdf() {
		return edf;
	}


	public void setEdf(Edificio edf) {
		this.edf = edf;
	}


	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	public Hidraulica hidraulica;
	
	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	public Eletrica eletrica;
	
	
	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	public Revestimento revestimento;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}


	public int getQuantidadeApartamento() {
		return quantidadeApartamento;
	}


	public void setQuantidadeApartamento(int quantidadeApartamento) {
		this.quantidadeApartamento = quantidadeApartamento;
	}


	public Alvenaria getAlvenaria() {
		return alvenaria;
	}


	public void setAlvenaria(Alvenaria alvenaria) {
		this.alvenaria = alvenaria;
	}


	public Hidraulica getHidraulica() {
		return hidraulica;
	}


	public void setHidraulica(Hidraulica hidraulica) {
		this.hidraulica = hidraulica;
	}


	public Eletrica getEletrica() {
		return eletrica;
	}


	public void setEletrica(Eletrica eletrica) {
		this.eletrica = eletrica;
	}


	public Revestimento getRevestimento() {
		return revestimento;
	}


	public void setRevestimento(Revestimento revestimento) {
		this.revestimento = revestimento;
	}
	
	
	
}
