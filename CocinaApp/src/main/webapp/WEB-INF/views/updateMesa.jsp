<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Update Mesa</title>
<link rel="stylesheet" href="jqueryui/jquery-ui.min.css">
<link rel="stylesheet" href="cocina.css">
<script src="jqueryui/jquery.js"></script>
<script src="jqueryui/jquery-ui.min.js"></script>
</head>
<body>
<h3>Edicion Mesa</h3>
<form action="updateMesaRequest" method="post">
<pre>
Id: <input type="text" name="id" value="${mesa.id}" readonly />
Numero Maximo Comensales: <input type="text" name="numMaxComensales" value="${mesa.numMaxComensales}"/>
Ubicación: <input type="text" name="ubicacion" value="${mesa.ubicacion}"/>
<input type="submit" value="Guardar"/>
</pre>
</form>
${msg}
<br><a class="ui-button ui-widget ui-corner-all" href="displayMesas">Ver Todos</a>
</body>
</html>