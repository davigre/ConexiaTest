package com.conexia.test.entities;

import javax.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter @Setter
public abstract class PersonBasicInfoA {
			
	private String nombre;		
	private String apellido1;	
	private String apellido2;

}
