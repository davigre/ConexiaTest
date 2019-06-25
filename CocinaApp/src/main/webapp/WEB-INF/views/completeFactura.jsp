<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Factura ${factura.id}</title>
<link rel="stylesheet" href="jqueryui/jquery-ui.min.css">
<link rel="stylesheet" href="datatables.min.css"/>
<link rel="stylesheet" href="cocina.css">
<script src="jqueryui/jquery.js"></script>
<script src="jqueryui/jquery-ui.min.js"></script>
<script src="datatables.min.js"></script>
<script>
	$(function() {
		$('#table_id').DataTable();
	});
</script>
</head>
<body>
<h3>Factura ${factura.id}</h3>
<div>Cliente:${factura.cliente.nombre} ${factura.cliente.apellido1} ${factura.cliente.apellido2}</div>
<div>camarero:${factura.camarero.nombre} ${factura.camarero.apellido1} ${factura.camarero.apellido2}</div>
<div>Mesa:${factura.mesa.id}</div>
<div>fecha:${factura.fechaFactura}</div>
<h4>Detalle de platos</h4>
<table id="table_id" class="display" >
<thead>
<tr>
<th>Cocinero</th>
<th>Plato</th>
<th>Importe</th>
</tr>
</thead>
<tbody>
<c:forEach items="${factura.facturaDetails}" var="detallefactura">
	<tr>
	<td>${detallefactura.cocinero.nombre} ${detallefactura.cocinero.apellido1} ${detallefactura.cocinero.apellido2}</td>		
	<td>${detallefactura.plato}</td>
	<td>${detallefactura.importe}</td>
	</tr>
</c:forEach>
</tbody>
</table>
<br/><a class="ui-button ui-widget ui-corner-all" href="displayFacturas">Ver Todos</a>
<a class="ui-button ui-widget ui-corner-all" href="index.html">Menu Principal</a>
</body>
</html>