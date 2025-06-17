package exemplos.interfaceGrafica;

import javax.swing.*;

public class Exemplo02 extends JFrame{
	private JFrame j;
	
	Exemplo02(){
		JButton button = new JButton("Clique aqui!");
		
		button.setBounds(190, 210, 100, 40);
		add(button);
		
		setSize(500, 500);
		setLayout(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exemplo02();
	}
}
