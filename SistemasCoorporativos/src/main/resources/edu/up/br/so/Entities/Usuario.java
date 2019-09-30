package edu.up.br.so.Entities;


import java.util.ArrayList;
import java.util.List;

import edu.up.br.so.Entities.Sistema;

public class Usuario {
	private int id;
	private String Nome;
	private String Cpf;
	private String Email;
	private String Senha;
	public List<Sistema> sistemas;
	public List<Modules> modulos;

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
	

	public Usuario(int id, String nome, String cpf, String email, String senha, List<Sistema> permissoes) {
		this.id = id;
		Nome = nome;
		Cpf = cpf;
		Email = email;
		Senha = senha;
	}
	public Usuario() {
		// TODO Auto-generated constructor stub
	sistemas =new ArrayList<Sistema>();
		 modulos = new ArrayList<Modules>();
		
	}
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", Nome=" + Nome + ", Cpf=" + Cpf + ", Email=" + Email + ", Senha=" + Senha
				+ ", sistemas=" + sistemas + ", modulos=" + modulos + "]";
	}
	

	
	
}
