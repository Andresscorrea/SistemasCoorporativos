package edu.up.br.so.Service;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriInfo;

import edu.up.br.so.DAO.UsuarioDao;
import edu.up.br.so.Entities.Usuario;


@Path("/Cadastrar")
public class CadastroUsuario {
	@Context
	private UriInfo uriInfo;
	
	public static List<Usuario> usuarios = new ArrayList<Usuario>();
	@POST
	@Path("/Cadastro")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response CadastrarUsuario(Usuario usuario)
	{
		UsuarioDao dao = new UsuarioDao();
		usuario = dao.CadastrarUsuario(usuario);
		if (usuario != null) {
			URI produtoCadastrado = uriInfo.getBaseUriBuilder().path(CadastroUsuario.class)
					.build();
			return Response.created(produtoCadastrado).entity(usuario).build();
		} else {

			return Response.status(Status.CONFLICT).entity(Status.CONFLICT.toString()).build();
		}
	}

}
