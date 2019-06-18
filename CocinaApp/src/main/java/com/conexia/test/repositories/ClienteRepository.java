package com.conexia.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.conexia.test.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
