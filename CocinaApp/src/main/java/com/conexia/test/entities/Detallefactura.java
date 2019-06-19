package com.conexia.test.entities;

import javax.persistence.*;

@Entity
public class Detallefactura {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "iddetalleFactura")
	private Integer id;
	
	private String plato;

	private int importe;

	@JoinColumn(name = "IdFactura", referencedColumnName = "IdFactura")
	@ManyToOne
	private Factura factura;

	@JoinColumn(name = "IdCocinero", referencedColumnName = "IdCocinero")
	@OneToOne
	private Cocinero cocinero;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPlato() {
		return plato;
	}

	public void setPlato(String plato) {
		this.plato = plato;
	}

	public int getImporte() {
		return importe;
	}

	public void setImporte(int importe) {
		this.importe = importe;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public Cocinero getCocinero() {
		return cocinero;
	}

	public void setCocinero(Cocinero cocinero) {
		this.cocinero = cocinero;
	}

	@Override
	public String toString() {
		return "Detallefactura [id=" + id + ", plato=" + plato + ", importe=" + importe + ", factura=" + factura
				+ ", cocinero=" + cocinero + "]";
	}
	

}
