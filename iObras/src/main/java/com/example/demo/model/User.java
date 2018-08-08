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
public class User {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	public String name;
	public String email;
	public String senha;
	public String endereco;
	public String telefone;
	public String confSenha;
	public boolean engenheiro;
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="User")
	public List<Obras> obras;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getConfSenha() {
		return confSenha;
	}


	public void setConfSenha(String confSenha) {
		this.confSenha = confSenha;
	}


	public boolean isEngenheiro() {
		return engenheiro;
	}


	public void setEngenheiro(boolean engenheiro) {
		this.engenheiro = engenheiro;
	}


	public List<Obras> getObras() {
		return obras;
	}


	public void setObras(List<Obras> obras) {
		this.obras = obras;
	}
	

}
