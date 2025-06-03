package faccat;

import java.util.Scanner;

public class Exercicio19 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int valor1, valor2, maiorValor;
		
		System.out.println("Verificação de Maior Valor");
		
		System.out.print("Digite o valor de um número inteiro: ");
		valor1 = scanner.nextInt();
		
		System.out.print("Digite o valor de um outro número inteiro: ");
		valor2 = scanner.nextInt();
		
		if(valor1 > valor2) {
			maiorValor = valor1;
		} else {
			maiorValor = valor2;
		}
		
		System.out.printf("Maior Valor: %d", maiorValor);
		
		scanner.close();
	}
}
