package edu.up.br.so.Service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import edu.up.br.so.Entities.Usuario;

@Path("/Cadastrar")
public class CadastroUsuario {
	
	@POST
	@Path("/Cadastro")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Usuario CadastrarUsuario(Usuario usuario)
	{

		
		
	}

}
