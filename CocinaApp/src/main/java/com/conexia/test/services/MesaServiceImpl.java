package com.conexia.test.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.conexia.test.entities.Mesa;
import com.conexia.test.repositories.MesaRespository;

@Service
public class MesaServiceImpl implements MesaServiceI {

	@Autowired
	MesaRespository repository;
	
	public MesaRespository getRepository() {
		return repository;
	}

	public void setRepository(MesaRespository repository) {
		this.repository = repository;
	}

	@Override
	public Mesa saveMesa(Mesa mesa) {
		return repository.save(mesa);
	}

	@Override
	public Mesa updateMesa(Mesa mesa) {
		return repository.save(mesa);
	}

	@Override
	public void deleteMesa(Mesa mesa) {
		repository.delete(mesa);
	}

	@Override
	public Mesa getMesaById(Long id) {		
		return repository.findOne(id);
	}

	@Override
	public List<Mesa> getAllMesas() {
		return repository.findAll();
	}

}
