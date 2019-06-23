package com.conexia.test.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.conexia.test.dto.ClientePurchaseDto;
import com.conexia.test.entities.Cliente;
import com.conexia.test.repositories.ClienteRepository;
import com.conexia.test.services.ClienteServiceI;

@Controller
public class ClienteController {
	
	@Autowired
	ClienteServiceI service;
	
	@Autowired
	ClienteRepository repository;
	
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
	
	@RequestMapping("/clientesConsumoReport")
	public String reportClientePurchases(@RequestParam("purchaselimit") Long purchaselimit, ModelMap modelMap) {
		
		List<ClientePurchaseDto> clientePurchasesDto = new ArrayList<>();
		List<Object[]> data = repository.clientesSalesReport(purchaselimit);
		
		for(Object[] registro : data) {
			
			ClientePurchaseDto clientePurchaseDto = new ClientePurchaseDto(registro[0].toString(), registro[1].toString(), registro[2].toString());
			clientePurchasesDto.add(clientePurchaseDto);
			
		}		
		
		modelMap.addAttribute("purchaselimit", purchaselimit);
		modelMap.addAttribute("clientepurchases", clientePurchasesDto);
		
		return "reportClientePurchases";
		
	}

}
