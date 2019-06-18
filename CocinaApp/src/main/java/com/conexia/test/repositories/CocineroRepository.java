package com.conexia.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.conexia.test.entities.Cocinero;

public interface CocineroRepository extends JpaRepository<Cocinero, Long> {

}
