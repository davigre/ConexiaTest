<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Camareros Sales Report</title>
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
<h3>Best Clientes Report</h3>
<div>Consumo superior a: ${purchaselimit}</div>
<table id="table_id" class="display" >
<thead>
<tr>
<th>Id Cliente</th>
<th>Nombre</th>
<th>Consumo</th>
</tr>
</thead>
<tbody>
<c:forEach items="${clientepurchases}" var="clientepurchase">
	<tr>
	<td>${clientepurchase.id}</td>
	<td>${clientepurchase.name}</td>
	<td>${clientepurchase.consumo}</td>	
	</tr>
</c:forEach>
</tbody>
</table>
<a class="ui-button ui-widget ui-corner-all" href="index.html">Menu Principal</a>
</body>
</html>