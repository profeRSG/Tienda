<%@page import="org.apache.jasper.tagplugins.jstl.core.Catch"%>
<%@page import="modelo.usuario.Usuario"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="dao.DAOProducto"%>
<%@ page import="modelo.Producto.Producto"%>
<%@ page import="modelo.Producto.Pedido"%>
<%@ page import="java.text.DecimalFormat"%>
<%@ page import="gestion.LoginServlet"%>
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
<link rel="icon" type="image/jpg"
	href="https://upload.wikimedia.org/wikipedia/commons/d/de/Amazon_icon.png" />
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Resumen del Pedido</title>
<link rel="stylesheet" href="styles.css">
</head>
<body>
	<div class="header">
		<div></div>
		<!-- Espacio en blanco a la izquierda -->
		<img src=<%= LoginServlet.obtenerLogoUsuario(request.getSession())%> align="left" alt="Logo Amazon"
			class="logo">
		<div class="nombre">
			Hola
			<%= LoginServlet.obtenerNombreUsuario(request.getSession(), response)%></div>
	</div>
	<div class="productos-container">
		<h2>Resumen del Pedido</h2>
		<%Pedido pedido=(Pedido)request.getSession().getAttribute("pedido"); 
        DecimalFormat formato1 = new DecimalFormat("#.00");%>
		<div class="productos-lista">
			<div class="producto">
				<img id="resumImg"
					style="width: 15%; height: auto; max-width: 100%; float: left; margin-right: 10px;"
					src="<%= pedido.getProducto().getImagen() %>" width="5px"
					height="5px" alt="<%= request.getParameter("nombre") %>">
				<div class="producto-info">
					<h3><%= pedido.getProducto().getNombre() %></h3>
					<p>
						Descripción:
						<%= pedido.getProducto().getDescripcion() %></p>
					<p>
						Precio:
						<%= formato1.format(pedido.getProducto().getPrecioFinal()) %>
						&#8364;
					</p>
					<p>
						Fecha de entrega:
						<%= pedido.getFechaEntrega() %>
					</p>
					<!-- Agrega más información del pedido según sea necesario -->
					<button>Confirmar Pedido</button>
				</div>
			</div>
		</div>
	</div>
</body>
</html>

