<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Listar Camareros</title>
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
<h3>Camareros:</h3>
<table id="table_id" class="display" >
<thead>
<tr>
<th>id</th>
<th>nombre</th>
<th>apellido1</th>
<th>apellido2</th>
<th></th>
</tr>
</thead>
<tbody>
<c:forEach items="${camareros}" var="camarero">
<tr>
<td>${camarero.id}</td>
<td>${camarero.nombre}</td>
<td>${camarero.apellido1}</td>
<td>${camarero.apellido2}</td>
<td><a href="updateCamarero?id=${camarero.id}">editar</a></td>
</tr>
</c:forEach>
</tbody>
</table>
<a class="ui-button ui-widget ui-corner-all" href="createCamarero">Adicionar</a>
<a class="ui-button ui-widget ui-corner-all" href="index.html">Menu Principal</a>
</body>
</html>