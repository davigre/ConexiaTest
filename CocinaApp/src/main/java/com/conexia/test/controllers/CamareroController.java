package com.conexia.test.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.conexia.test.entities.Camarero;
import com.conexia.test.services.CamareroServiceI;

@Controller
public class CamareroController {

	@Autowired
	CamareroServiceI service;

	@RequestMapping("/createCamarero")
	public String createCamarero() {
		return "createCamarero";
	}

	@RequestMapping("/saveCamarero")
	public String saveCamarero(Camarero camarero, ModelMap modelMap) {		
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
	
	@RequestMapping("/updateCamarero")
	public String updateCamarero(@RequestParam("id") Long id, ModelMap modelMap) {		
		Camarero camarero = service.getCamareroById(id);				
		modelMap.addAttribute("camarero", camarero);
		return "updateCamarero";		
	}
	
	@RequestMapping("/updateCamareroRequest")
	public String updateCamareroRequest(Camarero camarero, ModelMap modelMap) {		
		service.saveCamarero(camarero);
		String msg = "Camarero actualizado";
		modelMap.addAttribute("msg", msg);		
		return "updateCamarero";
	}

	
}
