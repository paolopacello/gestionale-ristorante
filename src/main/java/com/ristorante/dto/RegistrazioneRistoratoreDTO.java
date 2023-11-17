package com.ristorante.dto;

import java.util.List;

import com.ristorante.model.Ruolo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;


public class RegistrazioneRistoratoreDTO {
	
	@NotBlank(message="il campo Username non può essere lasciato vuoto")
	private String username;
	
	@NotBlank(message="la password non può essere vuota")
	@Pattern(regexp= "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$\", message = \"la password deve rispettare i caratteri previsti")
	private	String password;
	@NotBlank(message = "Il nome non può essere vuoto")
	private String nome;
	@NotBlank(message = "Il Cognome non può essere vuoto")
	private String cognome;
	
	private Ruolo ruolo=Ruolo.RISTORATORE;
	
	@NotEmpty(message="Il ristoratore deve aggiungere un ristorante al minimo.")
	private List<String> nomeRistoranti;

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

	public Ruolo getRuolo() {
		return ruolo;
	}

	public void setRuolo(Ruolo ruolo) {
		this.ruolo = ruolo;
	}

	public List<String> getNomeRistoranti() {
		return nomeRistoranti;
	}

	public void setNomeRistoranti(List<String> nomeRistoranti) {
		this.nomeRistoranti = nomeRistoranti;
	}
	
	
	
}
