package com.conexia.test.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.conexia.test.entities.Camarero;
import com.conexia.test.repositories.CamareroRepository;

@Service
public class CamareroServiceImpl implements CamareroServiceI {

	@Autowired
	CamareroRepository repository;

	public CamareroRepository getRepository() {
		return repository;
	}

	public void setRepository(CamareroRepository repository) {
		this.repository = repository;
	}

	@Override
	public Camarero saveCamarero(Camarero camarero) {
		return repository.save(camarero);
	}

	@Override
	public Camarero updateCamarero(Camarero camarero) {
		return repository.save(camarero);
	}

	@Override
	public void deleteCamarero(Camarero camarero) {
		repository.delete(camarero);
	}

	@Override
	public Camarero getCamareroById(Long id) {
		return repository.findOne(id);
	}

	@Override
	public List<Camarero> getAllCamareros() {
		return repository.findAll();
	}

}
