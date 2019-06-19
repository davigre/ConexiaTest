<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Camarero</title>
</head>
<body>
<form action="updateCamareroRequest" method="post">
<pre>
Id: <input type="text" name="id" value="${camarero.id}" readonly />
Nombre: <input type="text" name="nombre" value="${camarero.nombre}"/>
Apellido1: <input type="text" name="apellido1" value="${camarero.apellido1}"/>
Apellido2: <input type="text" name="apellido2" value="${camarero.apellido2}"/>
<input type="submit" value="Guardar"/>
</pre>
</form>
${msg}
<br><a href="displayCamareros">Ver Todos</a>
</body>
</html>