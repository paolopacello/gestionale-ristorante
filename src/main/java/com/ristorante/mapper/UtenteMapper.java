package com.ristorante.mapper;



import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.ristorante.dto.AggiungiUtenteDTO;
import com.ristorante.dto.LoginDTO;
import com.ristorante.dto.RegistrazioneRistoratoreDTO;

import com.ristorante.model.Ruolo;
import com.ristorante.model.Utente;

@Component
public class UtenteMapper {
	
	public Utente daDTOaUtente(AggiungiUtenteDTO request) {
		Utente u = new Utente();
		u.setNome(request.getNome());
		u.setCognome(request.getCognome());
		u.setUsername(request.getUsername());
		u.setPassword(request.getPassword());
		u.setRuolo(Ruolo.CLIENTE);
		return u;
	}
	
	public Utente toRistoratoreFromDTO(AggiungiUtenteDTO request) {
		
		Utente u = new Utente();
		u.setNome(request.getNome());
		u.setCognome(request.getCognome());
		u.setUsername(request.getUsername());
		u.setPassword(request.getPassword());
		u.setRuolo(Ruolo.RISTORATORE);
		return u;
	}
	
	public LoginDTO tologinDTO(Utente u) {
		LoginDTO loginDTO= new LoginDTO();
		loginDTO.setUsername(u.getUsername());
		loginDTO.setPassword(u.getPassword());
		return loginDTO;
	}
	
	public List<LoginDTO> toLoginDTOList(List<Utente> user){
		
		return user.stream().map(this::tologinDTO).collect(Collectors.toList());
		
	}
	

}
