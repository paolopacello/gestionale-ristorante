package com.ristorante.mapper;

import java.util.List;


import org.springframework.stereotype.Component;

import com.ristorante.dto.AggiungiPiattoDTO;
import com.ristorante.model.Ingrediente;
import com.ristorante.model.Piatto;

@Component
public class PiattoMapper {
	

	
	public AggiungiPiattoDTO convertToPiattoDTO(Piatto piatto) {
		AggiungiPiattoDTO DTO = new AggiungiPiattoDTO();
		DTO.setNome_risto(piatto.getRistorante().getNomeRistorante());
		DTO.setNome_cate(piatto.getCategoria().getNome());
		DTO.setNome(piatto.getNome());
		List<String> listaIngredienti = piatto.getIngredienti().stream().map(Ingrediente::getNome).toList();
		DTO.setLista_ingredienti(listaIngredienti);
		DTO.setPrezzo(piatto.getPrezzo());
		return DTO;
	}
	

}
