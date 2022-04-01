package br.com.fiap.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class App {
	
	public static void main(String[] args) {
		
		try {
			UIManager.setLookAndFeel(
					UIManager.getSystemLookAndFeelClassName()
			);
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
		
		JFrame jFrame = new JFrame("Meu App");
		jFrame.setLayout(new FlowLayout());
		
		
		
		MeuLabel label = new MeuLabel("Meu label");
		InputText inputText = new InputText();
		MeuTextArea textArea = new MeuTextArea();
		JCheckBox checkBox = new JCheckBox();
		
		JPanel busca = new JPanel();
		busca.setLayout(new BorderLayout());
		busca.add(inputText, BorderLayout.LINE_START);
		busca.add(new JButton("Buscar"));
		
		JRadioButton radioButtonPix = new JRadioButton("Pix");
		JRadioButton radioButtonCartao = new JRadioButton("Cartão");
		ButtonGroup formaDePagamento = new ButtonGroup();
		formaDePagamento.add(radioButtonPix);
		formaDePagamento.add(radioButtonCartao);
		
		jFrame.add(label, BorderLayout.PAGE_END);
		jFrame.add(busca, BorderLayout.PAGE_START);
		jFrame.add(textArea);
		jFrame.add(checkBox);
		jFrame.add(radioButtonPix);
		jFrame.add(radioButtonCartao);
		
		String[] cidades = {"São Paulo", "Santos", "Osasco"};
		jFrame.add(new JComboBox<String>(cidades));
		
		jFrame.setSize(400, 600);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setVisible(true);
		
	}

}
