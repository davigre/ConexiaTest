<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listar Cocineros</title>
<link rel="stylesheet" href="cocina.css">
</head>
<body>
<h3>Cocineros:</h3>
<table>
<tr>
<th>id</th>
<th>nombre</th>
<th>apellido1</th>
<th>apellido2</th>
<th></th>
</tr>
<c:forEach items="${cocineros}" var="cocinero">
<tr>
<td>${cocinero.id}</td>
<td>${cocinero.nombre}</td>
<td>${cocinero.apellido1}</td>
<td>${cocinero.apellido2}</td>
<td><a href="updateCocinero?id=${cocinero.id}">editar</a></td>
</tr>
</c:forEach>
</table>
<a href="createCocinero">Adicionar</a>
<a href="index.html">Menu Principal</a>
</body>
</html>