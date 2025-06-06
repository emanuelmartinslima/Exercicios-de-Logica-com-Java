package exemplos;

import java.util.Scanner;

public class Adicao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Operação Soma");
		System.out.println("Digite um número: ");
		int numero1 = scanner.nextInt();
		System.out.println("Digite mais um número: ");
		int numero2 = scanner.nextInt();
		
		scanner.close();
		
		int resultado = numero1 + numero2;
		
		System.out.println("Soma: " + resultado);
	}

}
