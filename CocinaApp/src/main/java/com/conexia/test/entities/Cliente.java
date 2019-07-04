package com.conexia.test.entities;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter @ToString
public class Cliente extends PersonBasicInfoA {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idcliente")
	private long id;			
	
	private String observaciones;	

}
