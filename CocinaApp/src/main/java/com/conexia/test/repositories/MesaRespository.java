package com.conexia.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.conexia.test.entities.Mesa;

public interface MesaRespository extends JpaRepository<Mesa, Long> {

}
