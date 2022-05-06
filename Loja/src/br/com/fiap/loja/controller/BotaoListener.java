package br.com.fiap.loja.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

import javax.swing.JOptionPane;

import br.com.fiap.loja.model.Produto;
import br.com.fiap.loja.view.Janela;

// MVC

public class BotaoListener implements ActionListener {
	
	private Janela view;

	public BotaoListener(Janela view) {
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Produto produto = new Produto();
		produto.setNome(view.getTxtNome().getText());
		produto.setDescricao(view.getTxtDescricao().getText());
		produto.setPreco(new BigDecimal(view.getTxtPreco().getText()) );
		
		
		
		JOptionPane.showMessageDialog(null, produto);
	}
	
}
