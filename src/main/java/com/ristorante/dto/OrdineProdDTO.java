package com.ristorante.dto;

public class OrdineProdDTO {
	private String nomePiatto;
	private int quantita;
	
	
	
	public OrdineProdDTO(String nomePiatto, int quantita) {
		super();
		this.nomePiatto = nomePiatto;
		this.quantita = quantita;
	}
	public String getNomePiatto() {
		return nomePiatto;
	}
	public void setNomePiatto(String nomePiatto) {
		this.nomePiatto = nomePiatto;
	}
	public int getQuantita() {
		return quantita;
	}
	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}
	
}
