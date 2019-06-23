<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Camareros Sales Report</title>
<link rel="stylesheet" href="cocina.css">
</head>
<body>
<h3>Camareros Sales Report</h3>
<table>
<tr>
<th>Id Camarero</th>
<th>Nombre</th>
<th>Periodo</th>
<th>Importe</th>
</tr>
<c:forEach items="${camarerosales}" var="camarerosale">
	<tr>
	<td>${camarerosale.id}</td>
	<td>${camarerosale.nombre}</td>
	<td>${camarerosale.periodo}</td>
	<td>${camarerosale.importe}</td>
	</tr>
</c:forEach>
</table>
<a href="index.html">Menu Principal</a>
</body>
</html>