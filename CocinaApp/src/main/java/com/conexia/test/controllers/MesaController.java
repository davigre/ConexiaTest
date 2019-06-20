package com.conexia.test.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.conexia.test.entities.Mesa;
import com.conexia.test.services.MesaService;

@Controller
public class MesaController {
	
	@Autowired
	MesaService service;
	
	@RequestMapping("/createMesa")
	public String createMesa() {		
		return "createMesa";
	}
	
	@RequestMapping("/saveMesa")
	public String saveMesa(@ModelAttribute("mesa") Mesa mesa, ModelMap modelMap) {
		Mesa savedMesa = service.saveMesa(mesa);
		String msg = "Mesa guardada con id:" + savedMesa.getId();
		modelMap.addAttribute("msg", msg);		
		return "createMesa";
		
	}
	
	@RequestMapping("/displayMesas")
	public String displayMesas(ModelMap modelMap) {
		List<Mesa> mesas = service.getAllMesas();
		modelMap.addAttribute("mesas", mesas);
		return "displayMesas";
	}

}
