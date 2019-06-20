package com.conexia.test.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.conexia.test.dto.FacturaCreate;
import com.conexia.test.entities.Camarero;
import com.conexia.test.entities.Cliente;
import com.conexia.test.entities.Factura;
import com.conexia.test.entities.Mesa;
import com.conexia.test.services.CamareroService;
import com.conexia.test.services.ClienteService;
import com.conexia.test.services.FacturaService;
import com.conexia.test.services.MesaService;

@Controller
public class FacturaController {
	
	@Autowired
	FacturaService facturaService;
	
	@Autowired
	ClienteService clienteService;
	
	@Autowired
	CamareroService camareroService;
	
	@Autowired
	MesaService mesaService;
	
	@RequestMapping("/createFactura")
	public String createFactura(ModelMap modelMap) {
		
		List<Cliente> clientes = clienteService.getAllClientes();
		modelMap.addAttribute("clientes", clientes);
		
		List<Camarero> camareros = camareroService.getAllCamareros();
		modelMap.addAttribute("camareros", camareros);
		
		List<Mesa> mesas = mesaService.getAllMesas();
		modelMap.addAttribute("mesas", mesas);
		
		return "createFactura";
	}
	
	@RequestMapping(value = "/saveFactura", method = RequestMethod.POST)
	public String saveFacturaRequest(FacturaCreate facturaCreate, ModelMap modelMap) {
		
		Factura savedFactura = facturaService.saveFactura(facturaCreate);
		
		String msg = "Se genera la Factura No:" + savedFactura.getId() + "<a href=\"/createDetalle\">Agregar Detalle</a>";
		modelMap.addAttribute("msg", msg);
		
		return "createFactura";
		
	}
	
}
