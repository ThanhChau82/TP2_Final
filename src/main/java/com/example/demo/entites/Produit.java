package com.example.demo.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;

import org.springframework.lang.NonNull;

@Entity
public class Produit {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotBlank
	@Max(255)
	private String titre;
	
	@NonNull
	private float prixU;
	
	@NonNull
	private float prixV;
	
	@NonNull
	private int quantite;	
	
	public Produit() {
		super();
	}
	public Produit(String titre, float prixU, float prixV, int quantite) {
		super();
		this.titre = titre;
		this.prixU = prixU;
		this.prixV = prixV;
		this.quantite = quantite;
	}
	public Produit(int id, String titre, float prixU, float prixV, int quantite) {
		super();
		this.id = id;
		this.titre = titre;
		this.prixU = prixU;
		this.prixV = prixV;
		this.quantite = quantite;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public float getPrixU() {
		return prixU;
	}
	public void setPrixU(float prixU) {
		this.prixU = prixU;
	}
	public float getPrixV() {
		return prixV;
	}
	public void setPrixV(float prixV) {
		this.prixV = prixV;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
	
}
