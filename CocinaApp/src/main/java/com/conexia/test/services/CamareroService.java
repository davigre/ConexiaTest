package com.conexia.test.services;

import java.util.List;

import com.conexia.test.entities.Camarero;

public interface CamareroService {
	
	Camarero saveCamarero(Camarero camarero);
	
	Camarero updateCamarero(Camarero camarero);
	
	void deleteCamarero(Camarero camarero);
	
	Camarero getCamareroById(Long id);
	
	List<Camarero> getAllCamareros();

}
