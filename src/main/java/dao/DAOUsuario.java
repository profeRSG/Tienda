package dao;

import java.util.LinkedList;

import modelo.usuario.Cliente;
import modelo.usuario.Usuario;

/**
 * Clase utilizada para obtener informacion de los Usuarios de la base de datos.
 * @implSpec Actualmente la clase es un Mock. No obtienes los datos de una base de datos
 * sino de una lista predefinida de objetos en el constructor.
 * @author Raul SG 
 */
public class DAOUsuario {
	
	LinkedList<Usuario> personasBD;
	
	/**
	 * Constructor del objeto utilizado para acceder a los datos de la base de datos.
	 * @implNote Actualmente, en lugar de abrir una conexion con la BD
	 * se crear una lista predefinida de objetos.
	 * @author Raul SG
	 */
	public DAOUsuario() {
		personasBD=new LinkedList<>();
		personasBD.add(new Cliente("asd","Pepe","asd", true));
		personasBD.add(new Cliente("hola","Ana","123",false));
		personasBD.add(new Usuario("admin", "Antonio"));
		personasBD.add(new Usuario("jeff_Bezos","Jeff"));
	}

	/**
	 * Metodo utilizado para obtener un objeto Usuario de la base de datos, a partir de su
	 * username. Se debe tener en cuenta que un Usuario puede ser un objeto de tipo Cliente.
	 * @param username, nombre del usuario que se desea obtener de la BD
	 * @return objeto Usuario, suyo username coincide con el parametro. En caso de no existir se
	 * devuelve null. 
	 * @apiNote Los Clientes son tambien Usuarios, por tanto, el metodo devuelve un objeto Usuario, el cual puede ser un Usuario asecas, o tambien
	 * por la propiedad del polimorfismo, un Cliente.
	 */
	public Usuario getUsuario(String username) {
		Usuario usuarioBuscado=null;
		for(int i=0;i<personasBD.size() && usuarioBuscado==null;i++) {
			Usuario user=personasBD.get(i);
			if(user.getUsername().equals(username))
				usuarioBuscado=user;
		}
		return usuarioBuscado;
	}

}
