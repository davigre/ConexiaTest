<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Generar Factura</title>
</head>
<body>
<form action="saveFactura" method="post">
<input type="hidden" name="id"/>
<h3>Create Factura</h3>
Cliente:
<select name="cliente">
<c:forEach items="${clientes}" var="cliente">
    <option value="${cliente.id}">${cliente.nombre} ${cliente.apellido1} ${cliente.apellido2}</option>
</c:forEach>
</select>
Camarero:
<select name="camarero">
<c:forEach items="${camareros}" var="camarero">
    <option value="${camarero.id}">${camarero.nombre} ${camarero.apellido1} ${camarero.apellido2}</option>
</c:forEach>
</select>
Mesa:
<select name="mesa">
<c:forEach items="${mesas}" var="mesa">
    <option value="${mesa.id}">${mesa.id}</option>
</c:forEach>
</select>
<input type="submit" value="Guardar" />
</form>
${msg}
<br/><a href="displayFacturas">Ver Todos</a>
</body>
</html>