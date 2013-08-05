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

import com.gmail.andersoninfonet.dao.Wc7556DAO;
import com.gmail.andersoninfonet.modelo.Toner;


@ManagedBean
@SessionScoped
public class Wc7556Bean {

	private Toner toner = new Toner();
	private List<Toner> listap = new ArrayList<Toner>();
	private List<Toner> listac = new ArrayList<Toner>();
	private List<Toner> listaa = new ArrayList<Toner>();
	private List<Toner> listam = new ArrayList<Toner>();
	private Wc7556DAO dao = new Wc7556DAO();
	
	public Wc7556Bean() throws SQLException, NamingException{
		toner = new Toner();
		toner.setSituacao("NOVO");
		toner.setModelo("XEROX 7556");
		listap = dao.getListaPreto();
		listac = dao.getListaCiano();
		listaa = dao.getListaAmarelo();
		listam = dao.getListaMagenta();
	}
	
	public void adiciona7556(ActionEvent evt) {
    	
		dao.adicionaToner(toner);
		
        listap = dao.getListaPreto();
        listac = dao.getListaCiano();
        listaa = dao.getListaAmarelo();
        listam = dao.getListaMagenta();
        showMessage("Toner "  + toner.getPatrimonio().toUpperCase()  + "\n" + "adicionado com sucesso!");
        
	}
	
	public void remover7556(ActionEvent evt){
    	System.out.println(toner.getPatrimonio() + "bean1");
    	dao.exlcuir(toner.gettId());
    	listap = dao.getListaPreto();
    	listac = dao.getListaCiano();
    	listaa = dao.getListaAmarelo();
    	listam = dao.getListaMagenta();
    	showMessage("Toner " + toner.getPatrimonio().toUpperCase() + "\n" + "excluido com sucesso!");
    	
    	toner = new Toner();
    	toner.setSituacao("NOVO");
    	toner.setModelo("XEROX 7556");
    }
	
	 public void editar7556(){
     	System.out.println(toner.getPatrimonio() + "bean1");
     	dao.atualizar(toner);
     	listap = dao.getListaPreto();
     	listac = dao.getListaCiano();
     	listaa = dao.getListaAmarelo();
     	listam = dao.getListaMagenta();
     	showMessage("Toner " + toner.getPatrimonio().toUpperCase() + "\n" + "atualizado com sucesso!");
     	
     	toner = new Toner();
     	toner.setSituacao("NOVO");
     	toner.setModelo("XEROX 7556");
     }
	 
	 public boolean testaPreto(){
		 if(getList7556Preto().size() <= 3 && getList7556Preto().size() > 0){
			 return true;
		 }else
		 return false;
	 }
	 
	 public boolean testaPretoZero(){
		 if(getList7556Preto().size() == 0){
			 return true;
		 }else
			 return false;
	 }
	 
	 public boolean testaCiano(){
		 if(getList7556Ciano().size() <= 3 && getList7556Ciano().size() > 0){
			 return true;
		 }else
			 return false;
	 }
	 
	 public boolean testaCianoZero(){
		 if(getList7556Ciano().size() == 0){
			 return true;
		 }else
			 return false;
	 }
	 
	 public boolean testaAmarelo(){
		 if(getList7556Amarelo().size() <= 3 && getList7556Amarelo().size() > 0){
			 return true;
		 }else
			 return false;
	 }
	 
	 public boolean testaAmareloZero(){
		 if(getList7556Amarelo().size() == 0){
			 return true;
		 }else
			 return false;
	 }
	 
	 public boolean testaMagenta(){
		 if(getList7556Magenta().size() <= 3 && getList7556Magenta().size() > 0){
			 return true;
		 }else
			 return false;
	 }
	 
	 public boolean testaMagentaZero(){
		 if(getList7556Magenta().size() == 0){
			 return true;
		 }else
			 return false;
	 }
	 
	 public void alertaPreto(){
		 FacesContext.getCurrentInstance().addMessage("preto", new FacesMessage(FacesMessage.SEVERITY_WARN, "Baixa quantidade de Toner preto em estoque", "Necessario solicitar Toner 7556 preto"));
	 }
	 
	 public void alertaPretoZero(){
		 FacesContext.getCurrentInstance().addMessage("preto", new FacesMessage(FacesMessage.SEVERITY_FATAL, "Sem Toner preto em estoque", "Solicitar com Urgência Toner Preto 7556"));
	 }
	 
	 public void alertaCiano(){
		 FacesContext.getCurrentInstance().addMessage("ciano", new FacesMessage(FacesMessage.SEVERITY_WARN, "Baixa quantidade de Toner ciano em estoque", "Necessario solicitar Toner 7556 ciano"));
	 }
	 
	 public void alertaCianoZero(){
		 FacesContext.getCurrentInstance().addMessage("ciano", new FacesMessage(FacesMessage.SEVERITY_FATAL, "Sem Toner ciano em estoque", "Solicitar com Urgência Toner ciano 7556"));
	 }
	 
	 public void alertaAmarelo(){
		 FacesContext.getCurrentInstance().addMessage("amarelo", new FacesMessage(FacesMessage.SEVERITY_WARN, "Baixa quantidade de Toner amarelo em estoque", "Necessario solicitar Toner 7556 amarelo"));
	 }
	 
	 public void alertaAmareloZero(){
		 FacesContext.getCurrentInstance().addMessage("amarelo", new FacesMessage(FacesMessage.SEVERITY_FATAL, "Sem Toner amarelo em estoque", "Solicitar com Urgência Toner amarelo 7556"));
	 }
	 
	 public void alertaMagenta(){
		 FacesContext.getCurrentInstance().addMessage("magenta", new FacesMessage(FacesMessage.SEVERITY_WARN, "Baixa quantidade de Toner magenta em estoque", "Necessario solicitar Toner 7556 magenta"));
	 }
	 
	 public void alertaMagentaZero(){
		 FacesContext.getCurrentInstance().addMessage("magenta", new FacesMessage(FacesMessage.SEVERITY_FATAL, "Sem Toner magenta em estoque", "Solicitar com Urgência Toner magenta 7556"));
	 }
	 
	 public List<Toner> listaTonerNovo(){
		 return dao.getListaTonerNovo();
	 }
	 
	 public List<Toner> listaTonerUso(){
		 return dao.getListaTonerUso();
	 }
	 
	 public List<Toner> listaTonerUsado(){
		 return dao.getListaTonerUsado();
	 }
	
	public List<Toner> getList7556Preto(){
		return dao.getListaPreto();
	}
	
	public List<Toner> getList7556Ciano(){
		return dao.getListaCiano();
	}
	
	public List<Toner> getList7556Amarelo(){
		return dao.getListaAmarelo();
	}
	
	public List<Toner> getList7556Magenta(){
		return dao.getListaMagenta();
	}
	
	public List<Toner> getList7556PretoUso(){
		return dao.getListaUsoPreto();
	}
	
	public List<Toner> getList7556CianoUso(){
		return dao.getListaUsoCiano();
	}
	
	public List<Toner> getList7556AmareloUso(){
		return dao.getListaUsoAmarelo();
	}
	
	public List<Toner> getList7556MagentaUso(){
		return dao.getListaUsoMagenta();
	}
	
	public List<Toner> getList7556PretoUsado(){
		return dao.getListaUsadoPreto();
	}
	
	public List<Toner> getList7556CianoUsado(){
		return dao.getListaUsadoCiano();
	}
	
	public List<Toner> getList7556AmareloUsado(){
		return dao.getListaUsadoAmarelo();
	}
	
	public List<Toner> getList7556MagentaUsado(){
		return dao.getListaUsadoMagenta();
	}
	
	 public void limpar(){
     	toner = new Toner();
     	toner.setSituacao("NOVO");
     	toner.setModelo("XEROX 7556");
     }
    
     public void showMessage(String summary){
             FacesContext context = FacesContext.getCurrentInstance();
             context.addMessage(null, new FacesMessage(summary));
     }

	public Toner getToner() {
		return toner;
	}

	public void setToner(Toner toner) {
		this.toner = toner;
	}

	public List<Toner> getListap() {
		return listap;
	}

	public void setListap(List<Toner> listap) {
		this.listap = listap;
	}

	public List<Toner> getListac() {
		return listac;
	}

	public void setListac(List<Toner> listac) {
		this.listac = listac;
	}

	public List<Toner> getListaa() {
		return listaa;
	}

	public void setListaa(List<Toner> listaa) {
		this.listaa = listaa;
	}

	public List<Toner> getListam() {
		return listam;
	}

	public void setListam(List<Toner> listam) {
		this.listam = listam;
	}

	public Wc7556DAO getDao() {
		return dao;
	}

	public void setDao(Wc7556DAO dao) {
		this.dao = dao;
	}
}
