package br.com.fiap.loja.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.loja.dao.ProdutoDao;
import br.com.fiap.loja.model.Produto;
import br.com.fiap.loja.view.Janela;

// MVC

public class BotaoListener implements ActionListener {
	
	private Janela view;
	private ProdutoDao dao = new ProdutoDao();

	public BotaoListener(Janela view) {
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Produto produto = new Produto();
		produto.setNome(view.getTxtNome().getText());
		produto.setDescricao(view.getTxtDescricao().getText());
		produto.setPreco(new BigDecimal(view.getTxtPreco().getText()) );
		
		dao.inserir(produto);
		
		view.carregarDados();
		
		List<Produto> lista = dao.listarTodos();
		lista.forEach(System.out::println);
	}
	
}
