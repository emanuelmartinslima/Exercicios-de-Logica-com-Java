package exemplos.interfaceGrafica;

import javax.swing.*;


public class Exemplo01 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JButton button = new JButton("Clique aqui!");
		
		button.setBounds(130, 100, 100, 40);
		frame.add(button);
		
		frame.setTitle("Exemplo 01");
		frame.setSize(400, 500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}
