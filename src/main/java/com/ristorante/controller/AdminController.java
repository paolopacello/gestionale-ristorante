package com.ristorante.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ristorante.dto.RistoranteDTO;
import com.ristorante.facade.AdminFacade;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private AdminFacade admin;
	
	@GetMapping
	public ResponseEntity<List<RistoranteDTO>> vediRistoranti(){
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(admin.visualizzaRistoranti());
	}

}
