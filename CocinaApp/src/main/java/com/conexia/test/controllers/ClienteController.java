package com.conexia.test.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.conexia.test.entities.Cliente;
import com.conexia.test.services.ClienteServiceI;

@Controller
public class ClienteController {
	
	@Autowired
	ClienteServiceI service;
	
	@RequestMapping("/createCliente")
	public String createCliente() {
		return "createCliente";
	}

	@RequestMapping("/saveCliente")
	public String saveCliente(Cliente cliente, ModelMap modelMap) {		
		Cliente savedCliente = service.saveCliente(cliente);
		String msg = "Cliente guardado with id:" + savedCliente.getId();
		modelMap.addAttribute("msg", msg);
		return "createCliente";
	}
	
	@RequestMapping("/displayClientes")
	public String displayCliente(ModelMap modelMap) {
		List<Cliente> clientes = service.getAllClientes();
		modelMap.addAttribute("clientes", clientes);		
		return "displayClientes";
	}
	
	@RequestMapping("/updateCliente")
	public String updateCliente(@RequestParam("id") Long id, ModelMap modelMap) {		
		Cliente cliente = service.getClienteById(id);				
		modelMap.addAttribute("cliente", cliente);
		return "updateCliente";		
	}
	
	@RequestMapping("/updateClienteRequest")
	public String updateCamareroRequest(Cliente cliente, ModelMap modelMap) {		
		service.saveCliente(cliente);
		String msg = "Cliente actualizado";
		modelMap.addAttribute("msg", msg);		
		return "updateCliente";
	}

}
