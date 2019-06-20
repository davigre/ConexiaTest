package com.conexia.test.services;

import java.util.List;

import com.conexia.test.dto.FacturaCreateDto;
import com.conexia.test.entities.Factura;

public interface FacturaServiceI {

	Factura saveFactura(FacturaCreateDto facturaCreate);

	Factura updateFactura(Factura factura);

	void deleteFactura(Factura factura);

	Factura getFacturaById(Long id);

	List<Factura> getAllFacturas();

}
