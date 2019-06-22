<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listar Clientes</title>
<link rel="stylesheet" href="cocina.css">
</head>
<body>
<h3>Clientes:</h3>
<table>
<tr>
<th>id</th>
<th>nombre</th>
<th>apellido1</th>
<th>apellido2</th>
<th>Observaciones</th>
<th></th>
</tr>
<c:forEach items="${clientes}" var="cliente">
<tr>
<td>${cliente.id}</td>
<td>${cliente.nombre}</td>
<td>${cliente.apellido1}</td>
<td>${cliente.apellido2}</td>
<td>${cliente.observaciones}</td>
<td><a href="updateCliente?id=${cliente.id}">editar</a></td>
</tr>
</c:forEach>
</table>
<a href="createCliente">Adicionar</a>
<a href="index.html">Menu Principal</a>
</body>
</html>