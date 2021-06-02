package com.example.demo.controllers;

import java.util.List;

import javax.validation.Valid; // Ajouter la dépendence via click droit sur le projet, puis Spring/Add Starters

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.daos.ProduitRepository;
import com.example.demo.entites.Produit;
import com.example.demo.validations.ValidProduit;

@RestController
@RequestMapping("produit")
public class ProduitController {
	@Autowired
	private ProduitRepository produitRepository; 
	
	
	/**
	 * Ajouter un produit dans la bdd
	 * @param produit
	 * @return
	 */
	@PostMapping
	public Produit addProduit(@Valid @RequestBody Produit produit) { // @Valid : vérifier au préalable les validations via Annotations côtés entities (class Produit)
		ValidProduit validProduit = new ValidProduit();
		if (validProduit.verifTitre(produit.getTitre()) && validProduit.verifPrix(produit.getPrixU(), produit.getPrixV())
			&& validProduit.verifQuantite(produit.getQuantite())) {
			return produitRepository.save(produit);	
		}
		
		return null;
	}
	
	@GetMapping
	public List<Produit> getAllProduits() {
		return produitRepository.findAll();		
	}
	
}
