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

import com.gmail.andersoninfonet.dao.Wc6015DAO;
import com.gmail.andersoninfonet.modelo.Toner;


@ManagedBean
@SessionScoped
public class Wc6015Bean {

	private Toner toner = new Toner();
	private List<Toner> listap = new ArrayList<Toner>();
	private List<Toner> listac = new ArrayList<Toner>();
	private List<Toner> listaa = new ArrayList<Toner>();
	private List<Toner> listam = new ArrayList<Toner>();
	private Wc6015DAO dao = new Wc6015DAO();
	private String[] teste = {"dataTable1","dataTable2"};
	
	public Wc6015Bean() throws SQLException, NamingException{
		toner = new Toner();
		toner.setSituacao("NOVO");
		toner.setModelo("XEROX 6015");
		listap = dao.getListaPreto();
		listac = dao.getListaCiano();
		listaa = dao.getListaAmarelo();
		listam = dao.getListaMagenta();
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
	
	public void adiciona6015(ActionEvent evt) {
    	
		dao.adicionaToner(toner);
		
        listap = dao.getListaPreto();
        listac = dao.getListaCiano();
        listaa = dao.getListaAmarelo();
        listam = dao.getListaMagenta();
        showMessage("Toner "  + toner.getPatrimonio().toUpperCase()  + "\n" + "adicionado com sucesso!");
        
	}
	
	public void remover6015(ActionEvent evt){
    	System.out.println(toner.getPatrimonio() + "bean1");
    	dao.exlcuir(toner.gettId());
    	listap = dao.getListaPreto();
    	listac = dao.getListaCiano();
    	listaa = dao.getListaAmarelo();
    	listam = dao.getListaMagenta();
    	showMessage("Toner " + toner.getPatrimonio().toUpperCase() + "\n" + "excluido com sucesso!");
    	
    	toner = new Toner();
    	toner.setSituacao("NOVO");
    	toner.setModelo("XEROX 6015");
    }
	
	 public void editar6015(){
     	System.out.println(toner.getPatrimonio() + "bean1");
     	dao.atualizar(toner);
     	listap = dao.getListaPreto();
     	listac = dao.getListaCiano();
     	listaa = dao.getListaAmarelo();
     	listam = dao.getListaMagenta();
     	showMessage("Toner " + toner.getPatrimonio().toUpperCase() + "\n" + "atualizado com sucesso!");
     	
     	toner = new Toner();
     	toner.setSituacao("NOVO");
     	toner.setModelo("XEROX 6015");
     }
	 
	 public boolean testaPreto(){
		 if(getList6015Preto().size() <= 3 && getList6015Preto().size() > 0){
			 return true;
		 }else
		 return false;
	 }
	 
	 public boolean testaPretoZero(){
		 if(getList6015Preto().size() == 0){
			 return true;
		 }else
			 return false;
	 }
	 
	 public boolean testaCiano(){
		 if(getList6015Ciano().size() <= 3 && getList6015Ciano().size() > 0){
			 return true;
		 }else
			 return false;
	 }
	 
	 public boolean testaCianoZero(){
		 if(getList6015Ciano().size() == 0){
			 return true;
		 }else
			 return false;
	 }
	 
	 public boolean testaAmarelo(){
		 if(getList6015Amarelo().size() <= 3 && getList6015Amarelo().size() > 0){
			 return true;
		 }else
			 return false;
	 }
	 
	 public boolean testaAmareloZero(){
		 if(getList6015Amarelo().size() == 0){
			 return true;
		 }else
			 return false;
	 }
	 
	 public boolean testaMagenta(){
		 if(getList6015Magenta().size() <= 3 && getList6015Magenta().size() > 0){
			 return true;
		 }else
			 return false;
	 }
	 
	 public boolean testaMagentaZero(){
		 if(getList6015Magenta().size() == 0){
			 return true;
		 }else
			 return false;
	 }
	 
	 public void alertaPreto(){
		 FacesContext.getCurrentInstance().addMessage("preto", new FacesMessage(FacesMessage.SEVERITY_WARN, "Baixa quantidade de Toner preto em estoque", "Necessario solicitar Toner 6015 preto"));
	 }
	 
	 public void alertaPretoZero(){
		 FacesContext.getCurrentInstance().addMessage("preto", new FacesMessage(FacesMessage.SEVERITY_FATAL, "Sem Toner preto em estoque", "Solicitar com Urgência Toner Preto 6015"));
	 }
	 
	 public void alertaCiano(){
		 FacesContext.getCurrentInstance().addMessage("ciano", new FacesMessage(FacesMessage.SEVERITY_WARN, "Baixa quantidade de Toner ciano em estoque", "Necessario solicitar Toner 6015 ciano"));
	 }
	 
	 public void alertaCianoZero(){
		 FacesContext.getCurrentInstance().addMessage("ciano", new FacesMessage(FacesMessage.SEVERITY_FATAL, "Sem Toner ciano em estoque", "Solicitar com Urgência Toner ciano 6015"));
	 }
	 
	 public void alertaAmarelo(){
		 FacesContext.getCurrentInstance().addMessage("amarelo", new FacesMessage(FacesMessage.SEVERITY_WARN, "Baixa quantidade de Toner amarelo em estoque", "Necessario solicitar Toner 6015 amarelo"));
	 }
	 
	 public void alertaAmareloZero(){
		 FacesContext.getCurrentInstance().addMessage("amarelo", new FacesMessage(FacesMessage.SEVERITY_FATAL, "Sem Toner amarelo em estoque", "Solicitar com Urgência Toner amarelo 6015"));
	 }
	 
	 public void alertaMagenta(){
		 FacesContext.getCurrentInstance().addMessage("magenta", new FacesMessage(FacesMessage.SEVERITY_WARN, "Baixa quantidade de Toner magenta em estoque", "Necessario solicitar Toner 6015 magenta"));
	 }
	 
	 public void alertaMagentaZero(){
		 FacesContext.getCurrentInstance().addMessage("magenta", new FacesMessage(FacesMessage.SEVERITY_FATAL, "Sem Toner magenta em estoque", "Solicitar com Urgência Toner magenta 6015"));
	 }
	
	public List<Toner> getList6015Preto(){
		return dao.getListaPreto();
	}
	
	public List<Toner> getList6015Ciano(){
		return dao.getListaCiano();
	}
	
	public List<Toner> getList6015Amarelo(){
		return dao.getListaAmarelo();
	}
	
	public List<Toner> getList6015Magenta(){
		return dao.getListaMagenta();
	}
	
	public List<Toner> getList6015PretoUso(){
		return dao.getListaUsoPreto();
	}
	
	public List<Toner> getList6015CianoUso(){
		return dao.getListaUsoCiano();
	}
	
	public List<Toner> getList6015AmareloUso(){
		return dao.getListaUsoAmarelo();
	}
	
	public List<Toner> getList6015MagentaUso(){
		return dao.getListaUsoMagenta();
	}
	
	public List<Toner> getList6015PretoUsado(){
		return dao.getListaUsadoPreto();
	}
	
	public List<Toner> getList6015CianoUsado(){
		return dao.getListaUsadoCiano();
	}
	
	public List<Toner> getList6015AmareloUsado(){
		return dao.getListaUsadoAmarelo();
	}
	
	public List<Toner> getList6015MagentaUsado(){
		return dao.getListaUsadoMagenta();
	}
	
	 public void limpar(){
     	toner = new Toner();
     	toner.setSituacao("NOVO");
     	toner.setModelo("XEROX 6015");
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

	public Wc6015DAO getDao() {
		return dao;
	}

	public void setDao(Wc6015DAO dao) {
		this.dao = dao;
	}

	public String[] getTeste() {
		return teste;
	}

	public void setTeste(String[] teste) {
		this.teste = teste;
	}
	
}
