package com.conexia.test.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.conexia.test.entities.Cocinero;
import com.conexia.test.services.CocineroService;

@Controller
public class CocineroController {

	@Autowired
	CocineroService service;

	@RequestMapping("/showCreate")
	public String showCreate() {
		return "createCocinero";
	}

	@RequestMapping("/saveCocinero")
	public String saveCocinero(@ModelAttribute("cocinero") Cocinero cocinero, ModelMap modelMap) {
		Cocinero savedCocinero = service.saveCocinero(cocinero);
		String msg = "Cocinero saved with id:" + savedCocinero.getId();
		modelMap.addAttribute("msg", msg);
		return "createCocinero";
	}
	
	@RequestMapping("/displayCocineros")
	public String displayCocineros(ModelMap modelMap) {
		List<Cocinero> lstCocineros = service.getAllCocineros();
		modelMap.addAttribute("cocineros", lstCocineros);
		
		return "displayCocineros";
	}
}
