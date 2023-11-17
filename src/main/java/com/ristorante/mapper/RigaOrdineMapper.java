package com.ristorante.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ristorante.dto.OrdineProdDTO;
import com.ristorante.model.Ordine;
import com.ristorante.model.RigaDOrdine;

@Component
public class RigaOrdineMapper {
	
	public List<OrdineProdDTO> toListaProdottiOrdinati (Ordine o){
		return o.getRigheDOrdine().stream().map(this::toProdottiOrdinati).toList();
	}
	
	public OrdineProdDTO toProdottiOrdinati(RigaDOrdine rigdor) {
		return new OrdineProdDTO(rigdor.getPiatto().getNome(), rigdor.getQuantita());
	}
}
