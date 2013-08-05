package com.gmail.andersoninfonet.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.NamingException;

import com.gmail.andersoninfonet.conexao.ConnectionFactory;
import com.gmail.andersoninfonet.modelo.Toner;

public class Wc6015DAO {

	private Connection con;
	private Statement stm;

	
	public void conectar(){
		try {
			con = new ConnectionFactory().getConnection();
			stm = con.createStatement();
			System.out.println("conectado");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (NamingException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void fechar(){
		try {
			stm.close();
			con.close();
			System.out.println("desconectado");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}
	
	public List<Toner>  getListaTonerNovo(){
		conectar();
		
		try {
			ResultSet result = stm.executeQuery("select t_id, modelo, patrimonio, serie, cor, situacao" + " from toner where modelo='XEROX 6015' and situacao='NOVO'");
			
			List<Toner> lista = new ArrayList<Toner>();
			
			while(result.next()){
				Toner temp = new Toner();
				
				temp.settId(result.getLong("t_id"));
				temp.setModelo(result.getString("modelo"));
				temp.setPatrimonio(result.getString("patrimonio"));
				temp.setSerie(result.getString("serie"));
				temp.setCor(result.getString("cor"));
				temp.setSituacao(result.getString("situacao"));
				
				lista.add(temp);
			}
			
			result.close();
			
			return lista;
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally{
			fechar();
		}
	}
	
	
	public List<Toner>  getListaTonerUso(){
		conectar();
		
		try {
			ResultSet result = stm.executeQuery("select t_id, modelo, patrimonio, serie, cor, situacao" + " from toner where modelo='XEROX 6015' and situacao='EM USO'");
			
			List<Toner> lista = new ArrayList<Toner>();
			
			while(result.next()){
				Toner temp = new Toner();
				
				temp.settId(result.getLong("t_id"));
				temp.setModelo(result.getString("modelo"));
				temp.setPatrimonio(result.getString("patrimonio"));
				temp.setSerie(result.getString("serie"));
				temp.setCor(result.getString("cor"));
				temp.setSituacao(result.getString("situacao"));
				
				lista.add(temp);
			}
			
			result.close();
			
			return lista;
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally{
			fechar();
		}
	}
	
	
	public List<Toner>  getListaTonerUsado(){
		conectar();
		
		try {
			ResultSet result = stm.executeQuery("select t_id, modelo, patrimonio, serie, cor, situacao" + " from toner where modelo='XEROX 6015' and situacao='USADO'");
			
			List<Toner> lista = new ArrayList<Toner>();
			
			while(result.next()){
				Toner temp = new Toner();
				
				temp.settId(result.getLong("t_id"));
				temp.setModelo(result.getString("modelo"));
				temp.setPatrimonio(result.getString("patrimonio"));
				temp.setSerie(result.getString("serie"));
				temp.setCor(result.getString("cor"));
				temp.setSituacao(result.getString("situacao"));
				
				lista.add(temp);
			}
			
			result.close();
			
			return lista;
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally{
			fechar();
		}
	}
	
	public List<Toner> getListaPreto(){
		conectar();
		try{
		
		ResultSet result = stm.executeQuery("select toner.t_id, toner.modelo, toner.patrimonio, toner.serie, toner.cor, toner.situacao " + " from toner where toner.situacao='NOVO'and toner.modelo='XEROX 6015' and toner.cor='PRETO'");
		
		List<Toner> lista = new ArrayList<Toner>();
		
			while(result.next()){
				Toner temp = new Toner();
				
				temp.settId(result.getLong("t_id"));
				temp.setModelo(result.getString("modelo"));
				temp.setPatrimonio(result.getString("patrimonio"));
				temp.setSerie(result.getString("serie"));
				temp.setCor(result.getString("cor"));
				temp.setSituacao(result.getString("situacao"));
			
				lista.add(temp);
			}
		
		result.close();
		
		return lista;
		
		}catch(SQLException e){
			throw new RuntimeException(e);
		}finally{
			fechar();
		}
	}
	
	public List<Toner> getListaCiano(){
		conectar();
		try{
		
		ResultSet result = stm.executeQuery("select toner.t_id, toner.modelo, toner.patrimonio, toner.serie, toner.cor, toner.situacao " + " from toner where toner.situacao='NOVO'and toner.modelo='XEROX 6015' and toner.cor='CIANO'");
		
		List<Toner> lista = new ArrayList<Toner>();
		
			while(result.next()){
				Toner temp = new Toner();
				
				temp.settId(result.getLong("t_id"));
				temp.setModelo(result.getString("modelo"));
				temp.setPatrimonio(result.getString("patrimonio"));
				temp.setSerie(result.getString("serie"));
				temp.setCor(result.getString("cor"));
				temp.setSituacao(result.getString("situacao"));
			
				lista.add(temp);
			}
		
		result.close();
		
		return lista;
		
		}catch(SQLException e){
			throw new RuntimeException(e);
		}finally{
			fechar();
		}
	}
	
	public List<Toner> getListaAmarelo(){
		conectar();
		try{
		
		ResultSet result = stm.executeQuery("select toner.t_id, toner.modelo, toner.patrimonio, toner.serie, toner.cor, toner.situacao " + " from toner where toner.situacao='NOVO'and toner.modelo='XEROX 6015' and toner.cor='AMARELO'");
		
		List<Toner> lista = new ArrayList<Toner>();
		
			while(result.next()){
				Toner temp = new Toner();
				
				temp.settId(result.getLong("t_id"));
				temp.setModelo(result.getString("modelo"));
				temp.setPatrimonio(result.getString("patrimonio"));
				temp.setSerie(result.getString("serie"));
				temp.setCor(result.getString("cor"));
				temp.setSituacao(result.getString("situacao"));
			
				lista.add(temp);
			}
		
		result.close();
		
		return lista;
		
		}catch(SQLException e){
			throw new RuntimeException(e);
		}finally{
			fechar();
		}
	}
	
	public List<Toner> getListaMagenta(){
		conectar();
		try{
		
		ResultSet result = stm.executeQuery("select toner.t_id, toner.modelo, toner.patrimonio, toner.serie, toner.cor, toner.situacao " + " from toner where toner.situacao='NOVO'and toner.modelo='XEROX 6015' and toner.cor='MAGENTA'");
		
		List<Toner> lista = new ArrayList<Toner>();
		
			while(result.next()){
				Toner temp = new Toner();
				
				temp.settId(result.getLong("t_id"));
				temp.setModelo(result.getString("modelo"));
				temp.setPatrimonio(result.getString("patrimonio"));
				temp.setSerie(result.getString("serie"));
				temp.setCor(result.getString("cor"));
				temp.setSituacao(result.getString("situacao"));
			
				lista.add(temp);
			}
		
		result.close();
		
		return lista;
		
		}catch(SQLException e){
			throw new RuntimeException(e);
		}finally{
			fechar();
		}
	}
	
	public List<Toner> getListaUsoPreto(){
		conectar();
		try{
		
		ResultSet result = stm.executeQuery("select toner.t_id, toner.modelo, toner.patrimonio, toner.serie, toner.cor, toner.situacao " + " from toner where toner.situacao='EM USO' and toner.modelo='XEROX 6015' and toner.cor='PRETO'");
		
		List<Toner> lista = new ArrayList<Toner>();
		
			while(result.next()){
				Toner temp = new Toner();
				
				temp.settId(result.getLong("t_id"));
				temp.setModelo(result.getString("modelo"));
				temp.setPatrimonio(result.getString("patrimonio"));
				temp.setSerie(result.getString("serie"));
				temp.setCor(result.getString("cor"));
				temp.setSituacao(result.getString("situacao"));
			
				lista.add(temp);
			}
		
		result.close();
		
		return lista;
		
		}catch(SQLException e){
			throw new RuntimeException(e);
		}finally{
			fechar();
		}
	}
	
	public List<Toner> getListaUsoCiano(){
		conectar();
		try{
		
		ResultSet result = stm.executeQuery("select toner.t_id, toner.modelo, toner.patrimonio, toner.serie, toner.cor, toner.situacao " + " from toner where toner.situacao='EM USO' and toner.modelo='XEROX 6015' and toner.cor='CIANO'");
		
		List<Toner> lista = new ArrayList<Toner>();
		
			while(result.next()){
				Toner temp = new Toner();
				
				temp.settId(result.getLong("t_id"));
				temp.setModelo(result.getString("modelo"));
				temp.setPatrimonio(result.getString("patrimonio"));
				temp.setSerie(result.getString("serie"));
				temp.setCor(result.getString("cor"));
				temp.setSituacao(result.getString("situacao"));
			
				lista.add(temp);
			}
		
		result.close();
		
		return lista;
		
		}catch(SQLException e){
			throw new RuntimeException(e);
		}finally{
			fechar();
		}
	}
	
	public List<Toner> getListaUsoAmarelo(){
		conectar();
		try{
		
		ResultSet result = stm.executeQuery("select toner.t_id, toner.modelo, toner.patrimonio, toner.serie, toner.cor, toner.situacao " + " from toner where toner.situacao='EM USO' and toner.modelo='XEROX 6015' and toner.cor='AMARELO'");
		
		List<Toner> lista = new ArrayList<Toner>();
		
			while(result.next()){
				Toner temp = new Toner();
				
				temp.settId(result.getLong("t_id"));
				temp.setModelo(result.getString("modelo"));
				temp.setPatrimonio(result.getString("patrimonio"));
				temp.setSerie(result.getString("serie"));
				temp.setCor(result.getString("cor"));
				temp.setSituacao(result.getString("situacao"));
			
				lista.add(temp);
			}
		
		result.close();
		
		return lista;
		
		}catch(SQLException e){
			throw new RuntimeException(e);
		}finally{
			fechar();
		}
	}
	
	public List<Toner> getListaUsoMagenta(){
		conectar();
		try{
		
		ResultSet result = stm.executeQuery("select toner.t_id, toner.modelo, toner.patrimonio, toner.serie, toner.cor, toner.situacao " + " from toner where toner.situacao='EM USO' and toner.modelo='XEROX 6015' and toner.cor='MAGENTA'");
		
		List<Toner> lista = new ArrayList<Toner>();
		
			while(result.next()){
				Toner temp = new Toner();
				
				temp.settId(result.getLong("t_id"));
				temp.setModelo(result.getString("modelo"));
				temp.setPatrimonio(result.getString("patrimonio"));
				temp.setSerie(result.getString("serie"));
				temp.setCor(result.getString("cor"));
				temp.setSituacao(result.getString("situacao"));
			
				lista.add(temp);
			}
		
		result.close();
		
		return lista;
		
		}catch(SQLException e){
			throw new RuntimeException(e);
		}finally{
			fechar();
		}
	}
	
	public List<Toner> getListaUsadoPreto(){
		conectar();
		try{
		
		ResultSet result = stm.executeQuery("select toner.t_id, toner.modelo, toner.patrimonio, toner.serie, toner.cor, toner.situacao " + " from toner where toner.situacao='USADO' and toner.modelo='XEROX 6015' and toner.cor='PRETO'");
		
		List<Toner> lista = new ArrayList<Toner>();
		
			while(result.next()){
				Toner temp = new Toner();
				
				temp.settId(result.getLong("t_id"));
				temp.setModelo(result.getString("modelo"));
				temp.setPatrimonio(result.getString("patrimonio"));
				temp.setSerie(result.getString("serie"));
				temp.setCor(result.getString("cor"));
				temp.setSituacao(result.getString("situacao"));
			
				lista.add(temp);
			}
		
		result.close();
		
		return lista;
		
		}catch(SQLException e){
			throw new RuntimeException(e);
		}finally{
			fechar();
		}
	}
	
	public List<Toner> getListaUsadoCiano(){
		conectar();
		try{
		
		ResultSet result = stm.executeQuery("select toner.t_id, toner.modelo, toner.patrimonio, toner.serie, toner.cor, toner.situacao " + " from toner where toner.situacao='USADO' and toner.modelo='XEROX 6015' and toner.cor='CIANO'");
		
		List<Toner> lista = new ArrayList<Toner>();
		
			while(result.next()){
				Toner temp = new Toner();
				
				temp.settId(result.getLong("t_id"));
				temp.setModelo(result.getString("modelo"));
				temp.setPatrimonio(result.getString("patrimonio"));
				temp.setSerie(result.getString("serie"));
				temp.setCor(result.getString("cor"));
				temp.setSituacao(result.getString("situacao"));
			
				lista.add(temp);
			}
		
		result.close();
		
		return lista;
		
		}catch(SQLException e){
			throw new RuntimeException(e);
		}finally{
			fechar();
		}
	}
	
	public List<Toner> getListaUsadoAmarelo(){
		conectar();
		try{
		
		ResultSet result = stm.executeQuery("select toner.t_id, toner.modelo, toner.patrimonio, toner.serie, toner.cor, toner.situacao " + " from toner where toner.situacao='USADO' and toner.modelo='XEROX 6015' and toner.cor='AMARELO'");
		
		List<Toner> lista = new ArrayList<Toner>();
		
			while(result.next()){
				Toner temp = new Toner();
				
				temp.settId(result.getLong("t_id"));
				temp.setModelo(result.getString("modelo"));
				temp.setPatrimonio(result.getString("patrimonio"));
				temp.setSerie(result.getString("serie"));
				temp.setCor(result.getString("cor"));
				temp.setSituacao(result.getString("situacao"));
			
				lista.add(temp);
			}
		
		result.close();
		
		return lista;
		
		}catch(SQLException e){
			throw new RuntimeException(e);
		}finally{
			fechar();
		}
	}
	
	public List<Toner> getListaUsadoMagenta(){
		conectar();
		try{
		
		ResultSet result = stm.executeQuery("select toner.t_id, toner.modelo, toner.patrimonio, toner.serie, toner.cor, toner.situacao " + " from toner where toner.situacao='USADO' and toner.modelo='XEROX 6015' and toner.cor='MAGENTA'");
		
		List<Toner> lista = new ArrayList<Toner>();
		
			while(result.next()){
				Toner temp = new Toner();
				
				temp.settId(result.getLong("t_id"));
				temp.setModelo(result.getString("modelo"));
				temp.setPatrimonio(result.getString("patrimonio"));
				temp.setSerie(result.getString("serie"));
				temp.setCor(result.getString("cor"));
				temp.setSituacao(result.getString("situacao"));
			
				lista.add(temp);
			}
		
		result.close();
		
		return lista;
		
		}catch(SQLException e){
			throw new RuntimeException(e);
		}finally{
			fechar();
		}
	}
	
	public void adicionaToner(Toner ton){
		conectar();
		System.out.println(ton.getPatrimonio().toUpperCase());
		
		try{
			
			stm.execute("insert into toner (modelo,patrimonio, serie, cor, situacao) values ('" + ton.getModelo().toUpperCase() + "','" + ton.getPatrimonio().toUpperCase() + "','" + ton.getSerie().toUpperCase() + "','" 
					  + ton.getCor().toUpperCase() + "','" + ton.getSituacao().toUpperCase() + "')");
			System.out.println(ton.getPatrimonio().toUpperCase());
		}catch(SQLException e){
			throw new RuntimeException(e);
		}finally{
			fechar();
		}
	
	}
	
	
	public void exlcuir(long tId){
		conectar();
		System.out.println(tId + "1");
		System.out.println("tentando exlcuir...");
		try {
			
			System.out.println(tId + "2");
			stm.execute("delete from toner where t_id='" + tId +"';");
			System.out.println(tId + "3");
			System.out.println("excluido");
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}finally{
			fechar();
		}
	}
	
	
	public void atualizar(Toner ton){
		conectar();
		System.out.println(ton.getPatrimonio() + "dao1");
		try {
			stm.executeUpdate("update toner set  toner.patrimonio='" + ton.getPatrimonio().toUpperCase() + "',toner.serie='" + ton.getSerie().toUpperCase() +
								 "',toner.cor='" + ton.getCor().toUpperCase() + "',toner.situacao='" + ton.getSituacao().toUpperCase() + "' where toner.t_id='" + ton.gettId() + "';");
			System.out.println(ton.getPatrimonio() + "dao2");
			System.out.println("editado ...");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}finally{
			fechar();
		}
		
	}
}
