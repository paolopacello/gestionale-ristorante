package com.ristorante.dto;

import java.util.List;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class AggiungiPiattoDTO {
	
	@NotBlank
	private String nome_risto;
	@NotBlank
	private String nome_cate;
	@NotBlank
	private String nome;
	@NotBlank
	@Size(min=5, max= 500, message="la descrizione deve avere minimo 5 caratteri e un massimo di 500")
	private String descrizione;
	@NotBlank
	private double prezzo;
	
	
	private List<String> lista_ingredienti;
	
	public AggiungiPiattoDTO() {
		super();
	}

	
	
	public List<String> getLista_ingredienti() {
		return lista_ingredienti;
	}



	public void setLista_ingredienti(List<String> lista_ingredienti) {
		this.lista_ingredienti = lista_ingredienti;
	}



	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome= nome;
	}


	public String getDescrizione() {
		return descrizione;
	}


	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}



	public double getPrezzo() {
		return prezzo;
	}



	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}



	public String getNome_risto() {
		return nome_risto;
	}



	public void setNome_risto(String nome_risto) {
		this.nome_risto = nome_risto;
	}



	public String getNome_cate() {
		return nome_cate;
	}



	public void setNome_cate(String nome_cate) {
		this.nome_cate = nome_cate;
	}
	
	





	
	
	
	
	
	
}
