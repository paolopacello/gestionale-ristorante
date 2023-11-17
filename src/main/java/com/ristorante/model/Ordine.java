package com.ristorante.model;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Ordine {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable = false)
	private LocalDateTime dataInvioOrdine;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cliente_id")
	private Utente cliente;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ristorante_id")
	private Ristorante ristorante;
	
	@OneToMany(mappedBy = "ordine",cascade=CascadeType.PERSIST)
    private List<RigaDOrdine> righeDOrdine;

	
	@Lob @Column(nullable = false,updatable = false)
	private Stato stato;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public LocalDateTime getDataInvioOrdine() {
		return dataInvioOrdine;
	}
	public void setDataInvioOrdine(LocalDateTime dataInvioOrdine) {
		this.dataInvioOrdine = dataInvioOrdine;
	}
	public Utente getCliente() {
		return cliente;
	}
	public void setCliente(Utente cliente) {
		this.cliente = cliente;
	}
	public Ristorante getRistorante() {
		return ristorante;
	}
	public void setRistorante(Ristorante ristorante) {
		this.ristorante = ristorante;
	}
	public List<RigaDOrdine> getRigheDOrdine() {
		return righeDOrdine;
	}
	public void setRigheDOrdine(List<RigaDOrdine> righeDOrdine) {
		this.righeDOrdine = righeDOrdine;
	}
	public Stato getStato() {
		return stato;
	}
	public void setStato(Stato stato) {
		this.stato = stato;
	}
	
	
}
