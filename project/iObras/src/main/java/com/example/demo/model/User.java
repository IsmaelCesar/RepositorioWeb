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
	private String name;
	private String email;
	private String senha;
	private String endereco;
	private String telefone;
	private String confSenha;
	private boolean engenheiro;
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="user")
	private List<Obra> obras;



}
