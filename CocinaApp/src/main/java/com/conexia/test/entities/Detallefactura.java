package com.conexia.test.entities;

import javax.persistence.*;

@Entity
@Table(name = "detallefactura")
public class Detallefactura {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "IdDetalleFactura")
	private Integer idDetalleFactura;

	@Column(name = "Plato")
	private String plato;

	@Column(name = "Importe")
	private int importe;

	@JoinColumn(name = "IdFactura", referencedColumnName = "IdFactura")
	@ManyToOne
	private Factura idFactura;

	@JoinColumn(name = "IdCocinero", referencedColumnName = "IdCocinero")
	@ManyToOne
	private Cocinero idCocinero;

	public Detallefactura() {
	}

	public Detallefactura(Integer idDetalleFactura) {
		this.idDetalleFactura = idDetalleFactura;
	}

	public Detallefactura(Integer idDetalleFactura, String plato, int importe) {
		this.idDetalleFactura = idDetalleFactura;
		this.plato = plato;
		this.importe = importe;
	}

	public Integer getIdDetalleFactura() {
		return idDetalleFactura;
	}

	public void setIdDetalleFactura(Integer idDetalleFactura) {
		this.idDetalleFactura = idDetalleFactura;
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

	public Factura getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(Factura idFactura) {
		this.idFactura = idFactura;
	}

	public Cocinero getIdCocinero() {
		return idCocinero;
	}

	public void setIdCocinero(Cocinero idCocinero) {
		this.idCocinero = idCocinero;
	}

	@Override
	public String toString() {
		return "Detallefactura [idDetalleFactura=" + idDetalleFactura + ", plato=" + plato + ", importe=" + importe
				+ ", idFactura=" + idFactura + ", idCocinero=" + idCocinero + "]";
	}

}
