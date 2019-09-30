import java.util.ArrayList;
import java.util.List;

import edu.up.br.so.DAO.ModuloDao;
import edu.up.br.so.DAO.SistemaDao;
import edu.up.br.so.DAO.TIpoAcessoDAO;
import edu.up.br.so.DAO.UsuarioDao;
import edu.up.br.so.Entities.Modules;
import edu.up.br.so.Entities.Sistema;
import edu.up.br.so.Entities.TipoAcesso;
import edu.up.br.so.Entities.Usuario;
import edu.up.com.Utils.teclado;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TIpoAcessoDAO tas = new TIpoAcessoDAO();

		TipoAcesso ta = new TipoAcesso(1, "Adicionar");
		TipoAcesso ta2 = new TipoAcesso(2, "Ler");
		TipoAcesso ta3 = new TipoAcesso(3, "Alterar");
		TipoAcesso ta4 = new TipoAcesso(4, "Excluir");
		tas.Cadastrartipo(ta);
		tas.Cadastrartipo(ta2);
		tas.Cadastrartipo(ta3);
		tas.Cadastrartipo(ta4);

		teclado t = new teclado();
		Usuario u = new Usuario();
		String y = "s";
		while (y.equals("s")) {
			System.out.println("escolha o que deseja");
			System.out.println("1 - cadastrar usuario");
			System.out.println("2 - cadastrar premissao");
			System.out.println("3 - cadastrar modulo");
			int op = t.leInt();
			switch (op) {
			case 1:

				System.out.println("id");
				u.setId(t.leInt());
				System.out.println("nome");
				u.setNome(t.leString());
				System.out.println("cpf");
				u.setCpf(t.leString());
				System.out.println("email");
				u.setEmail(t.leString());
				System.out.println("senha");
				u.setSenha(t.leString());
				System.out.println("selecione a permissao");
				SistemaDao s = new SistemaDao();
				for (Sistema sis : s.Buscaall()) {
					System.out.println(sis);
				}
				u.sistemas.add(s.BuscaID(t.leInt()));

				System.out.println("selecione o modulo que deseja conceder acesso");
				ModuloDao modulod = new ModuloDao();
				for (Sistema Sistema : u.sistemas) {

					for (Modules m : modulod.Buscaporpermissoe(Sistema.getIdPermissao())) {
						
						System.out.println(m.toString());
					}
				}
				Modules mselect = modulod.BuscarId(t.leInt());
				String continuar = "";
				do {
				System.out.println("selecione qual acesso deseja");
				TIpoAcessoDAO tipo = new TIpoAcessoDAO();
				for (TipoAcesso sis : tipo.BuscarALL()) {
					System.out.println(sis);
				}
				mselect.getAcessos().add(tipo.BuscaID(t.leInt()));
				System.out.println("outros acessos?");
				continuar = t.leString();
				}while(continuar.equals("s"));
				u.modulos.add(mselect);
				UsuarioDao usudao = new UsuarioDao();
				usudao.CadastrarUsuario(u);

				break;
			case 2:
				Sistema p = new Sistema();
				System.out.println("p id");
				p.setIdPermissao(t.leInt());
				System.out.println("p nome");
				p.setNomePermissao(t.leString());
				SistemaDao sistemadao = new SistemaDao();
				sistemadao.CadastrarPermição(p);

				System.out.println("continuar?");
				y = t.leString();
				break;

			case 3:
				Modules m = new Modules();
				System.out.println("m id");
				m.setId(t.leInt());
				System.out.println("m nome");
				m.setNome_Modilo(t.leString());

				System.out.println("selecione o sistema que o modulo pertence");
				SistemaDao sisdao = new SistemaDao();
				for (Sistema sis : sisdao.Buscaall()) {
					System.out.println(sis);
				}
				m.setIdPermissao(sisdao.BuscaID(t.leInt()));
				ModuloDao Modulodao = new ModuloDao();
				Modulodao.CadastrarModulo(m);
				break;

			default:
				break;
			}
		}

	}

}
