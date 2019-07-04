package com.conexia.test.dto;

import lombok.*;

@Getter @Setter @ToString
public class FacturaCreateDto {
	
	private Long clienteId;
	private Long camareroId;
	private Long mesaId;
	private String serializedDetails;
	
}
