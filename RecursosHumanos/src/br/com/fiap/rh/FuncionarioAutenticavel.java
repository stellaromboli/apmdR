package br.com.fiap.rh ;

public interface FuncionarioAutenticavel {

	boolean autenticar(String senha);

	void setSenha(String senha);
}
