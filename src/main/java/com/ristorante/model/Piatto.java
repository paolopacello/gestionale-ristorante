package com.ristorante.model;

import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;


@Entity
public class Piatto {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable = false,name="nome_piatto")
	private String nome;
	
	@Lob @Column(length=500)
	private String descrizione;
	
	@Column(nullable = false)
	private double prezzo;
	

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "ristorante_id")
    private Ristorante ristorante;
    
    @ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="ingrediente_Piatto",
    							joinColumns =@JoinColumn(name="id_piatti"),
    							inverseJoinColumns=@JoinColumn (name="id_ingredienti"))
    private List<Ingrediente> ingredienti;
	
	public Piatto() {}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Ristorante getRistorante() {
		return ristorante;
	}

	public void setRistorante(Ristorante ristorante) {
		this.ristorante = ristorante;
	}

	public List<Ingrediente> getIngredienti() {
		return ingredienti;
	}

	public void setIngredienti(List<Ingrediente> ingredienti) {
		this.ingredienti = ingredienti;
	}
    
	
	
	
	
	
}
