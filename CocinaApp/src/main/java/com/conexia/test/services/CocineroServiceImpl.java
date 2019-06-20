package com.conexia.test.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.conexia.test.entities.Cocinero;
import com.conexia.test.repositories.CocineroRepository;

@Service
public class CocineroServiceImpl implements CocineroServiceI {
	
	@Autowired
	private CocineroRepository repository;

	public CocineroRepository getRepository() {
		return repository;
	}

	public void setRepository(CocineroRepository repository) {
		this.repository = repository;
	}

	@Override
	public Cocinero saveCocinero(Cocinero cocinero) {		
		return repository.save(cocinero);
	}

	@Override
	public Cocinero updateCocinero(Cocinero cocinero) {
		return repository.save(cocinero);
	}

	@Override
	public void deleteCocinero(Cocinero cocinero) {
		repository.delete(cocinero);
	}

	@Override
	public Cocinero getCocineroById(Long id) {
		return repository.findOne(id);
	}

	@Override
	public List<Cocinero> getAllCocineros() {
		return repository.findAll();
	}

}
