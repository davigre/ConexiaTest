package com.conexia.test.entities;

import javax.persistence.*;

import lombok.*;

@Entity
@Getter @Setter @ToString
public class Mesa {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idmesa")
	private Long id;
	
	@Column(name = "nummaxcomensales")
	private Long numMaxComensales;
	
	private String ubicacion;	

}
