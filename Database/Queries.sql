-- Mostrar nombre, apellido, mes y la suma del total facturado por cada camarero por mes; tenga en cuenta que deben verse inclusive 
-- los camareros que no facturaron nada. 
SELECT ca.idcamarero, CONCAT(ca.nombre, ' ', ca.apellido1, ' ', ca.apellido2) nombre, re.periodo, IFNULL(re.importe, 0) importe
FROM camarero ca
LEFT JOIN (
	SELECT fa.idcamarero, CONCAT(YEAR(fa.FechaFactura), '-', MONTH(fa.FechaFactura)) periodo, sum(df.importe) importe
	FROM factura fa
	JOIN detallefactura df on df.idfactura=fa.idfactura
	GROUP BY fa.idcamarero, CONCAT(YEAR(fa.FechaFactura), '-', MONTH(fa.FechaFactura))
) re ON re.idcamarero=ca.idcamarero
order by ca.idcamarero, re.periodo;


-- Construya una consulta que muestre los clientes con más de cien mil pesos gastados en el restaurante
SELECT cl.IdCliente, CONCAT(cl.nombre, ' ', cl.apellido1, ' ', cl.apellido2) nombre, co.consumo
FROM cliente cl
JOIN (
	SELECT fa.idcliente, sum(df.importe) consumo
	FROM factura fa
	JOIN detallefactura df on df.idfactura=fa.idfactura
	GROUP BY fa.IdCliente) co 
ON co.idcliente=cl.idcliente
WHERE co.consumo > 100000;
