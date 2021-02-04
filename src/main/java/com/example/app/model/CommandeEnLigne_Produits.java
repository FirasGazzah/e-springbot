package com.example.app.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties(ignoreUnknown=true)
public class CommandeEnLigne_Produits implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CmdPK id = new CmdPK();

	public CmdPK getCmdPk() {
		return id;
	}

	private int qte;
	@Column(name = "prixachat", columnDefinition="float default 0")
	private float prixachat;
	
	@ManyToOne
	@MapsId("idProduit")
	private Produits produits;
	
	@ManyToOne
	@JsonBackReference
	@MapsId("idCmd")
	private CommandeEnLigne cmdLigne;

	public float getPrixachat() {
		return prixachat;
	}
	public void setPrixachat(float prixachat) {
		this.prixachat = prixachat;
	}
	public CmdPK getId() {
		return id;
	}
	public void setId(CmdPK id) {
		this.id = id;
	}
	public int getQte() {
		return qte;
	}
	public void setQte(int qte) {
		this.qte = qte;
	}
	public Produits getProduits() {
		return produits;
	}
	public void setProduits(Produits produits) {
		this.produits = produits;
	}
	public CommandeEnLigne getCmdLigne() {
		return cmdLigne;
	}
	public void setCmdLigne(CommandeEnLigne cmdLigne) {
		this.cmdLigne = cmdLigne;
	}


}

