package com.conexia.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.conexia.test.entities.Cocinero;
import com.conexia.test.repositories.CocineroRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CocineroTests {

	@Autowired
	private CocineroRepository repository;

	@Test
	public void testSaveCocinero() {

		Cocinero cocinero = new Cocinero();
		cocinero.setNombre("nombre cocinero");
		cocinero.setApellido1("apellido1 cocinero");
		cocinero.setApellido2("apellido2 cocinero");

		repository.save(cocinero);

	}

	@Test
	public void testUpdateCocinero() {

		Cocinero cocinero = repository.findOne(1L);
		cocinero.setNombre("nombre2");

		repository.save(cocinero);

	}

	@Test
	public void testDeleteCocinero() {
		Cocinero cocinero = repository.findOne(1L);

		repository.save(cocinero);

	}

	@Test
	public void testGetAllCocineros() {

		List<Cocinero> lstCocineros = repository.findAll();

		for (Cocinero cocinero : lstCocineros) {
			System.out.println(cocinero);
		}

	}

}
