package br.com.fiap.loja.view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import br.com.fiap.loja.controller.BotaoListener;

public class Janela extends JFrame{
	
	private JTextField txtNome = new JTextField(20);
	private JTextArea txtDescricao = new JTextArea(3, 20);
	private JTextField txtPreco = new JTextField(20);
	private JButton btnSalvar = new JButton("Salvar");
	
	public Janela() {
		setLayout(new FlowLayout());
		setSize(330, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public void init() {
		add(new JLabel("Nome"));
		add(txtNome);
		
		add(new JLabel("Descrição"));
		add(txtDescricao);
		
		add(new JLabel("Preço"));
		add(txtPreco);
		
		add(btnSalvar);
		
		setVisible(true);
		
		BotaoListener listener = new BotaoListener(this);
		btnSalvar.addActionListener(listener);
		
	}

	public JTextField getTxtNome() {
		return txtNome;
	}

	public JTextArea getTxtDescricao() {
		return txtDescricao;
	}

	public JTextField getTxtPreco() {
		return txtPreco;
	}
	
	

}
