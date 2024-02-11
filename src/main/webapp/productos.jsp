<%@page import="gestion.LoginServlet"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.Catch"%>
<%@page import="modelo.usuario.Usuario"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="dao.DAOProducto"%>
<%@ page import="modelo.Producto.Producto"%>
<%@ page import="java.text.DecimalFormat"%>
<%@ page import="gestion.LoginServlet"%>
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
<link rel="icon" type="image/jpg"
	href="https://upload.wikimedia.org/wikipedia/commons/d/de/Amazon_icon.png" />
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Productos</title>
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
			<%=LoginServlet.obtenerNombreUsuario(request.getSession(), response)%></div>
	</div>
	<div class="productos-container">
		<h2>Listado de productos</h2>
		<div class="productos-lista">
			<%
            DAOProducto daoProductos=new DAOProducto();
            DecimalFormat formato1 = new DecimalFormat("#.00");
                        List<modelo.Producto.IProducto> productos = daoProductos.getProductos();
                                                for (modelo.Producto.IProducto producto : productos) {
            %>
			<div class="producto">
				<img src=<%= producto.getImagen()%> width="50" height="50"
					alt="<%= producto.getNombre() %>">
				<div class="producto-info">
					<h3><%= producto.getNombre() %></h3>
					<p>
						Precio:
						<%= formato1.format(producto.getPrecioFinal()) %>
						&#8364;
					</p>
					<form action="gestion.PedidoServlet" method="post">
						<input type="hidden" name="idProducto"
							value="<%= producto.getId() %>">
						<button type="submit">Comprar ya</button>
					</form>
				</div>
			</div>
			<% } %>
		</div>
	</div>
</body>
</html>