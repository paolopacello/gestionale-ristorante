package com.ristorante.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ristorante.model.Ingrediente;
import com.ristorante.model.Piatto;

public interface PiattoRepository extends JpaRepository<Piatto, Long> {
	
	public Optional<List<Piatto>> findAllByRistoranteId(long ristoranteId);
	public Optional<List<Ingrediente>> findAllByIngredienteId(long ingredienteId);
}