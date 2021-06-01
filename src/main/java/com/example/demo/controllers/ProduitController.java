package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.daos.ProduitRepository;
import com.example.demo.entites.Produit;

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
	public Produit addProduit(@RequestBody Produit produit) {
		return produitRepository.save(produit);		
	}
	
	@GetMapping
	public List<Produit> getAllProduits() {
		return produitRepository.findAll();		
	}
	
}
