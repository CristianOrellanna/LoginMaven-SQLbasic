<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="ContentType" content="text/html: charset=UTF-8">
	<link rel="stylesheet" type="text/css" href="styles.css">
	<title>Login</title>
</head>
<body>
    <div class="background">
        <div class="shape"></div>
        <div class="shape"></div>
    </div>
    <form action="ValidadorServlet" method="POST">
        <h3>Login</h3>

        <label for="username"></label>
        <input type="text" placeholder="Usuario" name="usuario">

        <label for="password"></label>
        <input type="password" placeholder="Contraseña" name="password">

		<button>Iniciar sesión</button>
		
    </form>
</body>
</html>
