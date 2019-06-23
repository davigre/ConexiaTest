package com.conexia.test.dto;

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
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public String getImporte() {
		return importe;
	}
	public void setImporte(String importe) {
		this.importe = importe;
	}
	@Override
	public String toString() {
		return "CamareroSalesReportDto [id=" + id + ", nombre=" + nombre + ", periodo=" + periodo + ", importe="
				+ importe + "]";
	}

}
