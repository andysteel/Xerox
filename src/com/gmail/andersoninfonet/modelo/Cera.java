package com.gmail.andersoninfonet.modelo;

public class Cera {

	private long cId;
	private String modelo;
	private String cor;
	private long quantidade;
	
	public Cera(long cId, String modelo, String cor, long quantidade){
		this.cId = cId;
		this.modelo = modelo;
		this.cor = cor;
		this.quantidade = quantidade;
	}
	
	public Cera(String modelo, String cor, long quantidade){
		this.modelo = modelo;
		this.cor = cor;
		this.quantidade = quantidade;
	}
	
	@Override
	public String toString() {
		return "Cera [id=" + cId + ", modelo=" + modelo + ", cor=" + cor + ", quantidade=" + quantidade +"]";
	}
	
	public Cera(){
		
	}
	
	public long getcId() {
		return cId;
	}
	public void setcId(long cId) {
		this.cId = cId;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public long getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(long quantidade) {
		this.quantidade = quantidade;
	}
	
	
}
