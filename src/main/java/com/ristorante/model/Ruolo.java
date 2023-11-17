package com.ristorante.model;

public enum Ruolo {
	
	CLIENTE("Cliente"),
	RISTORATORE("Ristorante"),
	ADMIN("Admin");
	
	private String ruolo;

	private Ruolo(String ruolo) {
		this.ruolo = ruolo;
	}

	public String getRuolo() {
		return ruolo;
	}

	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}
	
	
}
