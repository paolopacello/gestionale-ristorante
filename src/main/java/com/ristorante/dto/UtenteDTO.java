package com.ristorante.dto;

import jakarta.validation.constraints.NotBlank;

public class UtenteDTO {
	
	@NotBlank
	private String nome,cognome,username;
	
	
	private Long idRistorante;
	

	public UtenteDTO() {
		super();
	}
	
	

	public UtenteDTO(String nome, String cognome, String username, Long idRistorante) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.username = username;
		this.idRistorante = idRistorante;
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

	public Long getIdRistorante() {
		return idRistorante;
	}

	public void setIdRistorante(Long idRistorante) {
		this.idRistorante = idRistorante;
	}
	
	
}
