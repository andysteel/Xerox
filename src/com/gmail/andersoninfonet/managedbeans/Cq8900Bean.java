package com.gmail.andersoninfonet.managedbeans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.gmail.andersoninfonet.dao.Cq8900DAO;
import com.gmail.andersoninfonet.modelo.Cera;


@ManagedBean
@SessionScoped
public class Cq8900Bean {

	private Cera cera = new Cera();
	private List<Cera> lista = new ArrayList<Cera>();
	private Cq8900DAO dao = new Cq8900DAO();
	
	public Cq8900Bean(){
		cera = new Cera();
		
		lista = dao.getListaCera();
	}
	
	public void alerta(){
		 FacesContext.getCurrentInstance().addMessage("quant", new FacesMessage(FacesMessage.SEVERITY_WARN, "Baixa quantidade de Cera em estoque", "Necessario solicitar Cera"));
	}
	
	public void alertaZero(){
		 FacesContext.getCurrentInstance().addMessage("quant", new FacesMessage(FacesMessage.SEVERITY_FATAL, "Sem Cera em estoque", "Solicitar com urgência"));
	}
	
	public List<Cera> getListCera(){
		return dao.getListaCera();
	}
	
	public void editar8900(){
		dao.atualizarCera(cera);
		lista = dao.getListaCera();
		
		showMessage("Cera " + cera.getCor().toUpperCase() + "\n" + "atualizado com sucesso!");
		cera = new Cera();
	}
	
	 public void showMessage(String summary){
         FacesContext context = FacesContext.getCurrentInstance();
         context.addMessage(null, new FacesMessage(summary));
	 }
	 
	 public void limpar(){
	     	cera = new Cera();
	 }

	public Cera getCera() {
		return cera;
	}

	public void setCera(Cera cera) {
		this.cera = cera;
	}

	public List<Cera> getLista() {
		return lista;
	}

	public void setLista(List<Cera> lista) {
		this.lista = lista;
	}

	public Cq8900DAO getDao() {
		return dao;
	}

	public void setDao(Cq8900DAO dao) {
		this.dao = dao;
	}
	 
	 
	 
}
