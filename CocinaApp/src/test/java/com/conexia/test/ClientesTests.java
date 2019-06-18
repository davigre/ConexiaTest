package com.conexia.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.conexia.test.entities.Cliente;
import com.conexia.test.repositories.ClienteRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClientesTests {

	@Autowired
	private ClienteRepository repository;
	
	@Test
	public void testSaveCliente() {
		
		Cliente cliente = new Cliente();
		cliente.setNombre("Luis");
		cliente.setApellido1("A1");
		cliente.setApellido2("A2");
		//cliente.setObservaciones();
		
		cliente = repository.save(cliente);		
		System.out.println(cliente);
		
	}

	@Test
	public void testUpdateCliente() {
		
		Cliente cliente = repository.findOne(1L);
		cliente.setObservaciones("new obnservaciones");
		
		repository.save(cliente);
		
	}

	@Test
	public void testDeleteCliente() {
		
		Cliente cliente = repository.findOne(1L);
		repository.delete(cliente);
		
	}
	
	@Test
	public void testGetAllClientes() {
		
		List<Cliente> lstClientes = repository.findAll();
		
		for(Cliente cliente: lstClientes) {
			System.out.println(cliente);
		}
		
	}

}
