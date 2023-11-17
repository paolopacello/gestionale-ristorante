package com.ristorante.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ristorante.model.Utente;
import com.ristorante.repository.UtenteRepository;

import com.ristorante.service.model.UtenteService;

@Service
public class UtenteServiceImpl implements UtenteService{
	
	@Autowired
	private UtenteRepository repoUser;

	@Override
	public void registraUser(Utente user) {
		repoUser.save(user);
		
	}

	@Override
	public void registraRistoratore(Utente ristora) {
		repoUser.save(ristora);
		
	}

	@Override
	public Utente login(String username, String password) {
		// TODO Auto-generated method stub
		return repoUser.findUtenteByUsernameAndPassword(username, password).orElse(null);
	}



	@Override
	public Utente userPerId(long id) {
		// TODO Auto-generated method stub
		return repoUser.findById(id).orElse(null);
	}

	@Override
	public Utente findUtenteByUsername(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utente findUtenteByUsernameAndPassword(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}
	


}
