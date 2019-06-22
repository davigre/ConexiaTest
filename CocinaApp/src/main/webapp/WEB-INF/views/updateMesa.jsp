<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Mesa</title>
</head>
<body>
<form action="updateMesaRequest" method="post">
<pre>
Id: <input type="text" name="id" value="${mesa.id}" readonly />
Numero Maximo Comensales: <input type="text" name="numMaxComensales" value="${mesa.numMaxComensales}"/>
Ubicación: <input type="text" name="ubicacion" value="${mesa.ubicacion}"/>
<input type="submit" value="Guardar"/>
</pre>
</form>
${msg}
<br><a href="displayMesas">Ver Todos</a>
</body>
</html>