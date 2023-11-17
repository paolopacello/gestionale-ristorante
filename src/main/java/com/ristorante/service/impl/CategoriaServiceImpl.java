package com.ristorante.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ristorante.model.Categoria;
import com.ristorante.repository.CategoriaRepository;
import com.ristorante.service.model.CategoriaService;

public class CategoriaServiceImpl implements CategoriaService {
	
	@Autowired
	private CategoriaRepository repoC;

	
	

	@Override
	public List<Categoria> listaCategorie() {
		// TODO Auto-generated method stub
		return repoC.findAll();
	}

	@Override
	public Categoria trovaNomeCategorie(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void aggiungiCategoria(String string) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Categoria findCategoriaById(String string) {
		// TODO Auto-generated method stub
		return null;
	}



}
