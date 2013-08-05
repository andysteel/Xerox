package com.gmail.andersoninfonet.modelo;

public class Fotorreceptor {

	private long fId;
	private String modelo;
	private String patrimonio;
	private String serie;
	private String situacao;
	private String cor;
	
	public Fotorreceptor(long fId, String modelo, String patrimonio, String serie, String situacao, String cor){
		this.fId = fId;
		this.modelo = modelo;
		this.patrimonio = patrimonio;
		this.serie = serie;
		this.situacao = situacao;
		this.cor = cor;
	}
	
	public Fotorreceptor(String modelo, String patrimonio, String serie, String situacao, String cor){
		this.modelo = modelo;
		this.patrimonio = patrimonio;
		this.serie = serie;
		this.situacao = situacao;
		this.cor = cor;
	}
	
	@Override
	public String toString() {
		return "Fotorreceptor [id=" + fId + ", modelo=" + modelo + ", patrimonio=" + patrimonio + ", serie=" 
								+ serie + ", situacao=" + situacao + ", cor=" + cor + "]";
	}
	
	public Fotorreceptor(){
		
	}
	
	public long getfId() {
		return fId;
	}
	public void setfId(long fId) {
		this.fId = fId;
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
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
}
