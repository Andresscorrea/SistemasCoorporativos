package edu.up.br.so.DAO;

import java.util.ArrayList;
import java.util.List;

import edu.up.br.so.Entities.Sistema;
import edu.up.br.so.Entities.Usuario;

public class SistemaDao {
	public static List<Sistema> Permissoes = new ArrayList<Sistema>();

	public Sistema Buscarp(String nome) {

		for (Sistema u : Permissoes) {
			if (u.getNomePermissao().equals(nome)) {
				return u;
			}
		}
		return null;

	}
	
	public Sistema BuscaID(int id) {

		for (Sistema u : Permissoes) {
			if (u.getIdPermissao() == id) {
				return u;
			}
		}
		return null;

	}
	
	public List<Sistema> Buscaall() {
		
		return Permissoes;

	}


	public Sistema CadastrarPermição(Sistema p) {

			Permissoes.add(p);
			return p;

	}

		
}
