<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Update Cliente</title>
<link rel="stylesheet" href="jqueryui/jquery-ui.min.css">
<link rel="stylesheet" href="cocina.css">
<script src="jqueryui/jquery.js"></script>
<script src="jqueryui/jquery-ui.min.js"></script>
</head>
<body>
<h3>Edit Cliente</h3>
<form action="updateClienteRequest" method="post">
<pre>
Id: ${cliente.id}
Nombre: <input type="text" name="nombre" value="${cliente.nombre}"/>
Apellido1: <input type="text" name="apellido1" value="${cliente.apellido1}"/>
Apellido2: <input type="text" name="apellido2" value="${cliente.apellido2}"/>
Observaciones: <input type="text" name="observaciones" value="${cliente.observaciones}"/>
<input type="submit" value="Guardar"/>
<input type="hidden" value="${cliente.id}" name="id" />
</pre>
</form>
${msg}
<br><a class="ui-button ui-widget ui-corner-all" href="displayClientes">Ver Todos</a>
</body>
</html>