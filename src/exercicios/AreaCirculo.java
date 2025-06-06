package exercicios;

import java.util.Scanner;

public class AreaCirculo {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Cálculo da Área do Círculo");
		System.out.println("Digite o valor do raio do círculo (em cm²): ");
		double raio = scanner.nextDouble();
		
		double area = Math.PI * Math.pow(raio, 2);
		
		System.out.printf("Raio: %.2f cm\nÁrea: %.2f cm²", raio, area);
		
		scanner.close();
	}
}
