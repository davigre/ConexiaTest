package com.conexia.test.services;

import java.util.List;

import com.conexia.test.entities.Mesa;

public interface MesaServiceI {

	Mesa saveMesa(Mesa mesa);

	Mesa updateMesa(Mesa mesa);

	void deleteMesa(Mesa mesa);

	Mesa getMesaById(Long id);

	List<Mesa> getAllMesas();
	
}
