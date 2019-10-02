package edu.up.br.so.DAO;

import java.util.ArrayList;
import java.util.List;

import edu.up.br.so.Entities.Sistema;
import edu.up.br.so.Entities.Usuario;

public class UsuarioDao {
	public static List<Usuario> usuarios = new ArrayList<Usuario>();

	public Usuario BuscarUsuario(String email) {

		for (Usuario u : this.usuarios) {
			if (u.getEmail().equals(email)) {
				return u;
			}
		}
		return null;

	}

	
	public Usuario LoginUsuario(String email, String senha) {

		for (Usuario u : this.usuarios) {
			if (u.getEmail().equals(email) && u.getSenha().equals(senha)) {
				
				return u;
			}
		}
		return null;

	}
	
	
	public Usuario CadastrarUsuario(Usuario usuario) {
		//if  (this.BuscarUsuario(usuario.getEmail()).equals(null)) {
			usuarios.add(usuario);
			return usuario;
		//} else {
		//	return null;
		//}
	}

}
