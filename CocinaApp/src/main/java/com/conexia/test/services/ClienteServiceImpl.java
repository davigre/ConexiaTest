package com.conexia.test.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.conexia.test.entities.Cliente;
import com.conexia.test.repositories.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {
	
	@Autowired
	ClienteRepository repository;	

	public ClienteRepository getRepository() {
		return repository;
	}

	public void setRepository(ClienteRepository repository) {
		this.repository = repository;
	}

	@Override
	public Cliente saveCliente(Cliente cliente) {		
		return repository.save(cliente);
	}

	@Override
	public Cliente updateCliente(Cliente cliente) {
		return repository.save(cliente);
	}

	@Override
	public void deleteCliente(Cliente cliente) {
		repository.delete(cliente);		
	}

	@Override
	public Cliente getClienteById(Long id) {
		return repository.findOne(id);
	}

	@Override
	public List<Cliente> getAllCliente() {
		return repository.findAll();
	}	

}
