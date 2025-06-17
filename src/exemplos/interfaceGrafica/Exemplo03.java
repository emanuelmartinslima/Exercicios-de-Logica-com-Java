package exemplos.interfaceGrafica;

import javax.swing.*;

public class Exemplo03 extends JFrame{
	Exemplo03(){
		JButton button = new JButton("Clique aqui!");
		
		button.setBounds(200, 200, 100, 40);
		
		add(button);
		setTitle("Exemplo 03");
		setSize(500, 500);
		setLayout(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exemplo03();
	}
}
