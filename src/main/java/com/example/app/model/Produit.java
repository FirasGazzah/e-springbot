package com.example.app.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties(ignoreUnknown=true)
public class Produit implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(unique= true,name = "reference")
	private String reference;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "couleur")
	private String couleur;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "tailleMin")
	private int tailleMin;
	@Column(name = "tailleMax")	
	private int tailleMax;
	@Column(name = "prix")
	private float prix;
	@Column(name = "oldprix")
	private float oldprix;
	@Column(name = "promotion")
	private boolean promotion;
	@Column(name = "display")
	private boolean display;
	@Column(name = "type")
	private boolean type;
	@Column(name = "images")
	@ElementCollection(fetch = FetchType.EAGER)
	private List<String> images;

	@ManyToOne
	private Categories categori;
	@ManyToOne
	private SousCategories subcategori;
	
	@Column(nullable= true, name="image")
	private String image;
	
	
	public boolean isDisplay() {
		return display;
	}
	public void setDisplay(boolean display) {
		this.display = display;
	}
	public boolean isType() {
		return type;
	}
	public void setType(boolean type) {
		this.type = type;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<String> getImages() {
		return images;
	}
	public void setImages(List<String> images) {
		this.images = images;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public SousCategories getSubcategori() {
		return subcategori;
	}
	public void setSubcategori(SousCategories subcategori) {
		this.subcategori = subcategori;
	}
	public float getOldprix() {
		return oldprix;
	}
	public void setOldprix(float oldprix) {
		this.oldprix = oldprix;
	}
	public Categories getCategori() {
		return categori;
	}
	public void setCategori(Categories categori) {
		this.categori = categori;
	}
	public boolean isPromotion() {
		return promotion;
	}
	public void setPromotion(boolean promotion) {
		this.promotion = promotion;
	}
	public Produit() {
		super();
	}

	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getTailleMin() {
		return tailleMin;
	}
	public void setTailleMin(int tailleMin) {
		this.tailleMin = tailleMin;
	}
	public int getTailleMax() {
		return tailleMax;
	}
	public void setTailleMax(int tailleMax) {
		this.tailleMax = tailleMax;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}

	
}

	