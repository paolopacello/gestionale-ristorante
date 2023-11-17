package com.ristorante.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class RigaDOrdine {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "piatto_id")
	private Piatto piatto;
	
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ordine_id")
    private Ordine ordine;
	
	@Column(nullable = false)
	private int quantita;
	
	
	
	public RigaDOrdine() {}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Piatto getPiatto() {
		return piatto;
	}
	public void setPiatto(Piatto piatto) {
		this.piatto = piatto;
	}
	public Ordine getOrdine() {
		return ordine;
	}
	public void setOrdine(Ordine ordine) {
		this.ordine = ordine;
	}
	public int getQuantita() {
		return quantita;
	}
	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}
	
	
}
