package com.ristorante.dto;

import jakarta.validation.constraints.NotBlank;

public class RistoranteDTO {
	
	
	private Long id;
	
	@NotBlank(message="il nome non può essere vuoto")
	private String nome;
	
	
	
	public RistoranteDTO() {
		super();
	}
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	

}
