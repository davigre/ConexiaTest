<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Facturas</title>
<link rel="stylesheet" href="cocina.css">
</head>
<body>
<h3>Facturas:</h3>
<table>
<tr>
<th>id</th>
<th>Fecha</th>
<th>Cliente</th>
<th>Camarero</th>
<th>Mesa</th>
<th></th>
</tr>
<c:forEach items="${facturas}" var="factura">
	<tr>
	<td>${factura.id}</td>
	<td>${factura.fechaFactura}</td>
	<td>${factura.cliente.nombre}</td>
	<td>${factura.camarero.nombre}</td>
	<td>${factura.mesa.id}</td>
	<td><a href="viewFactura?id=${factura.id}">ver</a></td>
	</tr>
</c:forEach>
</table>
<a href="createFactura">Adicionar</a>
<a href="index.html">Menu Principal</a>
</body>
</html>