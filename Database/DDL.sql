drop database if exists `cocina`;

create database cocina;
use cocina;

create table cocinero (

   idcocinero   int auto_increment,
   nombre      varchar(100) not null,
   apellido1   varchar(100) not null,
   apellido2   varchar(100),
   primary key (idcocinero)

);

create table camarero (

   idcamarero  int auto_increment,
   nombre      varchar(100) not null,
   apellido1   varchar(100) not null,
   apellido2   varchar(100),
   primary key (idcamarero)

);

create table mesa (

   idmesa            int auto_increment,
   nummaxcomensales  int not null default 1,
   ubicacion         varchar(100),   
   primary key (idmesa)

);

create table cliente (

   idcliente     int auto_increment,
   nombre        varchar(100) not null,
   apellido1     varchar(100) not null,
   apellido2     varchar(100),
   observaciones varchar(1000),
   primary key (idcliente)
	
);

create table factura (

   idfactura     int auto_increment,
	idcliente     int not null,
	idcamarero    int not null,	
   idmesa        int not null,
	fechafactura  timestamp default current_timestamp,
	primary key (idfactura)
	
);

alter table factura add constraint fk_fact_cliente foreign key (idcliente) references cliente(idcliente);
alter table factura add constraint fk_fact_camarero foreign key (idcamarero) references camarero(idcamarero);
alter table factura add constraint fk_fact_mesa foreign key (idmesa) references mesa(idmesa);

create table detallefactura (

   idfactura         int,
	iddetallefactura  int auto_increment,
	idcocinero        int,
	plato             varchar(100) not null default '',
	importe           int not null default 0,
   -- 
	primary key (iddetallefactura)
	
);

alter table detallefactura add constraint fk_det_fact_cocinero foreign key (idcocinero) references cocinero(idcocinero);
alter table detallefactura add constraint fk_det_fact_factura foreign key (idfactura) references factura(idfactura);
