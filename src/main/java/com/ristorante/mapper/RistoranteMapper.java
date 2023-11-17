package com.ristorante.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ristorante.dto.AggiungiRistoranteDTO;
import com.ristorante.dto.RistoranteDTO;
import com.ristorante.model.Ristorante;

@Component
public class RistoranteMapper {
	
	public  RistoranteDTO dARistoranteDTOaRistorante (Ristorante risto) {
		RistoranteDTO ristDTO = new RistoranteDTO();
		ristDTO.setNome(risto.getNomeRistorante());
		return ristDTO;
	}
	
	public List<RistoranteDTO> daRistDTOListaRistoranteLista (List<Ristorante> risto){
		return risto.stream().map(this::dARistoranteDTOaRistorante).toList();
	}

	
}
