package exemplos.interfaceGrafica;

import java.awt.*;

public class Exemplo01 extends Frame {
	public Exemplo01() {
		Button button = new Button("Clique aqui!");
		
		button.setBounds(30, 100, 80, 30);
		
		add(button);
		
		setSize(300, 300);
		
		setTitle("Exemplo 01 de GUI com AWT");
		
		setLayout(null);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Exemplo01 frame = new Exemplo01();
	}
}
