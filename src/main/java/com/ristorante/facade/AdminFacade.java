package com.ristorante.facade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ristorante.dto.RistoranteDTO;
import com.ristorante.mapper.RistoranteMapper;
import com.ristorante.model.Ristorante;
import com.ristorante.repository.RistoranteRepository;

@Service
public class AdminFacade {
	
	@Autowired
	private RistoranteRepository repo;
	
	@Autowired
	private RistoranteMapper map;
	
	public List<RistoranteDTO> visualizzaRistoranti() {
		List<Ristorante> listaRistoranti = repo.findAll();
		List<RistoranteDTO> listaRistorantiDTO = map.daRistDTOListaRistoranteLista(listaRistoranti);
		return listaRistorantiDTO; 
	}
}
