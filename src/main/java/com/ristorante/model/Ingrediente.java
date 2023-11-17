package com.ristorante.model;


import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;


@Entity
public class Ingrediente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable = false)
	private String nomeIngr;
	
	@ManyToMany(mappedBy="ingredienti")
	private List<Piatto> piatti;
	
	public Ingrediente() {
		super();
	}
	
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nomeIngr;
	}
	
	public void setNome(String nome) {
		this.nomeIngr = nome;
	}


	public List<Piatto> getPiatti() {
		return piatti;
	}


	public void setPiatti(List<Piatto> piatti) {
		this.piatti = piatti;
	}
	
	
}
