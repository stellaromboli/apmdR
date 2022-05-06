package br.com.fiap.loja.model;

import java.math.BigDecimal;

// POJO - Plain Old Java Object
// BO - Bussiness Object
public class Produto {

	private String nome;
	private String descricao;
	private BigDecimal preco;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", descricao=" + descricao + ", preco=" + preco + "]";
	}
	
	

}
