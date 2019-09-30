package edu.up.br.so.DAO;

import java.util.ArrayList;
import java.util.List;

import edu.up.br.so.Entities.Sistema;
import edu.up.br.so.Entities.TipoAcesso;

public class TIpoAcessoDAO {
	
	public static List<TipoAcesso> tipos = new ArrayList<TipoAcesso>();

	public TipoAcesso Cadastrartipo(TipoAcesso ta) {

			tipos.add(ta);
			return ta;

	}
	
	public List<TipoAcesso> BuscarALL() {

		return tipos;
	}
	public TipoAcesso BuscaID(int id) {

		for (TipoAcesso u : tipos) {
			if (u.getId() == id) {
				return u;
			}
		}
		return null;

	}
	

}
	




