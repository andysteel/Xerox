package com.gmail.andersoninfonet.managedbeans;

import java.io.Serializable;


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
import com.gmail.andersoninfonet.modelo.Toner;



@ManagedBean
@SessionScoped
public class Wc4260Bean implements Serializable {

        private static final long serialVersionUID = 1135163075951387945L;
       
       
        private Toner toner = new Toner();
        private List<Toner> lista = new ArrayList<Toner>();
        private Wc4260DAO dao = new Wc4260DAO();
        
        
        public Wc4260Bean() throws SQLException, NamingException{
        	toner = new Toner();
        	toner.setSituacao("NOVO");
        	toner.setModelo("XEROX 4260");
        	lista = dao.getLista();
		}
        
        public boolean testaToner(){
        	if(getLista().size() <= 6 && getLista().size() > 0){
        		return true;
        	}else
        		return false;
        }
        
        public void alerta(){
        	FacesContext.getCurrentInstance().addMessage("alerta", new FacesMessage(FacesMessage.SEVERITY_WARN, "Baixa quantidade de Toner em estoque", "Necessario solicitar Toner 4260"));
        }
        
        public boolean testaZero(){
        	if(getLista().size() == 0){
        		return true;
        	}else
        		return false;
        }
        
        public void alertaZero(){
        	FacesContext.getCurrentInstance().addMessage("alertaz", new FacesMessage(FacesMessage.SEVERITY_FATAL, "Sem Toner em estoque", "Solicitar com urgência Toner 4260"));
        }
     
        public void adiciona(ActionEvent evt) {
        	
        		dao.adicionaToner(toner);
        		
                lista = dao.getLista();
                showMessage("Toner "  + toner.getPatrimonio().toUpperCase()  + "\n" + "adicionado com sucesso!");
                //toner = new Toner();
        }
       
        
        public List<Toner> getListUso(){
        	
        	return dao.getListaUso();
        }
        
        public List<Toner> getListUsado(){
        	return dao.getListaUsado();
        }
        
        public void remover(ActionEvent evt){
        	System.out.println(toner.getPatrimonio() + "bean1");
        	dao.exlcuir(toner.gettId());
        	lista = dao.getLista();
        	showMessage("Toner " + toner.getPatrimonio().toUpperCase() + "\n" + "excluido com sucesso!");
        	
        	toner = new Toner();
        	toner.setSituacao("NOVO");
        	toner.setModelo("XEROX 4260");
        }
        
        public void editar(){
        	System.out.println(toner.getPatrimonio() + "bean1");
        	dao.atualizar(toner);
        	lista = dao.getLista();
        	showMessage("Toner " + toner.getPatrimonio().toUpperCase() + "\n" + "atualizado com sucesso!");
        	
        	toner = new Toner();
        	toner.setSituacao("NOVO");
        	toner.setModelo("XEROX 4260");
        }
        
        public void limpar(){
        	toner = new Toner();
        	toner.setSituacao("NOVO");
        	toner.setModelo("XEROX 4260");
        }
       
        public void showMessage(String summary){
                FacesContext context = FacesContext.getCurrentInstance();
                context.addMessage(null, new FacesMessage(summary));
        }
        
        public List<Toner> listaTodosToner(){
        	return dao.getListaTodosToner();
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
       
       
       
       
}

