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
<h3>Best Clientes Report</h3>
<div>Consumo superior a: ${purchaselimit}</div>
<table>
<tr>
<th>Id Cliente</th>
<th>Nombre</th>
<th>Consumo</th>
</tr>
<c:forEach items="${clientepurchases}" var="clientepurchase">
	<tr>
	<td>${clientepurchase.id}</td>
	<td>${clientepurchase.name}</td>
	<td>${clientepurchase.consumo}</td>	
	</tr>
</c:forEach>
</table>
<a href="index.html">Menu Principal</a>
</body>
</html>