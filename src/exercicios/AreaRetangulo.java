package exercicios;

import java.util.Scanner;

public class AreaRetangulo {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Cálculo da Área de Retângulo");
		System.out.println("Digite o valor da altura do retângulo (em cm²): ");
		float altura = scanner.nextFloat();
		System.out.println("Digite o valor da base do retângulo (em cm²): ");
		float base = scanner.nextFloat();
		
		float area  = altura * base;
		
		System.out.println("Altura: " + altura + " cm\nBase: " + base + " cm\nÁrea: " + area + " cm²");
		
		scanner.close();
	}
}
