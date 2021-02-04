package com.example.app.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@JsonIgnoreProperties(ignoreUnknown=true)
public class CommandeEnLigne implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "idcmd")
	private int idcmd;
	@Column(name = "totale")
	private float totale;
	@Column(name = "shippmentFee")
	private float shippmentFee;
	
	@Column(name = "quantiter")
	private int quantiter;
	@Column(name = "adress")
	private String adress;
	@Column(name = "nom")
	private String nom;
	@Column(name = "num")
	private String num;
	@Column(name = "livreur")
	private String livreur;
	@Column(name = "etat")
	private String etat;
	@Column(name = "gouvern")
	private String gouvern;
	@Column(name = "pays")
	private String pays;
	@Column(name = "payer")
	private boolean payer;
	@Column(name = "source")
	private String source;
	@Column(name = "codecolis")
	private String codecolis;
	@Column(name = "modepayment")
	private String modepayment;	
	
	@Column(name="date", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Date date;
	@ManyToOne
	private Client client;
	@JsonManagedReference
	@OneToMany(mappedBy="cmdLigne",cascade = CascadeType.MERGE,fetch=FetchType.EAGER)
	private Set<CommandeEnLigne_Produits> cmdP = new HashSet<>();
	
	
	public Set<CommandeEnLigne_Produits> getCmdP() {
		return cmdP;
	}
	public void setCmdP(Set<CommandeEnLigne_Produits> cmdP) {
		this.cmdP = cmdP;
	}

	public float getShippmentFee() {
		return shippmentFee;
	}
	public void setShippmentFee(float shippmentFee) {
		this.shippmentFee = shippmentFee;
	}
	public String getModepayment() {
		return modepayment;
	}
	public void setModepayment(String modepayment) {
		this.modepayment = modepayment;
	}
	public String getCodecolis() {
		return codecolis;
	}
	public void setCodecolis(String codecolis) {
		this.codecolis = codecolis;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public String getGouvern() {
		return gouvern;
	}
	public void setGouvern(String gouvern) {
		this.gouvern = gouvern;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdcmd() {
		return idcmd;
	}
	public void setIdcmd(int idcmd) {
		this.idcmd = idcmd;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	public float getTotale() {
		return totale;
	}
	public void setTotale(float totale) {
		this.totale = totale;
	}
	public int getQuantiter() {
		return quantiter;
	}
	public void setQuantiter(int quantiter) {
		this.quantiter = quantiter;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getLivreur() {
		return livreur;
	}
	public void setLivreur(String livreur) {
		this.livreur = livreur;
	}
	public boolean isPayer() {
		return payer;
	}
	public void setPayer(boolean payer) {
		this.payer = payer;
	}
	public CommandeEnLigne(int id, int idcmd, Date date, Set<CommandeEnLigne_Produits> cmdP, float totale,
			int quantiter, String adress, String nom, String num, String livreur, String etat, boolean payer) {
		super();
		this.id = id;
		this.idcmd = idcmd;
		this.date = date;
		this.cmdP = cmdP;
		this.totale = totale;
		this.quantiter = quantiter;
		this.adress = adress;
		this.nom = nom;
		this.num = num;
		this.livreur = livreur;
		this.etat = etat;
		this.payer = payer;
	}
	public CommandeEnLigne() {
		super();
	}
	
	
	
}

	