package com.conexia.test.entities;

import javax.persistence.*;

import lombok.*;

@Entity
@Getter @Setter @ToString
public class Detallefactura {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "iddetallefactura")
	private Integer id;
	
	private String plato;

	private int importe;

	@JoinColumn(name = "idfactura", referencedColumnName = "idfactura")
	@ManyToOne
	private Factura factura;

	@JoinColumn(name = "idcocinero", referencedColumnName = "idcocinero")
	@OneToOne
	private Cocinero cocinero;

}
