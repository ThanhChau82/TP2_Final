package com.example.demo.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entites.Produit;

public interface ProduitRepository extends JpaRepository <Produit, Integer>{

}
