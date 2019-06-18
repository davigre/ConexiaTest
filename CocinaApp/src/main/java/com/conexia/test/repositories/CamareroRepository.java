package com.conexia.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.conexia.test.entities.Camarero;

public interface CamareroRepository extends JpaRepository<Camarero, Long> {

}
