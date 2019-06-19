package com.conexia.test.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.conexia.test.entities.Camarero;
import com.conexia.test.services.CamareroService;

@Controller
public class CamareroController {

	@Autowired
	CamareroService service;

	@RequestMapping("/createCamarero")
	public String createCamarero() {
		return "createCamarero";
	}

	@RequestMapping("/saveCamarero")
	public String saveCamarero(@ModelAttribute("camarero") Camarero camarero, ModelMap modelMap) {		
		Camarero savedCamarero = service.saveCamarero(camarero);
		String msg = "Camarero guardado with id:" + savedCamarero.getId();
		modelMap.addAttribute("msg", msg);
		return "createCamarero";
	}
	
	@RequestMapping("/displayCamareros")
	public String displayCamarero(ModelMap modelMap) {
		List<Camarero> lstCamareros = service.getAllCamareros();
		modelMap.addAttribute("camareros", lstCamareros);		
		return "displayCamareros";
	}

}
