package com.example.app.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Client implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name = "id")
	@Id
	private int id;
	@Column(name = "tel")
	private String tel;
	@Column(name = "code")
	private String code;
	@Column(name = "nom")
	private String nom;
	@Column(name = "nbrCmd")
	private int nbrCmd;
	@Column(name = "sommeTotale")
	private float sommeTotale;
	@Column(name = "pts")
	private int pts;
	@Column(name = "country")
	private String country;
	@Column(name = "state")
	private String state;	
	
	
	public Client(int id, String tel, String code, String nom, int nbrCmd, float sommeTotale, int pts, String country,
			String state) {
		super();
		this.id = id;
		this.tel = tel;
		this.code = code;
		this.nom = nom;
		this.nbrCmd = nbrCmd;
		this.sommeTotale = sommeTotale;
		this.pts = pts;
		this.country = country;
		this.state = state;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getNbrCmd() {
		return nbrCmd;
	}
	public void setNbrCmd(int nbrCmd) {
		this.nbrCmd = nbrCmd;
	}
	public float getSommeTotale() {
		return sommeTotale;
	}
	public void setSommeTotale(float sommeTotale) {
		this.sommeTotale = sommeTotale;
	}
	public int getPts() {
		return pts;
	}
	public void setPts(int pts) {
		this.pts = pts;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Client() {
		super();
	}	
	
}

	