package br.com.dojoweb.persistencia.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import java.sql.PreparedStatement;

import br.com.dojoweb.persistencia.entidade.Usuario;

public class UsuarioDAO {

	private Connection con = ConexaoFactory.getConnection();
	
	public void cadastrar(Usuario usu) {
		String sql = "insert into usuarios(UsuNome, UsuLogin, UsuSenha) values(?,?,?)";
		
		try (PreparedStatement preparador = con.prepareStatement(sql)){
			preparador.setString(1, usu.getUsuNome());
			preparador.setString(2, usu.getUsuLogin());
			preparador.setString(3, usu.getUsuSenha());
			
			preparador.execute();			
			//preparador.close();
		} catch (SQLException e) {			
			e.printStackTrace();
		}
	}

	public void alterar(Usuario usu) {
		String sql = "update usuarios set UsuNome=?, UsuLogin=?, UsuSenha=? where UsuCod=?";
		
		try (PreparedStatement preparador = con.prepareStatement(sql)){
			preparador.setString(1, usu.getUsuNome());
			preparador.setString(2, usu.getUsuLogin());
			preparador.setString(3, usu.getUsuSenha());
			preparador.setInt(4, usu.getUsuCod());
			
			preparador.execute();			
			
		} catch(SQLException e){
			e.printStackTrace();
		}
		
	}

	public void excluir(Usuario usu) {
		String sql = "delete from usuarios where UsuCod=?";
		
		try(PreparedStatement preparador = con.prepareStatement(sql)){
			preparador.setInt(1, usu.getUsuCod());
			
			preparador.execute();
			
		} catch(SQLException e){
			e.printStackTrace();
		}
		
	}

}
