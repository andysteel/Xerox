package com.gmail.andersoninfonet.managedbeans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import com.gmail.andersoninfonet.dao.Cq8900DAO;
import com.gmail.andersoninfonet.modelo.Limpeza;

@ManagedBean
@SessionScoped
public class Limpeza8900Bean {

	private Limpeza limp = new Limpeza();
	private List<Limpeza> lista = new ArrayList<Limpeza>();
	private Cq8900DAO dao = new Cq8900DAO();
	
	public Limpeza8900Bean(){
		limp = new Limpeza();
		limp.setSituacao("NOVO");
		limp.setModelo("XEROX 8900");
		
		lista = dao.getListaLimpeza();
	}
	
	public boolean testaLimpeza(){
    	if(getListLimpeza().size() <= 5 && getListLimpeza().size() > 0){
    		return true;
    	}else
    		return false;
    }
    
    public void alerta(){
    	FacesContext.getCurrentInstance().addMessage("alerta", new FacesMessage(FacesMessage.SEVERITY_WARN, "Baixa quantidade de Uni. Limpeza em estoque", "Necessario solicitar Uni. Limpeza"));
    }
    
    public boolean testaZero(){
    	if(getListLimpeza().size() == 0){
    		return true;
    	}else
    		return false;
    }
    
    public void alertaZero(){
    	FacesContext.getCurrentInstance().addMessage("alertaz", new FacesMessage(FacesMessage.SEVERITY_FATAL, "Sem Uni. Limpeza em estoque", "Solicitar com urgência Uni. Limpeza"));
    }

	
	public List<Limpeza> getListLimpeza(){
		return dao.getListaLimpeza();
	}
	
	public List<Limpeza> getListLimpezaUso(){
		return dao.getListaLimpezaUso();
	}
	
	public List<Limpeza> getListLimpezaUsado(){
		return dao.getListaLimpezaUsado();
	}
	
	public void adiciona8900(ActionEvent evt) {
    	
		dao.adicionaLimpeza(limp);
		
        lista = dao.getListaLimpeza();
        showMessage("Uni. limpeza "  + limp.getPatrimonio().toUpperCase()  + "\n" + "adicionado com sucesso!");
        
	}
	
	public void remover8900(ActionEvent evt){
    	System.out.println(limp.getPatrimonio() + "bean1");
    	dao.exlcuir(limp.getlId());
    	lista = dao.getListaLimpeza();
    	showMessage("Uni. limpeza " + limp.getPatrimonio().toUpperCase() + "\n" + "excluido com sucesso!");
    	
    	limp = new Limpeza();
    	limp.setSituacao("NOVO");
    	limp.setModelo("XEROX 8900");
    }
	
	public void editar8900(){
     	System.out.println(limp.getPatrimonio() + "bean1");
     	dao.atualizar(limp);
     	lista = dao.getListaLimpeza();
     	showMessage("Uni. limpeza " + limp.getPatrimonio().toUpperCase() + "\n" + "atualizado com sucesso!");
     	
     	limp = new Limpeza();
     	limp.setSituacao("NOVO");
     	limp.setModelo("XEROX 8900");
     }
	
	public void limpar(){
     	limp = new Limpeza();
     	limp.setSituacao("NOVO");
     	limp.setModelo("XEROX 8900");
     }
    
     public void showMessage(String summary){
             FacesContext context = FacesContext.getCurrentInstance();
             context.addMessage(null, new FacesMessage(summary));
     }

	public Limpeza getLimp() {
		return limp;
	}

	public void setLimp(Limpeza limp) {
		this.limp = limp;
	}

	public List<Limpeza> getLista() {
		return lista;
	}

	public void setLista(List<Limpeza> lista) {
		this.lista = lista;
	}

	public Cq8900DAO getDao() {
		return dao;
	}

	public void setDao(Cq8900DAO dao) {
		this.dao = dao;
	}
     
     
     
}
