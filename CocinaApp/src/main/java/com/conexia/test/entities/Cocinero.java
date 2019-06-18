package com.conexia.test.entities;

import javax.persistence.*;

@Entity
public class Cocinero {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "IdCocinero")
	private Long id;

	@Column(name = "Nombre")
	private String nombre;

	@Column(name = "Apellido1")
	private String apellido1;

	@Column(name = "Apellido2")
	private String apellido2;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	@Override
	public String toString() {
		return "Cocinero [id=" + id + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2
				+ "]";
	}

}
