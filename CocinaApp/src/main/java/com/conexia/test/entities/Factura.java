package com.conexia.test.entities;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "FACTURA")
public class Factura {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "IdFactura")
	private Long id;

	@Column(name = "IdCliente")
	private Long idCliente;

	@Column(name = "IdCamarero")
	private Long idCamarero;

	@Column(name = "IdMesa")
	private Long idMesa;

	@Column(name = "FechaFactura")
	private Date fechaFactura;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public Long getIdCamarero() {
		return idCamarero;
	}

	public void setIdCamarero(Long idCamarero) {
		this.idCamarero = idCamarero;
	}

	public Long getIdMesa() {
		return idMesa;
	}

	public void setIdMesa(Long idMesa) {
		this.idMesa = idMesa;
	}

	public Date getFechaFactura() {
		return fechaFactura;
	}

	public void setFechaFactura(Date fechaFactura) {
		this.fechaFactura = fechaFactura;
	}

	@Override
	public String toString() {
		return "Factura [id=" + id + ", idCliente=" + idCliente + ", idCamarero=" + idCamarero + ", idMesa=" + idMesa
				+ ", fechaFactura=" + fechaFactura + "]";
	}

}
