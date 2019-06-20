<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Camarero</title>
</head>
<body>
<h3>Create Camarero</h3>
<form action="saveCamarero" method="post">
<pre>
Nombre: <input type="text" name="nombre"/>
Apellido1: <input type="text" name="apellido1"/>
Apellido2: <input type="text" name="apellido2"/>
<input type="submit" value="Guardar"/>
</pre>
</form>
${msg}
<br/><a href="displayCamareros">Ver Todos</a>
</body>
</html>