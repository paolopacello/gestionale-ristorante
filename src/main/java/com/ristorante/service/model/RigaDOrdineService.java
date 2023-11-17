package com.ristorante.service.model;

import com.ristorante.model.RigaDOrdine;

public interface RigaDOrdineService {
	
	public void aggiungiRigaDOrdine(long idPiatto,long idOrdine,int quantita);
	public RigaDOrdine perIdRigaDOrdine(long id);
	
}
