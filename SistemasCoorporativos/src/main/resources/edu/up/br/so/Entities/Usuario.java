package edu.up.br.so.Entities;


import java.util.List;

import edu.up.br.so.Entities.Permissao;

public class Usuario {
	private int id;
	private String Nome;
	private String Cpf;
	private String Email;
	private String Senha;
	private List<Permissao> permissoes;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getCpf() {
		return Cpf;
	}

	public void setCpf(String cpf) {
		Cpf = cpf;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getSenha() {
		return Senha;
	}
	public void setSenha(String senha) {
		Senha = senha;
	}
	public List<Permissao> getPermissoes() {
		return permissoes;
	}
	public void setPermissoes(List<Permissao> permissoes) {
		this.permissoes = permissoes;
	}

	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", Nome=" + Nome + ", Cpf=" + Cpf + ", Email=" + Email + ", Senha=" + Senha
				+ ", permissoes=" + permissoes + "]";
	}
	
}
