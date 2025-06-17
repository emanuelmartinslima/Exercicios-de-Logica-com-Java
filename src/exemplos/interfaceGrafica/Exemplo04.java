package exemplos.interfaceGrafica;

import javax.swing.*;

public class Exemplo04 extends JFrame{
	Exemplo04(){
		JLabel primeiroNomeLabel = new JLabel("Primeiro Nome");
		JLabel ultimoNomeLabel = new JLabel("Último Nome");
		
		JTextField primeiroNomeField = new JTextField();
		JTextField ultimoNomeField = new JTextField();
		
		JButton enviarButton = new JButton("Enviar");
		JButton resetarButton = new JButton("Resetar");
		
		primeiroNomeLabel.setBounds(20, 50, 120, 20);
		ultimoNomeLabel.setBounds(20, 80, 120, 20);
		
		primeiroNomeField.setBounds(130, 50, 100, 20);
		ultimoNomeField.setBounds(130, 80, 100, 20);
		
		enviarButton.setBounds(20, 110, 80, 20);
		resetarButton.setBounds(150, 110, 80, 20);
		
		add(primeiroNomeLabel);
		add(ultimoNomeLabel);
		add(primeiroNomeField);
		add(ultimoNomeField);
		add(enviarButton);
		add(resetarButton);
		
		setSize(300, 300);
		setLayout(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exemplo04();
	}
}
