package com.ristorante.dto;

import com.ristorante.model.Ruolo;


import jakarta.validation.constraints.NotBlank;

import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class RegistrazioneUserDTO {
	
	@NotBlank(message="il nome non può essere vuoto")
	private String nome;
	
	@NotBlank(message="il cognome non può essere vuoto")
	private String cognome;
	
	@NotBlank(message="lo username non può essere vuoto")
	@Size(min= 4, max= 8, message="lo username non può essere inferiore ai 4 caratteri")
	private	String username;
	
	@NotBlank(message="la password non può essere vuota")
	@Pattern(regexp= "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$\", message = \"la password deve rispettare i caratteri previsti")
	private	String password;
	

	private Ruolo ruolo=Ruolo.CLIENTE;
	
	

	public Ruolo getRuolo() {
		return ruolo;
	}

	public void setRuolo(Ruolo ruolo) {
		this.ruolo = ruolo;
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


}
