package com.example.demo.validations;

public class ValidProduit {
	public boolean verifTitre(String titre) {
		return titre != null;
	}
	
	public boolean verifPrix(float unit, float vente) {
		return vente > unit;	
	}
	
	public boolean verifQuantite(int quantite) {
		return quantite > 10;
	}
	
	
}
