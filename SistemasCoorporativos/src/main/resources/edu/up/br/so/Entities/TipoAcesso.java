package edu.up.br.so.Entities;

public class TipoAcesso {
	private int id;
	private String Nome_Tipo;
	public TipoAcesso() {
		// TODO Auto-generated constructor stub
	}
	public TipoAcesso(int id, String nome_Tipo) {
		super();
		this.id = id;
		Nome_Tipo = nome_Tipo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome_Tipo() {
		return Nome_Tipo;
	}
	public void setNome_Tipo(String nome_Tipo) {
		Nome_Tipo = nome_Tipo;
	}
	@Override
	public String toString() {
		return "TipoAcesso [id=" + id + ", Nome_Tipo=" + Nome_Tipo + "]";
	}

}
