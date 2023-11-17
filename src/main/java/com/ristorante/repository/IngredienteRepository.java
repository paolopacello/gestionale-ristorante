package com.ristorante.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.ristorante.model.Ingrediente;

public interface IngredienteRepository extends JpaRepository<Ingrediente, Long> {
	
	public Optional <Ingrediente> FindIngredienteByNomeIngrediente(String nomeIngrediente);

}
