package com.conexia.test.entities;

import javax.persistence.*;

@Entity
public class Mesa {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "IdMesa")
	private Long id;

	@Column(name = "NumMaxComensales")
	private Long numMaxComensales;

	@Column(name = "Ubicacion")
	private String ubicacion;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getNumMaxComensales() {
		return numMaxComensales;
	}

	public void setNumMaxComensales(Long numMaxComensales) {
		this.numMaxComensales = numMaxComensales;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	@Override
	public String toString() {
		return "Mesa [id=" + id + ", numMaxComensales=" + numMaxComensales + ", ubicacion=" + ubicacion + "]";
	}

}
