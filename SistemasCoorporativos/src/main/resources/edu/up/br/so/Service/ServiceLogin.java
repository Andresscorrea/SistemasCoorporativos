package edu.up.br.so.Service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import edu.up.br.so.DAO.UsuarioDao;
import edu.up.br.so.Entities.Usuario;

@Path("/Login")
public class ServiceLogin {
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Usuario ValidaUsuario(String Json, String Json2)
	{
		UsuarioDao usuariodao = new UsuarioDao();
		
		return usuariodao.LoginUsuario(Json, Json2); 
		
	}

}
