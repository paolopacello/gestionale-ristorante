package com.ristorante.exception;

import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class DatoNonInseritoException  extends RuntimeException{

	
	private String nomeDato;

	public DatoNonInseritoException(String nomeDato) {
		this.nomeDato = nomeDato;
	}

	public String getNomeDato() {
		return nomeDato;
	}
	
	
}
