package com.conexia.test.services;

import java.util.List;

import com.conexia.test.entities.Cliente;

public interface ClienteServiceI {

	Cliente saveCliente(Cliente cliente);

	Cliente updateCliente(Cliente cliente);

	void deleteCliente(Cliente cliente);

	Cliente getClienteById(Long id);

	List<Cliente> getAllClientes();

}
