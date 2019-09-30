package edu.up.br.so.Entities;

import java.util.ArrayList;
import java.util.List;

public class Modules {
	private int Id;
	private String Nome_Modilo;
	private Sistema idPermissao;
	private List<TipoAcesso> acessos;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getNome_Modilo() {
		return Nome_Modilo;
	}
	public void setNome_Modilo(String nome_Modilo) {
		Nome_Modilo = nome_Modilo;
	}
	public List<TipoAcesso> getAcessos() {
		return acessos;
	}
	public void setAcessos(List<TipoAcesso> acessos) {
		this.acessos = acessos;
	}
	public Sistema getIdPermissao() {
		return idPermissao;
	}
	public void setIdPermissao(Sistema idPermissao) {
		this.idPermissao = idPermissao;
	}
	public Modules(int id, String nome_Modilo, Sistema idPermissao, List<TipoAcesso> acessos) {
		super();
		Id = id;
		Nome_Modilo = nome_Modilo;
		this.idPermissao = idPermissao;
		this.acessos = acessos;
	}
	
	public Modules() {
		// TODO Auto-generated constructor stub
		acessos = new ArrayList<TipoAcesso>();
	}
	@Override
	public String toString() {
		return "Modules [Id=" + Id + ", Nome_Modilo=" + Nome_Modilo + ", idPermissao=" + idPermissao + ", acessos="
				+ acessos + "]";
	}
	

}
