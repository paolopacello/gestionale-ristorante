package com.ristorante.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ristorante.dto.MessaggioErroreDTO;

@RestControllerAdvice
public class GestisceException {
	
	@ExceptionHandler(UtenteEsistenteException.class)
	public ResponseEntity<MessaggioErroreDTO> getUtenteEsistente( UtenteEsistenteException e){
		MessaggioErroreDTO meDTO = new MessaggioErroreDTO("Utente" +e.getMessage() +"già esistente");
		return ResponseEntity.status(HttpStatus.FORBIDDEN).body(meDTO);
	}
	
	@ExceptionHandler(UtenteNonTrovatoException.class)
	public ResponseEntity<MessaggioErroreDTO> getUtenteNonTrovato(UtenteNonTrovatoException e){
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new MessaggioErroreDTO(e.getMessage()));
	}
	
	@ExceptionHandler(DatoNonInseritoException.class)
	public ResponseEntity<MessaggioErroreDTO> getUtenteNonInserito(DatoNonInseritoException e){
		MessaggioErroreDTO meDTO = new MessaggioErroreDTO("campo" +e.getNomeDato() + "non inserito correttamente");
		return ResponseEntity.status(HttpStatus.FORBIDDEN).body(meDTO);
	}
		
	

}
