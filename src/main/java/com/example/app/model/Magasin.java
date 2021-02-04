package com.example.app.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Magasin implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name = "id")
		private int id;
		@Column(name = "nom")
		private String nom;
		@Column(name = "local")
		private String local;
		@Column(name = "datedecreation")
		private Date datedecreation;
		@Column(name = "mat")
		private String mat;
		
		
		public String getMat() {
			return mat;
		}
		public void setMat(String mat) {
			this.mat = mat;
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public String getLocal() {
			return local;
		}
		public void setLocal(String local) {
			this.local = local;
		}
		public Date getDatedecreation() {
			return datedecreation;
		}
		public void setDatedecreation(Date datedecreation) {
			this.datedecreation = datedecreation;
		}
		
}
