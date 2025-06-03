package faccat;

import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Cálculo de Média Final");
		
		System.out.print("Digite a primeira nota: ");
		float nota1 = scanner.nextFloat();
		
		System.out.print("Digite a segunda nota: ");
		float nota2 = scanner.nextFloat();
		
		System.out.print("Digite a terceira nota: ");
		float nota3 = scanner.nextFloat();
		
		float mediaFinal = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;
		
		System.out.printf("Nota 1: %.2f%nNota 2: %.2f%nNota 3: %.2f%nMédia Final: %.2f", nota1, nota2, nota3, mediaFinal);
		
		scanner.close();
	}
}
