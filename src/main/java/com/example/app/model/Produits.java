package com.example.app.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@JsonIgnoreProperties(ignoreUnknown=true)
public class Produits implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "taille")
	private int taille;
	
	@Column(unique= true,name = "codebare")
	private String codebare;

	@ManyToOne(cascade = CascadeType.ALL)
	private Produit produits;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTaille() {
		return taille;
	}
	public void setTaille(int taille) {
		this.taille = taille;
	}
	public String getCodebare() {
		return codebare;
	}
	public void setCodebare(String codebare) {
		this.codebare = codebare;
	}
	public Produit getProduits() {
		return produits;
	}
	public void setProduits(Produit produits) {
		this.produits = produits;
	}
	
	

}
