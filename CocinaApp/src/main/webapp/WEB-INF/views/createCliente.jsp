<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Cliente</title>
</head>
<body>
<h3>Create Cliente</h3>
<form action="saveCliente" method="post">
<pre>
Nombre: <input type="text" name="nombre"/>
Apellido1: <input type="text" name="apellido1"/>
Apellido2: <input type="text" name="apellido2"/>
Observaciones: <input type="text" name="observaciones"/>
<input type="submit" value="Guardar"/>
</pre>
</form>
${msg}
<br/><a href="displayClientes">Ver Todos</a>
</body>
</html>