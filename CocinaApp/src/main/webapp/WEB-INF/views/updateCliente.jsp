<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Cliente</title>
</head>
<body>
<form action="updateClienteRequest" method="post">
<pre>
Id: <input type="text" name="id" value="${cliente.id}" readonly />
Nombre: <input type="text" name="nombre" value="${cliente.nombre}"/>
Apellido1: <input type="text" name="apellido1" value="${cliente.apellido1}"/>
Apellido2: <input type="text" name="apellido2" value="${cliente.apellido2}"/>
Observaciones: <input type="text" name="observaciones" value="${cliente.observaciones}"/>
<input type="submit" value="Guardar"/>
</pre>
</form>
${msg}
<br><a href="displayClientes">Ver Todos</a>
</body>
</html>