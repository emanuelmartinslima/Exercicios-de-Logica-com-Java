package exemplos.interfaceGrafica;

import javax.swing.*;

public class Exemplo02 {
	private JFrame f;
	
	Exemplo02(){
		JButton button = new JButton("Clique aqui!");
		
		button.setBounds(190, 210, 100, 40);
		f.add(button);
		
		f.setTitle("Exemplo 02");
		f.setSize(500, 500);
		f.setLayout(null);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exemplo02();
	}
}
