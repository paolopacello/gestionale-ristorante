package com.ristorante.service.model;

import java.util.List;

import com.ristorante.model.Ingrediente;
import com.ristorante.model.Piatto;

public interface PiattoService {
	
	public void aggiungiPiatto(Piatto p);
	public Piatto trovaPiattoPerId(long id);
	public List<Piatto> listaPiattiPerRistorante(long idRistorante);
	public List<Ingrediente> visualizzaIngredientiPiatto(long idPiatto);


}
