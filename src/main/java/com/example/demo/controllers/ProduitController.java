package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.daos.ProduitRepository;

@RestController
public class ProduitController {
	@Autowired
	private ProduitRepository produitRepository; 	
	
}
