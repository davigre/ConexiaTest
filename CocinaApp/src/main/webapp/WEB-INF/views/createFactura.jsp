<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Generar Factura</title>
<link rel="stylesheet" href="jqueryui/jquery-ui.min.css">
<link rel="stylesheet" href="datatables.min.css"/>
<link rel="stylesheet" href="cocina.css">
<script src="jqueryui/jquery.js"></script>
<script src="jqueryui/jquery-ui.min.js"></script>
<script src="datatables.min.js"></script>
<script src="jquery.tabletojson.min.js"></script>
<script>
	$(function() {
		$('#clientes').selectmenu();
		$('#camareros').selectmenu();
		$('#mesas').selectmenu();
		//$('#detallesFactura').DataTable();
	});
</script>
</head>
<body>
<h3>Generar Factura</h3>
<form action="saveFactura" method="post">
<input type="hidden" name="serializedDetails" id="serializedDetails" />
<label for="clientes">Select a Client</label>
<select id="clientes" name="clienteId">
<c:forEach items="${clientes}" var="cliente">
    <option value="${cliente.id}">${cliente.nombre} ${cliente.apellido1} ${cliente.apellido2}</option>
</c:forEach>
</select>
<button type="button" class="ui-button ui-corner-all ui-button-icon-only" title="Add Cliente" onclick="window.location.href = 'createCliente';"><span class="ui-button-icon ui-icon ui-icon-plus"></span></button>
<br/><label for="camareros">Select a Camarero</label>
<select id="camareros" name="camareroId">
<c:forEach items="${camareros}" var="camarero">
    <option value="${camarero.id}">${camarero.nombre} ${camarero.apellido1} ${camarero.apellido2}</option>
</c:forEach>
</select>
<button type="button" class="ui-button ui-corner-all ui-button-icon-only" title="Add Camarero" onclick="window.location.href = 'createCamarero';"><span class="ui-button-icon ui-icon ui-icon-plus"></span></button>
<br/>
<label for="mesas">Select a Mesa</label>
<select id="mesas" name="mesaId">
<c:forEach items="${mesas}" var="mesa">
    <option value="${mesa.id}">${mesa.id}</option>
</c:forEach>
</select>
<button type="button" class="ui-button ui-corner-all ui-button-icon-only" title="Add Mesa" onclick="window.location.href = 'createMesa';"><span class="ui-button-icon ui-icon ui-icon-plus"></span></button>
<br/>
<fieldset>
  <legend>Add Plato:</legend>
<label for="cocineroId">Cocinero</label>
<select name="cocineroId" id="cocineroId" >
<c:forEach items="${cocineros}" var="cocinero">
    <option value="${cocinero.id}">${cocinero.nombre} ${cocinero.apellido1} ${cocinero.apellido2}</option>
</c:forEach>
</select>
<br/><label for="nombreplato">Plato Name</label>
<input type="text" name="nombrePlato" id="nombreplato" />
<br/><label for="importe">Importe</label>
<input type="text" name="importe" id="importe" />
<br/><button type="button" id="addDetail">Agregar Plato</button>
</fieldset>
<fieldset>
<legend>Platos Factura:</legend>
<table id='detallesFactura' >
<thead><tr><th>CocineroId</th><th>Cocinero</th><th>Plato</th><th>Importe</th><th></th></tr></thead>
<tbody></tbody>
</table>
</fieldset>
<br/><input type="submit" value="Guardar Factura" id="submit" />
</form>
<br/><a class="ui-button ui-widget ui-corner-all" href="displayFacturas">Ver Todos</a>
<script type="text/javascript">
	
	$(function() {

		// add new row
		$("#addDetail").click(function(){
			var cocineroid = $("#cocineroId").val();
			var cocineroName = $("#cocineroId option:selected").text();
			var name = $("#nombreplato").val();
            var precio = $("#importe").val();
            var markup = "<tr><td>" + cocineroid + "</td><td>" + cocineroName + "</td><td>" + name + "</td><td>" + precio + "</td><td><a href='javascript:void(0);' class=\"deleteRow\">eliminar</a></td></tr>";

			if (!isNaN(precio)) {
				$("#detallesFactura tbody").append(markup);
			} else {
				alert("Por favor digitar un valor numerico en el importe");
			}
            
            return false;
        });

		// submit serialized table
		$("#submit").click(function(){
			$("#serializedDetails").val(JSON.stringify($("#detallesFactura").tableToJSON()));
        });	    

		// Delete row
		$(document).on("click", "a.deleteRow" , function() {
			$(this).parents('tr').first().remove();
            return false;
        });		
        
	});
</script>
</body>
</html>