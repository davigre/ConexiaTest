<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listar Camareros</title>
</head>
<body>
<h3>Camareros:</h3>
<table>
<tr>
<th>id</th>
<th>nombre</th>
<th>apellido1</th>
<th>apellido2</th>
</tr>
<c:forEach items="${camareros}" var="camarero">
<tr>
<td>${camarero.id}</td>
<td>${camarero.nombre}</td>
<td>${camarero.apellido1}</td>
<td>${camarero.apellido2}</td>
</tr>
</c:forEach>
</table>
<a href="createCamarero">Adicionar</a>
</body>
</html>