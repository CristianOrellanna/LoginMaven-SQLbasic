<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="ContentType" content="text/html: charset=UTF-8">
	<title>Hola Usuario!</title>
</head>
<body>
	<form action="ValidadorServlet" method="POST">
		Nombre de usuario: <input type="text" name="usuario"><br/>
		Contraseña: <input type="password" name="password"><br/>
		<input type="submit" value="Enviar">
	</form>
</body>
</html>
