package com.ristorante.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ristorante.model.Ingrediente;
import com.ristorante.repository.IngredienteRepository;
import com.ristorante.service.model.IngredienteService;

public class IngredienteServiceImpl implements IngredienteService {
	
	@Autowired
	private IngredienteRepository repoIng;

	@Override
	public Ingrediente tornaIngredientePerId(Long id) {
		// TODO Auto-generated method stub
		return repoIng.findById(id).orElse(null);
	}

	@Override
	public void aggiungiIngrediente(Ingrediente ingredientiAggiunti) {
		// TODO Auto-generated method stub
		repoIng.save(ingredientiAggiunti);
	}

	@Override
	public List<Ingrediente> listaIngredientiCreati() {
		// TODO Auto-generated method stub
		return repoIng.findAll();
	}

	@Override
	public Ingrediente findIngredienteByNome(String nomeIng) {
		// TODO Auto-generated method stub
		return null;
	}
	


}
