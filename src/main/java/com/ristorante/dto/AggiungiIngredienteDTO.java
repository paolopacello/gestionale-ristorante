package com.ristorante.dto;

import jakarta.validation.constraints.NotBlank;

public class AggiungiIngredienteDTO {
	
	@NotBlank(message="non può essere vuoto")
	private String nomeIng;

	
	public AggiungiIngredienteDTO() {
		super();
	}

	public String getNomeIng() {
		return nomeIng;
	}

	public void setNomeIng(String nomeIng) {
		this.nomeIng = nomeIng;
	}
	
	
	
	

}
