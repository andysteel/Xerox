package com.gmail.andersoninfonet.conexao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ConnectionFactory {

	public Connection getConnection()throws SQLException, NamingException{
		
		InitialContext ic = new InitialContext();
		DataSource ds = (DataSource)ic.lookup("java:comp/env/jdbc/xerox");
		
		Connection con = ds.getConnection();
		
		return con;
	}
}
