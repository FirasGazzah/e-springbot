package com.example.app.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;

@Entity
@IdClass(StockId.class)
public class Stock implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name = "quantiter")
	private int quantiter;
	@Id
	@Column(name = "etat")
	private String etat;
	@Id
	@ManyToOne
	private Produits produit;
	@Id
	@ManyToOne
	private Magasin magasin;
	
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public Produits getProduit() {
		return produit;
	}
	public void setProduit(Produits produit) {
		this.produit = produit;
	}
	public Magasin getMagasin() {
		return magasin;
	}
	public void setMagasin(Magasin magasin) {
		this.magasin = magasin;
	}
	public int getQuantiter() {
		return quantiter;
	}
	public void setQuantiter(int quantiter) {
		this.quantiter = quantiter;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((magasin == null) ? 0 : magasin.hashCode());
		result = prime * result + ((produit == null) ? 0 : produit.hashCode());
		result = prime * result + quantiter;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stock other = (Stock) obj;
		if (magasin == null) {
			if (other.magasin != null)
				return false;
		} else if (!magasin.equals(other.magasin))
			return false;
		if (produit == null) {
			if (other.produit != null)
				return false;
		} else if (!produit.equals(other.produit))
			return false;
		if (quantiter != other.quantiter)
			return false;
		return true;
	}
	
	
	
}
