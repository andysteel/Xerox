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

import com.gmail.andersoninfonet.dao.Wc5755DAO;
import com.gmail.andersoninfonet.modelo.Toner;


@ManagedBean
@SessionScoped
public class Wc5755Bean {

	 private Toner toner = new Toner();
     private List<Toner> lista = new ArrayList<Toner>();
     private Wc5755DAO dao = new Wc5755DAO();
     
     public Wc5755Bean() throws SQLException, NamingException{
    	 toner = new Toner();
    	 toner.setSituacao("NOVO");
    	 toner.setModelo("XEROX 5755");
    	 lista = dao.getLista5755();
     }
     
     public boolean testaToner(){
     	if(getList5755().size() <= 3 && getList5755().size() > 0){
     		return true;
     	}else
     		return false;
     }
     
     public void alerta(){
     	FacesContext.getCurrentInstance().addMessage("alerta", new FacesMessage(FacesMessage.SEVERITY_WARN, "Baixa quantidade de Toner em estoque", "Necessario solicitar Toner 5755"));
     }
     
     public boolean testaZero(){
     	if(getList5755().size() == 0){
     		return true;
     	}else
     		return false;
     }
     
     public void alertaZero(){
     	FacesContext.getCurrentInstance().addMessage("alertaz", new FacesMessage(FacesMessage.SEVERITY_FATAL, "Sem Toner em estoque", "Solicitar com urgência Toner 5755"));
     }
     
     public List<Toner> getList5755(){
         
     	return dao.getLista5755();
     }
     
     public List<Toner> getList5755Uso(){
    	 return dao.getLista5755Uso();
     }
     
     public List<Toner> getList5755Usado(){
    	 return dao.getLista5755Usado();
     }
     
     public void adiciona5755(ActionEvent evt){
     	
     	dao.adiciona5755(toner);
     	
     	lista = dao.getLista5755();
     	showMessage("Toner "  + toner.getPatrimonio().toUpperCase()  + "\n" + "adicionado com sucesso!");
     }
     
     public void remover5755(ActionEvent evt){
     	System.out.println(toner.getPatrimonio() + "bean1");
     	dao.exlcui5755(toner.gettId());
     	lista = dao.getLista5755();
     	showMessage("Toner " + toner.getPatrimonio().toUpperCase() + "\n" + "excluido com sucesso!");
     	
     	toner = new Toner();
     	toner.setSituacao("NOVO");
     	toner.setModelo("XEROX 5755");
     }
     
     public void editar5755(){
     	System.out.println(toner.getPatrimonio() + "bean1");
     	dao.atualiza5755(toner);
     	lista = dao.getLista5755();
     	showMessage("Toner " + toner.getPatrimonio().toUpperCase() + "\n" + "atualizado com sucesso!");
     	
     	toner = new Toner();
     	toner.setSituacao("NOVO");
     	toner.setModelo("XEROX 5755");
     }
     
     public void limpar(){
     	toner = new Toner();
     	toner.setSituacao("NOVO");
     	toner.setModelo("XEROX 5755");
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
	public List<Toner> getLista() {
		return lista;
	}
	public void setLista(List<Toner> lista) {
		this.lista = lista;
	}
	public Wc5755DAO getDao() {
		return dao;
	}
	public void setDao(Wc5755DAO dao) {
		this.dao = dao;
	}
     
     
     
}
