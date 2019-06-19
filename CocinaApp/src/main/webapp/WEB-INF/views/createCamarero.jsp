<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Camarero</title>
</head>
<body>
<form action="saveCamarero" method="post">
<pre>
Id: <input type="text" name="id">
Nombre: <input type="text" name="nombre"/>
Apellido1: <input type="text" name="apellido1"/>
Apellido2: <input type="text" name="apellido2"/>
<input type="submit" value="save"/>
</pre>
</form>
${msg}
<a href="displayCamareros">Ver Todos</a>
</body>
</html>