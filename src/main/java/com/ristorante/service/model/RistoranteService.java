package com.ristorante.service.model;

import java.util.List;

import com.ristorante.model.Ristorante;

public interface RistoranteService {
	
	public Ristorante ristorantePerNome(String string);
	public List<Ristorante> vediRistorante();
	public Ristorante aggiungiRistorante(Ristorante nomeRistorante);
	public Ristorante findById(String nome_risto);

}
