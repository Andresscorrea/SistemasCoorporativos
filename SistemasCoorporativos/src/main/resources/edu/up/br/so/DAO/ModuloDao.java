package edu.up.br.so.DAO;

import java.util.ArrayList;
import java.util.List;

import edu.up.br.so.Entities.Modules;
import edu.up.br.so.Entities.Modules;
import edu.up.br.so.Entities.Usuario;

public class ModuloDao {
	public static List<Modules> Modulos = new ArrayList<Modules>();

	public Modules Buscarp(String nome) {

		for (Modules u : Modulos) {
			if (u.getNome_Modilo().equals(nome)) {
				return u;
			}
		}
		return null;

	}
	public Modules BuscarId(int id) {

		for (Modules u : Modulos) {
			if (u.getId() == id) {
				return u;
			}
		}
		return null;

	}
	public Modules CadastrarModulo(Modules p) {
		
			Modulos.add(p);
			return p;

	}
	
	public List<Modules> Buscaporpermissoe(int id) {
		List<Modules> result = new ArrayList<Modules>();
		for (Modules u : Modulos) {
			if (u.getIdPermissao().getIdPermissao() == id) {
				result.add(u);
			}
		}
		return result;

	}

		
}
