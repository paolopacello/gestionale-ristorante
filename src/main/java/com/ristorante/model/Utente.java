package com.ristorante.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Lob;

import jakarta.persistence.OneToMany;


@Entity
public class Utente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	 
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false, unique=true)
	private String cognome;
	
	@Column(nullable = false, unique = true)
	private String username;
	
	@Column(nullable = false)
	private String password;
	
	@Lob @Column(nullable = false,updatable = false)
	private Ruolo ruolo=Ruolo.CLIENTE;
	
	@OneToMany(mappedBy = "gestore",cascade = CascadeType.PERSIST)
	private List<Ristorante> ristoranti;
	
	public Utente() {}


	public Utente(String nome, String cognome) {
		
	}


	
	


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCognome() {
		return cognome;
	}


	public void setCognome(String cognome) {
		this.cognome = cognome;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Ruolo getRuolo() {
		return ruolo;
	}


	public void setRuolo(Ruolo ruolo) {
		this.ruolo = ruolo;
	}


	public List<Ristorante> getRistoranti() {
		return ristoranti;
	}


	public void setRistoranti(List<Ristorante> ristoranti) {
		this.ristoranti = ristoranti;
	}
	
	
	

}
