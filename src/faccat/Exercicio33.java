package faccat;

import java.util.Scanner;

public class Exercicio33 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Comparar Dois Números");
		
		System.out.print("Digite o valor de um primeiro número inteiro: ");
		int numero1 = scanner.nextInt();
		
		System.out.print("Digite o valor de um segundo número inteiro: ");
		int numero2 = scanner.nextInt();
		
		String mensagem = "";
		
		if(numero1 > numero2) {
			mensagem = "Primeiro é maior";
		} else if(numero2 > numero1) {
			mensagem = "Segundo é maior";
		} else {
			mensagem = "Números iguais";
		}
		
		System.out.printf("1° Número: %d%n2° Número: %d%n%n%s", numero1, numero2, mensagem);
		
		scanner.close();
	}
}
