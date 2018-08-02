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
	

}
