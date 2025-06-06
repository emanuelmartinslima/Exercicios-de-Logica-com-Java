package exercicios;

import java.util.Scanner;

public class AreaTrapezio {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Cálculo da Área do Trapézio");
		
		System.out.println("Digite o valor da base maior do trapézio (em cm²): ");
		float baseMaior = scanner.nextFloat();
		
		System.out.println("Digite o valor da base menor do trapézio (em cm²): ");
		float baseMenor = scanner.nextFloat();
		
		System.out.println("Digite o valor da altura do trapézio (em cm²): ");
		float altura = scanner.nextFloat();
		
		float area = ((baseMaior + baseMenor) * altura) / 2;
		
		System.out.printf("Base Maior: %.2f cm\nBase Menor: %.2f cm\nAltura: %.2f cm\nÁrea: %.2f cm²", baseMaior, baseMenor, altura, area);
		
		scanner.close();
	}
}
