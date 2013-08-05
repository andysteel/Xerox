package com.gmail.andersoninfonet.managedbeans;

import java.io.Serializable;


import javax.faces.bean.ManagedBean;

import javax.faces.bean.SessionScoped;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;

import com.gmail.andersoninfonet.modelo.Usuario;

@SuppressWarnings("serial")
@ManagedBean
@SessionScoped
public class UsuarioBean implements Serializable{

	private Usuario usuario;

	public UsuarioBean(){
		usuario = new Usuario();
		SecurityContext context = SecurityContextHolder.getContext();
		if(context instanceof SecurityContext){
			Authentication authentication = context.getAuthentication();
			
			if(authentication instanceof Authentication){
				usuario.setLogin(((User)authentication.getPrincipal()).getUsername());
			}
			
		}
	}
	
	public String logado(){
		UsuarioBean ub = new UsuarioBean();
		String usuario = ub.getUsuario().getLogin();
		return usuario;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
}
