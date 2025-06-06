package exercicios;

import java.util.Scanner;

public class AreaTriangulo {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Cálculo da Área do Triângulo");
		System.out.println("Digite o valor da altura do triângulo (em cm²): ");
		float altura = scanner.nextFloat();
		System.out.println("Digite o valor da base do triângulo (em cm²): ");
		float base = scanner.nextFloat();
		
		float area = (altura * base) / 2;
		
		System.out.println("Altura: " + altura + " cm\nBase: " + base + " cm\nÁrea: " + area + " cm²");
		
		scanner.close();
	}
}
