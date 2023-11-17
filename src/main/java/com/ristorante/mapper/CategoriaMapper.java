package com.ristorante.mapper;

import org.springframework.stereotype.Component;

import com.ristorante.dto.AggiungiCategoriaDTO;
import com.ristorante.model.Categoria;

@Component
public class CategoriaMapper {
	
	public AggiungiCategoriaDTO convertToCategoriaDTO(Categoria request) {
		AggiungiCategoriaDTO c = new AggiungiCategoriaDTO();
		c.setNome(request.getNome());
		return c;
	}
}
