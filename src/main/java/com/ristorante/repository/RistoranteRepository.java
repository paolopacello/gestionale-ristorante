package com.ristorante.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ristorante.model.Ristorante;

public interface RistoranteRepository extends JpaRepository<Ristorante, Long> {

}
