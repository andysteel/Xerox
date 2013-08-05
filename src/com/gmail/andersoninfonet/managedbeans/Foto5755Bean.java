package com.gmail.andersoninfonet.managedbeans;

import java.util.ArrayList;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import com.gmail.andersoninfonet.dao.Wc5755DAO;
import com.gmail.andersoninfonet.modelo.Fotorreceptor;


@ManagedBean
@SessionScoped
public class Foto5755Bean {

	private Fotorreceptor foto = new Fotorreceptor();
	private Wc5755DAO dao = new Wc5755DAO();
	private List<Fotorreceptor> lista = new ArrayList<Fotorreceptor>();
	
	
	public Foto5755Bean(){
		foto = new Fotorreceptor();
		foto.setModelo("XEROX 5755");
		foto.setSituacao("NOVO");
		lista = dao.getListaFoto();
	}
	
	public boolean testaFoto(){
    	if(getListFoto5755().size() <= 2 && getListFoto5755().size() > 0){
    		return true;
    	}else
    		return false;
    }
    
    public void alerta(){
    	FacesContext.getCurrentInstance().addMessage("alerta", new FacesMessage(FacesMessage.SEVERITY_WARN, "Baixa quantidade de Foto em estoque", "Necessario solicitar Foto 5755"));
    }
    
    public boolean testaZero(){
    	if(getListFoto5755().size() == 0){
    		return true;
    	}else
    		return false;
    }
    
    public void alertaZero(){
    	FacesContext.getCurrentInstance().addMessage("alertaz", new FacesMessage(FacesMessage.SEVERITY_FATAL, "Sem Foto em estoque", "Solicitar com urgência Foto 5755"));
    }
	
	public List<Fotorreceptor> getListFoto5755(){
		return dao.getListaFoto();
	}
	
	public List<Fotorreceptor> getListFoto5755Uso(){
		return dao.getListaFotoUso();
	}
	
	public List<Fotorreceptor> getListFoto5755Usado(){
		return dao.getListaFotoUsado();
	}
	
	public void adicionaFoto5755(ActionEvent evt){
		
		dao.adicionaFotorreceptor(foto);
		lista = dao.getListaFoto();
		showMessage("Fotorreceptor "  + foto.getPatrimonio().toUpperCase()  + "\n" + "adicionado com sucesso!");
		
	}
	
	public void removerFoto5755(ActionEvent evt){
		dao.exlcuirFoto(foto.getfId());
		lista = dao.getListaFoto();
		showMessage("Fotorreceptor "  + foto.getPatrimonio().toUpperCase()  + "\n" + "excluido com sucesso!");
		
		foto = new Fotorreceptor();
		foto.setModelo("XEROX 5755");
		foto.setSituacao("NOVO");
	}
	
	public void editarFoto5755(){
		dao.atualizarFoto(foto);
		lista = dao.getListaFoto();
		showMessage("Fotorreceptor "  + foto.getPatrimonio().toUpperCase()  + "\n" + "atualizado com sucesso!");
		
		foto = new Fotorreceptor();
		foto.setModelo("XEROX 5755");
		foto.setSituacao("NOVO");
	}
	
	public void limpar(){
		foto = new Fotorreceptor();
		foto.setModelo("XEROX 5755");
		foto.setSituacao("NOVO");
	}
	
	public void showMessage(String summary){
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(summary));
    }

	public Fotorreceptor getFoto() {
		return foto;
	}

	public void setFoto(Fotorreceptor foto) {
		this.foto = foto;
	}

	public List<Fotorreceptor> getLista() {
		return lista;
	}

	public void setLista(List<Fotorreceptor> lista) {
		this.lista = lista;
	}

	public Wc5755DAO getDao() {
		return dao;
	}

	public void setDao(Wc5755DAO dao) {
		this.dao = dao;
	}
	
	
}
