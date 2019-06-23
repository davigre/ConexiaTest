package com.conexia.test.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.conexia.test.entities.Camarero;

public interface CamareroRepository extends JpaRepository<Camarero, Long> {

	@Query(value = "SELECT ca.idcamarero, CONCAT(ca.nombre, ' ', ca.apellido1, ' ', ca.apellido2) nombre, re.periodo, IFNULL(re.importe, 0) importe\r\n"
			+ "FROM camarero ca\r\n" + "LEFT JOIN (\r\n"
			+ "	SELECT fa.idcamarero, CONCAT(YEAR(fa.FechaFactura), '-',MONTH(fa.FechaFactura)) periodo, sum(df.importe) importe\r\n"
			+ "	FROM factura fa\r\n" + "	JOIN detallefactura df on df.idfactura=fa.idfactura\r\n"
			+ "	GROUP BY fa.idcamarero, CONCAT(YEAR(fa.FechaFactura), MONTH(fa.FechaFactura))\r\n"
			+ ") re ON re.idcamarero=ca.idcamarero\r\n" + "order by ca.idcamarero, re.periodo", nativeQuery = true)
	public List<Object[]> camarerosSalesReport();

}
