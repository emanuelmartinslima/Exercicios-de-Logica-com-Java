package exemplos.operacoesAritmeticas;

import java.util.Scanner;

public class Multiplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Operação de Multiplicação");
		System.out.println("Digite um número inteiro: ");
		int numero1 = scanner.nextInt();
		System.out.println("Digite um outro número inteiro: ");
		int numero2 = scanner.nextInt();
		
		int resultado = numero1 * numero2;
		
		System.out.println("Produto: " + resultado);
		
		scanner.close();
	}

}
