package com.conexia.test.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.conexia.test.entities.Factura;
import com.conexia.test.repositories.FacturaRepository;

@Service
public class FacturaServiceImpl implements FacturaService {
	
	@Autowired
	FacturaRepository facturaRepository;
	
	public FacturaRepository getFacturaRepository() {
		return facturaRepository;
	}

	public void setFacturaRepository(FacturaRepository facturaRepository) {
		this.facturaRepository = facturaRepository;
	}

	@Override
	public Factura saveFactura(Factura factura) {
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
