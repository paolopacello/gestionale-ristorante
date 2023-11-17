package com.ristorante.repository;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ristorante.model.Utente;

public interface UtenteRepository extends JpaRepository<Utente, Long>{
	
	public Optional<Utente> findUtenteByUsernameAndPassword(String username,String password);
	public Optional<Utente> findUtenteByUsername(String username);
	public Utente findUtenteByRistoranteId(long ristoranteId);
	
}
