-- COCINEROS
INSERT INTO COCINERO ( nombre, apellido1, apellido2 ) VALUES ( 'DAVID', 'MENDEZ', 'NAVARRETE' );
INSERT INTO COCINERO ( nombre, apellido1, apellido2 ) VALUES ( 'PEDRO', 'PEREZ', 'JARAMILLO' );

-- CAMAREROS
INSERT INTO CAMARERO ( nombre, apellido1, apellido2 ) VALUES ( 'LUIS', 'ALTAMAR', 'SASTOQUE' );
INSERT INTO CAMARERO ( nombre, apellido1, apellido2 ) VALUES ( 'CARLOS', 'JIMENEZ', 'UMAÑA' );
INSERT INTO CAMARERO ( nombre, apellido1, apellido2 ) VALUES ( 'JUAN', 'PERITO', 'MENDOZA' );
INSERT INTO CAMARERO ( nombre, apellido1, apellido2 ) VALUES ( 'ISRAEL', 'CARTES', 'CARDENAS' );
INSERT INTO CAMARERO ( nombre, apellido1, apellido2 ) VALUES ( 'JAIME', 'CAMACHO', 'ROLDAN' );

-- MESAS
INSERT INTO MESA ( nummaxcomensales, ubicacion ) VALUES ( 2, 'ZONA A');
INSERT INTO MESA ( nummaxcomensales, ubicacion ) VALUES ( 4, 'ZONA B');
INSERT INTO MESA ( nummaxcomensales, ubicacion ) VALUES ( 4, 'ZONA B');
INSERT INTO MESA ( nummaxcomensales, ubicacion ) VALUES ( 6, 'ZONA C');
INSERT INTO MESA ( nummaxcomensales, ubicacion ) VALUES ( 6, 'ZONA C');
INSERT INTO MESA ( nummaxcomensales, ubicacion ) VALUES ( 8, 'ZONA D');
INSERT INTO MESA ( nummaxcomensales, ubicacion ) VALUES ( 8, 'ZONA D');

-- CLIENTES
INSERT INTO CLIENTE ( nombre, apellido1, apellido2, observaciones ) VALUES ( 'JAIRO', 'ALVAREZ', 'MONTANO', 'Le gusta el sancocho' );
INSERT INTO CLIENTE ( nombre, apellido1, apellido2, observaciones ) VALUES ( 'PEDRO', 'SARMIENTO', 'TRUJILLO', 'Le gusta el sancocho' );

-- FACTURAS
INSERT INTO FACTURA ( idcliente, idcamarero, idmesa, fechafactura ) VALUES ( 1, 1, 1, '2019-03-01 00:00:01');
INSERT INTO FACTURA ( idcliente, idcamarero, idmesa, fechafactura ) VALUES ( 1, 2, 2, '2019-04-01 00:00:01');
INSERT INTO FACTURA ( idcliente, idcamarero, idmesa, fechafactura ) VALUES ( 2, 3, 3, '2019-05-01 00:00:01');
INSERT INTO FACTURA ( idcliente, idcamarero, idmesa, fechafactura ) VALUES ( 2, 4, 4, '2019-06-01 00:00:01');

-- DETALLE FACTURA
-- FACTURA 1
INSERT INTO DETALLEFACTURA ( idfactura, idcocinero, plato, importe ) VALUES ( 1, 1, 'SANCOCHO', 50000 );
INSERT INTO DETALLEFACTURA ( idfactura, idcocinero, plato, importe ) VALUES ( 1, 2, 'BANDEJA PAISA', 50000 );

-- FACTURA 2
INSERT INTO DETALLEFACTURA ( idfactura, idcocinero, plato, importe ) VALUES ( 2, 1, 'SANCOCHO', 50000 );
INSERT INTO DETALLEFACTURA ( idfactura, idcocinero, plato, importe ) VALUES ( 2, 2, 'BANDEJA PAISA', 50000 );
INSERT INTO DETALLEFACTURA ( idfactura, idcocinero, plato, importe ) VALUES ( 2, 2, 'HELADO', 50000 );

-- FACTURA 3
INSERT INTO DETALLEFACTURA ( idfactura, idcocinero, plato, importe ) VALUES ( 3, 1, 'SOPA', 20000 );
INSERT INTO DETALLEFACTURA ( idfactura, idcocinero, plato, importe ) VALUES ( 3, 2, 'ARROZ', 20000 );

-- FACTURA 4
INSERT INTO DETALLEFACTURA ( idfactura, idcocinero, plato, importe ) VALUES ( 4, 1, 'SANCOCHO', 50000 );
INSERT INTO DETALLEFACTURA ( idfactura, idcocinero, plato, importe ) VALUES ( 4, 2, 'ARROZ', 20000 );
