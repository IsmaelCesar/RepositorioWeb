package com.example.demo.model;

import java.io.File;
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
public class Obras {
	

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	public String nome;
	public String status;
	public boolean piscina;
	public File imagem;
	public Long numeroCrea;
	public String descricao;
	
	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	private User user;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="Obras")
	public List<Edificio> edf;
	
	public List<Edificio> getEdf() {
		return edf;
	}

	public void setEdf(List<Edificio> edf) {
		this.edf = edf;
	}	

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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isPiscina() {
		return piscina;
	}

	public void setPiscina(boolean piscina) {
		this.piscina = piscina;
	}

	public File getImagem() {
		return imagem;
	}

	public void setImagem(File imagem) {
		this.imagem = imagem;
	}

	public Long getNumeroCrea() {
		return numeroCrea;
	}

	public void setNumeroCrea(Long numeroCrea) {
		this.numeroCrea = numeroCrea;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
