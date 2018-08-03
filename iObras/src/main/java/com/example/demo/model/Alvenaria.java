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
	
	public int vigasTotal;
	public int vigasParcial;
	public int pilaresParcial;
	public int pilaresTotal;
	public double mQuadradosParcial;
	public double mQuadradosTotal;
	
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

	public int getVigasTotal() {
		return vigasTotal;
	}

	public void setVigasTotal(int vigasTotal) {
		this.vigasTotal = vigasTotal;
	}

	public int getVigasParcial() {
		return vigasParcial;
	}

	public void setVigasParcial(int vigasParcial) {
		this.vigasParcial = vigasParcial;
	}

	public int getPilaresParcial() {
		return pilaresParcial;
	}

	public void setPilaresParcial(int pilaresParcial) {
		this.pilaresParcial = pilaresParcial;
	}

	public int getPilaresTotal() {
		return pilaresTotal;
	}

	public void setPilaresTotal(int pilaresTotal) {
		this.pilaresTotal = pilaresTotal;
	}

	public double getmQuadradosParcial() {
		return mQuadradosParcial;
	}

	public void setmQuadradosParcial(double mQuadradosParcial) {
		this.mQuadradosParcial = mQuadradosParcial;
	}

	public double getmQuadradosTotal() {
		return mQuadradosTotal;
	}

	public void setmQuadradosTotal(double mQuadradosTotal) {
		this.mQuadradosTotal = mQuadradosTotal;
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
