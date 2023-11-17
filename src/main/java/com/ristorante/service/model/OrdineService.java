package com.ristorante.service.model;


import java.util.List;

import com.ristorante.model.Ordine;

public interface OrdineService {
	
	public void aggiungiOrdine(Ordine o);
	public List<Ordine> cercaOrdinePerId (long id);
	
}
