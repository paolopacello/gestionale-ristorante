package com.ristorante.service.model;

import java.util.List;

import com.ristorante.model.Categoria;

public interface CategoriaService {
	
		public Categoria trovaNomeCategorie(String string);
		public void aggiungiCategoria(String string);
		public List<Categoria> listaCategorie();
		public Categoria findCategoriaById(String string);
}
