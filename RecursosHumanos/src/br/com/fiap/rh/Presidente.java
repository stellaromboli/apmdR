package br.com.fiap.rh ;

public final class Presidente extends Empregado implements FuncionarioAutenticavel {

	private double valorDasCotas;
	private String senha;
	
	@Override
	public boolean autenticar(String senha) {
		if (this.senha == senha) {
			System.out.print("Logado");
			return this.senha == senha;
		} else {
			System.out.println("Erro Login");
			return this.senha == senha;
		}
	}

	@Override
	public void setSenha(String senha) {
		this.senha = senha;
	}


	@Override
	public double calcularSalario() {
		return getSalarioBase() + valorDasCotas;
	}

	public double getValorDasCotas() {
		return valorDasCotas;
	}

	public void setValorDasCotas(double valorDasCotas) {
		this.valorDasCotas = valorDasCotas;
	}
}
