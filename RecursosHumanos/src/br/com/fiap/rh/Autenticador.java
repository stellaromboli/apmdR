package br.com.fiap.rh ;

public class Autenticador {
	
	private String senha;
	
	public boolean autenticar(String senha) {
		if (this.senha == senha) {
			System.out.print("Logado");
			return this.senha == senha;
		} else {
			System.out.println("Erro Login");
			return this.senha == senha;
		}
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}


}
