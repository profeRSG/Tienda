package gestion;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import modelo.Producto.IProducto;
import modelo.Producto.Pedido;
import modelo.Producto.Producto;
import modelo.usuario.Cliente;
import modelo.usuario.Usuario;

import java.io.IOException;
import java.time.LocalDate;

import dao.DAOProducto;
import dao.DAOUsuario;

@WebServlet("/gestion.PedidoServlet")
public class PedidoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	HttpSession session = request.getSession(true);
    	String idProducto=request.getParameter("idProducto");
    	Pedido pedido=crearPedido(Integer.parseInt(idProducto),(Cliente)session.getAttribute("user"));
    	session.setAttribute("pedido", pedido);
            response.sendRedirect("resumenPedido.jsp");
            
        }

    /**
     * El metodo devuelve un objeto pedido, que tiene como producto, el producto cuyo id
     * es idProducto, el cliente es el usuario pasado como parametro, y la
     * fecha de la compra, es la fecha actual.
     * 
     * @implNote Para obtener el producto a partir de su id de la base de datos
     * se utiliza un objeto daoProducto, el cual tiene un metodo para obtener 
     * un pedido a partir de su id.
     * 
     * @param idProducto. id del producto del pedido
     * @param usuario. Cliente que realiza el pedido
     * @return Un objeto pedido, con toda la informacion del producto, usuario
     * y fecha de compra.
     */
	private Pedido crearPedido(int idProducto, Cliente usuario) {
		
		return new Pedido(new Producto(1, null, null, 0, null), usuario, LocalDate.of(12,12,12));
		//TODO, actualmente se crea un pedido con los mismo datos. Se debe borrar esta linea
		//y crear un pedido que tenga como producto, el que tiene como id idProducto
		//y que tenga como fecha de compra la actual, y como cliente
		//el parametro usuario. Para acceder a la BD utilizar un objeto de DAOProducto.
	}

   
}