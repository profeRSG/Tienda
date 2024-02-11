package gestion;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import modelo.usuario.Cliente;
import modelo.usuario.Usuario;

import java.io.IOException;

import dao.DAOUsuario;

@WebServlet("/gestion.LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		boolean validCredentials = checkLoginCliente(username,password);
		HttpSession session = request.getSession(true);
		if (validCredentials) {
			DAOUsuario daoPersona=new DAOUsuario();
			Usuario usuario=daoPersona.getUsuario(username);
			// Guardar el usuario en la sesión
			session.setAttribute("userLogado", true);
			session.setAttribute("user", usuario);
			response.sendRedirect("productos.jsp");
		} else {
			session.setAttribute("userLogado", null);
			session.setAttribute("user", null);
			response.sendRedirect("index.jsp?error=1");

		}
	}

	/**
	 * Este metodo es utilizado en la autenticacion del usuario en el Login.
	 * El metodo comprueba si existe un Cliente en la BD con el username
	 * y en caso afirmativo, comprueba si tiene el mismo password que el
	 * password pasado como parametro. En caso afirmativo devuelve true.
	 * En caso negativo devuelve false.
	 * @param username. username identificativo del cliente que intenta logarse
	 * @param password . Clave que ha introducido el usuario
	 * @return true, si se autentica el usuario, es decir si coincide el username
	 * y el password. False, en caso contrario.
	 */
	private boolean checkLoginCliente(String username, String password) {
		DAOUsuario daoUsuario=new DAOUsuario();//Se crea un objeto daoUsuario, que nos permite obtener informacion de los usuario de la BD
		Usuario usuario=daoUsuario.getUsuario(username);//Obtenemos el Usuario, cuyo username es el prorporcionado. 
		//En caso de no existir el metodo devolvera null
		
		
		//TODO añadir logica, para comproba si el username y password coinciden
		//actualmente devuelve siempre true. Por lo que siempre se puede entrar.
		//Hay que tener en cuenta que no todos los Usuarios, son CLientes. Los Clientes son
		//los usuario que se pueden logar.
		return true;
	}

	public static String obtenerNombreUsuario(HttpSession session, HttpServletResponse response2) {
		Usuario usuario=null;
		String resultado="Unknown";
		if (session != null && session.getAttribute("user") != null) {
			usuario = ((Usuario)session.getAttribute("user"));
		}
		if(usuario==null){
			Boolean usuarioLogado = ((Boolean)session.getAttribute("userLogado"));
			if(usuarioLogado==null)
				try {
					response2.sendRedirect("index.jsp");
				}catch (Exception e) {

				}
		}
		else
			resultado=usuario.getNombre();
		return resultado;
	}
	
	public static String obtenerLogoUsuario(HttpSession session) {
		String ruta="img/amazon.png";
		boolean prime;
		Cliente cliente=((Cliente)session.getAttribute("user"));
		prime=cliente!=null?cliente.isPrime():false;
		if(prime)
			ruta="img/amazon_prime.png";
		return ruta;
			
	}
}