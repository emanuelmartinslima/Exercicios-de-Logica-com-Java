package faccat;

import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Verificação de Valor em Relação ao 10");
		
		System.out.print("Digite um número inteiro: ");
		int numero = scanner.nextInt();
		
		if(numero > 10) {
			System.out.println("É MAIOR QUE 10!");
		} else {
			System.out.println("NÃO É MAIOR QUE 10!");
		}
		
		scanner.close();
	}
}
