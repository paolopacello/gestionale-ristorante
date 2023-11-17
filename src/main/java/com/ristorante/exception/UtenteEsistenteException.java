package com.ristorante.exception;

import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class UtenteEsistenteException extends RuntimeException {

	private String message;
	
	public UtenteEsistenteException(String message) {
		super(message);	
	}

	public String getMessage() {
		return message;
	}
	
	
	
	

}
