package exemplos;

import java.util.Scanner;

public class SucessorAntecessor {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Apresentação de Antecessor e Sucessor");
		System.out.println("Digite um número inteiro: ");
		int numero = scanner.nextInt();
		
		int antecessor = numero - 1;
		int sucessor = numero + 1;
		
		System.out.println("Número: " + numero + "\nAntecessor: " + antecessor + "\nSucessor: " + sucessor);

		scanner.close();
	}
}
