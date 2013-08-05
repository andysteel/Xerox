package com.gmail.andersoninfonet.managedbeans;

import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.naming.NamingException;

import com.gmail.andersoninfonet.dao.Wc4260DAO;
import com.gmail.andersoninfonet.modelo.Fotorreceptor;


@ManagedBean
@SessionScoped
public class Foto4260Bean {

	private Fotorreceptor foto = new Fotorreceptor();
	private List<Fotorreceptor> lista = new ArrayList<Fotorreceptor>();
	private Wc4260DAO dao = new Wc4260DAO();
	
	
	public Foto4260Bean() throws SQLException, NamingException{
		foto = new Fotorreceptor();
		foto.setModelo("XEROX 4260");
		foto.setSituacao("NOVO");
		lista = dao.getListaFoto();
	}
	
	public boolean testaFoto(){
    	if(getListFoto4260().size() <= 4 && getListFoto4260().size() > 0){
    		return true;
    	}else
    		return false;
    }
    
    public void alerta(){
    	FacesContext.getCurrentInstance().addMessage("alerta", new FacesMessage(FacesMessage.SEVERITY_WARN, "Baixa quantidade de Foto em estoque", "Necessario solicitar Foto 4260"));
    }
    
    public boolean testaZero(){
    	if(getListFoto4260().size() == 0){
    		return true;
    	}else
    		return false;
    }
    
    public List<Fotorreceptor> listaTodosFoto(){
    	return dao.getListaTodosFoto();
    }
    
    public void alertaZero(){
    	FacesContext.getCurrentInstance().addMessage("alertaz", new FacesMessage(FacesMessage.SEVERITY_FATAL, "Sem Foto em estoque", "Solicitar com urgência Foto 4260"));
    }
	
	public List<Fotorreceptor> getListFoto4260(){
		return dao.getListaFoto();
	}
	
	public List<Fotorreceptor> getListFoto4260Uso(){
		return dao.getListaUsoFoto();
	}
	
	public List<Fotorreceptor> getListFoto4260Usado(){
		return dao.getListaUsadoFoto();
	}
	
	public void adicionaFoto4260(ActionEvent evt){
     	
     	dao.adicionaFotorreceptor(foto);
     	
     	lista = dao.getListaFoto();
     	showMessage("Fotorreceptor "  + foto.getPatrimonio().toUpperCase()  + "\n" + "adicionado com sucesso!");
     }
	
	public void removerFoto4260(ActionEvent evt){
		
		dao.exlcuirFoto(foto.getfId());
		lista = dao.getListaFoto();
		showMessage("Fotorreceptor "  + foto.getPatrimonio().toUpperCase()  + "\n" + "excluido com sucesso!");
		
		foto = new Fotorreceptor();
		foto.setModelo("XEROX 4260");
		foto.setSituacao("NOVO");
	}
	
	public void editarFoto4260(){
		
		dao.atualizarFoto(foto);
		lista = dao.getListaFoto();
		showMessage("Fotorreceptor "  + foto.getPatrimonio().toUpperCase()  + "\n" + "atualizado com sucesso!");
		
		foto = new Fotorreceptor();
		foto.setModelo("XEROX 4260");
		foto.setSituacao("NOVO");
	}
	
	public void limpar(){
		foto = new Fotorreceptor();
		foto.setModelo("XEROX 4260");
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

	public Wc4260DAO getDao() {
		return dao;
	}

	public void setDao(Wc4260DAO dao) {
		this.dao = dao;
	}

	
}
