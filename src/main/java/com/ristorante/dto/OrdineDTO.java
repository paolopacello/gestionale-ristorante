package com.ristorante.dto;



import com.ristorante.model.Ristorante;
import com.ristorante.model.Stato;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class OrdineDTO {
	
	@Min(value = 1)
	private long id;
	@NotBlank(message = "Il nome del ristorante non è stato inserito")
	private Ristorante nomeRisto;
	@NotBlank(message = "Il nome dell'utente non è stato inserito")
	private String nomeUtente;
	@NotBlank(message = "Lo stato non è stato inserito")
	private Stato stato;
	
	
	
	
	public OrdineDTO() {
		
	}


	public OrdineDTO( Ristorante nomeRisto, String nomeUtente, Stato stato) {
		
		this.nomeRisto = nomeRisto;
		this.nomeUtente = nomeUtente;
		this.stato = stato;
		
	}
	
	



	public Stato getStato() {
		return stato;
	}
	public void setStato(Stato stato) {
		this.stato = stato;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Ristorante getNomeRisto() {
		return nomeRisto;
	}
	public void setNomeRisto(Ristorante ristorante) {
		this.nomeRisto = ristorante;
	}
	public String getNomeUtente() {
		return nomeUtente;
	}
	public void setNomeUtente(String nomeUtente) {
		this.nomeUtente = nomeUtente;
	}
	
	
}
