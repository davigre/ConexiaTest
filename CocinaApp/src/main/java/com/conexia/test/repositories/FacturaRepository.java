package com.conexia.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.conexia.test.entities.Factura;

public interface FacturaRepository extends JpaRepository<Factura, Long> {

}
