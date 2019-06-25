package com.conexia.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.conexia.test.entities.Camarero;
import com.conexia.test.repositories.CamareroRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CamarerosTests {
	
	@Autowired
	private CamareroRepository repository;
	
	@Test
	public void testCreateCamarero() {
		
		Camarero camarero = new Camarero();
		camarero.setNombre("Nombre");
		camarero.setApellido1("Apellido1");
		camarero.setApellido2("Apellido2");
		
		repository.save(camarero);
		
	}
	
	@Test
	public void testFindCamarero() {
		
		Camarero camarero = repository.findOne(2L);
		System.out.println(camarero);
		
	}
	
	@Test 
	public void testUpdateCamarero() {
		
		Camarero camarero = repository.findOne(1L);
		camarero.setNombre("Nombre1");
		camarero.setApellido2("Apellido2");
		
		camarero = repository.save(camarero);		
		System.out.println(camarero);
		
	}
	
//	@Test 
//	public void testDeleteCamarero() {
//		
//		Camarero camarero = repository.findOne(2L);		
//		repository.delete(camarero);
//		
//	}

}
