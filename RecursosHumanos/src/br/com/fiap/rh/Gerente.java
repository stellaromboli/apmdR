package br.com.fiap.rh ;

public class Gerente extends Empregado implements FuncionarioAutenticavel {

	private String area;
	private double bonus;
	
	private Autenticador autenticador = new Autenticador();
	
	@Override
	public boolean autenticar(String senha) {
		return autenticador.autenticar(senha);
	}

	@Override
	public void setSenha(String senha) {
		autenticador.setSenha(senha);
	}

	
	
	@Override
	public double calcularSalario() {
		return getSalarioBase() + bonus;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}


}

