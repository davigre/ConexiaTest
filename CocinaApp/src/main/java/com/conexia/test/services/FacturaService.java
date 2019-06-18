package com.conexia.test.services;

import java.util.List;

import com.conexia.test.entities.Factura;

public interface FacturaService {

	Factura saveFactura(Factura factura);

	Factura updateFactura(Factura factura);

	void deleteFactura(Factura factura);

	Factura getFacturaById(Long id);

	List<Factura> getAllFactura();

}
