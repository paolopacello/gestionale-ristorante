package com.ristorante.dto;



import jakarta.validation.constraints.NotBlank;

public class AggiungiCategoriaDTO {
	

	@NotBlank(message="il campo nome non può essere vuoto")
	private String nome;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
