package com.ristorante.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ristorante.dto.AggiungiIngredienteDTO;
import com.ristorante.model.Ingrediente;

@Component
public class IngredienteMapper {
	
	public AggiungiIngredienteDTO convertToIngrediente (Ingrediente request) {
		AggiungiIngredienteDTO i = new AggiungiIngredienteDTO();
		i.setNomeIng(request.getNome());
		return i;
	}
		
	public List<AggiungiIngredienteDTO> convertIngredienteToListaIngrediente(List<Ingrediente> request) {
		return request.stream().map(this::convertToIngrediente).toList(); 
	}
		

}
