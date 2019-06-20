package com.conexia.test.services;

import java.util.List;

import com.conexia.test.entities.Cocinero;

public interface CocineroServiceI {

	Cocinero saveCocinero(Cocinero cocinero);
	
	Cocinero updateCocinero(Cocinero cocinero);
	
	void deleteCocinero(Cocinero cocinero);
	
	Cocinero getCocineroById(Long id);
	
	List<Cocinero> getAllCocineros();

}
