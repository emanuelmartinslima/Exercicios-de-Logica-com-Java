package faccat;

import java.util.Scanner;

public class Exercicio30 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ordenar Três Números em Ordem Crescente");
		
		System.out.print("Digite um valor de um número inteiro: ");
		int numero1 = scanner.nextInt();
		
		System.out.print("Digite um valor de um outro número inteiro: ");
		int numero2 = scanner.nextInt();
		
		System.out.print("Digite um valor de mais um outro número inteiro: ");
		int numero3 = scanner.nextInt();
		
		int primeiroNumero = 0, segundoNumero = 0, terceiroNumero = 0;
		
		if((numero1 > numero2) && (numero2 > numero3)) {
			primeiroNumero = numero3;
			segundoNumero = numero2;
			terceiroNumero = numero1;
		} else if((numero1 > numero3) && (numero3 > numero2)) {
			primeiroNumero = numero2;
			segundoNumero = numero3;
			terceiroNumero = numero1;
		} else if((numero2 > numero1) && (numero1 > numero3)) {
			primeiroNumero = numero3;
			segundoNumero = numero1;
			terceiroNumero = numero2;
		} else if((numero2 > numero3) && (numero3 > numero1)) {
			primeiroNumero = numero1;
			segundoNumero = numero3;
			terceiroNumero = numero2;
		} else if((numero3 > numero1) && (numero1 > numero2)) {
			primeiroNumero = numero2;
			segundoNumero = numero1;
			terceiroNumero = numero3;
		} else if((numero3 > numero2) && (numero2 > numero1)) {
			primeiroNumero = numero1;
			segundoNumero = numero2;
			terceiroNumero = numero3;
		}
		
		System.out.printf("Números Ordenados: %d, %d, %d", primeiroNumero, segundoNumero, terceiroNumero);
		
		scanner.close();
	}
}
