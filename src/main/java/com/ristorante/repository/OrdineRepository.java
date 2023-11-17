package com.ristorante.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ristorante.model.Ordine;

public interface OrdineRepository extends JpaRepository<Ordine, Long>{
	
	public Optional<List<Ordine>> findAllByRistorante_id(Long ristoranteId);

	public Optional<List<Ordine>> findAllByCliente_Id(long clienteId);


}
