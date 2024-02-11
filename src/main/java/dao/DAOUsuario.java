package dao;

import java.util.LinkedList;

import modelo.usuario.Cliente;
import modelo.usuario.Usuario;

public class DAOUsuario {
	
	LinkedList<Usuario> personasBD;
	
	public DAOUsuario() {
		personasBD=new LinkedList<>();
		personasBD.add(new Cliente("asd","Pepe","asd", true));
		personasBD.add(new Cliente("hola","Ana","123",false));
		personasBD.add(new Usuario("admin", "Antonio"));
		personasBD.add(new Usuario("jeff_Bezos","Jeff"));
	}

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
