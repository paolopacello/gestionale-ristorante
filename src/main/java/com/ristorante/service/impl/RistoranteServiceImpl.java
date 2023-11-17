package com.ristorante.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ristorante.model.Ristorante;
import com.ristorante.repository.RistoranteRepository;
import com.ristorante.service.model.RistoranteService;

@Service
public class RistoranteServiceImpl implements RistoranteService {
	
	@Autowired
	private RistoranteRepository repoRisto;

	

	@Override
	public Ristorante aggiungiRistorante(Ristorante nomeRistorante) {
		// TODO Auto-generated method stub
		
		return repoRisto.save(nomeRistorante);
	}

	@Override
	public List<Ristorante> vediRistorante() {
		// TODO Auto-generated method stub
		return repoRisto.findAll();
	}

	@Override
	public Ristorante ristorantePerNome(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ristorante findById(String nome_risto) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
