package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.validations.ValidProduit;

@SpringBootTest
class Tp2FinalApplicationTests {
	private static ValidProduit validProduit;
	
	@BeforeAll
	static void init() {
		validProduit = new ValidProduit();
	}
	
	@Test
	void contextLoads() {
	}
	
	@Test
	void testVerifTitreOK() {
		assertTrue(validProduit.verifTitre("Test"));
	}
	
	@Test
	void testVerifTitreKO() {
		assertFalse(validProduit.verifTitre(null));
	}
	
	@Test
	void testVerifPrixOK() {
		assertTrue(validProduit.verifPrix(12, 26));
	}
	
	@Test
	void testVerifPrixKO() {
		assertFalse(validProduit.verifPrix(26, 12));
	}
	
	@Test
	void testVerifQuantiteOK() {
		assertTrue(validProduit.verifQuantite(11));
	}
	
	@Test
	void testVerifQuantiteKO() {
		assertFalse(validProduit.verifQuantite(10));
	}

}
