package edu.up.br.so.Entities;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
	private int idPermissao;
	private String NomePermissao;

	public String getNomePermissao() {
		return NomePermissao;
	}
	public int getIdPermissao() {
		return idPermissao;
	}
	public void setIdPermissao(int idPermissao) {
		this.idPermissao = idPermissao;
	}
	public String getNomePremissao() {
		return NomePermissao;
	}
	public void setNomePermissao(String nomePermissao) {
		NomePermissao = nomePermissao;
	}
	
	

	@Override
	public String toString() {
		return "Sistema [idPermissao=" + idPermissao + ", NomePermissao=" + NomePermissao ;
	}
	
	
	

}
