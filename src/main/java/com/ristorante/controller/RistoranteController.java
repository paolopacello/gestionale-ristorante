package com.ristorante.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ristorante.dto.AggiungiCategoriaDTO;
import com.ristorante.dto.AggiungiIngredienteDTO;
import com.ristorante.dto.AggiungiPiattoDTO;
import com.ristorante.facade.RistoranteFacade;
import com.ristorante.service.model.CategoriaService;
import com.ristorante.service.model.IngredienteService;
import com.ristorante.service.model.PiattoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/ristorante")
public class RistoranteController {
	
	@Autowired
	private PiattoService piattoService;
	@Autowired
	private IngredienteService ingService;
	@Autowired
	private CategoriaService catService;
	@Autowired
	private RistoranteFacade ristFacade;
	
	@PostMapping("/ingrediente/add")
	public ResponseEntity<AggiungiIngredienteDTO> aggiungiIngrediente(@Valid @RequestBody AggiungiIngredienteDTO request){
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(ristFacade.aggiungiIngrediente(request));
		}
	
			
	
	
	@PostMapping("/categoria/add")
	public ResponseEntity<AggiungiCategoriaDTO> aggiungiCategoria(@Valid @RequestBody AggiungiCategoriaDTO request){
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(ristFacade.aggiungiCategoria(request));
		}
		
			
	
	
	@PostMapping("/piatto/add")
	public ResponseEntity<AggiungiPiattoDTO> aggiungiPiatto(@Valid @RequestBody AggiungiPiattoDTO request){
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(ristFacade.aggiungiPiatto(request));
	}
	
	@GetMapping("/ristoratore/visualizzaIngredienti")
	public ResponseEntity<List<AggiungiIngredienteDTO>> visualizzaIngredienti(){
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(ristFacade.visualizzaIngredienti());
		
	}
	

}
