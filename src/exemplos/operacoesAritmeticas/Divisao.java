package exemplos.operacoesAritmeticas;

import java.util.Scanner;

public class Divisao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Operação de Divisão");
		System.out.println("Digite um número inteiro: ");
		int numero1 = scanner.nextInt();
		int numero2 = 0;
		
		do {
			System.out.println("Digite um outro número inteiro, diferente de 0: ");
			numero2 = scanner.nextInt();
			
			if(numero2 == 0) {
				System.out.println("Digite um número diferente de 0 para o divisor!");
			}
		} while(numero2 == 0);
		
		double resultado = numero1 / numero2;
		
		System.out.println("Resultado: " + resultado);
		
		scanner.close();
	}

}
