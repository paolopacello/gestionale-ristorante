package com.ristorante.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ristorante.model.Ordine;

import com.ristorante.repository.OrdineRepository;
import com.ristorante.service.model.OrdineService;

public class OrdineServiceImpl implements OrdineService {
	
	@Autowired
	private OrdineRepository repoOrd;


	@Override
	public List<Ordine> cercaOrdinePerId(long id) {
		// TODO Auto-generated method stub
		return repoOrd.findAll();
	}

	@Override
	public void aggiungiOrdine(Ordine o) {
		// TODO Auto-generated method stub
		repoOrd.save(o);
	}

}
