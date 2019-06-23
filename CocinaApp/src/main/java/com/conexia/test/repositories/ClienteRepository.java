package com.conexia.test.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.conexia.test.entities.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	@Query(value = "SELECT cl.IdCliente, CONCAT(cl.nombre, ' ', cl.apellido1, ' ', cl.apellido2) nombre, co.consumo\r\n"
			+ "FROM cliente cl\r\n" + "JOIN (\r\n" + "	SELECT fa.idcliente, sum(df.importe) consumo\r\n"
			+ "	FROM factura fa\r\n" + "	JOIN detallefactura df on df.idfactura=fa.idfactura\r\n"
			+ "	GROUP BY fa.IdCliente) co \r\n" + "ON co.idcliente=cl.idcliente\r\n"
			+ "WHERE co.consumo > ?1", nativeQuery = true)
	public List<Object[]> clientesSalesReport(Long purchase);

}
