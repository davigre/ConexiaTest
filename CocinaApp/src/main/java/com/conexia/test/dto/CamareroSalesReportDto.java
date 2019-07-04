package com.conexia.test.dto;

import lombok.*;

@Getter @Setter @ToString
public class CamareroSalesReportDto {
	
	private String id;
	private String nombre;
	private String periodo;
	private String importe;
		
	public CamareroSalesReportDto(String id, String nombre, String periodo, String importe) {
		
		this.id = id;
		this.nombre = nombre;
		this.periodo = periodo;
		this.importe = importe;
		
	}
	
}
