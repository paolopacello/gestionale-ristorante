package com.ristorante.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ristorante.dto.AggiungiUtenteDTO;
import com.ristorante.dto.LoginDTO;
import com.ristorante.facade.UtenteFacade;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/utente")
public class UtenteController {
	
	@Autowired
	private UtenteFacade utenteFacade;
	
	@PostMapping("/registrazione/cliente")
		public ResponseEntity<String> registrazioneUtente(@Valid @RequestBody AggiungiUtenteDTO request){
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(utenteFacade.registrazioneUtente(request));
		}
		

	@PostMapping("/registrazione/ristoratore")
		public ResponseEntity<String> registrazioneRistoratore(@Valid @RequestBody AggiungiUtenteDTO request){	
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(utenteFacade.registrazioneR(request));
		}
	@PostMapping("/utente/login")
		public ResponseEntity<String> login(@Valid @RequestBody LoginDTO request){
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(utenteFacade.login(request));
	}
	
	
	

	
}
