package com.ristorante.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;


@Entity
public class Ristorante {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable = false)
	private String nomeRistorante;
	
	@OneToMany(mappedBy = "ristorante") 
    private List<Piatto> piatti;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="utente_id")
	private Utente gestore;
	
	
	public Ristorante() {}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public List<Piatto> getPiatti() {
		return piatti;
	}

	public void setPiatti(List<Piatto> piatti) {
		this.piatti = piatti;
	}

	public String getNomeRistorante() {
		return nomeRistorante;
	}

	public void setNomeRistorante(String nomeRistorante) {
		this.nomeRistorante = nomeRistorante;
	}

	public Utente getGestore() {
		return gestore;
	}

	public void setGestore(Utente gestore) {
		this.gestore = gestore;
	}
	
	

	
	
}
