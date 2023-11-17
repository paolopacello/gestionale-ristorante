package com.ristorante.mapper;


import org.springframework.stereotype.Component;

import com.ristorante.dto.OrdineDTO;
import com.ristorante.model.Ordine;

@Component
public class OrdineMapper {
	
	
	public OrdineDTO aOrdineDto(Ordine o) {
		OrdineDTO orDTO = new OrdineDTO();
		orDTO.setId(o.getId());
		orDTO.setNomeRisto(o.getRistorante());
		orDTO.setNomeUtente(o.getCliente().getNome()+  " " + o.getCliente().getCognome());
		orDTO.setStato(o.getStato());
		return orDTO;
	}
}