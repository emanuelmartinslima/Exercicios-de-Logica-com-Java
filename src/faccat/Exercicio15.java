package faccat;

import java.util.Scanner;

public class Exercicio15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Verificação de Número Positivo ou Negativo");
		
		System.out.print("Digite um número inteiro: ");
		int numero = scanner.nextInt();
		
		if(numero >= 0) {
			System.out.printf("O número %d é positivo!", numero);
		} else {
			System.out.printf("O número %d é negativo!", numero);
		}
		
		scanner.close();
	}
}
