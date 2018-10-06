package br.com.dojoweb;

import br.com.dojoweb.persistencia.entidade.Usuario;
import br.com.dojoweb.persistencia.jdbc.UsuarioDAO;

public class TestUsuarioDAO {

	public static void main(String[] args) {		
		testExcluir();
	}
	
	public static void testExcluir(){
		Usuario usu = new Usuario();
		usu.setUsuCod(2);
		
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.excluir(usu);
		
		System.out.println("Excluído com sucesso!");
	}
	
	public static void testAlterar(){
		Usuario usu = new Usuario();
		usu.setUsuCod(1);
		usu.setUsuNome("João P");
		usu.setUsuLogin("jjjj");
		usu.setUsuSenha("123");
		
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.alterar(usu);
		
		System.out.println("Alterado com sucesso!");
	}
	
	public static void testCadastrar(){
		Usuario usu = new Usuario();
		usu.setUsuNome("José");
		usu.setUsuLogin("jose");
		usu.setUsuSenha("abc");
		
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.cadastrar(usu);
		
		System.out.println("Cadastrado com sucesso!");
	}

}
