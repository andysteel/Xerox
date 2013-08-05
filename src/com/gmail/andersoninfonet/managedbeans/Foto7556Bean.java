package com.gmail.andersoninfonet.managedbeans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import com.gmail.andersoninfonet.dao.Wc7556DAO;
import com.gmail.andersoninfonet.modelo.Fotorreceptor;


@ManagedBean
@SessionScoped
public class Foto7556Bean {
	
	private Fotorreceptor foto = new Fotorreceptor();
	private List<Fotorreceptor> listap = new ArrayList<Fotorreceptor>();
	private List<Fotorreceptor> listac = new ArrayList<Fotorreceptor>();
	private List<Fotorreceptor> listaa = new ArrayList<Fotorreceptor>();
	private List<Fotorreceptor> listam = new ArrayList<Fotorreceptor>();
	private Wc7556DAO dao = new Wc7556DAO();
	
	public Foto7556Bean(){
		foto = new Fotorreceptor();
		foto.setSituacao("NOVO");
		foto.setModelo("XEROX 7556");
		listap = dao.getListaFotoPreto();
		listac = dao.getListaFotoCiano();
		listaa = dao.getListaFotoAmarelo();
		listam = dao.getListaFotoMagenta();
	}
	
	public boolean testaPreto(){
		 if(getListFoto7556Preto().size() <= 3 && getListFoto7556Preto().size() > 0){
			 return true;
		 }else
		 return false;
	 }
	 
	 public boolean testaPretoZero(){
		 if(getListFoto7556Preto().size() == 0){
			 return true;
		 }else
			 return false;
	 }
	 
	 public boolean testaCiano(){
		 if(getListFoto7556Ciano().size() <= 3 && getListFoto7556Ciano().size() > 0){
			 return true;
		 }else
			 return false;
	 }
	 
	 public boolean testaCianoZero(){
		 if(getListFoto7556Ciano().size() == 0){
			 return true;
		 }else
			 return false;
	 }
	 
	 public boolean testaAmarelo(){
		 if(getListFoto7556Amarelo().size() <= 3 && getListFoto7556Amarelo().size() > 0){
			 return true;
		 }else
			 return false;
	 }
	 
	 public boolean testaAmareloZero(){
		 if(getListFoto7556Amarelo().size() == 0){
			 return true;
		 }else
			 return false;
	 }
	 
	 public boolean testaMagenta(){
		 if(getListFoto7556Magenta().size() <= 3 && getListFoto7556Magenta().size() > 0){
			 return true;
		 }else
			 return false;
	 }
	 
	 public boolean testaMagentaZero(){
		 if(getListFoto7556Magenta().size() == 0){
			 return true;
		 }else
			 return false;
	 }
	 
	 public void alertaPreto(){
		 FacesContext.getCurrentInstance().addMessage("preto", new FacesMessage(FacesMessage.SEVERITY_WARN, "Baixa quantidade de Foto preto em estoque", "Necessario solicitar Foto 7556 preto"));
	 }
	 
	 public void alertaPretoZero(){
		 FacesContext.getCurrentInstance().addMessage("preto", new FacesMessage(FacesMessage.SEVERITY_FATAL, "Sem Foto preto em estoque", "Solicitar com Urgência Foto Preto 7556"));
	 }
	 
	 public void alertaCiano(){
		 FacesContext.getCurrentInstance().addMessage("ciano", new FacesMessage(FacesMessage.SEVERITY_WARN, "Baixa quantidade de Foto ciano em estoque", "Necessario solicitar Foto 7556 ciano"));
	 }
	 
	 public void alertaCianoZero(){
		 FacesContext.getCurrentInstance().addMessage("ciano", new FacesMessage(FacesMessage.SEVERITY_FATAL, "Sem Foto ciano em estoque", "Solicitar com Urgência Foto ciano 7556"));
	 }
	 
	 public void alertaAmarelo(){
		 FacesContext.getCurrentInstance().addMessage("amarelo", new FacesMessage(FacesMessage.SEVERITY_WARN, "Baixa quantidade de Foto amarelo em estoque", "Necessario solicitar Foto 7556 amarelo"));
	 }
	 
	 public void alertaAmareloZero(){
		 FacesContext.getCurrentInstance().addMessage("amarelo", new FacesMessage(FacesMessage.SEVERITY_FATAL, "Sem Foto amarelo em estoque", "Solicitar com Urgência Foto amarelo 7556"));
	 }
	 
	 public void alertaMagenta(){
		 FacesContext.getCurrentInstance().addMessage("magenta", new FacesMessage(FacesMessage.SEVERITY_WARN, "Baixa quantidade de Foto magenta em estoque", "Necessario solicitar Foto 7556 magenta"));
	 }
	 
	 public void alertaMagentaZero(){
		 FacesContext.getCurrentInstance().addMessage("magenta", new FacesMessage(FacesMessage.SEVERITY_FATAL, "Sem Foto magenta em estoque", "Solicitar com Urgência Foto magenta 7556"));
	 }
	 
	 public List<Fotorreceptor> listaFotoNovo(){
		 return dao.getListaFotoNovo();
	 }
	 
	 public List<Fotorreceptor> listaFotoUso(){
		 return dao.getListaFotoUso();
	 }
	 
	 public List<Fotorreceptor> listaFotoUsado(){
		 return dao.getListaFotoUsado();
	 }
	
	public List<Fotorreceptor> getListFoto7556Preto(){
		return dao.getListaFotoPreto();
	}
	
	public List<Fotorreceptor> getListFoto7556Ciano(){
		return dao.getListaFotoCiano();
	}
	
	public List<Fotorreceptor> getListFoto7556Amarelo(){
		return dao.getListaFotoAmarelo();
	}
	
	public List<Fotorreceptor> getListFoto7556Magenta(){
		return dao.getListaFotoMagenta();
	}
	
	public List<Fotorreceptor> getListFoto7556UsoPreto(){
		return dao.getListaFotoUsoPreto();
	}
	
	public List<Fotorreceptor> getListFoto7556UsoCiano(){
		return dao.getListaFotoUsoCiano();
	}
	
	public List<Fotorreceptor> getListFoto7556UsoAmarelo(){
		return dao.getListaFotoUsoAmarelo();
	}
	
	public List<Fotorreceptor> getListFoto7556UsoMagenta(){
		return dao.getListaFotoUsoMagenta();
	}
	
	public List<Fotorreceptor> getListFoto7556UsadoPreto(){
		return dao.getListaFotoUsadoPreto();
	}
	
	public List<Fotorreceptor> getListFoto7556UsadoCiano(){
		return dao.getListaFotoUsadoCiano();
	}
	
	public List<Fotorreceptor> getListFoto7556UsadoAmarelo(){
		return dao.getListaFotoUsadoAmarelo();
	}
	
	public List<Fotorreceptor> getListFoto7556UsadoMagenta(){
		return dao.getListaFotoUsadoMagenta();
	}
	
	public void showMessage(String summary){
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(summary));
    }
	
	public void limpar(){
		foto = new Fotorreceptor();
		foto.setModelo("XEROX 7556");
		foto.setSituacao("NOVO");
	}
	
	public void adicionaFoto7556(ActionEvent evt){
		
		dao.adicionaFotorreceptor(foto);
		listap = dao.getListaFotoPreto();
		listac = dao.getListaFotoCiano();
		listaa = dao.getListaFotoAmarelo();
		listam = dao.getListaFotoMagenta();
		showMessage("Fotorreceptor "  + foto.getPatrimonio().toUpperCase()  + "\n" + "adicionado com sucesso!");
		
	}
	
	public void removerFoto7556(ActionEvent evt){
		dao.exlcuirFoto(foto.getfId());
		listap = dao.getListaFotoPreto();
		listac = dao.getListaFotoCiano();
		listaa = dao.getListaFotoAmarelo();
		listam = dao.getListaFotoMagenta();
		showMessage("Fotorreceptor "  + foto.getPatrimonio().toUpperCase()  + "\n" + "excluido com sucesso!");
		
		foto = new Fotorreceptor();
		foto.setModelo("XEROX 7556");
		foto.setSituacao("NOVO");
	}
	
	public void editarFoto7556(){
		dao.atualizarFoto(foto);
		listap = dao.getListaFotoPreto();
		listac = dao.getListaFotoCiano();
		listaa = dao.getListaFotoAmarelo();
		listam = dao.getListaFotoMagenta();
		showMessage("Fotorreceptor "  + foto.getPatrimonio().toUpperCase()  + "\n" + "atualizado com sucesso!");
		
		foto = new Fotorreceptor();
		foto.setModelo("XEROX 7556");
		foto.setSituacao("NOVO");
	}

	public Fotorreceptor getFoto() {
		return foto;
	}

	public void setFoto(Fotorreceptor foto) {
		this.foto = foto;
	}

	public List<Fotorreceptor> getListap() {
		return listap;
	}

	public void setListap(List<Fotorreceptor> listap) {
		this.listap = listap;
	}

	public List<Fotorreceptor> getListac() {
		return listac;
	}

	public void setListac(List<Fotorreceptor> listac) {
		this.listac = listac;
	}

	public List<Fotorreceptor> getListaa() {
		return listaa;
	}

	public void setListaa(List<Fotorreceptor> listaa) {
		this.listaa = listaa;
	}

	public List<Fotorreceptor> getListam() {
		return listam;
	}

	public void setListam(List<Fotorreceptor> listam) {
		this.listam = listam;
	}

	public Wc7556DAO getDao() {
		return dao;
	}

	public void setDao(Wc7556DAO dao) {
		this.dao = dao;
	}
}
