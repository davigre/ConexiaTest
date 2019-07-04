package com.conexia.test.dto;

import lombok.*;

@Getter @Setter @ToString
public class ClientePurchaseDto {
	
	private String id;
	private String name;
	private String consumo;
		
	public ClientePurchaseDto(String id, String name, String consumo) {		
		this.id = id;
		this.name = name;
		this.consumo = consumo;		
	}	

}
