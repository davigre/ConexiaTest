<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Update Camarero</title>
<link rel="stylesheet" href="jqueryui/jquery-ui.min.css">
<link rel="stylesheet" href="cocina.css">
<script src="jqueryui/jquery.js"></script>
<script src="jqueryui/jquery-ui.min.js"></script>
</head>
<body>
<h3>Edit Camarero</h3>
<form action="updateCamareroRequest" method="post">
<pre>
Id: ${camarero.id}
Nombre: <input type="text" name="nombre" value="${camarero.nombre}"/>
Apellido1: <input type="text" name="apellido1" value="${camarero.apellido1}"/>
Apellido2: <input type="text" name="apellido2" value="${camarero.apellido2}"/>
<input type="submit" value="Guardar"/>
<input type="hidden" value="${camarero.id}" name="id" />
</pre>
</form>
${msg}
<br><a class="ui-button ui-widget ui-corner-all" href="displayCamareros">Ver Todos</a>
</body>
</html>