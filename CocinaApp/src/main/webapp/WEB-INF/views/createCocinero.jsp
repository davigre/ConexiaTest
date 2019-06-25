<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Create Cocinero</title>
<link rel="stylesheet" href="jqueryui/jquery-ui.min.css">
<link rel="stylesheet" href="cocina.css">
<script src="jqueryui/jquery.js"></script>
<script src="jqueryui/jquery-ui.min.js"></script>
</head>
<body>
<h3>Crear Cocinero</h3>
<form action="saveCocinero" method="post">
<pre>
Nombre: <input type="text" name="nombre"/>
Apellido1: <input type="text" name="apellido1"/>
Apellido2: <input type="text" name="apellido2"/>
<input type="submit" value="Guardar"/>
</pre>
</form>
${msg}
<br/><a class="ui-button ui-widget ui-corner-all" href="displayCocineros">Ver Todos</a>
</body>
</html>
