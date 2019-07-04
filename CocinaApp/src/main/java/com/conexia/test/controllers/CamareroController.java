package com.conexia.test.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.conexia.test.dto.CamareroSalesReportDto;
import com.conexia.test.entities.Camarero;
import com.conexia.test.repositories.CamareroRepository;
import com.conexia.test.services.CamareroServiceI;

@Controller
public class CamareroController {

	@Autowired
	CamareroServiceI service;

	@Autowired
	CamareroRepository repository;

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
		List<Camarero> camareros = service.getAllCamareros();
		modelMap.addAttribute("camareros", camareros);
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

	@RequestMapping("/camarerosSalesReport")
	public String camarerosSalesReport(ModelMap modelMap) {

		List<CamareroSalesReportDto> camareroSalesReportsDto = new ArrayList<>();
		List<Object[]> data = repository.camarerosSalesReport();

		for (Object[] registro : data) {

			CamareroSalesReportDto camareroSalesReportDto = new CamareroSalesReportDto(registro[0].toString(),
					registro[1].toString(), registro[2].toString(), registro[3].toString());

			camareroSalesReportsDto.add(camareroSalesReportDto);

		}
		modelMap.addAttribute("camarerosales", camareroSalesReportsDto);
		return "camarerosSalesReport";
		
	}

}