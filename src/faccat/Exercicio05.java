package faccat;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Apresentação de Antecessor e Sucessor");
		
		System.out.println("Digite um número inteiro: ");
		int numero = scanner.nextInt();
		
		int antecessor = numero - 1;
		int sucessor = numero + 1;
		
		System.out.printf("Número: %d\nAntecessor: %d\nSucessor: %d", numero, antecessor, sucessor);
		
		scanner.close();
	}
}
