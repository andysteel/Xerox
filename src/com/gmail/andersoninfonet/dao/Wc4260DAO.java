package com.gmail.andersoninfonet.dao;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.NamingException;

import com.gmail.andersoninfonet.conexao.ConnectionFactory;
import com.gmail.andersoninfonet.modelo.Fotorreceptor;
import com.gmail.andersoninfonet.modelo.Toner;

public class Wc4260DAO {

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
	
	public List<Toner> getListaTodosToner(){
		conectar();
		try{
		
		ResultSet result = stm.executeQuery("select t_id, modelo, patrimonio, serie, cor, situacao " + " from toner");
		
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
	
	
	public List<Fotorreceptor> getListaTodosFoto(){
		conectar();
		try{
		
		ResultSet result = stm.executeQuery("select f_id, modelo, patrimonio, serie, cor, situacao " + " from fotorreceptor");
		
		List<Fotorreceptor> lista = new ArrayList<Fotorreceptor>();
		
			while(result.next()){
				Fotorreceptor temp = new Fotorreceptor();
				
				temp.setfId(result.getLong("f_id"));
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
	
	public List<Toner> getLista(){
		conectar();
		try{
		
		ResultSet result = stm.executeQuery("select toner.t_id, toner.modelo, toner.patrimonio, toner.serie, toner.situacao " + " from toner where toner.situacao='NOVO' and toner.modelo='XEROX 4260'");
		
		List<Toner> lista = new ArrayList<Toner>();
		
			while(result.next()){
				Toner temp = new Toner();
				
				temp.settId(result.getLong("t_id"));
				temp.setModelo(result.getString("modelo"));
				temp.setPatrimonio(result.getString("patrimonio"));
				temp.setSerie(result.getString("serie"));
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
	
	public List<Toner> getListaUso(){
		conectar();
		try{
		
		ResultSet result = stm.executeQuery("select toner.t_id, toner.modelo, toner.patrimonio, toner.serie, toner.situacao " + " from toner where toner.situacao='EM USO' and toner.modelo='XEROX 4260'");
		
		List<Toner> lista = new ArrayList<Toner>();
		
			while(result.next()){
				Toner temp = new Toner();
				
				temp.settId(result.getLong("t_id"));
				temp.setModelo(result.getString("modelo"));
				temp.setPatrimonio(result.getString("patrimonio"));
				temp.setSerie(result.getString("serie"));
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
	
	public List<Toner> getListaUsado(){
		conectar();
		try{
		
		ResultSet result = stm.executeQuery("select toner.t_id, toner.modelo, toner.patrimonio, toner.serie, toner.situacao " + " from toner where toner.situacao='USADO' and toner.modelo='XEROX 4260'");
		
		List<Toner> lista = new ArrayList<Toner>();
		
			while(result.next()){
				Toner temp = new Toner();
				
				temp.settId(result.getLong("t_id"));
				temp.setModelo(result.getString("modelo"));
				temp.setPatrimonio(result.getString("patrimonio"));
				temp.setSerie(result.getString("serie"));
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
			
			stm.execute("insert into toner (modelo,patrimonio, serie, situacao) values ('" + ton.getModelo().toUpperCase() + "','" + ton.getPatrimonio().toUpperCase() + "','" + ton.getSerie().toUpperCase() + "','" 
					  + ton.getSituacao().toUpperCase() + "')");
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
			stm.executeUpdate("update toner inner join impressora on toner.t_id='" + ton.gettId() + "' set toner.patrimonio='" + ton.getPatrimonio().toUpperCase() + 
								"',toner.serie='" + ton.getSerie().toUpperCase() + "',toner.situacao='" + ton.getSituacao().toUpperCase() + "' ;");
			System.out.println(ton.getPatrimonio() + "dao2");
			System.out.println("editado ...");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}finally{
			fechar();
		}
		
	}
	
	
	public List<Fotorreceptor> getListaFoto(){
		conectar();
		try{
		
		ResultSet result = stm.executeQuery("select fotorreceptor.f_id, fotorreceptor.modelo, fotorreceptor.patrimonio, fotorreceptor.serie, fotorreceptor.situacao " + " from fotorreceptor where fotorreceptor.situacao='NOVO' and fotorreceptor.modelo='XEROX 4260'");
		
		List<Fotorreceptor> lista = new ArrayList<Fotorreceptor>();
		
			while(result.next()){
				Fotorreceptor temp = new Fotorreceptor();
				
				temp.setfId(result.getLong("f_id"));
				temp.setModelo(result.getString("modelo"));
				temp.setPatrimonio(result.getString("patrimonio"));
				temp.setSerie(result.getString("serie"));
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
	
	public List<Fotorreceptor> getListaUsoFoto(){
		conectar();
		try{
		
		ResultSet result = stm.executeQuery("select fotorreceptor.f_id, fotorreceptor.modelo, fotorreceptor.patrimonio, fotorreceptor.serie, fotorreceptor.situacao " + " from fotorreceptor where fotorreceptor.situacao='EM USO' and fotorreceptor.modelo='XEROX 4260'");
		
		List<Fotorreceptor> lista = new ArrayList<Fotorreceptor>();
		
			while(result.next()){
				Fotorreceptor temp = new Fotorreceptor();
				
				temp.setfId(result.getLong("f_id"));
				temp.setModelo(result.getString("modelo"));
				temp.setPatrimonio(result.getString("patrimonio"));
				temp.setSerie(result.getString("serie"));
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
	
	public List<Fotorreceptor> getListaUsadoFoto(){
		conectar();
		try{
		
		ResultSet result = stm.executeQuery("select fotorreceptor.f_id, fotorreceptor.modelo, fotorreceptor.patrimonio, fotorreceptor.serie, fotorreceptor.situacao " + " from fotorreceptor where fotorreceptor.situacao='USADO' and fotorreceptor.modelo='XEROX 4260'");
		
		List<Fotorreceptor> lista = new ArrayList<Fotorreceptor>();
		
			while(result.next()){
				Fotorreceptor temp = new Fotorreceptor();
				
				temp.setfId(result.getLong("f_id"));
				temp.setModelo(result.getString("modelo"));
				temp.setPatrimonio(result.getString("patrimonio"));
				temp.setSerie(result.getString("serie"));
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
	
	public void adicionaFotorreceptor(Fotorreceptor foto){
		conectar();
		System.out.println(foto.getPatrimonio().toUpperCase());
		
		try{
			
			stm.execute("insert into fotorreceptor (modelo,patrimonio, serie, situacao) values ('" + foto.getModelo().toUpperCase() + "','" + foto.getPatrimonio().toUpperCase() + "','" + foto.getSerie().toUpperCase() + "','" 
					  + foto.getSituacao().toUpperCase() + "')");
			System.out.println(foto.getPatrimonio().toUpperCase());
		}catch(SQLException e){
			throw new RuntimeException(e);
		}finally{
			fechar();
		}
	
	}
	
	public void exlcuirFoto(long fId){
		conectar();
		System.out.println(fId + "1");
		System.out.println("tentando exlcuir...");
		try {
			
			System.out.println(fId + "2");
			stm.execute("delete from fotorreceptor where f_id='" + fId +"';");
			System.out.println(fId + "3");
			System.out.println("excluido");
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}finally{
			fechar();
		}
	}
	
	public void atualizarFoto(Fotorreceptor foto){
		conectar();
		System.out.println(foto.getPatrimonio() + "dao1");
		try {
			stm.executeUpdate("update fotorreceptor inner join impressora on fotorreceptor.f_id='" + foto.getfId() + "' set fotorreceptor.patrimonio='" + foto.getPatrimonio().toUpperCase() + 
								"',fotorreceptor.serie='" + foto.getSerie().toUpperCase() + "',fotorreceptor.situacao='" + foto.getSituacao().toUpperCase() + "' ;");
			System.out.println(foto.getPatrimonio() + "dao2");
			System.out.println("editado ...");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}finally{
			fechar();
		}
		
	}
}
