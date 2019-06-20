package com.conexia.test.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.conexia.test.dto.FacturaCreate;
import com.conexia.test.entities.Camarero;
import com.conexia.test.entities.Cliente;
import com.conexia.test.entities.Factura;
import com.conexia.test.entities.Mesa;
import com.conexia.test.repositories.CamareroRepository;
import com.conexia.test.repositories.ClienteRepository;
import com.conexia.test.repositories.FacturaRepository;
import com.conexia.test.repositories.MesaRespository;

@Service
public class FacturaServiceImpl implements FacturaService {
	
	@Autowired
	FacturaRepository facturaRepository;
	
	@Autowired
	ClienteRepository clienteRepository;
	
	@Autowired
	CamareroRepository camareroRepository;
	
	@Autowired
	MesaRespository mesaRespository;
	
	public FacturaRepository getFacturaRepository() {
		return facturaRepository;
	}

	public void setFacturaRepository(FacturaRepository facturaRepository) {
		this.facturaRepository = facturaRepository;
	}

	@Override
	public Factura saveFactura(FacturaCreate facturaCreate) {
		
		Long clienteId = facturaCreate.getClienteId();
//		Cliente cliente = clienteRepository.findOne(clienteId);
		
		Long camareroId = facturaCreate.getCamareroId();
//		Camarero camarero = camareroRepository.findOne(camareroId);
		
		Long mesaId = facturaCreate.getMesaId();
//		Mesa mesa = mesaRespository.findOne(mesaId);
		
		Factura factura = new Factura();
		factura.setIdCliente(clienteId);
		factura.setIdCamarero(camareroId);
		factura.setIdMesa(mesaId);		
		
		return facturaRepository.save(factura);
	}

	@Override
	public Factura updateFactura(Factura factura) {
		return facturaRepository.save(factura);
	}

	@Override
	public void deleteFactura(Factura factura) {
		facturaRepository.delete(factura);
	}

	@Override
	public Factura getFacturaById(Long id) {
		return facturaRepository.findOne(id);
	}

	@Override
	public List<Factura> getAllFacturas() {
		return facturaRepository.findAll();
	}

}
