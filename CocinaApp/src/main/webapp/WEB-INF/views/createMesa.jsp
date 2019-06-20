<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Mesa</title>
</head>
<body>
<h3>Crear Mesa</h3>
<form action="saveMesa" method="post">
<br/>Numero Max de Comensales: <input type="text" name="numMaxComensales"/>
<br/>Ubicacion: <input type="text" name="ubicacion"/>
<br/><input type="submit" value="Guardar"/>
</form>
${msg}
<br/><a href="displayMesas">Ver Todos</a>
</body>
</html>