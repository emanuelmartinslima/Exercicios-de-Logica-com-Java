package faccat;

import java.util.Scanner;

public class Exercicio27 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Verificação de valor positivo, negativo ou zero");
		
		System.out.println("Digite o valor de um número inteiro: ");
		int numero = scanner.nextInt();
		
		String mensagem = "";
		
		if(numero > 0) {
			mensagem = "positivo";
		} else if(numero < 0) {
			mensagem = "negativo";
		} else {
			mensagem = "zero";
		}
		
		System.out.printf("Número: %d%nClassificação do número: %s", numero, mensagem);
		
		scanner.close();
	}
}
