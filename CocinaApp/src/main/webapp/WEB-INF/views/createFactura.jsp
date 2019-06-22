<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Generar Factura</title>
<link rel="stylesheet" href="jqueryui/jquery-ui.min.css">
<link rel="stylesheet" href="cocina.css">
<script src="jqueryui/jquery.js"></script>
<script src="jqueryui/jquery-ui.min.js"></script>
<script src="jquery.tabletojson.min.js"></script>
</head>
<body>
<h3>Create Factura</h3>
<form action="saveFactura" method="post">
<input type="hidden" name="serializedDetails" id="serializedDetails" />
Cliente:
<select name="clienteId">
<c:forEach items="${clientes}" var="cliente">
    <option value="${cliente.id}">${cliente.nombre} ${cliente.apellido1} ${cliente.apellido2}</option>
</c:forEach>
</select>
<br/>Camarero:
<select name="camareroId">
<c:forEach items="${camareros}" var="camarero">
    <option value="${camarero.id}">${camarero.nombre} ${camarero.apellido1} ${camarero.apellido2}</option>
</c:forEach>
</select>
<br/>Mesa:
<select name="mesaId">
<c:forEach items="${mesas}" var="mesa">
    <option value="${mesa.id}">${mesa.id}</option>
</c:forEach>
</select>
<div>
<select name="cocineroId" id="cocineroId" >
<c:forEach items="${cocineros}" var="cocinero">
    <option value="${cocinero.id}">${cocinero.nombre} ${cocinero.apellido1} ${cocinero.apellido2}</option>
</c:forEach>
</select>
<input type="text" name="nombrePlato" id="nombreplato" /> 
<input type="text" name="importe" id="importe" />
<button id="addDetail">Agregar Plato</button>
</div>
<table id='detallesFactura'>
<tr><th>CocineroId</th><th>Cocinero</th><th>Plato</th><th>Importe</th><th></th></tr>
</table>
<br/><input type="submit" value="Guardar" id="submit" />
</form>
<br/><a href="displayFacturas">Ver Todos</a>
<script type="text/javascript">
	
	$(function() {
		
		$("#addDetail").click(function(){
			var cocineroid = $("#cocineroId").val();
			var cocineroName = $("#cocineroId option:selected").text();
			var name = $("#nombreplato").val();
            var precio = $("#importe").val();
            var markup = "<tr><td>" + cocineroid + "</td><td>" + cocineroName + "</td><td>" + name + "</td><td>" + precio + "</td><td><a href='javascript:void(0);' class=\"deleteRow\">eliminar</a></td></tr>";
            $("#detallesFactura tbody").append(markup);
            return false;
        });

		$("#submit").click(function(){
			
			$("#serializedDetails").val(JSON.stringify($("#detallesFactura").tableToJSON()));
            
        });	    

		$(document).on("click", "a.deleteRow" , function() {
			$(this).parents('tr').first().remove();
            return false;
        });		
        
	});
</script>
</body>
</html>