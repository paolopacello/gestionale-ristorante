package com.ristorante.service.impl;

import java.util.List;

import com.ristorante.model.Ingrediente;
import com.ristorante.model.Piatto;
import com.ristorante.repository.PiattoRepository;
import com.ristorante.service.model.PiattoService;

public class PiattoServiceImpl implements PiattoService {
	
	private PiattoRepository repoP;

	@Override
	public void aggiungiPiatto(Piatto p) {
		// TODO Auto-generated method stub
		repoP.save(p);
	}

	@Override
	public Piatto trovaPiattoPerId(long id) {
		// TODO Auto-generated method stub
		return repoP.findById(id).orElse(null);
	}

	@Override
	public List<Piatto> listaPiattiPerRistorante(long idRistorante) {
		// TODO Auto-generated method stub
		return repoP.findAllByRistoranteId(idRistorante).orElse(null);
	}

	@Override
	public List<Ingrediente> visualizzaIngredientiPiatto(long idPiatto) {
		// TODO Auto-generated method stub
		return repoP.findAllByIngredienteId(idPiatto).orElse(null);

	}
	
}
