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
	public String nome;
	public String tipoFundacao;
	public String statusFundacao;
	public String empresaFundaao;
	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipoFundacao() {
		return tipoFundacao;
	}

	public void setTipoFundacao(String tipoFundacao) {
		this.tipoFundacao = tipoFundacao;
	}

	public String getStatusFundacao() {
		return statusFundacao;
	}

	public void setStatusFundacao(String statusFundacao) {
		this.statusFundacao = statusFundacao;
	}

	public String getEmpresaFundaao() {
		return empresaFundaao;
	}

	public void setEmpresaFundaao(String empresaFundaao) {
		this.empresaFundaao = empresaFundaao;
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



	public Obras getObra() {
		return obra;
	}

	public void setObra(Obras obra) {
		this.obra = obra;
	}

	@OneToMany(cascade = CascadeType.ALL, mappedBy="Edificio")
	public List<Andar> andar;

	public List<Andar> getAndar() {
		return andar;
	}

	public void setAndar(List<Andar> andar) {
		this.andar = andar;
	}

	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	public Alvenaria alvenaria;
	
	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	public Hidraulica hidraulica;
	
	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	public Eletrica eletrica;
	
	
	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	public Revestimento revestimento;
	
	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	public Obras obra;
	
}
