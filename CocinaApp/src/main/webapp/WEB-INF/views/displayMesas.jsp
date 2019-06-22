<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listar Mesas</title>
<link rel="stylesheet" href="cocina.css">
</head>
<body>
<h3>Mesas:</h3>
<table>
<tr>
<th>id</th>
<th>Numero Maximo de Comensales</th>
<th>Ubicacion</th>
<th></th>
</tr>
<c:forEach items="${mesas}" var="mesa">
<tr>
<td>${mesa.id}</td>
<td>${mesa.numMaxComensales}</td>
<td>${mesa.ubicacion}</td>
<td><a href="updateMesa?id=${mesa.id}">editar</a></td>
</tr>
</c:forEach>
</table>
<a href="createMesa">Adicionar</a>
<a href="index.html">Menu Principal</a>
</body>
</html>