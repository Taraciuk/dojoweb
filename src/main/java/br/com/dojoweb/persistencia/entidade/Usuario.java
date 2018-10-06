package br.com.dojoweb.persistencia.entidade;

public class Usuario {
	private Integer usuCod;
	private String usuNome;
	private String usuLogin;
	
	public Integer getUsuCod() {
		return usuCod;
	}
	public void setUsuCod(Integer usuCod) {
		this.usuCod = usuCod;
	}
	public String getUsuNome() {
		return usuNome;
	}
	public void setUsuNome(String usuNome) {
		this.usuNome = usuNome;
	}
	public String getUsuLogin() {
		return usuLogin;
	}
	public void setUsuLogin(String usuLogin) {
		this.usuLogin = usuLogin;
	}
	public String getUsuSenha() {
		return usuSenha;
	}
	public void setUsuSenha(String usuSenha) {
		this.usuSenha = usuSenha;
	}
	private String usuSenha;	

}
