<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Cocinero</title>
</head>
<body>
<form action="saveCocinero" method="post">
<pre>
<input type="hidden" name="id"/>
Nombre: <input type="text" name="nombre"/>
Apellido1: <input type="text" name="apellido1"/>
Apellido2: <input type="text" name="apellido2"/>
<input type="submit" value="Guardar"/>
</pre>
</form>
${msg}
<br/><a href="displayCocineros">Ver Todos</a>
</body>
</html>
