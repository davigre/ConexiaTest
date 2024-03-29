package com.conexia.test.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.conexia.test.dto.FacturaCreateDto;
import com.conexia.test.entities.Camarero;
import com.conexia.test.entities.Cliente;
import com.conexia.test.entities.Cocinero;
import com.conexia.test.entities.Factura;
import com.conexia.test.entities.Mesa;
import com.conexia.test.services.CamareroServiceI;
import com.conexia.test.services.ClienteServiceI;
import com.conexia.test.services.CocineroServiceI;
import com.conexia.test.services.FacturaServiceI;
import com.conexia.test.services.MesaServiceI;

@Controller
public class FacturaController {
	
	@Autowired
	FacturaServiceI facturaService;
	
	@Autowired
	ClienteServiceI clienteService;
	
	@Autowired
	CamareroServiceI camareroService;
	
	@Autowired
	CocineroServiceI cocineroService;
	
	@Autowired
	MesaServiceI mesaService;
	
	@RequestMapping("/createFactura")
	public String createFactura(ModelMap modelMap) {
		
		List<Cliente> clientes = clienteService.getAllClientes();
		modelMap.addAttribute("clientes", clientes);
		
		List<Camarero> camareros = camareroService.getAllCamareros();
		modelMap.addAttribute("camareros", camareros);
		
		List<Mesa> mesas = mesaService.getAllMesas();
		modelMap.addAttribute("mesas", mesas);
		
		List<Cocinero> cocineros = cocineroService.getAllCocineros();
		modelMap.addAttribute("cocineros", cocineros);
		
		return "createFactura";
	}
	
	@RequestMapping(value = "/saveFactura", method = RequestMethod.POST)
	public String saveFacturaRequest(FacturaCreateDto facturaCreate, ModelMap modelMap) {
		
		Factura savedFactura = facturaService.saveFactura(facturaCreate);
		modelMap.addAttribute("factura", savedFactura);
		
		return "completeFactura";
		
	}
	
	@RequestMapping(value = "/displayFacturas")
	public String displayFacturas(ModelMap modelMap) {
		List<Factura> facturas = facturaService.getAllFacturas();
		modelMap.addAttribute("facturas", facturas);
		return "displayFacturas";
	}
	
	@RequestMapping(value = "/viewFactura")
	public String viewFactura(@RequestParam("id") Long id, ModelMap modelMap) {
		Factura factura = facturaService.getFacturaById(id);						
		modelMap.addAttribute("factura", factura);
		
		return "completeFactura";
	}
	
}
