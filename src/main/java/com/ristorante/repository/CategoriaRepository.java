package com.ristorante.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ristorante.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
