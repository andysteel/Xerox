package com.gmail.andersoninfonet.modelo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Usuario implements Serializable{

	private Long id;
	private String login;
	private String senha;
	private String permissao;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getPermissao() {
		return permissao;
	}
	public void setPermissao(String permissao) {
		this.permissao = permissao;
	}
	
	
	
}
