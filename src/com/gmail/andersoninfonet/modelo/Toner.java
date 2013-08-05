package com.gmail.andersoninfonet.modelo;

public class Toner {

	private long tId;
	private String patrimonio;
	private String serie;
	private String situacao;
	private String cor;
	//private Long id;
	private String modelo;
	
	public Toner(long tId, String patrimonio, String serie, String situacao, String cor){
		this.tId = tId;
		this.patrimonio = patrimonio;
		this.serie = serie;
		this.situacao = situacao;
		this.cor = cor;
		
	}
	
	public Toner( String patrimonio, String serie, String situacao, String cor){

		this.patrimonio = patrimonio;
		this.serie = serie;
		this.situacao = situacao;
		this.cor = cor;
		
	}
	
	@Override
	public String toString() {
		return "Toner [id=" + tId + ", patrimonio=" + patrimonio + ", serie=" + serie + ", situacao="
				+ situacao + ", cor=" + cor + "]";
	}
	
	public Toner(){
		
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public long gettId() {
		return tId;
	}
	public void settId(long tId) {
		this.tId = tId;
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
	/*public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}*/
	
}
