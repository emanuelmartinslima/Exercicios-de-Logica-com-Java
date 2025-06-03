package faccat;

import java.util.Scanner;

public class Exercicio20 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int valor1, valor2, primeiroValor, segundoValor;
		
		System.out.println("Ordenação de Dois Valores");
		
		System.out.print("Digite um número inteiro: ");
		valor1 = scanner.nextInt();
		
		System.out.print("Digite um outro número inteiro: ");
		valor2 = scanner.nextInt();
		
		if(valor1 > valor2) {
			primeiroValor = valor2;
			segundoValor = valor1;
		} else {
			primeiroValor = valor1;
			segundoValor = valor2;
		}
		
		System.out.printf("Valores Ordenados: %d, %d", primeiroValor, segundoValor);
		
		scanner.close();
	}
}
