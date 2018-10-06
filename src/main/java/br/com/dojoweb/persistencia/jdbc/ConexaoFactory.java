package br.com.dojoweb.persistencia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConexaoFactory {

	public static Connection getConnection() {
		
		Properties propriedades = new Properties();
		propriedades.setProperty("user", "root");
		propriedades.setProperty("password", "aks2904");
		propriedades.setProperty("useSSL", "false");
		propriedades.setProperty("autoReconnect", "true");
		
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/dojoweb", propriedades);
		} catch (SQLException e) {			
			throw new RuntimeException(e);
		}
	}
}
