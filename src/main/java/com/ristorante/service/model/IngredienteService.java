package com.ristorante.service.model;

import java.util.List;

import com.ristorante.model.Ingrediente;

public interface IngredienteService {
	
public Ingrediente tornaIngredientePerId(Long id);
	
	public void aggiungiIngrediente(Ingrediente ingredientiAggiunti);
	
	public List<Ingrediente> listaIngredientiCreati();

	public Ingrediente findIngredienteByNome(String nomeIng);
	
	
}
