package com.example.app.model;

import java.io.Serializable;

public class StockId implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int produit;
	
	private int magasin;
	
	private String etat;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((etat == null) ? 0 : etat.hashCode());
		result = prime * result + magasin;
		result = prime * result + produit;
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
		StockId other = (StockId) obj;
		if (etat == null) {
			if (other.etat != null)
				return false;
		} else if (!etat.equals(other.etat))
			return false;
		if (magasin != other.magasin)
			return false;
		if (produit != other.produit)
			return false;
		return true;
	}
		
}
