package com.gmail.andersoninfonet.modelo;

public class Limpeza {

	private long lId;
	private String modelo;
	private String patrimonio;
	private String serie;
	private String situacao;
	
	public Limpeza(long lId, String patrimonio, String serie, String situacao){
		this.lId = lId;
		this.patrimonio = patrimonio;
		this.serie = serie;
		this.situacao = situacao;
		
	}
	
	public Limpeza( String patrimonio, String serie, String situacao){

		this.patrimonio = patrimonio;
		this.serie = serie;
		this.situacao = situacao;
		
	}
	
	@Override
	public String toString() {
		return "Limpeza [id=" + lId + ", patrimonio=" + patrimonio + ", serie=" + serie + ", situacao="
				+ situacao + "]";
	}
	
	public Limpeza(){
		
	}
	
	public long getlId() {
		return lId;
	}
	public void setlId(long lId) {
		this.lId = lId;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPatrimonio() {
		return patrimonio;
	}
	public void setPatrimonio(String patrimonio) {
		this.patrimonio = patrimonio;
	}
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	
	
}
