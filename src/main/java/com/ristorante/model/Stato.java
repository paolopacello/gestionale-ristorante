package com.ristorante.model;

public enum Stato {
	
	RICEVUTO("ricevuto"),
	IN_ELABORAZIONE("in_elaborazione"),
	EVASO("evaso"),
	RIFIUTATO("rifiutato");
	
	private String stato;

	private Stato(String stato) {
		this.stato = stato;
	}

	public String getStato() {
		return stato;
	}

	public void setStato(String stato) {
		this.stato = stato;
	}
	
	
}
