package br.com.fiap.gui;

import java.awt.Color;

import javax.swing.JTextField;

public class InputText extends JTextField {
	
	private static final long serialVersionUID = 1L;

	public InputText() {
		super(20);
		init();
	}

	private void init() {
		this.setForeground(new Color(50,50,50));
		this.setBackground(Color.WHITE);
		
		this.setBorder(BorderFactory.create()); 
	}

}
