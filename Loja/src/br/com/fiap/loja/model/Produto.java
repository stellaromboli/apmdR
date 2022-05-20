package br.com.fiap.loja.model;

import java.math.BigDecimal;
import java.util.Vector;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// POJO - Plain Old Java Object
// BO - Bussiness Object
//ORM
@Entity
public class Produto {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
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

	public Vector<String> getData() {
		
		Vector<String> data = new Vector<String>();
		data.add(id.toString());
		data.add(nome);
		data.add(descricao);
		data.add(preco.toString());
		
		return data;
	}
	
	

}
