<!DOCTYPE html>
<html lang="es">
<head>
<link rel="icon" type="image/jpg" href="https://upload.wikimedia.org/wikipedia/commons/d/de/Amazon_icon.png"/>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Iniciar sesión</title>
<link rel="stylesheet" href="styles.css">
</head>
<body>
	<div style="text-align: center;">
		<img src="img/amazon_login.png" alt="Logo de Amazon" class="logo">
	</div>

	<div class="login-container">
		<h2 id="p1">Iniciar sesión</h2>
		<form action="gestion.LoginServlet" method="post">
			<input type="text" name="username" placeholder="Usuario" required autocomplete="off"><br>
			<input type="password" name="password" placeholder="Contraseña"
				required><br>
			<% 
                if (request.getParameter("error") != null && request.getParameter("error").equals("1")) {
            %>
                <span id="loginIncorrecto">¡Usuario o contraseña incorrecto!</span><br>
            <% } %>
			<div id="legalTextRow"
				class="a-row a-spacing-top-medium a-size-small">
				Al continuar, aceptas las <a
					href="/gp/help/customer/display.html/ref=ap_signin_notification_condition_of_use?ie=UTF8&amp;nodeId=200545940">Condiciones
					de uso y venta</a> de Amazon. Consulta el <a
					href="/gp/help/customer/display.html/ref=ap_signin_notification_privacy_notice?ie=UTF8&amp;nodeId=200545460">Aviso
					de privacidad</a>, el <a
					href="/gp/help/customer/display.html/?nodeId=201890250">Aviso
					de cookies</a> y el <a
					href="/gp/help/customer/display.html?nodeId=201909150">Aviso de
					anuncios basados en intereses</a>.
			</div>
			<br>
			<button id="p2" type="submit">Continuar</button>
		</form>
	</div>

	<footer class="footer">
		<div class="footer-links">
			<a href="#">Condiciones de uso</a> <a href="#">Aviso de
				privacidad</a> <a href="#">Ayuda</a> <a href="#">Cookies</a> <a href="#">Publicidad
				basada en intereses</a>
		</div>
		<p>© 1996-2024, Amazon.com, Inc. o sus afiliados</p>
	</footer>
</body>
</html>
