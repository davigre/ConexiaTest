<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Update Cocinero</title>
<link rel="stylesheet" href="jqueryui/jquery-ui.min.css">
<link rel="stylesheet" href="cocina.css">
<script src="jqueryui/jquery.js"></script>
<script src="jqueryui/jquery-ui.min.js"></script>
</head>
<body>
<h3>Update Cocinero</h3>
<form action="updateCocineroRequest" method="post">
<pre>
Id: <input type="text" name="id" value="${cocinero.id}" readonly />
Nombre: <input type="text" name="nombre" value="${cocinero.nombre}"/>
Apellido1: <input type="text" name="apellido1" value="${cocinero.apellido1}"/>
Apellido2: <input type="text" name="apellido2" value="${cocinero.apellido2}"/>
<input type="submit" value="Guardar"/>
</pre>
</form>
${msg}
<br><a class="ui-button ui-widget ui-corner-all" href="displayCocineros">Ver Todos</a>
</body>
</html>