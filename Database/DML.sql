-- cocineros
insert into cocinero ( nombre, apellido1, apellido2 ) values ( 'david', 'mendez', 'navarrete' );
insert into cocinero ( nombre, apellido1, apellido2 ) values ( 'pedro', 'perez', 'jaramillo' );

-- camareros
insert into camarero ( nombre, apellido1, apellido2 ) values ( 'luis', 'altamar', 'sastoque' );
insert into camarero ( nombre, apellido1, apellido2 ) values ( 'carlos', 'jimenez', 'umaña' );
insert into camarero ( nombre, apellido1, apellido2 ) values ( 'juan', 'perito', 'mendoza' );
insert into camarero ( nombre, apellido1, apellido2 ) values ( 'israel', 'cartes', 'cardenas' );
insert into camarero ( nombre, apellido1, apellido2 ) values ( 'jaime', 'camacho', 'roldan' );

-- mesas
insert into mesa ( nummaxcomensales, ubicacion ) values ( 2, 'zona a');
insert into mesa ( nummaxcomensales, ubicacion ) values ( 4, 'zona b');
insert into mesa ( nummaxcomensales, ubicacion ) values ( 4, 'zona b');
insert into mesa ( nummaxcomensales, ubicacion ) values ( 6, 'zona c');
insert into mesa ( nummaxcomensales, ubicacion ) values ( 6, 'zona c');
insert into mesa ( nummaxcomensales, ubicacion ) values ( 8, 'zona d');
insert into mesa ( nummaxcomensales, ubicacion ) values ( 8, 'zona d');

-- clientes
insert into cliente ( nombre, apellido1, apellido2, observaciones ) values ( 'jairo', 'alvarez', 'montano', 'le gusta el sancocho' );
insert into cliente ( nombre, apellido1, apellido2, observaciones ) values ( 'pedro', 'sarmiento', 'trujillo', 'le gusta el sancocho' );

-- facturas
insert into factura ( idcliente, idcamarero, idmesa, fechafactura ) values ( 1, 1, 1, '2019-03-01 00:00:01');
insert into factura ( idcliente, idcamarero, idmesa, fechafactura ) values ( 1, 2, 2, '2019-04-01 00:00:01');
insert into factura ( idcliente, idcamarero, idmesa, fechafactura ) values ( 2, 3, 3, '2019-05-01 00:00:01');
insert into factura ( idcliente, idcamarero, idmesa, fechafactura ) values ( 2, 4, 4, '2019-06-01 00:00:01');

-- detalle factura
-- factura 1
insert into detallefactura ( idfactura, idcocinero, plato, importe ) values ( 1, 1, 'sancocho', 50000 );
insert into detallefactura ( idfactura, idcocinero, plato, importe ) values ( 1, 2, 'bandeja paisa', 50000 );

-- factura 2
insert into detallefactura ( idfactura, idcocinero, plato, importe ) values ( 2, 1, 'sancocho', 50000 );
insert into detallefactura ( idfactura, idcocinero, plato, importe ) values ( 2, 2, 'bandeja paisa', 50000 );
insert into detallefactura ( idfactura, idcocinero, plato, importe ) values ( 2, 2, 'helado', 50000 );

-- factura 3
insert into detallefactura ( idfactura, idcocinero, plato, importe ) values ( 3, 1, 'sopa', 20000 );
insert into detallefactura ( idfactura, idcocinero, plato, importe ) values ( 3, 2, 'arroz', 20000 );

-- factura 4
insert into detallefactura ( idfactura, idcocinero, plato, importe ) values ( 4, 1, 'sancocho', 50000 );
insert into detallefactura ( idfactura, idcocinero, plato, importe ) values ( 4, 2, 'arroz', 20000 );
