package com.conexia.test.entities;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "FACTURA")
public class Factura {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idfactura")
	private Long id;
	
	@Column(name = "fechafactura")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaFactura;
	
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idcliente")
	private Cliente cliente;
	
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idcamarero")
	private Camarero camarero;
	
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idmesa")
	private Mesa mesa;

	@OneToMany(mappedBy = "factura")
    private Collection<Detallefactura> detallefacturaCollection;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFechaFactura() {
		return fechaFactura;
	}

	public void setFechaFactura(Date fechaFactura) {
		this.fechaFactura = fechaFactura;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Camarero getCamarero() {
		return camarero;
	}

	public void setCamarero(Camarero camarero) {
		this.camarero = camarero;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	public Collection<Detallefactura> getDetallefacturaCollection() {
		return detallefacturaCollection;
	}

	public void setDetallefacturaCollection(Collection<Detallefactura> detallefacturaCollection) {
		this.detallefacturaCollection = detallefacturaCollection;
	}

	@Override
	public String toString() {
		return "Factura [id=" + id + ", fechaFactura=" + fechaFactura + ", cliente=" + cliente + ", camarero="
				+ camarero + ", mesa=" + mesa + ", detallefacturaCollection=" + detallefacturaCollection + "]";
	}	

}
