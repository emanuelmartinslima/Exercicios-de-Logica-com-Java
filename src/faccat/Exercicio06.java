package faccat;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Cálculo de Área do Retângulo");
		
		System.out.println("Digite o valor da altura do retângulo (em cm): ");
		float altura = scanner.nextFloat();
		
		System.out.println("Digite o valor da base do retângulo (em cm): ");
		float base = scanner.nextFloat();
		
		float area = altura * base;
		
		System.out.printf("Altura: %.2f cm\nBase: %.2f cm\nÁrea: %.2f cm²", altura, base, area);
		
		scanner.close();
	}
}
