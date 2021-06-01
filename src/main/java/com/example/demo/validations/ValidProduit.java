package com.example.demo.validations;

public class ValidProduit {
	public boolean verifTitre(String titre) {
		return titre != null;
	}
	
	public boolean verifPrix(int unit,int vente) {
		return vente > unit;	
	}
	
	public boolean verifQuantite(int quantite) {
		return quantite > 10;
	}
	
	
}
