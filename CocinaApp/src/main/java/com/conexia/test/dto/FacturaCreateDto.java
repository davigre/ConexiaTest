package com.conexia.test.dto;

public class FacturaCreateDto {
	private Long clienteId;
	private Long camareroId;
	private Long mesaId;
	private String serializedDetails;
	
	public Long getClienteId() {
		return clienteId;
	}
	public void setClienteId(Long clienteId) {
		this.clienteId = clienteId;
	}
	public Long getCamareroId() {
		return camareroId;
	}
	public void setCamareroId(Long camareroId) {
		this.camareroId = camareroId;
	}
	public Long getMesaId() {
		return mesaId;
	}
	public void setMesaId(Long mesaId) {
		this.mesaId = mesaId;
	}
	public String getSerializedDetails() {
		return serializedDetails;
	}
	public void setSerializedDetails(String serializedDetails) {
		this.serializedDetails = serializedDetails;
	}
	@Override
	public String toString() {
		return "FacturaCreateDto [clienteId=" + clienteId + ", camareroId=" + camareroId + ", mesaId=" + mesaId
				+ ", serializedDetails=" + serializedDetails + "]";
	}	
}
