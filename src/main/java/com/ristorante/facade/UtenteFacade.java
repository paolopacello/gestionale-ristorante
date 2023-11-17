package com.ristorante.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.ristorante.dto.AggiungiUtenteDTO;
import com.ristorante.dto.LoginDTO;
import com.ristorante.exception.UtenteEsistenteException;
import com.ristorante.mapper.UtenteMapper;
import com.ristorante.model.Utente;
import com.ristorante.service.model.UtenteService;



@Service
public class UtenteFacade {
	
	@Autowired
	 private UtenteService userservice;

	@Autowired
	private UtenteMapper map;
	
	
	@PostMapping("/registrazione/cliente")
	public String registrazioneUtente(AggiungiUtenteDTO request){
		Utente u = userservice.findUtenteByUsername(request.getUsername());
		if(u != null) {
			throw new UtenteEsistenteException("Utente gia esistente con questo username");
		}
		userservice.registraUser(map.daDTOaUtente(request));
		return "registrazione cliente avvenuta con successo";
		
		
	}
	

	@PostMapping("/registrazione/ristoratore")
	public String registrazioneR(AggiungiUtenteDTO request) {
		Utente u = userservice.findUtenteByUsername(request.getUsername());
		if(u != null) {
			throw new UtenteEsistenteException("Utente gia esistente con questo username");
			
		}
		userservice.registraRistoratore(map.toRistoratoreFromDTO(request));
		return "registrazione ristoratore avvenuta con successo";
			
		
	}
	
	@PostMapping("/utente/login")
	public String login(LoginDTO request) {
		Utente u = userservice.findUtenteByUsernameAndPassword(request.getUsername(),request.getPassword());
		if(u != null) {
			userservice.login(request.getUsername(),request.getPassword());
		}
		return "Impossibile effettuare login";
	}


		

}
