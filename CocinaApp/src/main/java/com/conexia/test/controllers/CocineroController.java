package com.conexia.test.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.conexia.test.entities.Cocinero;
import com.conexia.test.services.CocineroServiceI;

@Controller
public class CocineroController {

	@Autowired
	CocineroServiceI service;

	@RequestMapping("/createCocinero")
	public String createCocinero() {
		return "createCocinero";
	}

	@RequestMapping("/saveCocinero")
	public String saveCocinero(@ModelAttribute("cocinero") Cocinero cocinero, ModelMap modelMap) {
		Cocinero savedCocinero = service.saveCocinero(cocinero);
		String msg = "Cocinero guardado with id:" + savedCocinero.getId();
		modelMap.addAttribute("msg", msg);
		return "createCocinero";
	}

	@RequestMapping("/displayCocineros")
	public String displayCocineros(ModelMap modelMap) {
		List<Cocinero> lstCocineros = service.getAllCocineros();
		modelMap.addAttribute("cocineros", lstCocineros);
		return "displayCocineros";
	}

	@RequestMapping("/updateCocinero")
	public String updateCocinero(@RequestParam("id") Long id, ModelMap modelMap) {
		Cocinero cocinero = service.getCocineroById(id);
		modelMap.addAttribute("cocinero", cocinero);
		return "updateCocinero";
	}

	@RequestMapping("/updateCocineroRequest")
	public String updateCamareroRequest(Cocinero cocinero, ModelMap modelMap) {
		service.saveCocinero(cocinero);
		String msg = "Cocinero actualizado";
		modelMap.addAttribute("msg", msg);
		return "updateCocinero";
	}
	
}
