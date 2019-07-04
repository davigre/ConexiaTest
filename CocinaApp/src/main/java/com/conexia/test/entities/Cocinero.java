package com.conexia.test.entities;

import javax.persistence.*;

import lombok.*;

@Entity
@Getter @Setter @ToString
public class Cocinero extends PersonBasicInfoA {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idcocinero")
	private Long id;

}
