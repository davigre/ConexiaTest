package com.conexia.test.dto;

public class ClientePurchaseDto {
	
	private String id;
	private String name;
	private String consumo;
		
	public ClientePurchaseDto(String id, String name, String consumo) {		
		this.id = id;
		this.name = name;
		this.consumo = consumo;		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getConsumo() {
		return consumo;
	}
	public void setConsumo(String consumo) {
		this.consumo = consumo;
	}
	@Override
	public String toString() {
		return "ClientePurchases [id=" + id + ", name=" + name + ", consumo=" + consumo + "]";
	}

}
